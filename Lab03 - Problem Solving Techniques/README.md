# Lab 3 · Problem Solving Techniques

Minggu 3. Buat **PAC, IPO, flowchart, dan pseudocode** untuk kedua soal, lalu tulis Java berdasarkan desain itu. PAC merangkum data dan hasil yang dicari. IPO memisahkan input, proses, dan output supaya perhitungan mudah dilacak saat demo.

## Solusi

| Soal | Program Java | Desain dan bukti run |
| --- | --- | --- |
| Q1 · Nilai akhir berbobot | [`Lab3Q1_GradeCalculator.java`](Lab3Q1_GradeCalculator.java) | [PAC, IPO, flowchart, pseudocode, dan transkrip](docs/Q1.md) |
| Q2 · Resi dua jenis barang | [`Lab3Q2_Receipt.java`](Lab3Q2_Receipt.java) | [PAC, IPO, flowchart, pseudocode, dan transkrip](docs/Q2.md) |

Dari folder ini, kompilasi kedua program dengan JDK, lalu pilih mana yang mau dijalankan:

```bash
javac -encoding UTF-8 *.java
java -Duser.language=en -Duser.country=US Lab3Q1_GradeCalculator
java -Duser.language=en -Duser.country=US Lab3Q2_Receipt
```

Ketik angka desimal dengan titik, misalnya `2.30`. Contoh Q1 memakai data matrik fiktif.

## 1. Nilai akhir mata kuliah

Baca nomor matrik untuk identifikasi dan empat nilai yang masing-masing berskala 0–100. Tampilkan kontribusi tiap komponen dan jumlah nilai akhir.

| Komponen | Bobot |
| --- | ---: |
| Assessment 1 | 15% |
| Assessment 2 | 20% |
| Lab Assignment | 35% |
| Final Exam | 30% |

Cek hasil untuk nilai `65`, `67`, `89`, dan `80`: kontribusinya `9.75`, `13.4`, `31.15`, dan `24`, total `78.3`. Soal ini tidak meminta grade huruf.

## 2. Resi untuk dua jenis barang

Untuk **masing-masing dari dua barang**, baca nama, harga satuan (RM), dan kuantitas. Resi perlu memperlihatkan jumlah harga tiap barang, subtotal, pajak pemerintah 6%, biaya layanan 10%, dan total. Kedua biaya memakai **subtotal yang sama**.

Contoh lembar: dua susu seharga RM2.30 satuan dan sepuluh telur seharga RM0.70 satuan. Subtotal RM11.60; pajak tampil RM0.70, biaya layanan RM1.16, total RM13.46.

## Bukti yang diminta

Lembar versi 2026/2027 meminta file Java, dokumen input/output, dan demo. Lembar itu membedakan demo langsung dan demo video bila belum sempat menunjukkan langsung. Selalu cocokkan prosedurnya dengan pengumuman kelas sendiri. Jangan menaruh nomor matrik asli di contoh konsol publik.

Acuan: *Lab 3: PRE-prg phase, Data Types and Operations*, hlm. 1–3.
