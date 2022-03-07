package Section_8_Rekursif;

import java.io.*;
import java.util.*;

public class Problem4_Maximum_Buy_Product {


	private static int MaxbuyProduct (int jml_uang,List<Integer> listharga) {
		int max = 0;
	listharga.sort(Comparator.naturalOrder());
	for ( int i=0; i<listharga.size(); i++) {
		if (jml_uang-listharga.get(i)>=0) {
			jml_uang-=listharga.get(i);
			max++;
		}
	}
	return max;
	
	}
	

	// Driver code
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>(Arrays.asList(25000, 25000, 10000, 14000));
		int money = 50000;
		
		System.out.println(MaxbuyProduct(money,arraylist));


	}

}
