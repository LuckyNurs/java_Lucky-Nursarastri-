Time Complexity 
Time complexity menyatakan berapa lama suatu algoritma berjalan ketika runtime berdasarkan input yang diberikan.

Dalam perhitungan time complexity yang dinotasikan dengan Big-O notation , ada beberapa aturan yang berlaku

**abaikan konstanta, misalkan O(N + 2), maka dianggap O(N) saja.
abaikan non dominant terms,misalkan O(N² + N), maka dianggap O(N²) saja.

// contoh 1
int add(inta,intb) {
    return a + b;
}

ini adalah O(1) karena ia hanya menjalankan satu kali instruksi return

//contoh 2
 for (int i = 1; i<=n; i++) {
        if ( n % i == 0 ) 
        {
    System.out.println("Hasilnya: " +i);
        	}      }
Fungsi diatas memiliki time complexity O(n) karena ia menjalankan looping untuk menghitung faktorial sebanyak n yang di input.

//contoh 3
 for (int i = 1; i <=a.length ; i++) {
	 
 for(int j = 1; j <= b.length ; j++){
	 
 System.out.print(" " + i * j + "\t");
 Anggap saja, panjang array a dinotasikan sebagai N , dan panjang array b dinotasikan sebagai M , maka time complexity diatas bisa dihitung sebagai berikut:
1+1+N+M= O (N+M)


Space complexity menyatakan berapa banyak ruang dalam memori yang dibutuhkan suatu algoritma ketika beroperasi.
//contoh 1
int add(int a, int b) {
    return a + b;
}
Fungsi ini membutuhkan 2 unit ruang, yaitu 2 parameternya, dan ketika fungsi ini dijalankan, alokasi ruang memori ini akan tetap, berapapun inputnya, sehingga space complexitynya O(1).

//contoh 2
double average(double[] numbers) {
    double sum = 0;
    for(double number: numbers) {
        sum += number;
    }
    return sum / numbers.length;
}
Fungsi ini akan membutuhkan N unit ruang, yaitu parameter numbers nya, dan 1 unit ruang untuk sum. Space complexitynya O(n), dikarenakan fungsi average akan membutuhkan setidaknya N unit ruang di memori, bergantung panjang arraynya.
