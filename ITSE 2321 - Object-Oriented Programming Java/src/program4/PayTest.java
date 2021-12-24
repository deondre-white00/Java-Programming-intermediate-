package program4;

import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Pay1 annan = new Pay1();
		System.out.println("Please enter Employee's ID: ");
		int EmplID = input.nextInt();
		annan.setIdNumber(EmplID);
	}
}
