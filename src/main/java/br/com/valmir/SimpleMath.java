package br.com.valmir;

public class SimpleMath {
	
	public Double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public Double sub(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double mult(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double div(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
			throw new ArithmeticException("Divisão por zero não é permitida.");
		}
		return firstNumber / secondNumber;
	}

}
