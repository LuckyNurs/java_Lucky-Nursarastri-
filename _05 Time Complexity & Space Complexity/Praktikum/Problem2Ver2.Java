package Section_5_Time_Complexcity;

import java.util.Scanner;

public class Task_2 {
	
	    public static void main(String[] args) {

	        Scanner input=new Scanner(System.in);

	        System.out.print("Masukkan Bilangan berpangkat:");

	        int A=input.nextInt();

	        System.out.print("Masukkan Banyak pangkat:");

	        int B=input.nextInt();

	        int Hasil=(int) Math.pow(A, B);

	        System.out.println("Hasil Pangkatnya:"+Hasil);

	    }   

	}
