# Lab 6 · Loop Statements

Paket latihan pribadi untuk empat soal Lab 6 (Minggu 7, Lab Assignment 4). Lembar acuan Sem 1 2021/2022 meminta flowchart, source Java, dan tiga set output per soal. Lembar lama ini bukan konfirmasi pembagian soal atau ketentuan kelas sekarang. Simpan jawaban secara privat; jangan taruh di repo publik atau bagikan ke teman sekelas. Kolom identitas pada kode dan Word sengaja tidak diisi.

## Berkas per soal

| Soal | Java | Panduan dan tautan input/output | Dokumen Word | Flowchart |
| --- | --- | --- | --- | --- |
| 1 · Total penjualan (`while`, `switch`) | [Q1ProductSales.java](src/Q1ProductSales.java) | [PAC, IPO, pseudocode, dan run](docs/Q1.md) | [Lab6-Soal-1.docx](docs/Lab6-Soal-1.docx) | [PNG](charts/Q1.png) |
| 2 · Tiket Zoo Negara (`do-while` bersarang) | [Q2ZooTickets.java](src/Q2ZooTickets.java) | [PAC, IPO, pseudocode, dan run](docs/Q2.md) | [Lab6-Soal-2.docx](docs/Lab6-Soal-2.docx) | [PNG](charts/Q2.png) |
| 3 · BMI berulang (`do-while`) | [Q3BMICalculator.java](src/Q3BMICalculator.java) | [PAC, IPO, pseudocode, dan run](docs/Q3.md) | [Lab6-Soal-3.docx](docs/Lab6-Soal-3.docx) | [PNG](charts/Q3.png) |
| 4 · Klaim perjalanan 20 staf (`for`) | [Q4TravelClaims.java](src/Q4TravelClaims.java) | [PAC, IPO, pseudocode, dan run](docs/Q4.md) | [Lab6-Soal-4.docx](docs/Lab6-Soal-4.docx) | [PNG](charts/Q4.png) |

Setiap DOCX berdiri sendiri: PAC, IPO, flowchart dengan shape Word yang dapat diedit, pseudocode, kode, tiga set input/output, dan satu contoh error beserta cara memperbaiki input. Jika posisi shape dipindah, sesuaikan panahnya juga. Gunakan PNG untuk melihat diagram tanpa Word.

- [`samples/`](samples/) berisi 12 pasangan input dan output asli, tiga per soal. File `.in.txt` berisi jawaban sesuai urutan prompt, sedangkan `.out.txt` berisi stdout aktual. Saat input dialihkan dari berkas, jawaban tidak ikut tercetak sehingga beberapa prompt terlihat sebaris.
- [`errors/`](errors/) berisi empat pasangan contoh input bukan angka dan hasil `InputMismatchException`, satu per soal. Cuplikan di Word dipenggal per baris agar muat di halaman; file teks menyimpan hasil lengkap.
- Tarif Q2 berlaku untuk tabel di soal lama, bukan daftar harga terkini. Q3 memakai contoh tanpa identitas pribadi dan menambah pilihan `W/M` agar ambang pinggang dapat dipilih; hasilnya bukan diagnosis.

## Jalankan dari folder Lab 6

Perlu JDK (`javac` dan `java` di PATH). Contoh menjalankan Soal 1 dengan input dari berkas di terminal Linux/WSL:

```bash
mkdir -p bin
javac -encoding UTF-8 -d bin src/Q1ProductSales.java
java -Duser.language=en -Duser.country=US -Dfile.encoding=UTF-8 -cp bin Q1ProductSales < samples/Q1-set1.in.txt
```

Hapus bagian `< samples/Q1-set1.in.txt` untuk mengetik input sendiri. Di Eclipse, masukkan file `.java` ke `src` Java Project biasa, lalu pilih **Run As → Java Application**. Untuk menjalankan set yang sama, gunakan titik sebagai pemisah desimal.

## Verifikasi

Dengan JDK dan Python 3 di terminal Linux/WSL:

```bash
python3 tests/test_lab6.py       # empat program, 12 set
python3 tests/test_lab6.py Q2    # hanya tiga set Soal 2
```

[Runner pengujian](tests/test_lab6.py) mengompilasi ke folder sementara dan membandingkan stdout dengan berkas sampel, termasuk spasi dan baris baru.

Acuan: *Lab 6: Loop Statements*, hlm. 1–6; *Topic 3: Problem Solving Techniques* dan *Topic 6: Problem Solving with Loop Control*.
