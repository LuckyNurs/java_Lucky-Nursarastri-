import javax.swing.JOptionPane;

public class Task4_BilanganPrima {

	public static void main(String[] args) {
		
		int MasukanAngka = Integer.parseInt(JOptionPane.showInputDialog("Input Angka "));
		int temp = 0;
	
    //pengkondisian
		for (int i=1 ; i <= MasukanAngka; i++)  //i dimulai dari 1 , dalam rentang i <= angka yg diinput, maka i bertambah
		{
			if (MasukanAngka%i==0) {
				temp++;
			}
				
		}
		if (temp == 2)
		{
			JOptionPane.showMessageDialog(null,"Bilangan " +MasukanAngka+ " Adalah Bilangan Prima");
		}
		else {
			JOptionPane.showMessageDialog(null,"Bilangan "+MasukanAngka+ " Bukan Bilangan Prima");}
			
		
	}

}
