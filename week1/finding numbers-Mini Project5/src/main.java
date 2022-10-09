
public class main {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,5,7,9,0};
		int test = 7;
		int counter=0;
		for(int number:numbers) {
			if(number==test) {
				counter++;
			}
			
		}
		if(counter>0) {
			System.out.println(""+test+" is in the list.");
		}
		else {
			System.out.println(""+test+" is not in the list.");
		}
	}

}
