package Section_5_Time_Complexcity;

import java.util.Scanner;

public class Task_1 {
public static void main(String args[]){ 
		
		//input nilai n
		    Scanner input = new Scanner(System.in);
		    System.out.println("Masukkan angka: ");
		    int n  = input.nextInt();
		   
		    //variabel yang dipakai
		    int i ;
		    int m = 0;
		    int Temp = 0;      
			  //nomor yang akan di cek  
		    m=n/2; //m adalah nilai n yang dibagi dua agar mempersingkat waktu pengulangan
		           
          
		  if(n==0||n==1)//agar ketika diinput 0 / 1 tidak terdeteksi bilangan prima
			{  
		   System.out.println(n+" adalah bilangan komposit");   
		    }
		  else{  
		   for(i=2;i<= m;i++){      
		    if(n % i== 0){      
		     System.out.println(n+" adalah bilangan komposit");      
		     Temp = 1;      
		     break;      
		    }      
		   }      
		   if(Temp==0)  { System.out.println(n+" adalah bilangan Prima"); } 
		  }// else selesai
		}    
		}   

