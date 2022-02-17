package examples;

import java.util.Scanner;

public class DaireAlanBulma {
	public static void main(String[] args) {

		int r, a;
		double pi = 3.14;

		Scanner scan = new Scanner(System.in);

		System.out.print("Dairenin Yarýçapýný Giriniz :");
		r = scan.nextInt();

		System.out.print("Dairenin Merkez Açýsýnýn Ölçüsünü Giriniz :");
		a = scan.nextInt();

		double alan = (pi * r * r * a) / 360;

		System.out.println("Dairenin Alaný :" + alan);

	}

}
