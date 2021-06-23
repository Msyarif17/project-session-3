package overridingProject;

public class Ayam extends Hewan{
	private String nama;
	private String jenis;
	
	public Ayam(String nama) {
		super("Ayam");
		this.nama = nama;
		this.jenis = "tidak diketahui";
		
	}
	public Ayam(String nama, String jenis) {
		super("Ayam");
		this.nama = nama;
		this.jenis = jenis;
		
	}
	@Override
	public String toString() {
		return super.toString()+"\nini adalah" + jenis +"bernama " + nama;
	}
	@Override
	public void bersuara() {
		System.out.println("KUKURUYUK PETOK PETOK");
	}
}
