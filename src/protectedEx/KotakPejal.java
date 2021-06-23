package protectedEx;

public class KotakPejal extends Kotak {
	protected double berat;
	public KotakPejal(int p, int l ,int t,int b) {
		panjang = p;
		lebar =l;
		tinggi = t;
		berat = b;
	}
	public double getBerat() {
		return berat;
	}

}
