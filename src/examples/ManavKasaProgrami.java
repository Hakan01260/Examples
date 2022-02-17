package examples;

import java.util.Scanner;

public class ManavKasaProgrami {
	public static void main(String[] args) {

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
		int a, e, d, m, p;

		Scanner scan = new Scanner(System.in);

		System.out.print("Kaç kilo armut almak istersiniz :");
		a = scan.nextInt();

		System.out.print("Kaç kilo elma almak istersiniz :");
		e = scan.nextInt();

		System.out.print("Kaç kilo domates almak istersiniz :");
		d = scan.nextInt();

		System.out.print("Kaç kilo muz almak istersiniz :");
		m = scan.nextInt();

		System.out.print("Kaç kilo patlýcan almak istersiniz :");
		p = scan.nextInt();

		double toplamTutar = armut * a + elma * e + domates * d + muz * m + patlican * p;

		System.out.println("Toplam Tutar :" + toplamTutar + " TL");

	}

}
