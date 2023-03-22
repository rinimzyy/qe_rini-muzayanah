# Section 14

## API Testing

Apa itu API Testing:
API Testing berbeda dengan GUI. API Testing dilakukan dengan mengirim request dan mendapatkan request serta memverifikasi response yang benar dan error handling. dilakukan untuk mencegah adanya bug dan kerusakan. Alat pengujian API dapat digunakan untuk menguji kekuatan API terhadap serangan siber.

Proses API Testing:
- Input parameter untuk API perlu direncanakan dan ditentukan sebelumnya
- Jalankan test case dan bandingkan antara hasil yang diharapkan dengan hasil yang didapatkan.

Jenis API Testing:
- Functionally, menguji functionalitas API.
- Load test, menguji respon API dibawah beban kondisi normal dan tinggi (bagian dari Performance Testing). 
- Security, menguji API dari external threats.

API Testing Tools: Postman, JMeter, frisby.js, REST-assured

Perbedaan API test dan Unit Test:
a) Unit Test
- Dilakukan oleh developer
- Fungsi-fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasar functionality yang ditest
- Scopenya terbatas
- Biasanya dilakukan sebelum build

b) API Test
- Dilakukan oleh tester
- End to end
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build

Proses API testing:
- Specification Review
- Specification development
- Framework development
- Test case development
- Execution and report

Test case for API testing:
- Mendapatkan balikan (response) yang sesuai dengan inpUtan
- Apakah memberikan balikan atau tidak
- Apakah mengganggu fitur yang lain atau tidak
- Update struktur data
- Memodifikasi data yang ada

Best practices of API testing:
- Kelompokkan test case ke dalam beberapa kategori
- Beri judul yang sesuai pada setiap test
- Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu
- Memikirkan segala kemungkinan kombinasi input pada API

Tipe output dalam sebuah API:
- Umumnya berbentuk JSON atau XML
- Status balikan (response) apakah Passed atau Fail
- Memanggil fungsi API lain

Tipe test yang biasa dilakukan di dalam API Testing:
- Memverivikasi apakah kita mendapat respon dari API
- Memverifikasi apakah hasil input/request sudah sesuai atau belum
- Memverivikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah
- Memverifikasi waktu response yang diberikan

Tipe bug yang biasa ditemukan didalam API testing:
- Gagal melakukan error handling pada keadaan tertentu
- Kesulitan untuk tersambung dan mendapat respon API
- Isu keamanan
- Performance issue
- Error atau warning yang tidak tepat
- Struktur dari data respon tidak benar (JSON & XML)

Advanteges & challenge of Testing API
Advantages of Testing API
- Efisiensi waktu
- Bahasa yang independen
- Mengurangi biaya testing
- Mengurangi resiko

Challenges of API Testing:
- Kombinasi parameter, pemilihan parameter
- Tidak ada GUI
- Kita harus mengetahui terbelih dahulu parameter
- Perlu mengetest setiap error handling dari setiap API

API Testing Tools: Postman, frisby.js, Katalon