# Section 24

## Testing CI/CD Pipeline
CI/CD adalah salah satu praktik DevOps yang digunakan untuk pengembangan perangkat lunak menjadi lebih terorganisir. Penggunaan CI/CD pada pengembangan aplikasi memberikan banyak manfaat yang akan langsung terasa oleh tim pengembang.
Continuous Integration (CI) adalah praktek pengembangan perangkat lunak di mana setiap perubahan kode yang dilakukan oleh developer diintegrasikan secara otomatis ke dalam kode sumber utama serta diuji secara otomatis demi mendeteksi kesalahan secepat mungkin.
Continuous Delivery (CD) adalah praktek pengiriman perangkat lunak ke lingkungan produksi secara otomatis setelah melalui tahap integrasi, pengujian, dan verifikasi.

Continous integration:
Integrasi berkelanjutan memberi penekanan besar pada otomatisasi pengujian untuk memeriksa bahwa aplikasi tidak rusak setiap kali komit baru diintegrasikan ke dalam cabang utama.

Continous delivery:
- Persiapkan dan lacak rilis ke produksi secara otomatis
- Hasil yang diinginkan adalah siapa pun dengan hak istimewa yang memadai untuk menerapkan rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif

Continous deployment:
- Setiap perubahan dalam kode sumber diterapkan ke produksi secara otomatis, tanpa persetujuan eksplisit dari pengembang
- Asalkan lolos quality control

Alur continous delivery:
Build - Test - Accetance Test - Deploy to Staging - Deploy to Production (Manual)
Build - Test - Accetance Test - Deploy to Staging - Deploy to Production (all automatic)

What makes for Good CI
Tahapan Terpisah
- Setiap langkah dalam CI harus melakukan satu tugas terfokus.
Berulang
- Otomatis dengan cara yang dapat diulang secara konsisten
- Perkakas juga harus berfungsi untuk pengembang lokal
Gagal Cepat
- Gagal pada tanda pertama masalah

What makes for Good CD:
Desain dengan mempertimbangkan sistem
- Tutupi sebanyak mungkin bagian penerapan, seperti : Aplikasi, Infrastruktur, Konfigurasi, Data
Saluran pipa
- Terus tingkatkan kepercayaan diri saat Anda bergerak menuju produksi
Versi Unik Secara Global
- Mengetahui keadaan sistem setiap saat
- Mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan

## CI/CD Process
Commit - Build - Test - Deploy

Benefit implementing CI:
- Mendeteksi bug secara cepat
- MEningkatkan pengurangan but
- Proses development lebih transparan
- Efisien

Benefit implementing CD:
- Mengurangi resiko
- Painless deployment
- Mengurangi biaya
- Proses yang otomatis deployment
- Merilis dengan lebih sering

CI cost:
- Menulis test otomatis
- Server untuk tes otomatis
- Harus merge code sesering mungkin

CD cost:
- Fondasi yang kuat dalam proses CI.
- Budaya pengujian harus menjadi yang terbaik. Proses CD membutuhkan kualitas tes tertinggi.
- Dokumentasi perlu sering diperbarui untuk mengikuti setelah penerapan.

CI/CD tools:
Jenkins, Bamboo, circleci, AWS CodeBuilds, Azure DevOps, CI/CD, travis CI, github action

## Github Action
GitHub Actions adalah platform continuous integration and continuous delivery (CI/CD) yang memungkinkan Anda mengotomatiskan build, test, dan deployment pipeline.

Komponen:
1. Workflow
Alur kerja adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau beberapa pekerjaan. Alur kerja ditentukan oleh file YAML yang didaftarkan ke repositori Anda dan akan dijalankan saat dipicu oleh peristiwa di repositori Anda, atau dapat dipicu secara manual, atau pada jadwal yang ditentukan.
2. Events
Peristiwa adalah aktivitas tertentu dalam repositori yang memicu alur kerja berjalan. Misalnya, aktivitas dapat berasal dari GitHub saat seseorang membuat pull request, membuka masalah, atau mendorong komit ke repositori.
3. Runners
Pelari adalah server yang menjalankan alur kerja Anda saat dipicu. Setiap pelari dapat menjalankan satu pekerjaan pada satu waktu. GitHub menyediakan pelari Ubuntu Linux, Microsoft Windows, dan macOS untuk menjalankan alur kerja Anda.
4. Jobs
Pekerjaan adalah serangkaian langkah dalam alur kerja yang dijalankan pada pelari yang sama. Setiap langkah adalah skrip shell yang akan dijalankan, atau tindakan yang akan dijalankan. Langkah-langkah dijalankan secara berurutan dan bergantung satu sama lain. Karena setiap langkah dijalankan pada pelari yang sama, Anda dapat berbagi data dari satu langkah ke langkah lainnya.
5. Action
Action adalah aplikasi khusus untuk platform GitHub Actions yang melakukan tugas yang rumit namun sering diulang. Gunakan tindakan untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja.

Preparation: JAva, maven, intejel IDE, git
