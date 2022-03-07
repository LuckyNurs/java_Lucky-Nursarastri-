package Section_8_Rekursif;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // tambahin function
		System.out.println("Masukkan angka: ");
		int n = input.nextInt();
//	for (int i=0; i <20 ; i++) {
		//System.out.println(i+" "+PrimeCheck(i));
	//}
		System.out.println(PrimeX(n));		}

	private static boolean PrimeCheck(int n) {
		boolean hasil = true;
		int Temp = 0;

		if (n == 0 || n == 1) {
			hasil = false;

		} else {

			for (int i = 2; i <= n / 2; i++) {

				if (n % i == 0) {
					hasil = false;

				}

			}

		}
		return hasil;

	}

//n=5
	static int PrimeX(int n) {
		int Temp = 0;
		int counter = 0;
		while (Temp != n) {
			if (PrimeCheck(counter))//
				{
				Temp++;// kalau nilai true temp dan counter increament
				counter++;// Temp=2

			} else {
				counter++; // c=2
			}

		}
		return counter - 1;
	}
}
