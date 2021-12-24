//********************************************************************
//
//  Author:               DeonDre White
//
//  Program #:            Program3
//
//  File Name:            DeonDreWhite_program3
//
//  Course:               ITSE 2317 Java Programming(intermediate
//
//  Due Date:             3/8/2021
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              Program 3
//
//  Description:
//     Write a program that will read a list from an external file. Save the list into a hashmap. The program
//	   will need to list the teams and the year they won, while also listing the team and the number of times they won
//	   The last part, have a user enter 5 different years and display the the team that won and how many times they won
//
//********************************************************************
package Project3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class TestFile1 {

	private Scanner byDate, byTitle, askInput;
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	HashMap<String, Integer> hash = new HashMap<String, Integer>();
	TreeMap<String, Integer> sorted = new TreeMap<>();
	private String teamnames, teamnames2;

	public static void main(String[] args) {

		TestFile1 tf1 = new TestFile1();
		tf1.openFile();
		tf1.recordsByYear();
		tf1.recordsByTitles();
		tf1.displayMap();
		
		tf1.userInput();
		tf1.closeInput();

	}

	public void openFile() {// method to open file
		try {
			byDate = new Scanner(Paths.get("teamnames.txt"));
			byTitle = new Scanner(Paths.get("teamnames.txt"));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}

	public void recordsByYear() { //method to read file
		try {
			int year = 1903;
			while (byDate.hasNext()) // while there is more to read
			{

				if (year == 1904 || year == 1994) {
					year++;
				} else {
					teamnames = byDate.nextLine();
					map.put(year, teamnames);
					year++;
				}
			}

		} catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed. Terminating.");
		} catch (IllegalStateException stateException) {
			System.err.println("Error reading from file. Terminating.");
		}
	}

	public void displayMap() {//method to display both hashmaps(display listed items)

		System.out.println("Teams by Year: ");
		for (Entry<Integer, String> teamInfo : map.entrySet()) {
			System.out.println(teamInfo.getKey() + " " + teamInfo.getValue());
		}
		System.out.println();

		System.out.println("Teams by Titles: ");
		for (Entry<String, Integer> teamWins : sorted.entrySet()) {
			System.out.println(teamWins.getKey() + " " + teamWins.getValue());
		}
		System.out.println();

	}

	public void recordsByTitles() {//method the create the second hashmap to show number for times teams won

		while (byTitle.hasNext()) {

			sorted.putAll(hash);
			teamnames2 = byTitle.nextLine();

			if (hash.containsKey(teamnames2)) {
				int count = hash.get(teamnames2);
				hash.put(teamnames2, count + 1);
			} else {
				hash.put(teamnames2, 1);
			}

		}

	}

	public void userInput() {//method to prompt user for date then return into based on that year/date
		askInput = new Scanner(System.in);
		System.out.println("Please enter a year(Range: 1903 - 2020 |Exception: No World Series for 1904 or 1994): ");
		System.out.println("Enter 0 to stop\n");

		try {
			int date = askInput.nextInt();

			while (date != 0) {
				if(date == 1904 || date == 1994) {
					System.out.printf("There wasn't a World Series for %d%n", date);
					System.out.println("You can enter a new date: \n");
					date = askInput.nextInt();
				} else {
					System.out.printf("The World Series Champions for %d were the %s%n", date, map.get(date));
					String team = map.get(date);
					System.out.printf("This organization has %d chammpionship(s)%n", sorted.get(team));
					System.out.println();

					System.out.println("You can enter a new date: ");
					date = askInput.nextInt();
				}
				
			}
		} catch (NullPointerException e) {
			System.err.println("Number not in range.");
		} catch (InputMismatchException e) {
			System.err.println("Value is not an acceptable entry.");
		}

	}

	public void closeInput() {
		byDate.close();
		byTitle.close();
	}

}
