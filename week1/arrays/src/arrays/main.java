package arrays;

public class main {

	public static void main(String[] args) {
		// arrays
				String[] students = new String[3];
				students[0] = "Ahmet";
				students[1] = "Engin";
				students[2] = "Ömer";

				for (int i1 = 0; i1 < students.length; i1++) {
					System.out.println(students[i1]);
				}

				for (String student : students) {
					System.out.println(student);
				}

				// arrays ReCap demo2

				double[] myList = new double[4];
				double[] myList2 = { 1.3, 2.4, 5.2 };
				double total = 0;
				double max1 = myList2[0];

				for (double number : myList2) {
					if (max1 < number) {
						max1 = number;
					}
					total = total + number;
					System.out.println(number);
				}

				System.out.println("Sum= " + total);
				System.out.println("Max= " + max1);

				// Multi dimensional arrays

				String[][] cities = new String[3][3];

				cities[0][0] = "İstanbul";
				cities[0][1] = "Bursa";
				cities[0][2] = "Bilecik";
				cities[1][0] = "Ankara";
				cities[1][1] = "Konya";
				cities[1][2] = "Kayseri";
				cities[2][0] = "Diyarbakır";
				cities[2][1] = "Şanlıurfa";
				cities[2][2] = "Gaziantep";

				for (int i2 = 0; i2 <= 2; i2++) {
					for (int j = 0; j <= 2; j++) {
						System.out.println(cities[i2][j]);
					}
				}

	}

}
