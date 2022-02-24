import java.util.Scanner;

import javax.swing.JOptionPane;
//kelas
public class Program_X_dan_O {

	public static void main(String[] args) {
		//agar bisa input
		Scanner input = new Scanner(System.in);
		
		 String MasukanKalimat = JOptionPane.showInputDialog("Input kalimat");
		 int panjangTeks = MasukanKalimat.length();
		 
		 
		//deklarasi variabel 
		 int Hurufx = 0;
		 int HurufO = 0;
		 
         //pengkondisian
		 
		 for (int i = 0; i <panjangTeks; i++) {
			             // untuk menghitung jumlah x
	            char cha = Character.toLowerCase(MasukanKalimat.charAt(i)); // sort code untuk mengkonvert huruf besar ke huruf kecil
	            if (cha == 'x' )
	            {
	                Hurufx++; }
	           //untuk menghitung jumlah o 
	            else if (cha == 'o')
	    	            {
	    	                HurufO++;
	    	            }  }
		 JOptionPane.showMessageDialog(null, "jumlah x " +Hurufx);
	        JOptionPane.showMessageDialog(null, "jumlah o " +HurufO);
	     
	      //pengkondisian lanjutan untuk penentuan True/False
	    	  if (Hurufx==HurufO)
	    		  
	    	  {
	    		  JOptionPane.showMessageDialog(null, "TRUE");}
	    		  else  {
	    			  JOptionPane.showMessageDialog(null, "False");
	    		  }
	    	  }
	      }
