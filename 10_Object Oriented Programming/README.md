# Section 10

## Object Oriented Programming

Apa itu OOP?
- OOP merupakan sebuah paradigma atau sebuah teknik pemrograman yang berorientasikan objek.
- Setiap fungsi dan variable dibungkus dalam sebuah class yang dapat saling berinteraksi sehingga membentuk sebuah program.
- OOP bertujuan untuk memudahkan pengembangan sebuah program.
- Memiliki objek dan fungsi yang dibungkus dalam sebuah class.
- Keduanya dapat saling berinteraksi sehingga membentuk sebuah program.

Mengapa OOP?
- Meminimalisir program dan membuatnya terasa rapi.
- Mempercepat pembuatan aplikasi.
- Mempermudah maintenance.

Konponen-komponen OOP:
1. Class
- Bertugas untuk mengumpulkan prosedur atau fungsi dan variable dalam satu tempat.
- Blueprint atau cetakan dalam sebuah objek.
- Syntax penulisan:
public Class NamaClass {}
- Penulisan nama kelas menggunakan Pascal, dimana setiap kata diawali dengan huruf kapitan dan tanpa menggunakan spasi.
- Berisi kumpulan beberapa fungsi variable.
- Class mendefinisikan sebuah tipe dari objek.
- Sebuah class mempunyai anggota yang terdiri dari atribut dan method.

2. Object
- Sebuah variable instant yang merupakan wujud dari class.
- Object digambarkan dengan sebuah variable.
- Keyword “new” digunakan untuk melakukan instansiasi/ membuat sebuah object baru.
- Contoh:
Motor objectMotor = new Motor();

Motor (kata pertama), meripakan sebuah inisialisasi nama objek.
objectMototr (kata kedua) merupakan deklas=rasi nama objek.
Motor(), meripakan instantion object.

3. Attribute
- Bagian dari sebuah class.
- Bisa disebut sebagai properties dari sebuah class.
- Variable, ditulis dengan lowercase. Contoh int speed, int listCar.

4. Method
- Method menjelasakan bagaimana suatu attribut beraksi.
- Berupa tingkah laku atau benefial. 
- Terdiri dari variable dan acces modifier.

5. Inheritance
- Hubungan antara dua objek atau lebih.
- Tergdapat object utama yang mewariskan sifat, atribut, maupun method kepada object lain.
- Object diwariskan dengan keyword "extends".

6. Access Modifier
- Modifier merupakan bentuk pengimplementasian konsep enkapsulasi.
- Dengan adanya modifier maka class, interface, method, dan variabel akan terkena suatu
dampak tertentu.
a) Default, diwarisi subclass di paket yang sama dengan superclassnya. Dapat diakses oleh methodmethod di class-class yang sepaket.
b) Public, diwarisi oleh semua subclassnya. Dapat diakses dimanapun.
c) Protected, Diwarisi oleh semua subclassnya. Dapat diakses oleh method-method di classclass yang sepaket.
d) Private, Tidak diwarisi oleh subclassnya. Tidak dapat diakses oleh class lain.

