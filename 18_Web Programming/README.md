# Section 18

## Web Programming

Front End
Front End Developer berperan mengembangkan tampilan situs dengan menggunakan bahasa pemrograman seperti CSS (Cascading Style Sheets), HTML (Hypertext Markup Language), dan Javascript. Sedangkan untuk Back End Developer bertugas memastikan bahwa sebuah situs dapat berfungsi dan diakses melalui monitoring "di balik layar".
Seorang Front End Developer bertanggung jawab atas komposisi tampilan sebuah website dan aplikasi. Mulai dari isi konten, warna-jenis-ukuran font, gambar, serta tombol-tombol yang terdapat harus membuat pengguna merasa nyaman ketika melihat dan berinteraksi di dalamnya.
Kemampuan dasar yang perlu dimiliki yaitu minimal menguasai tiga bahasa pemrograman seperti Javascript, HTML dan CSS. 

HTML
Hypertext Markup Language atau HTML adalah bahasa markup standar yang digunakan untuk membuat halaman website dan aplikasi web.
Ekstensi file HTML adalah .html atau .htm, yang bisa dilihat dengan mengunakan web browser apa pun (seperti Google Chrome, Safari, atau Mozila Firefox). Browser tersebut membaca file HTML dan merender kontennya sehingga user internet bisa melihat dan membacanya.

Kegunaan HTML antar lain:
- Membuat struktur dari halaman website
- Mengatur tampilan dan isi dari halaman web
- Membuat tabel dengan tag HTML table
- Membuat Form HTML
- Membuat gambar HTML
- Mempublikasikan halaman website secara online

Macam-macam HTML editors:
- Notepad
- Visual studio code
- Ideapad
- Ect.

Dokumentasi HTML terdiri dari 5 elemen, antara lain:
1. !DOCTYPE html, mendefinisikan dokumen sebagai sebuah file HTML
2. html, elemen root dari halaman html
3. head, berisi informasi meta tentang dokumen
4. title, menentukan judul untuk dokumen
5. body, berisi konten halaman yang terlihat

Struktur Halaman HTML

Setiap halaman HTML sudah pasti mempunyai struktur dasar yang terdiri dari : tag Doctype, tag html, tag head, dan tag body.

Basic Tag HTML

p, Tag untuk membuat paragraf
br,	Memasukan satu baris putus
hr,	Tag untuk membuat perubahan dasar kata didalam isi
!--...-- ,	Tag untuk membuat komentar

Form HTML

form		Tag untuk membuat sebuah form HTML untuk input pengguna
input, Tag untuk membuat sebuah kontrol input
textarea, Tag untuk membuat sebuah kontrol input multibaris (text area)
button, Tag untuk membuat sebuah tombol yang dapat diklik
select,	Tag untuk membuat sebuah daftar drop-down
optgroup,	Tag untuk membuat sebuah kelompok pilihan yang terkait dalam daftar drop-down
option,	Tag untuk membuat pilihan dalam daftar drop-down
label,		Tag untuk membuat sebuah label untuk sebuah elemen 
fieldset,	Grup unsur terkait dalam bentuk
legend,	Tag untuk membuat sebuah caption untuk sebuah elemen fieldset,figure, atau details
datalist,	Menentukan daftar pilihan yang telah ditetapkan untuk kontrol input (tag baru HTML5)
keygen,	Tag untuk membuat key-pair generator kolom input (tag baru HTML5)
output,	Tag untuk membuat hasil penghitungan (tag baru HTML5)

Images
img,	Tag untuk membuat gambar
map,	Tag untuk membuat gambar-peta
area,	Tag untuk membuat area dalam gambar-peta
canvas,	Digunakan untuk menggambar grafik, melalui scripting (JavaScript ) (tag baru HTML5)
figcaption,	Tag untuk membuat sebuah caption untuk elemen figure (tag baru HTML5)
figure,	Menentukan konten mandiri (tag baru HTML5)

Links

a,	Tag untuk membuat hyperlink
link,	Tag untuk membuat hubungan antara dokumen dan sumber daya eksternal (paling sering digunakan untuk link ke style sheet)
nav,	Tag untuk membuat navigasi link (tag baru HTML5)

List

