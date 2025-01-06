public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// Arithemetic Operators
		System.out.println(" Additional= " + (a + b));
		System.out.println(" Substraction = " + (a - b));
		System.out.println(" Multiplication = " + (a * b));
		System.out.println(" Division = " + (a / b));
		System.out.println(" Modulus = " + (a % b));

		// Unary operators
		// a = 10
		System.out.println(" Pre Increment = " + (++a)); // a = 11
		// a = 11
		// b = 20
		System.out.println(" Pre Decrement = " + (--b)); // b = 19
		// a = 11
		// b = 19
		System.out.println(" Post Increment = " + (a++)); // a = 11
		// a = 12
		// b = 19
		System.out.println(" Post Decrement = " + (b--)); // b = 19
		// b = 18

		// Relational Operators
		System.out.println(" Equal to = " + (a == b)); // false
		System.out.println(" Not Equal to = " + (a != b)); // true
		System.out.println(" Greater than = " + (a > b)); // false
		System.out.println(" Less than = " + (a < b)); // true
		System.out.println(" Greater than or Equal to = " + (a >= b)); // false
		System.out.println(" Less than or Equal to = " + (a <= b)); // true
		
		// Logical Operators
		System.out.println(" Logical AND = " + ((a == b) && (a != b))); // false
		System.out.println(" Logical OR = " + ((a == b) || (a != b))); // true
		System.out.println(" Logical NOT = " + !(a == b)); // true

		int num1 = 200;
		int num2 = 300;
		// Assignment Operators
		num1 += num2; // num1 = num1 + num2
		System.out.println(" += " + num1); // 500

		num1 -= num2; // num1 = num1 - num2
		System.out.println(" -= " + num1); // 200

		num1 *= num2; // num1 = num1 * num2
		System.out.println(" *= " + num1); // 60000

		num1 /= num2; // num1 = num1 / num2
		System.out.println(" /= " + num1); // 200

		num1 %= num2; // num1 = num1 % num2
		System.out.println(" %= " + num1); // 200

		

	}
}