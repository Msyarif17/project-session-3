package overridingProject;

public class Hewan {
	public String tipe;
	public Hewan(String tipe) {
		this.tipe = tipe;
	}
	public String toString() {
		return "ini adalah" + tipe;
	}
	public void bersuara() {
		System.out.println("hewan bersuara");
	}

}
