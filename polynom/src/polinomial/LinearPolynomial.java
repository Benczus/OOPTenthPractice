package polinomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {

	double a;
	double b;
	
	public LinearPolynomial(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	/*
	Lineáris Polinom y=ax+b
	*/
	
	@Override
	public double calculate(double x) {
	// TODO Auto-generated method stub
		return (a*x+b);
	}

	@Override
	public int getDegree() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return "y="+a+"x+("+b+")";
	}


}
