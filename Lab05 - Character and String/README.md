# Lab 5 · Character and String

CSS3100 · Minggu 6 · Lab Assignment 3. Tujuan: membaca satu baris utuh, memeriksa panjangnya, mencari substring, dan menyusun teks baru dengan Java. Lembar lab meminta **flowchart, kode Java, dan tiga set output**.

> Referensi pribadi. Jangan publikasikan atau bagikan jawaban. Nama, nomor matrik, dan program studi pada header Java sengaja berupa placeholder. Jika diperlukan untuk pengumpulan yang diizinkan, isi hanya pada salinan pengumpulan. Selalu gunakan string contoh, bukan kata sandi asli.

| Soal | Desain | Java | Tangkapan konsol |
| --- | --- | --- | --- |
| Q1 · Potong teks dan ganti kecocokan pertama | [PAC, IPO, pseudocode, dan flowchart](Q1-Design.md) | [Lab5Q1_StringOperation.java](Lab5Q1_StringOperation.java) | [Set 1](outputs/q1-set1.txt) · [Set 2](outputs/q1-set2.txt) · [Set 3](outputs/q1-set3.txt) |
| Q2 · Cek panjang dan gabungkan teks bila tak ditemukan | [PAC, IPO, pseudocode, dan flowchart](Q2-Design.md) | [Lab5Q2_PasswordCheck.java](Lab5Q2_PasswordCheck.java) | [Set 1](outputs/q2-set1.txt) · [Set 2](outputs/q2-set2.txt) · [Set 3](outputs/q2-set3.txt) |

## Cara menjalankan

Dari folder lab, gunakan JDK (diuji dengan Java 21):

```bash
mkdir -p .build
javac -d .build Lab5Q1_StringOperation.java Lab5Q2_PasswordCheck.java
java -cp .build Lab5Q1_StringOperation
java -cp .build Lab5Q2_PasswordCheck
```

Jalankan satu soal, masukkan dua baris sesuai prompt (tekan Enter setelah masing-masing), lalu jalankan soal berikutnya. File di `outputs/` memuat prompt, input, dan hasil yang tampil di konsol. Sumber flowchart ada di `flowcharts/` sebagai `.dot`; SVG tertanam di desain, dengan PNG sebagai alternatif.

Acuan: *Lab 5: Character and String*, bagian Instructions, Questions, dan Sample Output; *Topic 3: Problem Solving Techniques* untuk format desain; *Topic 5: Strings* untuk operasi `String`.
