package methodOverloading;

public class main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(2, 3));
		int sonuc = dortIslem.topla(4, 5, 6);
		System.out.println(sonuc);
	}

}
