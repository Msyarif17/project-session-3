package protectedEx;

public class Kotak {
	protected double panjang ;
	protected double lebar ;
	protected double tinggi ;
	
	Kotak() {
		panjang = lebar = tinggi = 0 ;
	}
	public double hitungVolume() {
		return panjang*lebar*tinggi;
	}

}
