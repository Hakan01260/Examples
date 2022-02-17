package examples;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {

		double boy, kilo;

		Scanner scan = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy = scan.nextDouble();

		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();

		double indeks = kilo / (boy * boy);
		System.out.println("Vücut Kitle Ýndeksiniz :" + indeks);
	}

}
