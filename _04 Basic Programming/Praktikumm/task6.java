import javax.swing.JOptionPane;

public class Task6 {

	public static void main(String[] args) {
	//deklarasi variable
		int MasukanX = Integer.parseInt(JOptionPane.showInputDialog("Input X "));
		int MasukanN = Integer.parseInt(JOptionPane.showInputDialog("Input N "));
		
		JOptionPane.showMessageDialog(null,+Math.pow(MasukanX, MasukanN)); //+mathpow rumus pangkat
		
	}

}
