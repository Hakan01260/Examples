package examples;

import java.util.Scanner;

public class DaireAlanBulma {
	public static void main(String[] args) {

		int r, a;
		double pi = 3.14;

		Scanner scan = new Scanner(System.in);

		System.out.print("Dairenin Yar��ap�n� Giriniz :");
		r = scan.nextInt();

		System.out.print("Dairenin Merkez A��s�n�n �l��s�n� Giriniz :");
		a = scan.nextInt();

		double alan = (pi * r * r * a) / 360;

		System.out.println("Dairenin Alan� :" + alan);

	}

}
