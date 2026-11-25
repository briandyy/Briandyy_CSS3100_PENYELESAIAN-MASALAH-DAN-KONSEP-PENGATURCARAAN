# Lab 4 · Selection Statements

Minggu 4–5, Lab Assignment 2. Ada enam soal. Lembar meminta PAC, IPO, flowchart, pseudocode, dan program untuk Q1–Q3. Q5 meminta memperbarui desain dan program rujukan; Q4 dan Q6 fokus mengubah bentuk seleksi tanpa mengubah hasil. Dokumen demo memuat desain dan contoh input/output.

## Solusi

Setiap halaman desain memuat PAC, IPO, flowchart, pseudocode, dan transkrip dari run Java.

| Soal | Program Java | Desain dan bukti run |
| --- | --- | --- |
| Q1 · Diskon paket | [`Lab4Q1_PackageDiscount.java`](Lab4Q1_PackageDiscount.java) | [Desain Q1](docs/Q1.md) |
| Q2 · Diskon vendor | [`Lab4Q2_VendorDiscount.java`](Lab4Q2_VendorDiscount.java) | [Desain Q2](docs/Q2.md) |
| Q3 · Menu restoran | [`Lab4Q3_RestaurantOrder.java`](Lab4Q3_RestaurantOrder.java) | [Desain Q3](docs/Q3.md) |
| Q4 · Jenis hari | [`Lab4Q4_DayType.java`](Lab4Q4_DayType.java) | [Desain Q4](docs/Q4.md) |
| Q5 · Nilai dan grade | [`Lab4Q5_CourseMarkGrade.java`](Lab4Q5_CourseMarkGrade.java) | [Desain Q5](docs/Q5.md) |
| Q6 · Habis dibagi 3 | [`Lab4Q6_DivisibleBy3.java`](Lab4Q6_DivisibleBy3.java) | [Desain Q6](docs/Q6.md) |

Dari folder ini, kompilasi semua program dengan JDK. Ganti nama kelas pada perintah `java` untuk menjalankan soal lain:

```bash
javac -encoding UTF-8 *.java
java -Duser.language=en -Duser.country=US Lab4Q1_PackageDiscount
```

Ketik angka desimal dengan titik, misalnya `100.01`.

## Q1. Diskon paket perangkat lunak

Harga satu paket RM45.20. Baca jumlah paket; tampilkan jumlahnya, nilai potongan, dan total setelah potongan. Tangga diskon di lembar: 10–29 = 3%, 30–49 = 5%, 50–99 = 10%, dan 100 ke atas = 15%. Di bawah 10 tidak ada baris diskon. Coba `9` dan `10` untuk memeriksa perpindahan tingkat.

## Q2. Diskon vendor

Baca jumlah unit dan harga satu unit. Gunakan jumlah untuk memilih baris, lalu harga untuk memilih kolom. Tampilkan jumlah unit dan harga total setelah potongan.

| Jumlah unit | RM0.01–10.00 | RM10.01–100.00 | RM100.01 ke atas |
| --- | ---: | ---: | ---: |
| Lebih dari 1000 | 21% | 32% | 43% |
| 500–999 | 14% | 23% | 32% |
| 100–499 | 9% | 15% | 21% |
| 10–99 | 5% | 7% | 9% |
| 1–9 | 0% | 2% | 5% |

Lembar mencetak `100.01` untuk kolom terakhir tanpa batas atas dan melewatkan **tepat 1000 unit**. Kode menganggap kolom terakhir berarti harga `> 100.00` dan memasukkan 1000 unit ke tingkat 500–999. Keduanya asumsi, bukan aturan resmi.

## Q3. Menu restoran dengan `switch`

Pilihan di lembar: `1` steak (RM29.50), `2` grill chicken (RM19.50), `3` pasta (RM15.00), `4` minuman (RM4.90). Baca kode dan kuantitas. Cetak item terpilih, harga satuan, dan total. Kode `0` berarti keluar tanpa meminta kuantitas. Frasa “and/or” pada lembar bisa berarti beberapa item, tetapi kode ini hanya memproses **satu item per run**.

## Q4. Ubah `switch` menjadi `if`

Pertahankan hasil dari potongan kode di halaman 2: `1`–`5` mencetak `Weekday`, `0` dan `6` mencetak `Weekend`, dan nilai lain mencetak `unknown DAY`. Uji satu nilai dari tiap kelompok.

## Q5. Nilai dari skor mentah dan grade huruf

Masukan bukan empat persentase. Tes 1 maksimal 40, Tes 2 maksimal 50, tiga assignment masing-masing maksimal 30, dan ujian akhir maksimal 80. Bobotnya berturut-turut 15%, 20%, 35%, dan 30%. Tampilkan komponen nilai, total dari 100, dan grade sesuai tabel pada lembar.

Baris B (`65–69`) dan B− (`60–69`) tumpang tindih di lembar. Kode mendahulukan B (`65 <= total < 70`), sehingga B− dipakai untuk `60 <= total < 65`. Ini asumsi, bukan koreksi resmi. Grade menggunakan total sebelum pembulatan tampilan.

## Q6. Ubah `if` menjadi operator kondisional

Cetak apakah integer habis dibagi 3. Bentuk awal memakai `if/else`; yang diminta memakai `?:` untuk memilih teks hasil, dengan tes sisa bagi yang sama.

Acuan: *Lab 4: Selection Statements (Week 4 & 5)*, hlm. 1–3.
