# Tugas Inheritance PBO - Implementasi Bangun Datar dan Ruang

Repositori ini berisi sekumpulan kode program Java yang dibangun untuk memenuhi tugas inheritance Pemrograman Berorientasi Objek (PBO). Program ini memodelkan bentuk geometris dasar (Bentuk, Bujur Sangkar, Lingkaran, dan Silinder) untuk menghitung luas dan volume. 

Sesuai dengan instruksi tugas, program ini mengimplementasikan tiga pilar utama OOP sebagai berikut<img width="1118" height="472" alt="bentuk" src="https://github.com/user-attachments/assets/2e9c8988-c2bc-4f03-8d2b-055c698eaac5" />
:

### 1. Encapsulation (Enkapsulasi)
Penerapan *encapsulation* (pembungkusan data) bertujuan untuk menjaga keamanan data agar tidak dimodifikasi secara sembarangan dari luar kelas. Dalam kode ini, enkapsulasi diterapkan dengan cara:
* Menggunakan *access modifier* `private` pada atribut-atribut penting kelas anak, seperti `private double sisi` pada kelas `BujurSangkar`, `private double radius` pada kelas `Lingkaran`, dan `private double tinggi` pada kelas `Silinder`.
* Menyediakan metode *Getter* (contoh: `getSisi()`, `getRadius()`) untuk membaca nilai data.
* Menyediakan metode *Setter* (contoh: `setSisi()`, `setRadius()`) untuk mengubah nilai data dengan cara yang terkontrol melalui *method*.

### 2. Inheritance (Pewarisan)
Konsep *inheritance* digunakan untuk menghindari duplikasi kode dengan cara menurunkan sifat (atribut) dan perilaku (method) dari kelas induk (Superclass) ke kelas anak (Subclass). Dalam tugas ini, hierarki pewarisan yang dibuat adalah:
* **`Bentuk` (Superclass Utama):** Memiliki atribut `public String warna`. Atribut ini otomatis diwariskan ke semua kelas turunannya.
* **`BujurSangkar` dan `Lingkaran` (Subclass dari Bentuk):** Keduanya menggunakan *keyword* `extends Bentuk`. Di dalam *constructor*-nya, terdapat pemanggilan `super(warna)` untuk mengeksekusi *constructor* milik kelas induk.
* **`Silinder` (Subclass dari Lingkaran):** Menggunakan `extends Lingkaran`. Karena `Silinder` adalah turunan dari `Lingkaran`, ia tidak perlu membuat rumus luas alas dari nol. Kelas `Silinder` langsung memanggil metode `hitungLuas()` warisan dari `Lingkaran` untuk mengkalkulasi `hitungVolume()`.

### 3. Polymorphism (Polimorfisme)
Polimorfisme yang diterapkan dalam program ini adalah bentuk **Dynamic Polymorphism** melalui konsep *Method Overriding*. 
* Di kelas induk (`Bentuk`), terdapat metode `printInfo()` yang berfungsi mencetak teks dasar: "Bentuk berwarna [warna]".
* Pada kelas-kelas turunannya (`BujurSangkar`, `Lingkaran`, `Silinder`), metode `printInfo()` tersebut ditulis ulang (*di-override*) menggunakan anotasi `@Override`.
* Walaupun nama metodenya sama persis (`printInfo()`), output yang dihasilkan akan berbeda-beda (menampilkan luas atau volume spesifik) tergantung dari objek apa yang sedang memanggil metode tersebut di kelas `Main`.

---

### Struktur File
1. `Bentuk.java` - Berisi kelas induk utama.
2. `BujurSangkar.java` - Turunan dari kelas Bentuk, memiliki metode hitung luas.
3. `Lingkaran.java` - Turunan dari kelas Bentuk, memiliki metode hitung luas dengan konstanta PHI.
4. `Silinder.java` - Turunan dari kelas Lingkaran, memiliki metode hitung volume.
5. `Main.java` - Kelas utama yang berisi metode `public static void main` untuk melakukan instansiasi objek dan menguji (*run*) program.

---

### Screenshot Hasil Eksekusi Program
<img width="1118" height="472" alt="bentuk" src="https://github.com/user-attachments/assets/ae3b84c5-9fba-4956-afcb-7489256f2c44" />

