package loops;

public class main {

	public static void main(String[] args) {
		// For loops

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		// while loops
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------------");
		// do-while
		int x = 0;
		do {
			System.out.println(x);
			x += 2;
		} while (x < 10);

	}

}
