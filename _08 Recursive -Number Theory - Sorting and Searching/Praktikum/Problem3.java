package Section_8_Rekursif;
import java.util.*;

public class Problem_3_Max_Min_Array {
	
	 public static void main(String[] args) {
		     int minimum,maksimum = 0,jumlah, i, lokasi = 0,letak = 0, array[];

		     Scanner scan = new Scanner(System.in);
		     System.out.print("Masukkan jumlah index: ");
		     jumlah = scan.nextInt();

		     array = new int[jumlah];
		     
		     System.out.println("Masukkan "+jumlah+" angka");
		     for(i = 0; i < jumlah; i++) {
		       System.out.print("index ke-"+ (i) +": " );
		       array[i] = scan.nextInt();
		     }

		     
		     minimum = array[0];
		     
		     for(i = 0; i < jumlah; i++) {
		       if (array[i] < minimum){
		         minimum = array[i];
		         lokasi = i;
		       }
		       else if (array[i] > maksimum){
		           maksimum = array[i];
		           letak = i;}
		     }

		     System.out.println("Nilai minimum adalah "+minimum+" berada di index ke "+lokasi);
		     System.out.println("Nilai maximum adalah "+maksimum+" berada di index ke "+letak);
		   
		   }
		 
}