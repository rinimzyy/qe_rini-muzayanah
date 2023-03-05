## Section 8

# Linux Basic Command

Linux command adalah sebuah utilitas dari sebuah sistem operasi linux. Tugas dasar dilakukan dengan command line di terminal linux. Terminal sendiri merupakan antarmuka baris berintah untuk berinteraksi dengan sistem. Command linux bersifat fully text-based dan case sensitive (Membedakan huruf besar dan huruf kecil.


Kelebihan:
- Sangat berguna karena lebih cepat jika dibandingkan dengan GUI. 
- Less resources, resources lebih sedikit sehingga lebih ringan karena tidak memerlukan komputer dengan spesifikasi tinggi.
- Repetitive Task Friendly, multitasking. Dapat menyimpan script untuk mengotomatisasikan tugas yang sama berulang kali.
- Powerful. Lebih stabil dibandingkan dengan GUI karena hanya menggunakan text.


Linux command struktur:
cara menggunakan: pergi ke terminal
command [option] [parameters]

contoh:
(ls adalah perintah untuk menampilkan  seluruh folder)
ls -a /usr (untuk mengetahui likasi folder usr)
ls -a -l (menampilkan folder dan juga permission)
ls -al (menampilkan folder dan juga permission)

Jenis-jenis command linux:
Basic command:
- Cal, menampilkan calender.
- Date, menampilkan tanggal hari ini.
- ect.

File system command
- touch, membuat suatu file baru yang kosong.
Contoh: touch seno.html -> isinya file html kosong
- cat, membuat file dan bisa membuat penulisan. Membuat daftar konten atau isi file.
contoh cat > seno.html
- cp, mealakukan copy data/file.
    - cp seno.html /home/Dokumen
    - cp seno.html /home/Dokumen/contoh
    - cp seno.html halo.html (copy dengan nama yang berbeda)
    - cp seno.html /home/Dokumen halo.html (pindah folder kemudian copy dengan nama yang berbeda)
- mv (move), untuk memindahkan file. Bisa juga digunakan untuk mengganti atau mengubah nama file.
Contoh: mv seno.html /home/Dokumen
- rm, menghapus file di dalam suatu direktori.
Contoh: rm seno.html /home/Dokumen/contoh
- mkdir, membuat direktori baru.
Contoh: mkdir nama_file
- rmdir, menghapus sebuah direktori.
Contoh: mkdir nama_file
- cd, mengunjungi sebuah direktori.
- pwd, mengetahui posisi kita ada di folder mana.

Processes control commands:
- top, menampilkan daftar proses yang sedang berlangsung.
- clear, membersihkan terminal (semua command sebelumnya).
- history, riwayat command yang kita lakukan mulai dari awal kita menghidupkan linux.
- ect.

Utilities program commands
- ls, menampilkan file di posisi kita saat ini.
- which, mencari file yang dapat dieksekusi terkait dengan command yang diberikan.
- sudo (super user do), menjalankan perintah yang memerlukan hak akses dan permission administratif atau root. Tidak disarankan digunakan untuk melakukan tugas harian karena bisa terjadi error kapan saja jika kita melakukan kesalahan.
- find, untuk mecari file dan direktori, berfokus kepada menemukan file di dalam direktori yang diberikan.
- ect.

File access permissiom
- chmod, digunakan untuk membaca, menulis, dan menjalankan permission dari file dan direktori (Terdapat nomor-nomor tertentu yang digunakan untuk menentukan permission).
- chown, memungkinkan kita unutk mengubah atau mentransfer kepemilikan file khusus atau spesifik.
- ect.

Output dari sebuah command:
drwxrwxrwx 2 vboxuser wheel 64 Feb 8 06.00 access_directory
- drwxrwxrwx (Pesmission)
- 2 (Count of file)
- vboxuser (owned by (user))
- wheel (owned by (group))
- 64 (Size)
- Feb 8 06.00 (Create date)
- access_directory (File/directory)

drwxrwxrwx:
- d (File type) : menunjukkan file regular, menunjukkan direktori
- rwx : read, writre, execute file permission for the file owner
- rwx : read, writre, execute file permission for the file owner on the files
- rwx : read, writre, execute file permission for all other user
- rwx memiliki bilangan biner 111 dan bilangan desimal 7


Shell Script:
- Merupakan sebuah bahasa pemrograman yang disusun berdasarkan command-command shell. 
- Shell merupakan jembatan yang berfungsi sebagai jembatan antara user dan kernel.

Keuntungan:
- Ketika perlu mengeksekusi beberapa command secara berturut-turut membuat kita harus menunggu command pertama selesai terlebih dahulu.
- Dengan shell script tidak perlu menunggu, cukup menuliskan command-command yang akan dilakukan sesuai urutan.

Contoh shell script:
echo: digunakan untuk menampilkan sebuah kalimat
echo '#!/bin/sh' > my-script.sh (membuat file dan isinya)
echo 'echo Hello Word' >> my-script.sh (menambahkan di baris berikutnya pada file my-script.sh)
cat my-script.sh (menampilkan isi file my-script.sh)
./my-script.sh (menjalankan file. jika pesmission ditolah, cek dulu permission untuk file tersebut)
chmod 755 my-script.sh (mengubag permission agar dapat diexecute)
nano (untuk menggunakan text editor bawaan)
