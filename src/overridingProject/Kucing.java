package overridingProject;

public class Kucing extends Hewan{
	private String nama;
	private String jenis;
	
	public Kucing(String nama) {
		super("Kucing");
		this.nama = nama;
		this.jenis = "tidak diketahui";
		
	}
	public Kucing(String nama, String jenis) {
		super("Kucing");
		this.nama = nama;
		this.jenis = jenis;
		
	}
	@Override
	public String toString() {
		return super.toString()+"\nini adalah" + jenis +"bernama " + nama;
	}
	@Override
	public void bersuara() {
		System.out.println("meow meow");
	}
}
