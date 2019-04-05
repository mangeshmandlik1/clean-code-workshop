package com.thoughtworks.movierental;

public class HtmlStatement {

	public String display(Rentals rentals, String name) {
		String result = "<h1> Rental statement for <b>" + name + "</b></h1><br/>";

		for (Rental each : rentals) {
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.amount()) + "<br/>";
		}

		// add footer lines result
		result += "Amount owed is <b>" + String.valueOf(rentals.totalamount()) + "</b><br/>";
		result += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
				+ "</b> frequent renter points";
		return result;
	}

}
