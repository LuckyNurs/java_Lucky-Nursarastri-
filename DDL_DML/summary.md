Bahasa Definisi Data (DDL) dan Bahasa Manipulasi Data (DML) bersama-sama membentuk Bahasa Basis Data. Perbedaan mendasar antara DDL dan DML adalah bahwa DDL (Data Definition Language) digunakan untuk Menentukan struktur skema database. Di sisi lain, DML (Data Manipulation Language) digunakan untuk mengakses, memodifikasi atau mengambil data dari database
Definisi DDL (Bahasa Definisi Data)
DDL adalah singkatan dari Data Definition Language. Bahasa Definisi Data mendefinisikan struktur basis data atau skema basis data. DDL juga mendefinisikan properti tambahan dari data yang didefinisikan dalam database, sebagai domain dari atribut. Bahasa Definisi Data juga menyediakan fasilitas untuk menentukan beberapa kendala yang akan menjaga konsistensi data.

Mari kita bahas beberapa perintah DDL:

CREATE adalah perintah yang digunakan untuk membuat Database atau Tabel baru.
Perintah ALTER digunakan untuk mengubah konten dalam Tabel.
DROP digunakan untuk menghapus beberapa konten dalam database atau tabel.
TRUNCATE digunakan untuk menghapus semua konten dari tabel.
RENAME digunakan untuk mengubah nama konten dalam database.

Orang dapat melihat bahwa DDL hanya mendefinisikan kolom (atribut) dari Tabel. Seperti bahasa pemrograman lainnya, DDL juga menerima perintah dan menghasilkan output yang disimpan dalam kamus data (metadata).



Definisi DML (Bahasa Manipulasi Data)
DML adalah singkatan dari Data Manipulation Language . Skema (Tabel) yang dibuat oleh DDL (Data Definition Language) diisi atau diisi menggunakan Data Manipulation Language. DDL mengisi baris tabel, dan setiap baris disebut Tuple . Menggunakan DML, Anda dapat menyisipkan, memodifikasi, menghapus, dan mengambil informasi dari Tabel.

DML prosedural dan DML deklaratif adalah dua jenis DML. Di mana DML prosedural menjelaskan, data apa yang akan diambil dan juga cara mendapatkan data itu. Di sisi lain, DML Deklaratif hanya menjelaskan data apa yang akan diambil. Itu tidak menjelaskan cara mendapatkan data itu. DML deklaratif lebih mudah karena pengguna hanya perlu menentukan data apa yang diperlukan.

Perintah yang digunakan dalam DML adalah sebagai berikut:

SELECT digunakan untuk mengambil data dari Tabel.
INSERT digunakan untuk mendorong data dalam Tabel.
UPDATE digunakan untuk mereformasi data dalam Tabel.
HAPUS digunakan untuk menghapus data dari Tabel.


