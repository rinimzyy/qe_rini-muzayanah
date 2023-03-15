# Section 11

## Iterable and Data Map Structure

1. Iterable
- Iterable data adalah sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan.

Java Iterable Hierarcy Interface
Iterable (Hierarchy tertinggi)
=> Collection (Turunan pertama Iterable)
	   - Set -> SortedSet -> NavigableSet
	   - List
	   - Queue -> Deque -> BlockingDeque / Queue -> BlockingDeque -> BlockingDeque

a. Interface Set (HashSet, TreeSet, LinkedHashSet)
b. Interface List (ArrayList, LinkedList)
c. Interface Deque (ArrayDeque, LinkedList)

Cara menggunakan Iterable:
Method yang tersedia: forEach, iterator, spliterator

2. Iterator
- Kelas yang memanage iterasi dari sebuah iterable
- Mengelola bagian mana yang sidah melakukan iterasi
- Mengetahui data apa yang selanjutnya diambil dan bagaimana cara mengambilnya

3. Collection
- Kumpulan dari objek atau data yang diletakkan dalam satu tempat yang sama
- Mothod dalam collection: add, addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, parallelStream, remove, removeAll, retainAll, size, spliterator, stream, toArray

4. List
- Interface yang menyediakan cara untuk menyimpan data secara linear
- List dapat menerima nilai yang sama
- Urutan data list berdasarkan data pertama yang dimasukkan
- Method: add, clear, remove, get, hashCode, addAll, dll.

a. ArrayList
- ArrayList menyediakan data yang dinamis
- Tidak terikat dengan kapasitas data yang dapat disimpan oleh ArrayList
- Data yang disimpan bisa sebanyak apapun selama memori komputer masih tersedia

b. LinkedList
- Struktur data yang menyimpan setiap elemennya  saling terhubung satu sama lain
- Linked list menyimpan alamat memori dari masing-masing elemen, baik elemen setelah ataupun sebelumnya

c. Stack
- Stack menyimpan data dimana proses pengambilan datanya dilakukan secara LIFO (Last In First Out)
- pop() untuk mengambil data, push() untuk menambah data

5. Set
- Interface yang menyediakan cara untuk menyimpan data secara linear
- Tidak menerima data dublikat atau data yang sama
- Jika ada data kembar maka akan dihitung satu
-> HashSet (Data structute: Hash table, tidak menggunakan sorting, Iterator: Fail-Fast, menerima nilai null)
-> LinkedHashSet (Data structure: Hash table dan linked list, menggunakan insertion sort, Iterator: Fail-Fast, menerima nilai null)
-> TreeSet (Data structure: Red-Black tree, sorted, Iterator: Fail-Fast, bisa menerima nilai nul sesuai kondisi)
-> EnumSet (Data structure: Bit vector, menggunakan natural order, Iterator: Weakly consistent, tidak menerima null)

a. HashSet
- HashSet merupakan struktur data yang menyediakan cara tercepat untuk proses pencarian data
- Data yang muncul tidak diurutkan sesuai urutan data dimasukkan, namun sesuai nilai

b. LinkedHashSet
- Data yang muncul sesuai dengan urutan data yang dimasukkan

c. EnumSet
- Menampilkan nilai enum

d. SortedSet
- Set yang dapat mengelola urutan data

e. NavigableSet

6. Queue
- Queue menyimpan data dimana proses pengambilan datanya dilakukan secara FIFO (First In First Out)
- Data yang pertama masuk adak pertama keluar
- Mengambil data menggunakan dequeue, menambahkan data menggunakan enqueue
- Data yang masuk akan diletakkan di paling akhir

7. Deque
- Queue tetapi memiliki sebuat ujung
- Bisa menambah data di depan ataupun belakang
- Bisa mengambil dapa di depan atau Belakang

## Map Data Structure

Map
- Map merupakan struktur data di dalam java yang dapat digunakan untuk menyimpan banyak data di dalamnya.
- Data dalam map bisa diidentifikasi dengan menggunakan q
- Setiap q memiliki datanya sendiri yang disebut denganv value
- Map diseput sebagai penyimpanan data berbasis q

1. HashMap
- Implementasi dari map yang menggunakan struktur data HashTable

2. WeakHashMap
- Menggunkan HashTable
- Pada weakhashmap, q dapat dihilangkan jika sudah tidak digunakan

3. IdentityHashMap
- Jika q memiliki referensi dari memori yang berbeda maka data dianggap berbeda

4. LinkedHashMap
- Secara keseluruhan sama dengan hashmap
- Menerapkan double linkedlist

5. ImmutableMap
- Map yang tidak dapat diubah isinya baik ditambah, dihapus, atau yang lainnya


Sorted Map
- Map yang dapat diurutkan

1. SortedMap, menggunakan TreeMap
2. Map dengan comparator, menggunakan TreeMap
- Dibandingakan q yang memiliki urutan terlebih dahulu dan sebaliknya
3. NavigableMap, menggunakan TreeMap