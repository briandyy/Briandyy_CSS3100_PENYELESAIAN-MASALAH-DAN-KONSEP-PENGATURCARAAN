# Lab 5 · Character and String

Minggu 6, Lab Assignment 3. Lembar meminta flowchart, program Java, dan **tiga set output**, serta komentar identitas pada file yang akan dikumpulkan. Jangan pakai kata sandi asli buat pengujian.

## Q1. Potong teks dan ganti bagian yang cocok

1. Baca string pertama, termasuk spasi, lalu cek panjangnya.
2. Jika panjangnya **lebih dari 10**, tampilkan karakter ke-5 sampai ke-10 dan panjang seluruh string. Jika tidak, tampilkan pesan sesuai lembar. Syaratnya `> 10`, jadi panjang **tepat 10** ikut jalur pesan itu.
3. Baca string kedua. Jika ditemukan di string pertama, laporkan bahwa keduanya cocok lalu ganti bagian yang ditemukan dengan `Selamat Datang`. Jika tidak ditemukan, cetak pesan tanpa mengubah teks.

Contoh lembar: untuk `Welcome to Malaysia and Singapore`, cuplikan karakter 5–10 adalah `ome to`. Uji juga teks dengan kata yang tidak ditemukan. Posisi karakter di soal mulai dari 1; indeks Java mulai dari 0.

## Q2. Cek panjang lalu cari teks

1. Baca string pertama. Status valid hanya jika panjangnya **lebih dari 8**. Tepat 8 masih tidak valid.
2. Baca string kedua, lalu periksa apakah string pertama mengandung teks itu.
3. Jika ditemukan, laporkan dan pertahankan teks awal. Jika tidak, laporkan lalu gabungkan string kedua ke akhir string pertama.

Ini latihan `String`, bukan aturan keamanan kata sandi. Kasus uji yang berguna: panjang 8, panjang 9, substring ada, dan substring tidak ada.

Acuan: *Lab 5: Character and String*, bagian Instructions dan Questions.
