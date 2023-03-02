package com.lgs.lab.interface2;

public class Main {
	public static void main(String[] args) {
		MyCalculator myC = new MyCalculator(234.21, 442.52);

		myC.resault(myC.plus());
		myC.resault(myC.minus());
		myC.resault(myC.multiply());
		myC.resault(myC.devide());

	}
}
