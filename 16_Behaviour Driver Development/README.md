# Section 16

## Behaviour Driven Development

Introduction to Behaviour Driven Development

TDD (Test DD) merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan production codenya. Proses TDD perfokus pada komponen-kpmponen yang terdapat dalam sistem. Test case ditulis dengan menggunakan bahasa pemrograman

BDD menerapkan konsep test first.Dalam BDD tim developer akan menuliskan berbagai skenario yang menjelaskan behaviour dari perspektif pengguna. Scenario dituliskan dengan format bahasa yang mudah dipahami seluruh skateholder dalam pengembangan sistem. BDD bertujuan untuk meningkatkan komunikasi dan kilaborasi antar seluruh skateholder tim bisnis maupun teknikal yang terlibat dalam pengembangan sistem.
Membantu memastikan bahwa fitur-fitur dalam sistem dapat dipahami denganbaik oleh seluruh anggota tim.
Komunikasi yang baik dapat memaksimalkan sistem agar sesuai dengan kebutuhan pengguna.
Prinsip dasar BDD adalah mendefinisikan behaviour dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci.
Dalam BDD, seluruh skateholder (teknikal maupun non-teknikal) saling belkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan functional sistem yang dituliskan dalam bentuk feature files.
Deskripsi feature file berfungsi sebagai test logic yang nantinya dijasikan dasar oleh quality assuranse.
Test script untuk implementasi pengujian sebagai dasar bagi developer dalammembangun sistem.

BDD Format:
1. User story, menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
2. As a (X) I want (Y) so that (Z)
3. Scenario, terdiri dari satu atau lebih scenario
4. Given (konteks scenario), when(tindakan user), then (outcome dari tindakan user)

## Cucumber

Cucumber merupakan salah satu tools yang mendukung BDD. Cucumber ditulis menggunakan tesk biasa dan memvalidasi bahwa sistem melaksanakan ketentuan tersebut.
Cucumber membaca semacam ketentuan yang dapat dieksekusi, dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa skenario.
Alat mentimun memainkan peran penting dalam pengembangan kasus uji penerimaan untuk pengujian otomasi. Ini terutama digunakan untuk menulis tes penerimaan untuk aplikasi web sesuai perilaku fungsinya.
Dengan menggunakan bahasa Gherkin, cucumber memungkinkan software behavior dispesifikasikan dalam bahasa logis yang dapat dipahami oleh customer. Tes cucumber dibagi menjadi beberapa fitur-fitur dan fitur-fitur ini dibagi menjadi beberapa skenario, yang merupakan urutan tahapan testing. Sebelum cucumber dapat melakukan tahapan-tahapan tesebut, tahapan tersebut harus didefinisikan terlebih dahulu melalui definisi tahapan, bagaimana tahapan itu harus dilakukan.


## Tools BDD

1. Katalon
Tools untuk membuat kode dengan editor asli Gherkin. Integrasi Jira yang sesuai dengan cucumber-complaint dan seamless.

2. Cypress
Cypress adalah Javascript End-to-end Framework atau bisa diartikan layaknya sebuah tools yang dapat digunakan dalam automation testing atau pengujian otomatis. Cypress tidak hanya digunakan untuk keperluan E2E Testing, tetapi juga dapat melakukan beberapa jenis pengujian seperti Unit Testing hingga Integration Testing.

