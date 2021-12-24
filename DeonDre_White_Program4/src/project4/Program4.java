//***************************************************************
//
 //Developer:         DeonDre White
//
//Program #:         Five
//
//File Name:         Program4.java
//
//Course:            ITSE 2317 Intermediate Java Programming 
//
//Instructor:        Fred Kumi 
//
//Description:       
//                   
//                   
//***************************************************************
package project4;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;



public class Program4 {

	// initiate array
	Invoice[] invoice = { 
			new Invoice(83, "Electric sander", 7, 57.98), 
			new Invoice(24, "Power Saw", 18, 99.99),
			new Invoice(7, "Sledge hammer", 11, 21.50), 
			new Invoice(77, "Hammer", 76, 11.99),
			new Invoice(39, "Lawn Mower", 3, 79.50), 
			new Invoice(68, "Screwdriver", 106, 6.99),
			new Invoice(56, "Jig Saw", 21, 11.00), 
			new Invoice(3, "Wrench", 34, 7.50) };

	//get list view of invoice array
	List<Invoice> list = Arrays.asList(invoice);
	
	//function for getting part description
	Function<Invoice, String> partDesc = Invoice::getPartDescription;
	
	//Comparator for comparing partDesc
	Comparator<Invoice> partDesribe = Comparator.comparing(partDesc);
	
	//function for getting price
	Function<Invoice, Double> price = Invoice::getPrice;
	
	//comparator for comparing prices
	Comparator<Invoice> priceByEach = Comparator.comparing(price);
	
	//function for getting price
	Function<Invoice, Integer> quantity = Invoice::getQuantity;
	
	//comparator for comparing prices
	Comparator<Invoice> quantityOfItem = Comparator.comparing(quantity);
	
	public static void main(String[] args) {
		Program4 program = new Program4();
		program.sortByParDes();
		program.sortByPrice();
		program.mapPartQuan();
		program.mapInvoiceVal();
		program.rangeofValues();
		program.finfirst();
	}

	//method to sort Part Description
	public void sortByParDes() {
		System.out.printf("Invoices sorted by part description: %n");
		list.stream()
			.sorted(partDesribe)
			.forEach(System.out::println);
		System.out.println();
		

	}
	
	//method to sort by Price
	public void sortByPrice() {
		System.out.printf("Invoices sorted by price: %n");
		list.stream()
			.sorted(priceByEach)
			.forEach(System.out::println);
		System.out.println();
	}
	
	//Comparator for Part Description and Quantity
		Comparator<Invoice> descThenQuantity = 
				Comparator.comparing(Invoice::getPartDescription).thenComparing(Invoice::getQuantity);
	
	
	
	//map Part Description and Quantity to Each Invoice the display
	public void mapPartQuan() {
		System.out.printf("Invoices mapped to Description and Quantity:%n");
		list.stream()
			.sorted(descThenQuantity)
			.map(invoice -> String.format("Description: %-17s  Quantity: %d", invoice.getPartDescription() , invoice.getQuantity()))
			.forEach(System.out::println);
		System.out.println();
	}
	
	//comparator for part description and Value
	Comparator<Invoice> descThenValue = 
			Comparator.comparing(Invoice::getQuantity).thenComparing(Invoice::getPrice);
		
		
	public void mapInvoiceVal() {
		System.out.printf("Invoices mapped to description and invoice amount:%n");
		
		list.stream()
			.sorted(quantityOfItem)
			.map(invoice -> String.format("Description: %-17s  Invoice Amount: $%.2f", invoice.getPartDescription() , invoice.getQuantity() * invoice.getPrice()))
			.forEach(System.out::println);
		System.out.println();
	}
	
	
	Predicate<Invoice> hundred5hundred =
			e -> ((e.getQuantity() * e.getPrice()) >= 200 && (e.getQuantity() * e.getPrice()) <= 500);
			
	//Display items with a value between $200 - $500
	public void rangeofValues()	{
		System.out.printf("Invoices mapped to description and invoice amount for invoices in the range 200-500:%n");
		
		list.stream()
			.filter(hundred5hundred)
			//.sorted(Comparator.comparing(Invoice::getPrice)
			.map(invoice -> String.format("Description: %-17s  Invoice Amount: $%.2f", invoice.getPartDescription() , invoice.getQuantity() * invoice.getPrice()))
			.forEach(System.out::println);
		System.out.println();
	}
	
	//Predicate<Invoice> seen = 
			
	
	//find the first entry that contains SAW
	public void finfirst()	{
		System.out.printf("Find any one Invoice in which description contains \"saw\": %n%s%n",
		
		list.stream()
			.filter(a -> a.getPartDescription().contains("Saw"))
			.findAny()
			.get());	
		
		
		
	}
	
}
