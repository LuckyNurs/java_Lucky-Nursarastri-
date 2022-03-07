package Section_6_dan_7;

import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println(ArrayMerge(List.of("kazuya", "jin", "lee"), List.of("kazuya", "feng")));


		System.out.println(ArrayMerge(List.of("lee", "jin"), List.of("kazuya", "panda")));
	

	}

	static List<String> ArrayMerge(List<String> arrayA, List<String> arrayB) {
		HashSet<String> Temp = new HashSet<>();

		for (var arrA : arrayA) {
			Temp.add(arrA);
		}

		for (var arrB : arrayB) {
			Temp.add(arrB);
		}
		List<String> result = new ArrayList<>(Temp);
		return result;
	}
}

//hash_Set.add("kazuya");
//hash_Set.add("jin");
//hash_Set.add("kazuya");
//hash_Set.add("feng");
// System.out.println(hash_Set);