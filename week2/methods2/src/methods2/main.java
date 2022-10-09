package methods2;

public class main {

	public static void main(String[] args) {
		String message="Bugün hava güzel.";
		String newMessage= message.substring(0,2);
		System.out.println(newMessage);
		int number = Sum(5,7);
		System.out.println(number);
		int toplam = topla(2,3,4,5,12,32,33,66);
		System.out.println(toplam);
		
		
	}
	public static void Ekle() {
		System.out.println("Eklendi");
	}
	
	
	public static void Sil() {
		System.out.println("silindi");
	}
	
	
	public static void Guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int Sum(int number1,int number2) {
		return number1+number2;
	}
	
	public static int topla(int... numbers) {
		int toplam = 0;
		for(int number:numbers) {
			toplam+=number;
		}
		return toplam;
	}

}
