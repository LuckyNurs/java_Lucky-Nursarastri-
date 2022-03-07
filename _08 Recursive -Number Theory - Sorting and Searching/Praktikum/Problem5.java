package Section_8_Rekursif;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Problem5 {

	private static void MostAppear (List<String> arraystring) {
		HashSet<String> key = new HashSet<>(arraystring);
		 HashMap<String,Integer> map = new HashMap<>();
		 for (String string : key) {
			 map.put(string, 0);
			 
		 }
		 for (String string : arraystring) {
			Iterator<String> iterator = key.iterator();
			while (iterator.hasNext()) {
				if(iterator.next().equals(string)) {
				map.put(string,map.get(string)+1);					
				}
			}
			
			 
		 }
	System.out.println(map);
	List<Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
	list.sort(Entry.comparingByValue());
	list.forEach(System.out::print);
	}
	public static void main (String[] args) {
		List<String> arraylist = new ArrayList<>(Arrays.asList("js", "js", "golang", "ruby", "ruby", "js", "js"));
		MostAppear(arraylist);
	}
	
	

}
