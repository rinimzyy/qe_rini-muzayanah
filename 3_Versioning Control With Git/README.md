# Section 3

## Software Testing as a Career Versioning Control With Git

Version Control and Branch Management
Apa itu versioning?
- melakukan pengaturan versi atau pelacakan perubahan code dari program kita.
- dilakukan untuk tracking, melihat dimana kesalahan dan apa yang menyebabkan kesalahan, siapa yang melakukan kesalahan, dll.

Tools
- Version control sistem 
single user (sccs - 1972 unix only berbasis lokal)
centralized (rcs - cross paltform, text only (sudah ada internet, sudah menggunakan server. kekurangan jika internet mati tidak bisa melakukan apa2)
distributed (git, mercurical, dan bazaar. berbasis locak dan server)


Real World Collaboration
- git merupakan salah satu vcs yang paling banyak digunakan untuk mengembangkan software secara bersama-sama (kolaborasi)
- setiap developer harus menyinkronkan local server ke remote server
- git akan melacak setiap perubahan yang terjadi
- Repository: folder yang berisi file dan riwayat perubahan kode pada project. 
- Commit: riwayat perubahan pada file project. Melihat siapa yang membuat perubahan, apa yang diubah dan kapan perubahan itu dilakukan. 
- Clone: memungkinkan kamu untuk mendownload project yang ada di GitHub.

- git status (untuk melihat status dari reposiori lokal server dan melihan perubahan apa yang dilakukan.
- git add (ntuk menambahkan file)
- git commit (untuk menyimpan apabila terjadi perubahan dan dilakukan pada repository jarak jauh, namun ada perubahan yang terjadi pada remote repository)
- git push (Perintah yang digunakan untuk mentransfer perubahan file ke repository jarak jauh setelah melakukan perubahan)
- git diff (memberitahu kita secara mendetail apa saja perubahan yang terjadi di antara dua titik referensi Git)
- git stash (menyimpan semua kode yang belum selsai di kerjakan untuk di commit)

File .gitignore
- Git Ignore adalah suatu file di dalam github yang disimpan dengan nama .gitignore dimana fungsinya untuk mengatur pada saat kita push maka path file yang terdaftar di dalamnya tidak akan ikut di commit.

Inspecting repository
- git log, untuk melihat riwayat atau history perubahan pada project, selain itu git log sangat berguna jika kamu berkolaborasi dengan banyak orang sehingga kamu tahu apa yang di ubah oleh orang lain dalam project tim yang kamu kerjakan.
- git check out,ntuk menukar branch aktif dengan cabang yang dipilih
- git merge, perintah dasar yang menggabungkan cabang aktif dengan cabang yang dipilih.

Git Reset
- mengatur ulang cabang ke penerapan sebelumnya. 
- Git reset memengaruhi semua file di semua folder cabang
-> Git reset soft, mengembalikan berkas atau file ke dalam keadaan staged
-> Git reset hard, mengembalikan berkas atau file ke dalam keadaan commited

*note :
- Staging Area merupakan area pementasan yang digunakan untuk melacak semua file yang nantinya akan di-Commit. 
- Commit adalah proses di mana kode ditambahkan ke repositori lokal. 
- setiap file kode yang tidak dimasukkan ke Staging Area tidak akan di-Commit.

Gir Push, Fetch, dan Pull
- Git remote, membuat user terhubung ke remote repository.
- git remote -v, menampilkan repository yang sedang dikonfigurasi:

Git Branching
- git branch, menampilkan repository yang sedang dikonfigurasi:
- git checkout, untuk beralih cabang
- gti branch --list, untuk menampilkan semua branch
- git brach <...>, membuat branch baru
- git branch -D <...>, menghapus secara paksa sebuah branch
- git branch -a, list remote branch

Git Merge
- git checkout -b new-feature master, memulai fitur baru
- git add <files> dan git commit -m "...", untuk mengedit beberapa file
- git checkout master, git merge mew-feature, dan git branch -d new-feature, untuk merge new feature

Pull request
In case on fire
- git commit
- git push
- leave building

Workflow collaboration
- dalam kolaborasi kita biasanya tidak hanya bekerja di dalam satu branch
- perlu dibuat beberapa branch untuk mengoptimalkan kolaborasi

1. Buat branch master dari branch development
2. Hindari direct edit ke branch development
3. Merge branch feature hanya ke branch development
4. Merge branch development ke branch master jika development selesai