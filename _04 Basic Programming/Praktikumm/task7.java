import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("masukan angka");
	    	int angka = sc.nextInt(); 
		  int i, j,k;
		  for (i=1; i<=angka; i++) {
		   for (j=1; j<=i; j++) {
		   
		    /*untuk mencetak bintang tanpa baris baru kita
		    gunakan print bukan println*/
		    
		    System.out.print("*"); //mencetak bintang pertama/bagian atas
		   }
		    System.out.println(); //ini untuk menciptakan line baru
		  }
		  for (i=1;i>=angka;i--) {
		 
		  for (j=1;j>i ; j--) {
		    System.out.print(" ");/*untuk mencetak spasi */
		   }
		  for (k=1; k<=j; k++) {
		   System.out.print("*");//mencetak bintang bagian kedua/bagian bawah
		   }
		   System.out.println(); // mencetak baris baru
	}
	}
}