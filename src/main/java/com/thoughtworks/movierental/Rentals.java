package com.thoughtworks.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

	public int totalFrequentRenterPoints() {
		int totalFrequentRenterPoints = 0;
		for (Rental rental : this) {
			totalFrequentRenterPoints = rental.getFrequentRenterPoints();
		}
		return totalFrequentRenterPoints;
	}

	public double totalamount() {
		int totalAmount = 0;
		for (Rental rental : this) {
			totalAmount += rental.amount();
		}
		return totalAmount;
	}

}
