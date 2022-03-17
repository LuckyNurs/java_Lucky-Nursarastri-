package Section_10_Dynamic_Programming;

public class Problem1 {
	 public static long temp(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return temp(n - 1) + temp(n - 2);
	   }
	 
	   public static void main(String[] args) {
	      System.out.println("The 5th fibonacci number is: " + temp(5));

	   }
}
