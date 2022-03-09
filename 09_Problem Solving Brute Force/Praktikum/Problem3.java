package Section_9_Greedy_BruteForce_Divide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem_3 {

	public static void main(String[] args) {
		List<Integer> Diameter = new ArrayList(Arrays.asList(7, 2));// (5,4)
		List<Integer> Tinggi = new ArrayList(Arrays.asList(4, 3, 1, 2));// (8,7,4)
		System.out.println(DragonOfLoowater(Diameter, Tinggi));
	}

	public static int DragonOfLoowater(List<Integer> Diameter, List<Integer> Tinggi) {
		Set<Integer> knight = new HashSet<>();// Set untuk menghapus duplikat dan terurut
		int Temp = 0;
		Tinggi.sort(Comparator.reverseOrder());
		Diameter.sort(Comparator.reverseOrder());
		for (int i = 0; i < Diameter.size(); i++) {
			for (int j = 0; j < Tinggi.size(); j++) {
				if (Tinggi.get(j) >= Diameter.get(i)) {
					knight.add(Tinggi.get(j));
				}

			}
		}
		List<Integer> arraylist = new ArrayList<>(knight);
		if (Diameter.size() > arraylist.size() || Diameter.get(0) > arraylist.get(arraylist.size() - 1)) {
			System.out.println("knight fall");
		} else {
			for (int i = 0; i < Diameter.size(); i++) {
				Temp += arraylist.get(i);
			}
		}

		return Temp;
	}

}