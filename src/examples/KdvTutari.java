package examples;

import java.util.Scanner;

public class KdvTutari {
	public static void main(String[] args) {

		double fiyat, kdvlifiyat, kdvtutari;
		Scanner scan = new Scanner(System.in);

		System.out.print("�r�n fiyat�n� giriniz :");
		fiyat = scan.nextDouble();

		if (fiyat >= 0 && fiyat <= 1000) {
			kdvtutari = fiyat * 0.18;
			kdvlifiyat = fiyat + kdvtutari;

			System.out.println("�r�n fiyat� :" + fiyat);
			System.out.println("KDV'li Fiyat :" + kdvlifiyat);
			System.out.println("KDV Tutar� :" + kdvtutari);

		} else if (fiyat > 1000) {
			kdvtutari = fiyat * 0.08;
			kdvlifiyat = fiyat + kdvtutari;

			System.out.println("�r�n fiyat� :" + fiyat);
			System.out.println("KDV'li Fiyat :" + kdvlifiyat);
			System.out.println("KDV Tutar� :" + kdvtutari);

		} else {
			System.out.println("Hatal� giri� yapt�n�z !");
		}

	}

}
