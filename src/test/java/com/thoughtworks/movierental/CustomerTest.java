package com.thoughtworks.movierental;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	@Test
	public void test() {
		Customer customer = new Customer("Mangesh");
//    	System.out.println(customer.statement());
	}

	@Test
	public void testTextStatement() {
		Movie movie = new Movie("ABCD", 2);
		Rental rental = new Rental(movie, 5);
		Customer customer = new Customer("Mangesh");
		customer.addRental(rental);
		System.out.println(customer.statement("text"));
		assertEquals("Rental Record for Mangesh\n" + "	ABCD	4.5\n" + "Amount owed is 4.0\n"
				+ "You earned 1 frequent renter points", customer.statement("text"));
	}

	@Test
	public void testHtmlStatement() {
		Movie movie = new Movie("ABCD", 2);
		Rental rental = new Rental(movie, 5);
		Customer customer = new Customer("Mangesh");
		customer.addRental(rental);
		System.out.println(customer.statement("html"));
		assertEquals(
				"<h1> Rental statement for <b>Mangesh</b></h1><br/>	ABCD	4.5<br/>Amount owed is <b>4.0</b><br/>You earned <b>1</b> frequent renter points",
				customer.statement("html"));
	}

	@Test
	public void singleLoopVsMultiple() {
		for (int j = 0; j < 100; j++) {

			// single loop
			int x = 0, y = 0, z = 0;
			long l = System.currentTimeMillis();
			for (int i = 0; i < 100000000; i++) {
				x++;
				y++;
				z++;
			}
			l = System.currentTimeMillis() - l;

			// multiple loops doing the same thing
			int a = 0, b = 0, c = 0;
			long m = System.currentTimeMillis();
			for (int i = 0; i < 100000000; i++) {
				a++;
			}
			for (int i = 0; i < 100000000; i++) {
				b++;
			}
			for (int i = 0; i < 100000000; i++) {
				c++;
			}
			m = System.currentTimeMillis() - m;
			System.out.println(String.format("%d,%d", l, m));

		}
	}
}