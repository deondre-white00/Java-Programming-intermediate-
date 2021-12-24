package Program9;

import java.util.Stack;

public class InfixToPostfixConverter {
	
	
	public static void main(String[] args)
	{

		InfixToPostfixConverter itpf = new InfixToPostfixConverter();
		
		itpf.convertToPostfix("7 / 9");
		itpf.postFix();
		itpf.convertToPostfix("6 + 2 * 5");
		itpf.postFix();
		itpf.convertToPostfix("6 + 2 * 5 � 8 / 4");
		itpf.postFix();
		itpf.convertToPostfix("(6 + 2) * 5 � 8 / 4");
		itpf.postFix();
		itpf.convertToPostfix("(6 + 2) * 5 ^ 8 / 4");
		itpf.postFix();
		itpf.convertToPostfix("6 % 2 ^ 5 � 8 / 4 * 5");
		itpf.postFix();
		
	}
	 
	 
	 

	int t;
	char c;
	String result = new String();
	
	String exp;
	Stack<Character> list = new Stack<Character>();
	

	public String convertToPostfix(String exp){
		
		for(int i = 0; i < exp.length(); i++) {
			
			c = exp.charAt(i);
		
			if(isOperand(c)) {
				result += c;
			}
			else if (isOperator(c)){
				while(!list.isEmpty() && precedence(c) <= precedence(list.peek())) {
					result += list.pop();
					list.pop();
				}
			list.push(c);
				
			}
			else if (c == '('){
				list.push(c);
			}
			else if (c == ')'){
				while(!list.isEmpty() && list.peek() != '(')
					result += list.pop();
		
				
				
					list.pop();
				}
			}
		
		while(!list.isEmpty()) {
			if(list.peek() == '(')
				return "Invaild Exp";
			result += 
					list.pop();
		}
		return result;
	}
	
	public boolean isOperand(char c) {
		
		if(c >= '0' && c <= '9') {
			return true;
		} else {
			return false;
		}
		
		
		
	}
	
	public boolean isOperator(char c) {
	
		if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%') {
			return true;
		} else {
			return false;
		}
		
		
		
		
	}
	
	public int precedence(char c) {
		
		
		switch(c) {
		case '+': t = 1;
		break;
		case '-': t = 2;
		break;
		case '*': t = 3;
		break;
		case '/': t = 4;
		break;
		case '^': t = 5;
		break;
		case '%': t = 6;
		break;
		default:
			t = 0;
		}
		
		return t;
	}
	
	
	
	public void postFix() {
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
		
		
	

}