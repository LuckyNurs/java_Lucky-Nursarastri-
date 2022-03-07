package Section_6_dan_7;

import java.util.ArrayList;
import java.util.Arrays;
public class Problem4 {


		    public static void main(String args[]) {
		        int[] array1 = {1,2,3,4};
		        int[] array2 = {1,3,5,10,16};
		        ArrayList<Integer> unik = new ArrayList<>();
		        ArrayList<Integer> dup = new ArrayList<>();

		        // get the duplicate (common) numbers
		        // get the unique numbers of array1 when compared to array2
		        for(int i=0; i<array1.length; i++){
		            boolean duplicate = false;
		            for(int j=0; j<array2.length; j++){
		                if(array1[i] == array2[j]){
		                    dup.add(array1[i]);
		                    duplicate = true;
		                    break;
		                }
		            }
		            if (!duplicate) {
		                unik.add(array1[i]);
		            }
		        }

		        // Add the unique numbers of array2 when compared to array1
		        for(int j=0; j<array2.length; j++){
		            boolean duplicate = false;
		            for(int i=0; i<array1.length; i++){
		                if(array1[i] == array2[j]){
		                    duplicate = true;
		                    break;
		                }
		            }
		            if (!duplicate) {
		                unik.add(array2[j]);
		            }
		        }

		        System.out.println("terdapat 2 array: "+Arrays.toString(array1) + " and "+Arrays.toString(array2));
		        System.out.println("angka duplikatnya adalah: "+dup);
		        System.out.println("element uniqe antara dua array adalah: "+unik);
		    }

		}
		     


