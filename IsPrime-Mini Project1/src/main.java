
public class main {

	public static void main(String[] args) {
		int number = 1;
		int counter=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				counter++;
			}
			
		}
		if(counter>0 || number==0 || number==1) {
			System.out.println(""+number+" is not prime number.");
		}
		else {
			System.out.println(""+number+" is prime number.");
		}
	}

}
