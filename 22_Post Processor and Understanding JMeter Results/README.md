# Section 22

## Post Processor & Understanding JMeter Result

### Post Processor
Post-Prosesor adalah tindakan yang dilakukan setelah sampler dijalankan. Post processor dapat dugunakan untuk melakukan beberapa tindakan pada respons tertentu atau mengekstrak beberapa nilai tertentu dari respons dan menyimpannya dalam variabel yang dapat digunakan nanti.

Contoh: JSON Extractor

JSON Path:
- Digunakan untuk extract isi dari json response
- Beberapa expresi yang umum digunakan:
$ = root elemen
. = child operator (Object)
[] = child operator(Array)
.. = recursive descend (Langsung ke objek)
* = wildcard (all things)
[start:end] = array slice operator borrowed

Post Processor executes when Sampler request execution is done. There are various Post processors that are being used in JMeter.

The element list includes:
1. Regular Expression Extractor
Ekstraktor ekspresi reguler digunakan untuk mendapatkan informasi dari respons server. Itu menggunakan Perl-type Regular expression untuk mengekstraksi informasi yaitu nilai. Prosesor ini akan berjalan setelah setiap permintaan sampler dijalankan.
2. CSS/JQuery Extractor
CSS Selector Extractor is used to extract the values/information from the HTML response of the server.
3. XPath Extractor
XPath Extractor uses Xpath Query language to extract value from XML or X( HTML) responses.
4. BeanShell Post Processor
Result Status Action handler let the user select the action to be taken when the sampler gets any error.
5. Result Status Action Handler
This Processor executes after the Sampler.
6. JSR223 Post Processor
In this processor, the script is applied only when the sampler has been executed.
7. JDBC Post Processor
SQL queries are run after the Sampler has executed to make the changes that need to be reverted after the testing is done or are not required.
8. JSON Path Post Processor
This Processor gets the data from the JSON response using JSON Path syntax. It is created under the Sampler which has a response.
9. Boundary Extractor
The boundary extractor extracts data from the boundaries of the server response after the sampler has been executed. Once data/values have been extracted, the Template string needs to be generated and then the results are stored in the provided variable name.
10. Debug Post Processor
This Processor is used in case any sampler needs to be debugged, it is added as a child to that sampler.

