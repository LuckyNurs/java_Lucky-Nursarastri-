import java.util.Scanner;

import javax.swing.JOptionPane;
public class Menghitung_Vokal_Konsonan_Karakter {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		

     //menentukan Variabel
        int Konsonan = 0;
        int Vokal = 0;
        int nonhuruf = 0;
       
    	
     
	
       //memunculkan textbox 
        String MasukanKalimat = JOptionPane.showInputDialog("Input kalimat");
        int panjangTeks = MasukanKalimat.length();
        int textlength=0;
        
        
        //pengkondisian

        for (int i = 0; i <panjangTeks; i++) {
            // untuk cek huruf vokal
            char cha = Character.toLowerCase(MasukanKalimat.charAt(i)); // sort code untuk mengkonvert huruf besar ke huruf kecil
            if (cha == 'a' || 
            	cha == 'i' || 
            	cha == 'u' || 
            	cha == 'e' || 
            	cha == 'o') 
            {
                Vokal++;
            } // untuk cek huruf konsonan
            else if (cha   == 'b' || cha == 'c' || cha == 'd' || cha == 'f'
                    || cha == 'g' || cha == 'h' || cha == 'j' || cha == 'k' || cha == 'l'
                    || cha == 'm' || cha == 'n' || cha == 'p' || cha == 'q'
                    || cha == 'r' || cha == 's' || cha == 't' || cha == 'v'|| cha == 'w'
                    || cha == 'x' || cha == 'y' || cha == 'z') 
            {
                Konsonan++;
            } // untuk cek karakter nonhuruf
          
            else {
                nonhuruf++;
                
            }
         
        }
        //pengkondisian selanjutnya untuk menghitung karakter
      for(int j = 0; j < MasukanKalimat.length(); j++) {    
            if(MasukanKalimat.charAt(j) != ' ') ;   
            {
            	textlength++;    
            }
        }
       
      
        JOptionPane.showMessageDialog(null, "Huruf Vokal " +Vokal);
        JOptionPane.showMessageDialog(null, "Huruf Konsonan " +Konsonan);
        JOptionPane.showMessageDialog(null, "Non Huruf " +nonhuruf);
        
        JOptionPane.showMessageDialog(null, "Jumlah Karakter " +textlength);
    	
    	
    }
}

