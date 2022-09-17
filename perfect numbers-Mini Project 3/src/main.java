
public class main {

	public static void main(String[] args) {
		int number = 1;
		int sum = 0;
		for(int i=1;i<number;i++) {
			if(number % i==0) {
				sum = sum + i;
			}
			else {
				continue;
			}
			
		}
		if(number == sum && number != 0) {
			System.out.println(""+number+" is a perfect number.");
			
		}
		else {
			System.out.println(""+number+" is not a perfect number.");
		}
	}

}
