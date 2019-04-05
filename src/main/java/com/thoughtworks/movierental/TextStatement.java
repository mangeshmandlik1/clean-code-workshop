package com.thoughtworks.movierental;

public class TextStatement {

	public String display(Rentals rentals, String name) {
		String result = "Rental Record for " + name + "\n";
		for (Rental each : rentals) {
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.amount()) + "\n";
		}

		// add footer lines result
		result += "Amount owed is " + String.valueOf(rentals.totalamount()) + "\n";
		result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

}
