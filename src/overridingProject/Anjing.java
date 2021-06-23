package overridingProject;

public class Anjing extends Hewan{
	private String nama;
	private String jenis;
	
	public Anjing(String nama) {
		super("Anjing");
		this.nama = nama;
		this.jenis = "tidak diketahui";
		
	}
	public Anjing(String nama, String jenis) {
		super("Anjing");
		this.nama = nama;
		this.jenis = jenis;
		
	}
	@Override
	public String toString() {
		return super.toString()+"\nini adalah" + jenis +"bernama " + nama;
	}
	@Override
	public void bersuara() {
		System.out.println("GUK GUK GUK");
	}
}
