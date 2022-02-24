import java.util.Scanner;

import javax.swing.JOptionPane;

public class Task8 {


	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("masukan angka");
	    	int angka = sc.nextInt(); 
	 
	   	 
	        for (int i = 1; i <=angka ; i++) {
	 
	            for(int j = 1; j <= 10; j++){
	 
	                System.out.print(" " + i * j + "\t");
	            }
	            System.out.print("\n\n");
	        }
	    }
}

