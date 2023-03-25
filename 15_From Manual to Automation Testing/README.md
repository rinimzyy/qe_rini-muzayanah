# Section 15

## From Manual to Automation Testing

Introduction to Automation Testing

a. Manual testing, sebuah testing yang dilakukan secara manual

Manual testing adalah pengujian sistem yang eksekusi sepenuhnya dilakukan secara manual, oleh manusia, tanpa bantuan alat atau script. Tujuan penggunaan manual testing adalah untuk mengeksplore atau mengobservasi semua fitur-fitur yang telah dikembangkan

Mengapa manual testing perlu dilakukan?
- Exploratory, untuk menjelajah/mengexplorasi fitur apa saja yang sudah dikembangkan
- Velocity, sangat cepat dilakukan ketika ada perubahan dalam sistem yang dikembangkan
- Usability, bisa digunakan untuk pengujian usability

Kelebihan:
- Bisa mendapatkan feedback dengan cepat dan akurat
- Lebih murah
- Cocok untuk menguji perubahan kecil karena bisa langsung menguji tanpa harus menyiapkan script terlebih daluhu

Kekurangan:
- Sering terjadi error
- Tidak bisa direkam, ketika akan menjalankan tes harus dijalankan ulang

b. Automation testing
Automation testing merupakan pengujian secara otomatis yang menggunakan bantuan automation tools untuk mengeksekusi test case.Tujuan penggunaan automation testing adalah sebagai berikut
- Efisiensi (Cocok untuk mengeksekusi tase case yang banyak secara otomatis)
- Coverage (mengukur seberapa banyak fitur yang telah kita uji)

Mengapa automation testing perlu digunakan?
- Felxibility, bisa menggunakan kembali testing yang telah dibuat sebelumnya
- Velocity, sangat cepat untuk menguji fitur yang banyak dan komplex
- Coverage, mengukur seberapa banyak fitur yang telah kita uji
- Error-Avoidance, memilimalisir error dan kesalahan 


Test case yang cocok untuk dilakukan automasi
- Test case yang dieksekusi secara berulang
- Test case yang sulit untuk dilakukan secara manual
- Tase case yang memakan waktu cukup banyak ketika dilakukan secara amnual

Test case yang tidak cocok untuk auto:
- Test case yang baru saja dirancang
- Test case yang belum dieksekusi secara manual
- Test case yang memiliki kebutuhan yang sering berubah

Auto testing process:
- Test tool selection, sesuaikan dengan kebutuhan (Usability, apakah simple atau ribet, apakah memiliki cost yang cukup)
- Define scope of automation, mendefinisikan scoup atau test case apa saja yang cocok
- Planning, design, and development. Merencanakan dan mendesign script dan mendevelop script
- Test execution, mengeksekusi tes
- Maintenance, review

Automation best practice:
- Pendefinisian scope testing, dilakukan secara mendetail dan harus cocok dengan test case
- Memilih tools yang sesuai dengan kebutuhan testing
- Harus memenuhi standar penulisan script agar dapat dilakukan perubahan dengan lebih mudah serta dapat berjalan secara efisien
- Mengukur matriks

