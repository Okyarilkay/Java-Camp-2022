
public class main {

	public static void main(String[] args) {
		int number1=284;
		int number2=220;
		int counter1=0;
		int counter2=0;
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				counter1 = counter1 + i;
			}
		}
		for(int i=1;i<number2;i++) {
			if(number2%i==0) {
				counter2 = counter2 + i;
			}
		}
		if(counter1 == number2 && counter2==number1) {
			System.out.println(""+number1+" and "+""+number2+" are friendly numbers.");
		}
		else {
			System.out.println(""+number1+" and "+""+number2+" are not friendly numbers.");
		}
	}

}
