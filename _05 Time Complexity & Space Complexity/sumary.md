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
