package Section_9_Greedy_BruteForce_Divide;
import java.util.ArrayList;
import java.util.List;

public class Problem_2 {
	
	public static void main (String[] args) {
		System.out.println(listcoin(432));
	}


	public static List<Integer> listcoin(int money){
		var koin = List.of(1000,5000,2000,1000,500,200,100,50,20,10,1);
		List<Integer> result = new ArrayList<>();
		
		for (var coin : koin) {
			while (money>=coin) {
				result.add(coin);
				money-=coin;
			}
		}
		
		return result;
	}
	}

