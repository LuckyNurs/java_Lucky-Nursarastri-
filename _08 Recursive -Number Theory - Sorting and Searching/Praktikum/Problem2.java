package Section_8_Rekursif;

public class Problem_2_Fibonacci {
	 public static long temp(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return temp(n - 1) + temp(n - 2);
	   }
	   public static void main(String[] args) {
	      System.out.println("The 0th fibonacci number is: " + temp(0));
	      System.out.println("The 7th fibonacci number is: " + temp(7));
	      System.out.println("The 12th fibonacci number is: " + temp(12));
	   }
	}

