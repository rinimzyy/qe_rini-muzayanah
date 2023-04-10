# Section 20

## Fundamental Performance Test

### Performance Test
Performance test merupakan teknik functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban (load) kerja.
Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability), dan penggunaan sumber daya.

Berikut merupakan hal-hal yang diukur dalam performance testing:

1. Performa suatu aplikasi sampai suatu batas tertentu
2. Bukan merupakan functional test
3. Bisa dalam berbagai macam bentuk untuk memahami reliability, stability, dan availability pada environtmentnya. Contohnya seperti mengamati response time ketika menjalankan test dalam jumlah yang sangat banyak, dan melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.

Pada umumnya performance test sangat mahal untuk dilakukan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem dapat mengakomodasi traficyang ada. 
Hal ini disebabkan karena pengetesannya memerlukan persiapan yang dimana dalam beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production.
Environtment ini ada juga yang membuatnya di server cloud yang biasanya bisa lebih besar dari environtment production.

Dalam melakukan performance test, biasanya yang akan menjadi perhatian adalah troughput dan response datanya.

### Metode Performance Test

1. Membuat test plan
- Endpoint yang akan ditest : login, beli_pulsa, cek_out
- Kebutuhan masing-masing endpoint

2. Menentukan metode test
- Pilih berdasarkan kondisi sistem, apakah belum pernah ditest atau sudah
	- Selalu awali dengan load test untuk tahu kondisi awal system
- Pilih berdasarkan situasi yang dihadapi

### Tipe-Tipe Performance Test
1. Smoke Testing
Smoke testing dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali.

2. Load Testing
Load testing adalah pengujian yang paling sederhana dan dilakukan untuk memahami perilakuk sistem dalam kehidupan beban tertentu. Hasil dari load testing akan dilakukan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server, atau pendukung lainnya.
Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. idealnya, kita mengetahui jumlah trafic yang ada di prod sebagai nilai di load test.

3. Table Tier
Table tier dapat dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.

4. Stress Testing
Metode ini dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihi, lalu turun untuk melihat proses recovery.

5. Spike Testing
Hampir sama dengan stress test, namun kenaikan langsung menuju puncak dilakukan dalam waktu singkat. Jika stress testing memberikan waktu untuk scale out, maka disini tidak.
Salah satunya adalah saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.

6. Soak Testing
Soak testing dilakukan untuk mengetahui reability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam). Soak testdilakukan untuk mengetahui apakah terdapat bug pada race condition, memory leaks, db connection, dsb.
Sebaiknya test ini dilakukan ketika sistem sepi pengunjung dan tidak banyak transaksi dilakukan.

### Istilah-Istilah Dalam Performance Testing
- System Under Test, system yang sedang dilakukan test
- Load Generator, sebutan untuk server yang digunakan untuk membuat request
- Troughtput, Satuan kerja dalam satuan waktu, misalnya RPS atau RPM
- Performance Threshold, target maksimal nilai yang diperbolehkan
- Saturation, kondisi maksimun dalam merespon atau mengenerate
- Virtual User, Simulasi dari user yang melakukan pengujian
- Response time, lama waktu pengiriman request hingga menerima response