package test5;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int fact = 1;
		int firstNumber = 0;
		int secondNumber = 0;
		System.out.print("Enter first number : ");
		ATM objATM = new ATM();
		firstNumber = objATM.inputInt(sc, firstNumber);
		System.out.print("Enter second number : ");
		secondNumber = objATM.inputInt(sc, secondNumber);
		while (firstNumber <= secondNumber) {
			for (i = 1; i <= firstNumber; i++) {
				fact = fact * i;

			}
			System.out.println("factorial of " + firstNumber + " is : " + fact);
			firstNumber++;
			fact = 1;
		}
	}

}
