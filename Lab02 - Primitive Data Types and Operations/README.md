# Lab 2 · Tipe data dan operasi

Minggu 2. Bagian A meminta ekspresi Java untuk empat hitungan. Bagian B meminta program berdasarkan ekspresi itu; boleh dipisah atau digabung. Bagian C meminta semua nilai yang diperlukan dibaca dari pengguna. Lembar meminta latihan diselesaikan saat sesi lab.

| No. | Program | Input → Hasil | Rancangan dan hasil run |
| --- | --- | --- | --- |
| A1 | [`Average.java`](Average.java) | Tiga bilangan bulat → rata-rata. | [A1 · Rata-rata](solutions/a1-average.md) |
| A2 | [`SalePrice.java`](SalePrice.java) | Harga awal dan diskon (%) → harga setelah diskon. | [A2 · Harga setelah diskon](solutions/a2-sale-price.md) |
| A3 | [`PoundsToKg.java`](PoundsToKg.java) | Berat paket dalam lb → kg, dengan faktor `0.45359`. | [A3 · Konversi berat](solutions/a3-pounds-to-kg.md) |
| A4 | [`BMI.java`](BMI.java) | Berat (kg) dan tinggi (m) → angka BMI tanpa kategori. | [A4 · BMI](solutions/a4-bmi.md) |

Halaman A1–A4 berisi ekspresi Java (bagian A), PAC, IPO, flowchart SVG beserta sumber DOT, pseudocode, dan hasil run untuk input biasa serta kasus batas atau salah input.

[`Lab2Combined.java`](Lab2Combined.java) adalah alternatif yang menjalankan empat hitungan berurutan. Lihat [cara menjalankan dan hasil run versi gabungan](solutions/combined.md). Versi terpisah dan gabungan menjawab soal yang sama; cukup pilih salah satunya.

## Ringkasan run normal

| Program | Input | Hasil yang perlu terlihat |
| --- | --- | --- |
| `Average` | `80`, `90`, `100` | `90.0` |
| `SalePrice` | `250`, `20` | `RM 200.00` |
| `PoundsToKg` | `10` | `4.5359 kg` |
| `BMI` | `60`, `1.70` | `20.76` |

Program dasar ini belum memvalidasi input. Lihat halaman A1 untuk contoh salah tipe dan halaman A4 untuk hasil tinggi nol.

## Coba dari terminal

Dari folder Lab 2 (jalankan kelas yang ingin dicoba):

```bash
javac -encoding UTF-8 *.java
java -Duser.language=en -Duser.country=US Average
```

Agar hasil sama dengan transkrip lokal (OpenJDK 21.0.13.1), opsi `-D` menetapkan titik sebagai pemisah desimal. Pada kasus tinggi `1.70`, misalnya, ketik `1.70` pada prompt, lalu tekan Enter.

Acuan: *Lab 2: Primitive Data Types and Operations*, bagian A–C.
