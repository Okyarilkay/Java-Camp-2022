
public class main {

	public static void main(String[] args) {
		// Primitive types

				int a = 12;
				String b = "b";
				char c = 'c';
				double d = 2.4;
				short e = 2;
				long f = 123123;
				byte g = 127;
				boolean isTrue = false;

				// Conditionals

				if (isTrue) {
					System.out.println("it is true.");
				} else {
					System.out.println("it is false.");
				}

				if (a > e) {
					System.out.println("a>e");
				} else if (a > e) {
					System.out.println("a<e");
				} else {
					System.out.println("a=e");
				}

				// ReCap Demo 1
				int number1 = 20;
				int number2 = 25;
				int number3 = 3;
				int max = number1;

				if (number1 > number2 && number1 > number3) {
					System.out.println("Number1 is the biggest.");
				} else if (number2 > number1 && number2 > number3) {
					System.out.println("Number2 is the biggest.");
				} else {
					System.out.println("Number3 is the biggest.");
				}

				if (max < number2) {
					max = number2;

				}
				if (max < number3) {
					max = number3;

				}
				System.out.println("max is " + max);

				// Switch-case

				char grade = 'A';

				switch (grade) {
				case 'A':
					System.out.println("Passed AA.");
					break;
				case 'B':
					System.out.println("Passed BB.");
					break;
				case 'C':
					System.out.println("Passed CC.");
					break;
				case 'D':
					System.out.println("Passed DD.");
					break;
				case 'F':
					System.out.println("Failed FF.");
					break;
				default:
					System.out.println("İnvalid value.");

	}

}
