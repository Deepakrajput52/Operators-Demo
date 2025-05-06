package com.deepak.operators;

public class Opeatorsdemo {

	public static void main(String[] args) {

		int a = 10, b = 5;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;

		boolean isEqual = (a == b);
		boolean isGreater = (a > b);
		boolean isLess = (a < b);

		boolean logicalAnd = (a > 0) && (b > 0);
		boolean logicalOr = (a < 0) || (b > 0);
		boolean logicalNot = !(a == b);

		System.out.println("Arithmetic Operators:");
		System.out.println("Addition = " + add);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division = " + div);
		System.out.println("Modulo = " + mod);

		System.out.println("Relational Operators:");
		System.out.println("a == b: " + isEqual);
		System.out.println("a > b: " + isGreater);
		System.out.println("a < b: " + isLess);

		System.out.println("Logical Operators:");
		System.out.println("Logical AND: " + logicalAnd);
		System.out.println("Logical OR: " + logicalOr);
		System.out.println("Logical NOT: " + logicalNot);
	}

}
