# Lab 2 · Tipe data dan operasi

Minggu 2. Bagian A meminta ekspresi Java untuk empat hitungan. Bagian B meminta program berdasarkan ekspresi itu; boleh dipisah atau digabung. Bagian C meminta semua nilai yang diperlukan dibaca dari pengguna. Lembar meminta latihan diselesaikan saat sesi lab.

| No. | Program | Input dan yang harus keluar |
| --- | --- | --- |
| A1 | [`Average.java`](Average.java) | Tiga integer → rata-rata. Pakai pembagi `3.0` supaya hasil pecahan tidak hilang. |
| A2 | [`SalePrice.java`](SalePrice.java) | Harga awal dan diskon (%) → harga setelah diskon. Nilai `20` berarti 20%, bukan `0.20`. |
| A3 | [`PoundsToKg.java`](PoundsToKg.java) | Berat paket dalam lb → kg. Faktor pada soal: `0.45359` kg per lb. |
| A4 | [`BMI.java`](BMI.java) | Berat (kg) dan tinggi (m) → BMI. Soal ini hanya meminta angka BMI; kategorinya baru dipakai di Lab 6. |

[`Lab2Combined.java`](Lab2Combined.java) menjalankan empat hitungan berurutan. Gunakan salah satu cara, tidak perlu menjalankan keduanya untuk hitungan yang sama.

## Cek hasil

| Program | Input | Hasil yang perlu terlihat |
| --- | --- | --- |
| `Average` | `80`, `90`, `100` | `90.0` |
| `SalePrice` | `250`, `20` | `RM 200.00` |
| `PoundsToKg` | `10` | `4.5359 kg` |
| `BMI` | `60`, `1.70` | `20.76` |

Program dasar ini mengasumsikan angka masuk akal. Contohnya, tinggi `0` di `BMI` menghasilkan `Infinity`, bukan nilai BMI yang sah. Memasukkan `abc` pada prompt integer memunculkan `InputMismatchException`; jalankan ulang dengan angka.

```bash
javac -encoding UTF-8 *.java
java Average
```

Acuan: *Lab 2: Primitive Data Types and Operations*, bagian A–C.
