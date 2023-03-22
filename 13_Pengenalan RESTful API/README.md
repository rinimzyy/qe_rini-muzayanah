# Section 13

## Pengenalan RESTful API

Basic of API Testing

API adalah singkatan dari "Applicatiom Programming Interface". API merupakan Apa sih API itu?
API adalah singkatan dari Application Programming Interface. API sendiri merupakan antarmuka yang dapat menghubungkan satu aplikasi dengan aplikasi lainnya.- API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah.

API workflow:
Client melakukan request-> API menyampaikan request ke system-> System memberikan respon melalui API->API memberikan respon kepada client.

b. REST API
- REST API singkatan dari "Representational State Transfer". API RESTful adalah antarmuka yang digunakan oleh dua sistem komputer untuk bertukar informasi secara aman melalui internet dengan menggunakan HTTP method.
- HTTP method:
  a) Get: Membaca data
  b) Put: Membuat/Mengganti data
  c) Post: Membuat data baru
  d) Delete: Menghapus data yang ada

- Component REST API: Method, URL (base URL + path), header, body.
- HTTP Rsponse Code:
  a) 200: OK, status response code indicates that the request has succeeded.
  b) 201: Created,  the request has succeeded and has led to the creation of a resource.
  c) 400 Bad Request, the server cannot or will not process the request due to something that is perceived to be a client error.
  d) 404: Not Found, the server cannot find the requested resource.
  a) 401: Unauthorized, the client request has not been completed because it lacks valid authentication credentials for the requested resource.
  b) 405: Method Not Allowed, that the server knows the request method, but the target resource doesn't support this method.
  c) 500: Internal Server Error, the server encountered an unexpected condition that prevented it from fulfilling the request.

