# Lab 1 · Java dan Git

Minggu 1. Lembar lab mulai dari membuat `HelloWorld.java` dengan editor teks, mengompilasi lewat `javac`, dan menjalankan lewat `java`. Langkah yang sama dicoba di Eclipse. Bagian Git memakai alur clone, branch, stage, commit, dan push; lihat [catatan EGit](GIT-GUIDE.md).

## Empat soal

| No. | File | Yang diminta |
| --- | --- | --- |
| 1 | [`Name.java`](Name.java) | Tulis, kompilasi, dan uji kelas yang mencetak nama satu baris. |
| 2 | [`Student.java`](Student.java) | Cetak nama lengkap, nomor matrik, dan alamat di tiga baris. File publik memakai data contoh. |
| 3 | [`Welcome.java`](Welcome.java) | Cetak `Welcome`, `to`, `Java`, dan `Programming!` di baris terpisah. |
| 4 | [`MakingMoneyATM.java`](MakingMoneyATM.java) | Buat tampilan sambutan ATM dengan judul `Making Money Bank ATM Service`, teks `Welcome!`, dan komentar. Soal memberi latar tentang transaksi, tapi bagian yang diminta hanya layar sambutan. |

Soal meminta semua program ditunjukkan ke dosen atau demonstrator saat lab. Ada latihan tambahan dari buku, halaman 52–53 nomor 1.2 dan 1.5; teks latihannya tidak tercantum di lembar, jadi tidak dirangkum di sini.

## Coba dari terminal

```bash
javac Welcome.java
java Welcome
```

```text
Welcome
to
Java
Programming!
```

Nama file harus sama dengan nama `public class`, termasuk huruf besar/kecil. Waktu menjalankan `java`, tulis `Welcome`, bukan `Welcome.java` atau `Welcome.class`.

Acuan: *Lab 1: Programming and Version Control Environment (GitHub)*, hlm. 1–6.
