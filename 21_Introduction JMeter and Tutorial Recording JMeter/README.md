# Section 21

## Introduction JMeter and Tutorial Rescord with JMeter

### Introduction to JMeter
Tools -tools yang digunakan untuk performance test: JMeter, K6, LOCUST, BlazeMeter, SmartBear LoadNinja

JMeter adalah perangkat lunak open source, aplikasi java 100% murni, yang dirancang untuk memuat uji perilaku functional dan mengukur kinerja situs web. Awalnya JMeter dirancang untuk pengujian beban (load) pada web, namun sekarang sudah diperluas fungsi pengujiannya.
Kelebihan JMeter antara lain:
- Open source
- Easy to use with GUI/Non-GUI

### Open JMeter

1. Open terminal
2. Navigate to the bin folder
3. Run JMeter

Berikut beberapa componen JMeter script:
- Test plan, rencana besar test yang akan dilakukan (parent)
- Thread groups, kumpulan thread yang menjalankan scenario yang sama
- Samplers, sebutan untuk request yang dikirim ke server
- Config elements, elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirim ke server
- Listener, perekam data yang dihasilkan dari test
- Timers, fitur ini dilakukan terlebih dahulu sebelum semua fitur yangberjalan
- Assertions, kriteria tambahan apakah pass/tidak
- Pre-post processor, Fitur yang memproses response data sebelum/sesudah tes
