# Lab 2 (Week 2) — Primitive Data Types and Operations

**Course:** CCS3100 Problem Solving and Programming Concepts · **Semester 1, 2026/2027**

> From the lab sheet: *Create a Java equation for each of the following calculations (apply variables if required) ... write Java program(s) that can perform the calculations and solve the problems ... add input process in all Java programs.*

## 🎯 What this lab covers

1. Developing simple programs using **primitive data types** (`int`, `double`) based on problems.
2. Solving problems using **mathematical operations** (sum, multiply, divide).
3. Reading user input using `Scanner` and displaying the results.

## 📝 Exercises & Solutions

| # | Question | File | Task | Status |
|---|:---:|------|------|:------:|
| 1 | A(1) | [`Average.java`](Average.java) | Average of three integers | ✅ |
| 2 | A(2) | [`SalePrice.java`](SalePrice.java) | Sale price of an item with a discount percentage | ✅ |
| 3 | A(3) | [`PoundsToKg.java`](PoundsToKg.java) | Convert parcel weight from pounds to kilograms | ✅ |
| 4 | A(4) | [`BMI.java`](BMI.java) | Individual Body Mass Index (BMI) | ✅ |
| ⭐ | Bonus | [`Lab2Combined.java`](Lab2Combined.java) | All four calculations combined in a single program (lab sheet option B) | ✅ |

## 🔍 Input → Process → Output

| # | Program | Input | Process (equation) | Output |
|---|---------|-------|--------------------|--------|
| 1 | `Average.java` | Three integers (`int`) | `average = (first + second + third) / 3.0` | Average as `double` |
| 2 | `SalePrice.java` | Original price (RM), discount percentage (%) | `sale = price * (100 − discount) / 100.0` | Sale price (RM) |
| 3 | `PoundsToKg.java` | Weight in pounds (`double`) | `kilograms = pounds * 0.45359` | Weight in kilograms |
| 4 | `BMI.java` | Weight (kg), height (m) | `bmi = weight / (height * height)` | BMI value |

*(Equations applied exactly as given in the lab sheet; division uses `3.0` / `100.0` so the results keep their decimal places.)*

## 🖥️ Sample Output

### 1 — `Average.java`

**Valid input — `80`, `90`, `100`:**

```text
Enter the first integer  : 80
Enter the second integer : 90
Enter the third integer  : 100

Average of 80, 90 and 100 = 90.0
```

**Invalid input — letters (e.g. `abc`):**

```text
Enter the first integer  : abc
Exception in thread "main" java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:947)
    ...
```

> The program expects **integer** input — entering non-numeric data stops the program with an `InputMismatchException`.

### 2 — `SalePrice.java`

**Valid input — price `250`, discount `20`:**

```text
Enter the original price (RM)     : 250
Enter the discount percentage (%) : 20

Original price : RM 250.00
Discount       : 20.0%
Sale price     : RM 200.00
```

**Invalid input — discount `120` (%):**

```text
Enter the original price (RM)     : 250
Enter the discount percentage (%) : 120

Original price : RM 250.00
Discount       : 120.0%
Sale price     : RM -50.00
```

> A discount above 100% is invalid data — the calculation still runs and produces a **negative** sale price (input validation will be covered in a later chapter).

### 3 — `PoundsToKg.java`

**Valid input — `10` lb:**

```text
Enter the weight in pounds (lb) : 10

Weight of the parcel : 4.5359 kg
```

**Invalid input — `-5` lb:**

```text
Enter the weight in pounds (lb) : -5

Weight of the parcel : -2.2680 kg
```

> A negative weight is invalid data — the conversion still runs, producing a negative kilogram value.

### 4 — `BMI.java`

**Valid input — weight `60` kg, height `1.70` m:**

```text
Enter the weight (kg) : 60
Enter the height (m)  : 1.70

Body Mass Index (BMI) : 20.76
```

**Invalid input — height `0` m:**

```text
Enter the weight (kg) : 60
Enter the height (m)  : 0

Body Mass Index (BMI) : Infinity
```

> A height of 0 causes a **division by zero** — for `double` values Java produces `Infinity` instead of crashing.

### ⭐ Bonus — `Lab2Combined.java` (combined version)

The lab sheet also allows combining all calculations into a single program — this bonus file does all four in one run:

```text
-- Question A(1): Average of three integers --
Enter the first integer  : 85
Enter the second integer : 90
Enter the third integer  : 95
Average of 85, 90 and 95 = 90.0

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

## ▶️ Compile & Run

```bash
javac Average.java       && java Average
javac SalePrice.java     && java SalePrice
javac PoundsToKg.java    && java PoundsToKg
javac BMI.java           && java BMI
javac Lab2Combined.java  && java Lab2Combined   # bonus: all four in one run
```

## ✅ Before presenting

- [x] All four programs compile & run with the correct results.
- [x] Input → process → output documented (table above) with valid and invalid samples.
- [ ] Run the programs in front of the demonstrator and show the GitHub repository.

---

<div align="center"><sub>© 2026 Afif Febriandy · FSKTM, Universiti Putra Malaysia</sub></div>
