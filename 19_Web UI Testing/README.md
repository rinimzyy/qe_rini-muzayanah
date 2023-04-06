# Section 19

## Web Testing Using Serenity BDD

### Intro Serenity BDD
Serenity adalah framework BDD yang bersifat open source yang dapat membantu membuat script test yang terstruntur dan membuat otomatis testing yang mudah diterima.
Arsitektur sereniti terdiri dari Requirements, Test, Steps, Pages, dan Reports.


### Define Requirements
- Saat menggunakan serenity, mulailah dengan requirements yang akan diimplementasikan.
- - Ini sering dinyatakan sebagai user stroies dengan kriteria penerimaan yang membantu memperjelas persyaratan.
- "Stories" inilah yang membuat pengujian otomatis.

### Automate Acceptance Criteria
- Next, mendeskripsikan penerimaan kriteria dalam ketentuan bisnis level tinggi.
- Merekam kriteria penerimaan menggunakan BDD toll seperti Cucumber dengan form "feature", sehingga sereniti dapat berjalan.

### Implement the Test
- Implementasikan kriteria penerimaan ke dalam kode program, sehingga program dapat berjalan sesuai dengan pengaplikasian sebenarnya.
- Under the hood, pecah test menjadi sebuah step bersarang untuk kemudahan pembacaan kode dan kemudahan maintenance.

### Report on Tesy Result
- teks narative untuk setiap test
- Screenshot untuk setiap test yang dijalankan
- Test result termasuk waktu eksekusi dan error message jika test gagal dijalankan

## BDD Framework

1. Write story, menggunakan gherkin syntax (Given, when, then)
2. Configure stories, configure stories and steps
3. Browser interaction, maps steps untuk browser manipulation
4. Run stories, intelej IDEA dan maven
5. View reports, membuat report menggunakan serenity

### Writing The Test
- Using serenity cucumber
- Create file stories, define test scenario
- Create file test class, automate stories
- Create file test steps, define scenario steps
- Create file page objects, interact with browser

## Digging Deeper
### Serenity Properties
- Serenity mendukung banyak properties untuk menyesuaikan bagaimana test akan dijalankan
- Webdriver, driver mendefinisikan browser mana yang akan digunakan untuk testing
- Ignore.failures.in.stories mengatur serenity untuk melanjutkan pengujian ke test selanjutnya selanjutnya meskipun skenario yang sedang dijalankan gagal

### Parameter Injection
Teks dalam story dapat digunakan sebagai sebuah variable, menggunakan kurung kurawal {} dalan anotasi string dalam test class

### Meta Filtering
- Dalam membantu memenage story skenario, kita dapat menggunakan "tag" ubtuk corresponding scenario atau feature
- Untuk menjalankan test dengan spesific tag, command yang digunakan adalah:

mvn verify -Dtags="@User"

### Parameted Scenario
- Dalama sebuah story, skenario dapat diberi arameter dengan vakue yang dikonfigurasi
- Skenario yang diberi parameter sama dengan multiple scenario, hanya vakuenya yang berbeda
