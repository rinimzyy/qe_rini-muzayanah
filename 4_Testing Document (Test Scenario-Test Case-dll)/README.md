# Sec 4

## Testing Documentation (Test Scenario – Test Case – dll)

Test Scenario & Test Case
1. Test Scenario
- Test scenario memberikan ide apa yang harus diuji
- Test scenario merupakan hish-level test case

Contoh test scenario:
- Cek menu login secara fungsional
- Cek tombol forgot email apakah berfungsi
- Cek fitur create new account secara fungsional

2. Test Case
- Test case terdiri dari tahapan eksekusi positif dan tahapan eksekusi negatif dari test skenario
- Test case memiliki prasyarat, langkah, hasil yang diharapkan, status, dan hasil aktual.

Contoh test case:
Test skenario: Menguji fitur login secara functional
 1) masukkan email dan password yang valid
 2) masukkan email valid dan password invalid
 3) masukkan email invalid dan password valid
 4) masukkan email dan password yang invalid

Note:
- Test scenario menjawab: "Apa yang harus kita uji"
- Test case menjawab: "bagaimana kita menguji"

Lighthouse
- Lighthouse adalah alat otomatis yang bersifat open source untuk meningkatkan kualitas halaman web. Anda dapat menjalankannya di halaman web mana pun, publik atau membutuhkan otentikasi. Ini memiliki audit untuk kinerja, aksesibilitas, aplikasi web progresif, SEO, dan banyak lagi.
- Anda dapat menjalankan Lighthouse di Chrome DevTools, dari baris perintah, atau sebagai modul Node. 
- Anda memberikan Lighthouse sebuah URL untuk diaudit, Lighthouse menjalankan serangkaian audit terhadap halaman tersebut, dan kemudian menghasilkan laporan tentang seberapa baik performa halaman tersebut. 
- Dari situ, gunakan audit yang gagal sebagai indikator tentang cara meningkatkan halaman. 
- Setiap audit memiliki dokumen referensi yang menjelaskan mengapa audit itu penting, serta cara memperbaikinya.