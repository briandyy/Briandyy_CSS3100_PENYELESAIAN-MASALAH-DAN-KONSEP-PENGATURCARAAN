# Lab 6 · Loop Statements

Minggu 7, Lab Assignment 4. Acuan ini adalah lembar berheader Sem 1 2021/2022 yang dipakai untuk latihan Lab 6. Lembar meminta flowchart, source Java, **tiga set output**, dan komentar identitas di source. Catatan persiapan juga bisa memakai PAC, IPO, dan pseudocode seperti contoh di slide Topic 6.

## Q1. Total penjualan

Ada lima kode produk. Harga untuk kode `1`–`5` berturut-turut RM2.98, RM4.50, RM9.98, RM4.49, dan RM6.87. Baca pasangan kode dan jumlah terjual, tentukan harga dengan `switch`, lalu tampilkan total semua penjualan. Angka `0` mengakhiri input dan tidak punya pasangan jumlah. Coba masukkan `0` sebagai kode pertama untuk mengecek kondisi berhenti.

## Q2. Tiket Zoo Negara

Baca kewarganegaraan pengunjung (`M` atau `F`). Bila `F`, kelompok tarifnya `I` (i-Kad/izin kerja/dependent pass), `E` (ASEAN), atau `O` (lainnya). Pilih kategori tiket dewasa (`A`), anak (`C`), atau lansia (`S`), lalu baca jumlah tiket.

Cetak biaya kelompok tiket dan total per pengunjung. Contoh di lembar menunjukkan dua keputusan yang berbeda: beli tiket lagi **untuk pengunjung yang sama**, atau selesai dengan pengunjung itu dan input **pengunjung berikutnya**. Untuk `F`, contoh meminta kelompok tarif lagi saat menambah tiket. Gunakan tabel di lembar; nilai itu bukan harga Zoo Negara saat ini.

## Q3. BMI beberapa orang

Baca nama lengkap, tinggi (m), berat (kg), dan lingkar pinggang (inci). Hitung BMI, tampilkan kategori berdasarkan tabel lembar, dan berikan informasi ambang pinggang untuk latihan. Ulangi sampai pengguna menjawab `n`. `N` pada contoh juga berhenti.

Contoh tidak meminta kategori pinggang, padahal dua ambangnya berbeda: 35 inci untuk wanita dan 40 inci untuk pria. Kalau program harus memilih ambang untuk tiap orang, minta kategori itu sebagai input dan tulis asumsi tersebut. Tabel lama juga tidak memberi label BMI di bawah 18.5. Ini latihan pemrograman, bukan penilaian medis.

## Q4. Klaim perjalanan 20 staf

Baca satu jarak per staf. Bayar RM0.70/km untuk 500 km pertama dan RM0.50/km untuk kilometer setelahnya. Cetak klaim tiap staf, bukan satu total gabungan. Contoh 1.050 km menghasilkan RM625.00. Coba jarak `499`, `500`, dan `501` untuk mengecek perpindahan tarif, serta hitung apakah program benar-benar meminta 20 jarak.

| Soal | Bentuk loop yang cocok |
| --- | --- |
| Q1 | `while` mengecek sentinel sebelum membaca kuantitas. |
| Q2 | Dua loop: pengunjung di luar, kelompok tiket di dalam. |
| Q3 | `do-while` karena perhitungan pertama berjalan sebelum pertanyaan lanjut. |
| Q4 | `for` karena jumlah staf sudah diketahui. |

Acuan: *Lab 6: Loop Statements*, hlm. 1–6; slide *Topic 6: Problem Solving with Loop Control*.
