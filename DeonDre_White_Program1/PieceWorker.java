//********************************************************************
//
//  Developer:            Textbook Author
//
//  Program #:            One
//
//  File Name:            BasePlusCommissionEmployee.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             2/08/2021
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              10
//
//  Description:		 class pieceworker inherits from 
//
//********************************************************************
package Program1;

import Program1.Employee;

public class PieceWorker extends Employee {

	private double wage; // employee’s wage per piece
	private double pieces; // number of pieces produced

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) {
			System.out.printf("Employee did not produce any pieces");
		} else if (wage > 0.0) {
			System.out.printf("Employee finished %f pieces", getPieces());
		} else
			throw new IllegalArgumentException("Your entry was incorrect");
		
		this.pieces = pieces;
		this.wage = wage;

	}

	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getPieces() {
		return pieces;
	}

	public void setPieces(double pieces) {
		this.pieces = pieces;
	}

	@Override
	public String toString() {
		return String.format("PieceWorker: %s%n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "piece wage", getWage(),
				"pieces finished", getPieces());
	}
	

}
