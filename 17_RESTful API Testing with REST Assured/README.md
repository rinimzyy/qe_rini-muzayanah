# Section 17

## RESTful API Testing with Rest Assured

- Rest merupakan standar arsitektur berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web.
- REST API singkatan dari "Representational State Transfer". API RESTful adalah antarmuka yang digunakan oleh dua sistem komputer untuk bertukar informasi secara aman melalui internet dengan menggunakan HTTP method.
- Rest juga merupakan implementasi dari web service yang digunakan sebagai standar pertukaran data antar aplikasi ataupun sistem.
- Rest API memiliki aturan atau batasan yang mampu membatasi developer untuk mengakses atau melakukan tindakan-tindakan tertentu dalam sebuah database.
- API merupakan penghubung, sedangkan Rest merupakan aturan.
- Data yang digunakan biasanya berupa JSon.

API workflow:
Client melakukan request-> API menyampaikan request ke system-> System memberikan respon melalui API->API memberikan respon kepada client.

- API berperan sebagai pembawa pesan dari client dan memberi tahu sistem apa yang harus dilakukan dan memberikan response atas request yang diinginkan.

## Fundamental API

1. Record, define API information
2. Parsing, filter or recording API data and then extract
3. Recontruction API calls, and sent them from a simulate client
4. Test validation

## Fubdamental API Integrations
- Mobile App
- API Server
- Axt Process
- API Testing

## Test Pyramid

- Semakin naik, test yang dilakukan semakin sedikit

1. Unit testing (paling bawah)
- Pengujian yang menguji setiap unit atau komponen dari perangkat lunak
- Dilakukan saat masa pengembangan atau saat menuliskan kode program
- Komponen yang diuji adalah unit-unit dari perangat lunak yang dibangun
- Dapat berupa method, function, modul, maupun objek
- Digunakan untuk memvalidasi setiap unit dapat berjalan sesuai dengan yang diharapkan

2. Component testing
- Pengujian terhadap komponen individu secara terpisah tanpa mengintegrasikan dengan komponen lain
- Merupakan salah satu jenis blackbox testing

3. Integration Testing
- Pengujian dari penggabungan unit-unit dalam sebuah perangkat lunak
- Menguji bagaimana unit-unit bekerja sebagai sebuah kombinasi
- Sebaiknya dilakukan secara bertahap untuk mempermudah penelusuran ketika terjadi bug

4. UI Testing (End to end)
- User input harus memicu tindakan yang tepat
- Data response yang diberikan kepada pengguna harus sesuai dengan yang diharapkan

## BDD with Cucumber
- Write story (Gherkin syntax )Given, when then))
- Map steps to Java
- Configure Stories (Combines story and steps)
- Run story
- View reports

## API Testing with Katalon

1. API

API adalah singkatan dari "Applicatiom Programming Interface". API merupakan Apa sih API itu?
API adalah singkatan dari Application Programming Interface. API sendiri merupakan antarmuka yang dapat menghubungkan satu aplikasi dengan aplikasi lainnya.- API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah.

2. Client and Resources
- Clients adalah pengguna yang ingin mengakses informasi dari web. Clients dapat berupa orang atau software yang menggunakan API.
- Resources adalah informasi yang diberikan oleh aplikasi yang berbeda kepada client.
- Resources dapat berupa gambar, video, teks, angka, atau jenis data apapun. Mesin yang memberikan resources disebut server.

3. Tools API Testing (Cari di internet buat penjelasannya)
- Katalon
- Postman
- Karate Labs
- Rest-assured
- SoapUI
- ect.

## Resy Assured
- Supports for HTTP methods
- Supports for BDD/Gherkin
- Use of Hamcrest matches for chechs (equalTo)
- User Gpath for selcting element from JSon response

## Katalon
Katalon merupakan salah satu automation testing software. Software ini dibangun berdasarkan open source Selenium, Appium dengan interface khusus. Katalon rilis untuk penggunaan internal pada Januari 2015. Sedangkan rilis ke publik pertama kali pada September 2016.

Key features:
- Simple deployment, penerapan tunggal yang kohesif berisi semua yang kita butuhkan untuk menerapkan alat otomatisasi pengujian yang andal.
- Quick and easy setup, menjalankan script pengujian pertama dengan cukup cepat menggunakan template dan script pengujian yang telah dibuat sebelumnya, seperti repositori, objek, dan pustaka kata kunci.
- Faster and better result, template bawaan dengan tutorial yang m=jelas sehingga membantu penguji membuat dan menjalankan script pengujian otomatisasi dengan cepat. Mereka dapat melakukan setiap langkat dengan kecepatan yang efisien, mulai dari penyiapan projek, pembuatan pengujian, pelaksanaan, pembuatan laporan, dan pemeliharaan.
- Flexible modes, dapat menggunakan record dan kata kunci untuk membuat pengujian otomatisasi, sementara penguji ahli memiliki IDE lengkap untuk membuat skrip lanjutan.
- Ease of use, penguji dengan pengalaman minimum juga dapat memanfaatkan manfaatnya dengan mudah.
- Multi OS Application, mendukung berbagai macam platforms (windows, OS, dll)