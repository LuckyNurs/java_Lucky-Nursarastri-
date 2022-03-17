package Section_11_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge5 {
public static void main (String[]args) {
	Board board = new Board();
	board.Menu();
}
}

interface Game { // kelas yang berisi kumpulan method/fungsi tp tanpa implementasi
	public void acak_kandang(int panjang_kandang);

	public String kandang();

	public void Menu();

	public void Input();

	public void pilih_Kandang(List<Kandang> listkandang);

}

class Kandang {
	private String isi_kandang;
	private boolean atur_kndg;

	public Kandang(String isi_kandang) {
		super();
		this.isi_kandang = isi_kandang;

	}

	public String getIsi_kandang() {
		return isi_kandang;
	}

	public void setIsi_kandang(String isi_kandang) {
		this.isi_kandang = isi_kandang;
	}

	public boolean isAtur_kndg() {
		return atur_kndg;
	}

	public void setAtur_kndg(boolean atur_kndg) {
		this.atur_kndg = atur_kndg;
	}

	public void membuka_kandang(String isi_kndng) {
		System.out.println("|||");
		System.out.println("|" + isi_kndng + "|");
		System.out.println("|||");
		System.out.println(" ");
	}

	public void membuat_kandang(int jml_kndng) {
		for (int i = 1; i <= jml_kndng; i++) {
			membuka_kandang(String.valueOf(i));
		}

	}

}

class Kandang_Kambing extends Kandang {

	public Kandang_Kambing() {
		super("K");
		// TODO Auto-generated constructor stub
	}

}

class Kandang_Bebek extends Kandang {

	public Kandang_Bebek() {
		super("B");
		// TODO Auto-generated constructor stub
	}

}

class Kandang_Zebra extends Kandang {

	public Kandang_Zebra() {
		super("Z");
		// TODO Auto-generated constructor stub
	}

}

class Board implements Game {
	private double jml_kandang;
	private Scanner input;
	private List<Kandang> listkandang;

	public Board() {

		super();
		this.input = new Scanner(System.in);
		this.listkandang = new ArrayList<>();
	}

	@Override
	public void acak_kandang(int panjang_kandang) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 3) + 1;
		for (int i = 1; i <= panjang_kandang; i++) {
			if (a == 1) {
				listkandang.add(new Kandang_Bebek());
			} else if (a == 2) {
				listkandang.add(new Kandang_Kambing());
			} else { // kalo mau pake pembanding (==) kudu make if
				listkandang.add(new Kandang_Zebra());
			}
		}

	}

	@Override
	public String kandang() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void Menu() {
		// TODO Auto-generated method stub
		loopmenu: // namain looping
		while (true) {
			System.out.println("\n Tebak Kandang");
			System.out.println("----------------------");
			System.out.println(" 1 : Jumlah Kandang");
			System.out.println("99: Exit");
			System.out.println("----------------------");
			System.out.print("Pilih menu:");
			int Menu = input.nextInt();

			// switch implikasi , if biimplikasi
			switch (Menu) {
			case 1:
				Input();
				break;
			case 99:
				break loopmenu; // berenti looping
			default:
				System.out.println("Menu tidak tersedia");

			}
		}
	}

	@Override
	public void Input() {
		// TODO Auto-generated method stub
		System.out.print("\nMasukan jumlah Kandang : ");
		int jml_kandang = input.nextInt();
		acak_kandang(jml_kandang);
		pilih_Kandang(listkandang);

	}

	@Override
	public void pilih_Kandang(List<Kandang> listkandang) {
		// TODO Auto-generated method stub
		int poin = 0;
		while (poin < listkandang.size()) {

			for (int i = 0; i < listkandang.size(); i++) {
				if (listkandang.get(i).isAtur_kndg()) {
					listkandang.get(i).membuka_kandang(listkandang.get(i).getIsi_kandang());
				} else {
					listkandang.get(i).membuka_kandang(String.valueOf(i + 1));
				}
			}
			System.out.print("Pilih kandang yang ingin dibuka :");
			int no_kndank = input.nextInt();
			System.out.println("\n ---PILIHAN---");
			System.out.println("K=Kambing");
			System.out.println("Z=Zebra");
			System.out.println("B=Bebek");
			System.out.println(" ");
			System.out.print("Masukan tebakan : ");
			String tebakan = input.next();

			if (listkandang.get(no_kndank - 1).getIsi_kandang().equals(tebakan)) {
				System.out.println("Tebakan Benar");
				listkandang.get(no_kndank - 1).setAtur_kndg(true);
				poin++;
			} else {
				System.out.println("Tebakan Salah");
			}
		}
	}

}
