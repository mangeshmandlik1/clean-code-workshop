package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private Rentals rentals = new Rentals();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}
	public String statement() {
		return new TextStatement().display(this.rentals, this.getName());
	}

/*	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		for (Rental each : rentals) {
			double thisAmount = each.amount();
			frequentRenterPoints = getFrequentRenterPoints(each);
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}

		// add footer lines result
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}*/



	public String htmlstatement() {
		String result = "<h1> Rental statement for <b>" + getName() + "</b></h1><br/>";
		int totalFrequentRenterPoints = rentals.totalFrequentRenterPoints();

		for (Rental each : rentals) {

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.amount()) + "\n";

		}

		// add footer lines result
		result += "Amount owed is <b>" + String.valueOf(rentals.totalamount()) + "</b><br/>";
		result += "You earned <b>" + String.valueOf(totalFrequentRenterPoints) + "</b> frequent renter points";
		return result;
	}
	

}
