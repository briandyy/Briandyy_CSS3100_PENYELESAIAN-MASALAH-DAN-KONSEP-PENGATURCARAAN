# Lab 2 · Empat hitungan dalam satu program

[Kembali ke daftar soal](../README.md) · [Kode Java: `Lab2Combined.java`](../Lab2Combined.java)

Bagian B mengizinkan empat program terpisah atau satu program gabungan. Versi gabungan membaca input dan langsung mencetak hasil setiap hitungan. Urutannya: [A1 rata-rata](a1-average.md), [A2 harga setelah diskon](a2-sale-price.md), [A3 pon ke kilogram](a3-pounds-to-kg.md), lalu [A4 BMI](a4-bmi.md). Rancangan setiap hitungan ada di tautan tersebut.

## Hasil run lokal

Dari folder Lab 2:

```bash
javac Lab2Combined.java
java -Duser.language=en -Duser.country=US Lab2Combined
```

Ketik nilai yang terlihat setelah setiap prompt, lalu tekan Enter.

```text
-- Question A(1): Average of three integers --
Enter the first integer  : 80
Enter the second integer : 90
Enter the third integer  : 100
Average of 80, 90 and 100 = 90.0

-- Question A(2): Sale price --
Enter the original price (RM)     : 250
Enter the discount percentage (%) : 20
Sale price : RM 200.00

-- Question A(3): Pounds to kilograms --
Enter the weight in pounds (lb) : 10
Weight of the parcel : 4.5359 kg

-- Question A(4): Body Mass Index --
Enter the weight (kg) : 60
Enter the height (m)  : 1.70
Body Mass Index (BMI) : 20.76
```

Nilai akhirnya sama seperti pada contoh normal di versi terpisah. Bagian A2 di versi gabungan hanya mencetak harga akhir, tanpa mengulang harga awal dan persentase diskon.
