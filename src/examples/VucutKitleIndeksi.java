package examples;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {

		double boy, kilo;

		Scanner scan = new Scanner(System.in);

		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy = scan.nextDouble();

		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();

		double indeks = kilo / (boy * boy);
		System.out.println("V�cut Kitle �ndeksiniz :" + indeks);
	}

}
