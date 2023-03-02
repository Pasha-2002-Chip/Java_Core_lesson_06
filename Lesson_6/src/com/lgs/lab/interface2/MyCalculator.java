package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private double a;
	private double b;

	public MyCalculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double plus() {

		return this.a + this.b;
	}

	@Override
	public double minus() {

		return this.a - this.b;
	}

	@Override
	public double multiply() {

		return this.a * this.b;
	}

	@Override
	public double devide() {

		return this.a / this.b;
	}

	public void resault(double resault) {
		System.out.println("Результатом операції є число " + resault);
	}

}
