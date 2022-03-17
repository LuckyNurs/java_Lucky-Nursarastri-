package Section_10_Dynamic_Programming;

public class Problem2 {
	public static int deret(int n) {
		int nilai = 0;
		int[] listangka = new int[n+1];
		listangka[0] = 0;
		listangka[1] = 1;

		for (int i = 2; i <listangka.length; i++) {
		listangka[i]= listangka[i-1] + listangka[i-2];
		}
		return listangka[n];
	}

	
	public static void main(String[] args) {
		System.out.println(deret(5));
	}
}
