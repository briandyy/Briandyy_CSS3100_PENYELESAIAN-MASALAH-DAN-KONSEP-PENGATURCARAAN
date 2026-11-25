# Lab 1 · Java dan Git

Minggu 1. Mulai dari [contoh `HelloWorld.java`](../Contoh/HelloWorld.java): tulis dengan editor teks, kompilasi dengan `javac`, lalu jalankan dengan `java`. [Panduan HelloWorld](../Contoh/README.md) menunjukkan langkahnya. Latihan ini bisa diulang di Eclipse dengan **Run As → Java Application**. `HelloWorld` adalah contoh pembuka, bukan salah satu dari empat soal di bawah.

Bagian Git membahas clone, branch, stage, commit, dan push; lihat [catatan EGit](GIT-GUIDE.md). Perintah push di panduan hanya untuk latihan dengan repo remote yang sesuai, bukan untuk mencoba solusi lokal ini.

## Empat soal

| No. | Kode Java | Yang diminta | Rancangan dan hasil run |
| --- | --- | --- | --- |
| 1 | [`Name.java`](Name.java) | Cetak nama satu baris. | [Soal 1](solutions/q1-name.md) |
| 2 | [`Student.java`](Student.java) | Cetak nama lengkap, nomor matrik, dan alamat di tiga baris. Kode memakai data contoh. | [Soal 2](solutions/q2-student.md) |
| 3 | [`Welcome.java`](Welcome.java) | Cetak `Welcome`, `to`, `Java`, dan `Programming!` di baris terpisah. | [Soal 3](solutions/q3-welcome.md) |
| 4 | [`MakingMoneyATM.java`](MakingMoneyATM.java) | Tampilkan judul `Making Money Bank ATM Service` dan teks `Welcome!`. Kode menyertakan komentar. | [Soal 4](solutions/q4-making-money-atm.md) |

Setiap halaman soal berisi PAC, IPO, flowchart SVG beserta sumber DOT, pseudocode, dan hasil run lokal. Keempat program mencetak teks tanpa meminta input.

Lembar lab meminta semua program ditunjukkan kepada dosen atau demonstrator saat lab. Latihan tambahan buku, halaman 52–53 nomor 1.2 dan 1.5, terpisah dari empat soal ini. Teks latihannya tidak tercantum di lembar, jadi solusinya tidak disertakan di sini.

## Coba dari terminal

Dari folder Lab 1:

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
