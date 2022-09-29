package methods;

public class main {
		
		
	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		int[] numbers= {1,2,5,7,9,0};
		int test = 11;
		int counter=0;
		for(int number:numbers) {
			if(number==test) {
				counter++;
			}
			
		}
		String message = "";
		if(counter>0) {
			Message("Number"+test+" is in the list");
		}
		else {
			Message(""+test+" is not in the list.");
		}
	}
	public static void Message(String message) {
		System.out.println(message);
	}
}
