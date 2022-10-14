package overriding;

public class BaseKrediManager {
	//final keyword ü override yapılmasını engeller:public final double hesapla(double tutar)
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
