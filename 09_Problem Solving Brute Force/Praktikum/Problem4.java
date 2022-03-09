package Section_9_Greedy_BruteForce_Divide;

import java.util.Arrays;

public class Problem_4 {
	public static void main(String[] args) {
		int[]listangka = {1,1,3,5,5,6,7};
System.out.println(binarySearch(listangka,3));
	}

	private static int binarySearch(int[] listarray, int x) {
		Arrays.sort(listarray);
		int nilaiAwal = 0;
		int nilaiAkhir = listarray.length - 1;
		int nilaiTengah = (nilaiAwal + nilaiAkhir) / 2;
		while (nilaiAwal <= nilaiAkhir) {
			if (x < listarray[nilaiTengah]) {
				nilaiAkhir = nilaiTengah - 1;
			}
			else if(x> listarray[nilaiTengah]){
				nilaiAwal= nilaiTengah+1;
			}
			else {
				
			return nilaiTengah;
			}
			nilaiTengah = (nilaiAwal + nilaiAkhir) / 2;
		}
		if(nilaiAwal>nilaiAkhir) {
			return -1;
		}
		return -1;
	}

}
