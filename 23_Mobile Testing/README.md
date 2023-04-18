# Section 23

## Mobile Testing with Appium

Appium adalah open-source tool yang digunakan secara khusus untuk mengotomisasi aplikasi mobile.
Appium mendukung berbagai macam bahasa pemrograman seperti java, python, javascript, ruby, etc.
Appium library terbentuk dari selenium library.

### Appium server
1. XCUITest
2. UIAutomator2/Espresso
3. WinAppDriver

### Appium components
- Appium server, digunakan sebagai jembatan untuk mengontrol perangkat penguji. Ada dua versi appium server, yaitu appium desktop dan install apium menggunakan npm.
- Appium client, library ditulis dengan beberapa bahasa untuk pembuatan test script sehingga kita dapat mengirimkan command kepada appium server.

### Pre-request to install appium
- Java JDK 8/11
- Android SDK platforms tools dan command line tools
- Appium desktop
- Node JS
- Appium-doctor, untuk membantu memeriksa instalasi appium

### Desired capabilities to start inspector session
- platformName -> text -> Android
- deviceName -> text -> device
- udid -> text -> emulator-5554
- app -> Filepath/text -> Absolute path to apk file
- automationName -> UIAutomator 2
- noReset -> boolean -> True

## Project Inilization & Appium Basic Action
### Using maven archetype
- Maven archtype digunakan untuk menggenerate basic program dengan semua dependencies dan bacis structure.
- Project dapat dijalankan menggunakan command line ataupun menggunakan IDE.

### Adding appium java client
- Add appium java dependencies to project

## Appium Basic Action and Cucumber
### Cucumber frameworks
- Cucumber BDD adalah sebuah framework untuk membantu melakukan Behaviour Driven Development
- Menggunakan Gherkin syntax
- Mendukung berbagai macam bahasa pemrograman
- Mendukung penggunaan Intelej IDE
- Dalam serenity, dependencies sudah ditambahkan sehingga tidak perlu menambahkan dependencies ke dalam pom.

### Adding features files
- Go to src/test/resources folder
- Add file -> name.feature

### Mapping every scenario steps
- Perlu maping setiap step yang dilakukan dalam setiap fungsi di dalam Step Definition class
- Go to scr/test ->StepDefinition.java

### Initializing the appium
- Buat sebuah class untuk menyimpan driver session
- Integrasikan dengan cucumber hooks

### Adding desired capabilities
 Atur desired capabilites agar appium dapat mengetahui fitur mana yang akan digunakan.

### Initializing the appium
- Buat sebuah class untuk menyimpan driver session
- Integrasikan dengan cucumber hooks

### Cucumber hooks
- Hooks adalah blok kode yang dapat berjalan di dalam berbagai poin di dalam lingkaran eksekusi cucumber
- Digunakan untuk setup dan teardown environtment sebelum dan sesudah setiap skenario

### Page object design pattern
- merepresentasikan web sebagai sengle java class file
- Mengandung semua action yang dapat dilakukan dalam sebiah simgle web page
- Digunakan untuk reduce duplicate
- Membantu test code agar lebih mudah dibaca dan mudah untuk dimengerti

### The By object and findElement() function
- Digunakan untuk menemukan objek berdasarkan data tertentu
- findElement(), digunakan untuk menemukan element yang telah menerima parameter dari MobileBy
- Mengembalikan AndroidElement data type

### The sendKeys() and clear() function
- sendKeys adalah fungsi didalam androidElement yang digunakan untuk menulis action
- Menerima parameter Charsequence data type

### click()
- Untuk simulasi aksi "click"


### getText()
- untuk mendapatkan text dari element

### isDisplayed()
- Untuk mengecek apakah elemen tampil dalam layar atau tidak

### Perform assertation
- Menggunakan JUnit untuk validasi data
- Dapat membandingkan apakah data sama, lebih dari, kurang dari, dll.

### Cucumber tags
- Menjalankan subset skenario
- Membatasi kait ke subset skenario

## Appium Complex Action & Maximizing the Project Structure
### Web Driver Object
- Digunakan untuk menunggu elemen hingga bertemu dengan kondisi tertentu yang telah ditentukan, misal hingga elemen terlihat, hingga elemen menghilang, dll.
- Merupakan bagian dari explicit wait
- Construktornya terdiri dari 3 komponen, yaitu androidDriver object, timeout, polling time
- Expected condition didukung oleh Appium
- Contoh: driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

### Base object class
- Bertujuan untuk membungkus fungsi appium untuk membantu dalam penulisan kelas dengan sedikit code
- Dapat menggunakan inheritance sehingga setiap halaman class harus disambungkan dengan bsaeObject
- Ini adalah sebuah pendekatan, jika menemukan pendekatan yang lebih baik dari ini bisa saja digunakan.

## Performing Complex Action
### TouchActionClass
- Digunakan untuk performing complex action
- Menggunakan builder design pattern sehingga menggunakan metode chaining dan dapat dikombinasikan untuk perform specific action
- Contoh: Swipe, Long press, swipe multiple times, dll

### Taking Screenshot
Dapat mengkonfigurasinya dengan menambah propertie file didalam resource folder
1. cucumber.glue: untuk mengatur lokasi langkah dan hooks class
2. cucumber.plugin: untuk mengaktifkan cucumber plugin
3. cucumber features: mengatur lokasi/path dari file feature
4. Cucumber.publish.enable: mengaktifkan online cucumber reports
5. Cucumber.publish.quite: disable/enable reports info

- AndroidDriver class menggunakan takescreenshot interface
- Takescreenshot digunakan untuk menampilkan screenshot
- Dapat diaplikasikan dalam web automation

### Configuration file
Digunakan agar ketika memiliki perubahan konfigurasi, kita tidak perlu merefactor code automasi yang kita miliki. Yang pelu dilakukan hanya mengupdate value dari configuration file.