ul, Tag untuk membuat daftar dengan unordered list
ol,	Tag untuk membuat daftar ordered list
li,	Tag untuk membuat sebuah item daftar
dir,	Tag untuk membuat sebuah daftar direktori (tidak disupport lagi di HTML5)
dl,	Tag untuk membuat sebuah daftar definisi
dt,	Tag untuk membuat istilah (item) dalam daftar definisi
dd,	Defines a description of an item in a definition list
menu,	Tag untuk membuat deskripsi dari item dalam daftar definisi
command,	Tag untuk membuat sebuah tombol perintah bahwa seorang pengguna dapat meminta (tag baru HTML5)

Tables
table, Tag untuk membuat tabel
caption,	Tag untuk membuat sebuah caption tabel
th,	Tag untuk membuat sebuah sel header tabel
tr,	Tag untuk membuat baris dalam sebuah tabel
td,	Tag untuk membuat sel dalam sebuah tabel

## CSS
CSS adalah bahasa Cascading Style Sheet dan biasanya digunakan untuk mengatur tampilan elemen yang tertulis dalam bahasa markup, seperti HTML. CSS berfungsi untuk memisahkan konten dari tampilan visualnya di situs.
HTML dan CSS memiliki keterikatan yang erat. Karena HTML adalah bahasa markup (fondasi situs) dan CSS memperbaiki style (untuk semua aspek yang terkait dengan tampilan website), maka kedua bahasa pemrograman ini harus berjalan beriringan.
Tak hanya penting di sisi teknis, CSS juga berpengaruh pada tampilan sebuah website.

CSS menggunakan bahasa Inggris sederhana berbasis syntax yang dilengkapi dengan sekumpulan rule yang mengaturnya. Seperti yang telah kami sebutkan sebelumnya, HTML tidak dibuat untuk menerapkan elemen style, hanya markup halaman saja. HTML dirancang semata-mata untuk mendeskripsikan konten.
Sintaks CSS terdiri dari tiga bagian: pemilih atau selektor (selector), sifat atau properti (property), dan nilai (value). “Selektor” biasanya adalah elemen atau tag HTML yang akan didefinisikan, “properti” adalah atribut yang akan diganti dengan “nilai” tertentu.

Menambahkan file CSS

1. Inline, menginput kode CSS langsung ke dalam tag HTML dengan menggunakan atribut style.
2. Internal, memisahkan kode CSS dari tag HTML namun tetap dalam satu halaman HTML. Atribut style yang sebelumnya berada di dalam tag, dikumpulkan pada pada sebuah tag <style>. Tag style ini harus berada pada bagian <head> dari halaman HTML.
3. External, Metode External Style Sheets digunakan untuk ‘mengangkat’ kode CSS tersebut kedalam sebuah file tersendiri yang terpisah sepenuhnya dari halaman HTML. Setiap halaman yang membutuhkan kode CSS, tinggal ‘memanggil’ file CSS tersebut.


CSS Grouping
Grouping selector CSS ialah teknik menuliskan perintah CSS dimana elemen yang memiliki style CSS yang sama akan dikelompokkan/digroupkan dengan elemen lainnya. Tujuannya ialah untuk meminimalisir penulisan perintah CSS yang sama secara berulang-ulang.
Contoh:
 h1,h2,p
{
color:green;
}

CSS Margin dan Padding

Margin dan Padding adalah properti dari CSS yang digunakan untuk mengatur sisi tiap elemen pada HTML. Secara garis besar, margin digunakan untuk menata letak dari sisi luar, sedangkan padding digunakan untuk menata letak dari sisi dalam.


## Front End Framework

Framework frontend adalah adalah sebuah paket yang berisi kode file dan folder pra-tulis, terstandarisasi.
Bootstrap adalah framework HTML, CSS, dan JavaScript yang berfungsi untuk mendesain website responsive dengan cepat dan mudah. 

## Sistem Grid HTML

Sistem Grid adalah sistem yang digunakan Bootstrap untuk mengatur tata letak (layout). Sistem ini terdiri dari 12 kolom dan 6 breakpoint.
Breakpoint adalah ukuran lebar yang menentukan tampilan responsif terhadap ukuran viewport perangkat tertentu.