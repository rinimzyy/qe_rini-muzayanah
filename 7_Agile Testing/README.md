## Section 7

# Agile Testing

Definition of SLDC (Software Development Life Circle)

SLDC adalah proses dalam sebuah sotfware industri berupa design, pengembangan, dan pengujian software.

Prosesnya antara lain:
Requirements Gathering -> Design, Development(Code) -> Testing -> Deployment -> Maintenance

1. Reqruiment Gathering
- Mengumpulkan kebutuhan bisnis
- Membuat diagram proses
- Melakukan analisis detail

2. Design
- Mendesign infrastriktur IT
- Mendesign model sistem

3. Development
- Mengembangkan infrastruktur IT
- Mengembangkan database dan kode

4. Testing
- Menulis test case
- Mengeksekusi test case

5. Deployment
- Sistem dideploy ke lingkungan kehidupan nyata (klien) di mana pengguna sebenarnya mulai mengoperasikan sistem.

6. Maintenance
- Mendukung sistem pengguna
- Sistem maintenance, kegiatan untuk memonitor dan memelihara fasilitas dengan merancang, mengatur, menangani, dan memeriksa pekerjaan.
- Perubahan sistem dan pengaturan


Agile Testing Manifesto
- Testing is always behind
- Automation is even firther behind that
- Testers can't work until development is done
- There is preasure at the end of sprint
- There is blame around bugs (it's his fault ect)

Agile testing pada dasarnya pola pikir yang berbeda jika dibandingkan dengan tradisional testing.

5 kunci testing manifesto:
a.	Testing is an activity, not a phase. Proses testing dilakukan beriringan dengan proses development. Sebuah pengujian biasanya dilakukan berdampingan dengan aktivitas lain seperti coding, pembuatan dokumentasi dan aktivitas lainnya.
b.	Prevent bugs rather than finding bugs. Seabgai seorang quality engineer, akan lebih baik jika kita fokus dalam mencegah munculnya bug daripada menemukan bug. Hal ini dapat dilakukan dengan menganlisis bagaimana bug bisa muncul.
c.	Don't be a checker, be a tester. Memahami kebutuhan user dan memberikan feedback terhadap apa yang sedang diuji. 
d.	Don't try to break a system, instead help build the best possible system. Fokuskan tujuan dari pembuatan sistem, yaitu membuat sistem yang berkualitas dan sesuai dengan kebutuhan pengguna. Posisikan diri sebagai user dan menilai dari perspektif user dalam memberikan feedback kepada developer.
e.	The whole team is responsible for quality, not just the tester. Menjamin kualitas sistem merupakan tanggung jawab dari seluruh anggota tim. Beban dari kualitas produk tidak seharusnya dibebankan kepada satu orang saja, entah itu kepada tim developer, quality engineer, ataupun yang lainnya.

Testing Pyramid
- Unit test (Paling bawah)
- Integration (Tengah)
- UI (Paling atas)

Note:
- Seluruh tim jelas tentang apa yang harus diuji untuk setiap cerita dan fitur sebelum pengkodean apa pun dimulai.
- Sebelum berdiskusi mengenai solusi, pastikan kamu paham mengenai siapa dan mengapa dibalik kebutuhan apapun.
- Bertanya, kemudian menjawab pertanyaan "Bagaimana kita memulai test?" saat berdiskusi mengenai user story
- Semua anggota dalam tim mengetahui bagaimana menjalankan automated test dan membaca hasil test.
- Kamu tidak memiliki database bus karena kamu memperbaiki bugs sesaat setelah kamu menemukannya, alih-alih mencatatnya
- Timmu memiliki arah dalam mengukur kualitas, yang mana yang digunakan untuk mengidentifikasi jika proses testing ada pada kamu.
