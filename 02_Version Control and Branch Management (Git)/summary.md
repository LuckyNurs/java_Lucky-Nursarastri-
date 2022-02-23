# Resume Materi Version Control and Branch Management (Git)

Version Control System adalah suatu sistem yang dapat mendeteksi tiap-tiap perubahan yang terjadi di dalam suatu source code atau biasa disebut Versionning.

Terdapat perkembangan tipe Version Control System (VCS), yaitu :

Single User Version Control System (lokal). Contohnya : SCCS 1972,RCS 1982 Unix only Centralized Version Control System (terpusat). Contohnya : CVS 1986,Perfoce,Subversion 2000 track directory structure Distributed Version Control System (terdistribusi). Contohnya : Git 2005 , Mercurial - 2005 , Bazaar 2005

GIT menjadi salah satu VCS yang populer digunakan para developer untuk mengembangkan software secara bersamaan secara paralel.

Cara install Git Penginstalan Git dapat dilakukan di Mac,Linux,Windows karna saya memakai sistem operasi windows maka berikut adalah cara install Git di windows

Silahkan buka website resminya Git ( git-scm.com).
Kemudian unduh sesuai arsitektur Komputer yang dipakai.
Klik file instaler Git yang sudah diunduh
Klik Next sampai pengaturan PATH Environment . Pilih Use Git from the Windows Command Prompt agar git dapat dikenali di CMD. Kemudian Klik Next sampai akhir proses instalasi
Konfigurasi Awal Git -git config --global user.name "Username" -git config --global user.email "ikkyhtp@gmail.com"
Kemudian periksa konfigurasi dengan perintah git config --list jika username dan email sesuai, konfigurasi selesai. jangan lupa untuk menyamakan email dan username dengan akun github kamu.
Kemudian apasih GitHub ? Github adalah aplikasi basis website dengan VCS yang menyediakan layanan untuk menyimpan repository dengan gratis. aplikasi ini memungkinkan kita untuk mengedit repository secara pribadi ataupun bersamaan dengan programmer lain. Kemudian bagaimana caranya meng syncronize git ke github?

hal pertama yang harus kamu lakukan adalah membuat repository Lakukan perintah git init pada terminal kamu git init berfungsi untuk membuat repository pada file lokal yang nntinya akan muncul di folder .git kemudian tambahkan ke remote server dengan cara git remote add kemudian git add . lalu simpan perubahan yang kamu lakukan dengan command sbb git commit -m "keterangan perubahan" lalu untuk memindahkan source file yang ada di repository kita ke remote repository yang ada di github gunakan command git push -u

berikut adalah perintah dasar git

Git init : untuk membuat repository pada file lokal yang nantinya ada folder .git Git status : untuk mengetahui status dari repository lokal Git add : menambahkan file baru pada repository yang dipilih Git commit : untuk menyimpan perubahan yang dilakukan, tetapi tidak ada perubahan pada remote repository. Git push : untuk mengirimkan perubahan file setelah di commit ke remote repository. Git branch : melihat seluruh branch yang ada pada repository Git checkout : menukar branch yang aktif dengan branchyang dipilih GIt merge : untuk menggabungkan branch yang aktif dan branch yang dipilih Git clone : membuat Salinan repository lokal
