import javax.swing.JOptionPane;

public class Task5_Polindrome {

	public static void main(String[] args) {
		
		String Kata= JOptionPane.showInputDialog("Input Kata");
	String temp = "" ;
	
	int panjangKata=Kata.length();
	//pengkondisian 
	for (int i=panjangKata-1; i>=0; i--) {  //untuk i dimulai dari panjang kata - 1, dari rentang i>=0, maka i berkurang 1
		char cha =Kata.charAt(i); //variabel tambahan
		temp+= String.valueOf(cha);
		
	}
	if (Kata.toLowerCase().equals(temp.toLowerCase())) {
		JOptionPane.showMessageDialog(null,"Kata "+Kata+ " Adalah Polindrome");}
	
	else {JOptionPane.showMessageDialog(null,"Kata "+Kata+ " Bukan Polindrome");}
	}

}
