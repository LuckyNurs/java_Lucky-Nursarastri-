package Section_6_dan_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem6 {

	private static int hitungarray(List<Integer> arraylist) {
		int hasil = 0;
		for (int i = 0; i < arraylist.size(); i++) {
			hasil += arraylist.get(i);

		}
		return hasil;
	}

	private static int pindaharray(List<Integer> arraylist, int k) {
		List<Integer> subarray = new ArrayList<>();
		List<Integer> jmlsub = new ArrayList<>();

		for (int i = 0; i < arraylist.size() - k; i++) {
			for (int j = i; j < k + i; j++) {
				subarray.add(arraylist.get(j));

			}
			jmlsub.add(hitungarray(subarray));
			subarray.removeAll(subarray);

		}
		return Collections.max(jmlsub); // collectionmax= buat nyari nilai max

	}

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
		int k = 3;
		System.out.println(pindaharray(array, k));
	}

}
