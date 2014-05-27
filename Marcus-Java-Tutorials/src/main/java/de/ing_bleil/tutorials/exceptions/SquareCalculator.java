package de.ing_bleil.tutorials.exceptions;

public class SquareCalculator {

	private BasicCalculator basicCalculator;

	public SquareCalculator() {
		basicCalculator = new BasicCalculator();
	}

	public double sideLengthPropagatingException(double area) {
		return basicCalculator.squareRoot(area);
	}

	public double sideLengthTranslatingException(double area) {
		try {
			return basicCalculator.squareRoot(area);
		}
		catch (RuntimeException e) {
			throw new IllegalArgumentException(area
				+ " is not permitted for area, area must be > 0");
		}

	}

	public double sideLengthTranslatingExceptionByChaining(double area) {
		try {
			return basicCalculator.squareRoot(area);
		}
		catch (RuntimeException e) {
			throw new IllegalArgumentException(e);
		}
	}
}
