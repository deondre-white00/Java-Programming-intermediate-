package program5;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class TestProgram5 {
	
	Scanner input = new Scanner(System.in);
	String filename;
	Integer number;
	String describe;
	Integer invent;
	Double prices;
	Retail_Item num;

	public static void main(String[] args) {
		
		TestProgram5 test = new TestProgram5();
		test.openFile();
		test.readRecords();
		test.displayed();
		
		
		
		
		
		

	}
	
	
	
	List<Retail_Item> list = new ArrayList<>();
	//Retail_Item retail = new Retail_Item();
	Cash_Register reg = new Cash_Register();
	
	
	
	
	 public void openFile()
	   {
		 		 		 
		try {
			//System.out.println("Enter the name of the file you'd like to read: ");
			//filename = input.next();
			input = new Scanner(Paths.get("Inventory.txt"  ));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
		 
	   }
	 
	 public void readRecords()
	   {
		 
		
		

	      try 
	      {
	    	  
			while (input.hasNext()) // while there is more to read
			{
				number = input.nextInt();
				describe = input.next();
				invent = input.nextInt();
				prices = input.nextDouble();
				
				list.add(new Retail_Item(number, describe, invent, prices));
				//System.out.println(list);
				
			  }			 
	      } 
	      catch (NoSuchElementException elementException)
	      {
	         System.err.println("File improperly formed. Terminating.");
	      } 
	      catch (IllegalStateException stateException)
	      {
	         System.err.println("Error reading from file. Terminating.");
	      } 
	      
	     // System.out.println(list);
			//input.close();

			/*for (Retail_Item listed : list) 
		      {
		         System.out.println(listed); // invokes toString
	         
		      }// end for
			System.out.println("size of list: " + list.size());
			System.out.println("Test Program");*/
	 
	   }
	 
	 public void displayed() {

		System.out.println("Press enter to continue...");
		try {

			System.in.read();
			reg.display_menu(list);		
			
			reg.purchase_item(num);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	 }
	 
	 
	   

}
