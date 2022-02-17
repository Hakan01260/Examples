package examples;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {

		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner scan = new Scanner(System.in);

		System.out.print("Matematik Notunuz :");
		mat = scan.nextInt();
		System.out.print("Fizik Notunuz :");
		fizik = scan.nextInt();
		System.out.print("Kimya Notunuz :");
		kimya = scan.nextInt();
		System.out.print("Turkce Notunuz :");
		turkce = scan.nextInt();
		System.out.print("Tarih Notunuz :");
		tarih = scan.nextInt();
		System.out.print("Muzik Notunuz :");
		muzik = scan.nextInt();

		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6.0;
		System.out.println("Ortalamanýz :" + sonuc);

		String durum = (sonuc > 60) ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";

		System.out.println(durum);

	}

}
