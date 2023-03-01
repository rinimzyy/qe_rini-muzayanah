## Section 6

# Tracking Management Tools

JIRA
- Jira adalah alat bantu yang bertujuan untuk pelacakan bugs, pelacakan issue, dan management proyek

Kelebihan Jira
- Jira memiliki 2 metode yaitu Scum dan Kanban. Hal tersebut memudahkan developer untuk melakukan brainstorming. Fitur cukup intuitif sehingga cocok untuk melakukan kolaborasi dalam tim.
- Anggota tim dapat mengetahui masalah yang dimiliki oleh anggota tim lainnya.
- Memiliki fitur roadmap, dapat membantu anggota tim untuk mengetahui gamparan utuk job yang akan dilakukan kedepannya.
- Melalui roadmap team leader dapat memiliki kontrol penuh terhadap berbagai pekerjaan yang dilakukan. Team leader dapat melihat gambaran projek secara utuh sehingga mempermudah pengambilan keputusan.
- Dapat dihubungkan dengan aplikasi yang lain.

Create New Project
1. Klick burron dropdown di sebelah kiri atas dan klik new project
2. Pilih scum sebagai metode, kemudian masukkan nama project dan click button create

Panel dalam jira
- TODO, berisi panel story yang akan dikerjakan dan sudah diprioritaskan saat planning. Story yang ditempatkan paling atas menandakan bahwa story tersebut merupakan prioritas utama.
- In Progress, berisi story yang sedang dikerjakan oleh software engineer
- Finish, berisi story yang sudah dikerjakan oleh para software engineer, namun belum siap untuk tahap testing
- Deliver, berisi story yang siap memasuki tahap testing oleh para qe
- Need fix, berisi hasil proses testing yang tidak lolos kriteria oleh team development.
- Done, berisi fitur-fitur yang sudah lolos dari criteria testing pleh development team

Create issues
- Issue pada jira akan melacak masalah yang mendasari projek ataupun bug

7 point penting for creating issue
- Project
- Issue type
- Reporter
- Description
- Priority
- Assignee
- Sprint

Issue type:
- Story, digunakan untuk membuat fitur baru
- Task, melakukan perincian tugas-tugas yang akan dikerjakan
- Bug, digunakan jika terjadi penemuan bug saat proses testing oleh quality engineer
- Epic, untuk melakukan pengelompokan task


- Reporter ditentukan berdasarkan siapa yang membuat tugas tersebut
- Description, menuliskan deskripsi dengan jelas menggunakan format yang sama dengan dituliskan pada privotal tracker

Kondisi deskription:
- Acceptance criteria, jika fitur yang dibuat sudah sesuai dengan acceptance kriteria yang ditentukan oleh development team
- Test implementation, membuat dokumentasi setelah melakukan proses testing (test scenario)
- Priority, menentukan priority berdasarkan dari tingkat kesulitan sebuah task atau issue tersebut
- Assignee, menentukan assignee berdasarkan dari orang yang akan bertanggung jawab mengerjakan tugas tersebut
- Sprint, menentukan sprint berdasarkan dari ruang waktu pengerjaan sebuah task atau issue (1/2 minggu)

Fase pada jira
Todo - in progress - finish - deliver - need fix - (kembali ke in progress jika terdapat bug) - done