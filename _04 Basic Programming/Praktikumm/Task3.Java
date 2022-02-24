import javax.swing.JOptionPane;

public class Task3_Faktorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//memunculkan dialog input
		
		int MasukanAngka = Integer.parseInt(JOptionPane.showInputDialog("Input Angka "));
		 
		
		 int Hasil = 0;
		 
		
		     
		 
		 //pengkondisian 
		 for (int i = 1; i<=MasukanAngka; i++) {
        if ( MasukanAngka % i ==0 )  
        {
        	JOptionPane.showMessageDialog(null,+i);  
        	}      }
     
		
		
		
		
		
	}

}