package Section_11_OOP;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		CalculatorImplement kalkulator = new CalculatorImplement();
		kalkulator.Menu();

	}
}

interface Calculator { // kelas yang berisi kumpulan method/fungsi tp tanpa implementasi
	double perkalian(double Value1, double Value2);

	double pengurangan(double Value1, double Value2);

	double pembagian(double Value1, double Value2);

	double pertambahan(double Value1, double Value2);

	public void Menu();

	public void Input();

	public void operation();

	public void hasil(int menu);
}

class CalculatorImplement implements Calculator { 
//Atributte 
	private double Value1;
	private double Value2;
	private Scanner input;

//Constructor
	public CalculatorImplement() {
		super();

		this.input = new Scanner(System.in);
	}

//method
	@Override
	public double perkalian(double Value1, double Value2) {
		// TODO Auto-generated method stub
		return Value1 * Value2;
	}

	@Override
	public double pengurangan(double Value1, double Value2) {
		// TODO Auto-generated method stub
		return Value1 - Value2;
	}

	@Override
	public double pembagian(double Value1, double Value2) {
		// TODO Auto-generated method stub
		return Value1 / Value2;
	}

	@Override
	public double pertambahan(double Value1, double Value2) {
		// TODO Auto-generated method stub
		return Value1 + Value2;
	}

	@Override
	public void Menu() {
		// TODO Auto-generated method stub
		loopmenu: // namain looping
		while (true) {
			System.out.println("+++++++++++++++++ CALCULATOR +++++++++++++++++");
			System.out.println(" 1 : Open Calculator");
			System.out.println("99: Exit");
			System.out.print("Masukan pilihan anda:");
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
		System.out.println("+++++++++++++++++ CALCULATOR ++++++++++++++++");
		System.out.print("Masukan Value 1 :");
		Value1 = input.nextDouble();
		System.out.print("Masukan Value 2:");
		Value2 = input.nextDouble();
		operation();
		

	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++ CALCULATOR ++++++++++++++++");
		System.out.println("Please Enter Calculation Operation");
		System.out.println("1.Add Value");
		System.out.println("2.Sub Value");
		System.out.println("3.Multiply Value");
		System.out.println("4.Divide Value");
		System.out.println("+++++++++++++++++ CALCULATOR ++++++++++++++++");
		System.out.print("Pilihan Anda:");
		int Menu = input.nextInt();
		hasil(Menu);
	}

	@Override
	public void hasil(int menu) {
		// TODO Auto-generated method stub
		switch (menu) {
		case 1: 
			pertambahan(Value1,Value2);//manggil method harus pake parameter kiki!!!!
			System.out.println("Hasil:" +pertambahan (Value1,Value2));
		break;
		case 2:
			pengurangan(Value1,Value2);
			System.out.println("Hasil:" +pengurangan (Value1,Value2));
			break;
		case 3:
			perkalian(Value1,Value2);
			System.out.println("Hasil:" +perkalian (Value1,Value2));
			break;
		case 4:
			pembagian(Value1,Value2);
			System.out.println("Hasil:" +pembagian(Value1,Value2));
			break;
			
		
		}
	
	}

}