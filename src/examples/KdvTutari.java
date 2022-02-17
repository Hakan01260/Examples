package examples;

import java.util.Scanner;

public class KdvTutari {
	public static void main(String[] args) {

		double fiyat, kdvlifiyat, kdvtutari;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ürün fiyatýný giriniz :");
		fiyat = scan.nextDouble();

		if (fiyat >= 0 && fiyat <= 1000) {
			kdvtutari = fiyat * 0.18;
			kdvlifiyat = fiyat + kdvtutari;

			System.out.println("Ürün fiyatý :" + fiyat);
			System.out.println("KDV'li Fiyat :" + kdvlifiyat);
			System.out.println("KDV Tutarý :" + kdvtutari);

		} else if (fiyat > 1000) {
			kdvtutari = fiyat * 0.08;
			kdvlifiyat = fiyat + kdvtutari;

			System.out.println("Ürün fiyatý :" + fiyat);
			System.out.println("KDV'li Fiyat :" + kdvlifiyat);
			System.out.println("KDV Tutarý :" + kdvtutari);

		} else {
			System.out.println("Hatalý giriþ yaptýnýz !");
		}

	}

}
