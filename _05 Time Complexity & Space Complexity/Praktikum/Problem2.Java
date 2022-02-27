
package Section_5_Time_Complexcity;
import java.util.Scanner;
public class Task_2_ver2 {

		public static void main(String[] args)
		{
			 Scanner input=new Scanner(System.in);

		        System.out.print("Masukkan Bilangan berpangkat:");

		        int x=input.nextInt();

		        System.out.print("Masukkan Banyak pangkat:");

		        int n=input.nextInt();
		        System.out.printf("%d", power(x, n));
		        
		      
		    	}
		  static int power(int x, int n)
	  	{int hasil = 1;
	  	for (int i=0; i<n ; i++ ) 
	  	{ hasil *= x ; } 
	  		return hasil;		
	  	}
		

	}
