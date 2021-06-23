package overridingProject;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Hewan[] hewan = {
				new Anjing("Broni","Herder"),
				new Kucing("Broni","Herder"),
				new Ayam("Broni","Herder"),
			};
		Hewan pilihHewan;
		Random pilih = new Random(2);
		int k = pilih.nextInt() ;
		for(int i=0;i<k; i++) {
			pilihHewan = hewan[k];
			System.out.println("\nPilihan anda : \n"+pilihHewan);
			pilihHewan.bersuara();
		}
	

	}

}
