# Lab 1 (Week 1) — Programming and Version Control Environment (GitHub)

**Course:** CCS3100 Problem Solving and Programming Concepts · **Semester 1, 2026/2027**

> From the lab sheet: *Using Eclipse open source tools* — creating your first Java
> application, and using **GitHub** for version control.

## 🎯 What this lab covers

1. Writing Java in a text editor and compiling/running it **without an IDE** (`javac`, `java`).
2. Using the **Eclipse IDE** to create, compile and run Java programs.
3. Using **GitHub** (via Eclipse EGit) to clone the team repository, branch, commit and push.

## 📝 Exercises & Solutions

| # | File | Task | Status |
|---|------|------|:------:|
| 1 | [`Name.java`](Name.java) | Print your name on the screen. | ✅ |
| 2 | [`Student.java`](Student.java) | Print full name, matric number and address in **three separate lines**. | ✅ |
| 3 | [`Welcome.java`](Welcome.java) | Print multiple lines of text: `Welcome` / `Java` / `Programming!` | ✅ |
| 4 | [`MakingMoneyATM.java`](MakingMoneyATM.java) | Display "Making Money Bank ATM Service" and "Welcome!" in an **attractive layout** (comments required). | ✅ |

## 🖥️ Expected Output

**1 — `Name.java`**

```text
Afif Febriandy
```

**2 — `Student.java`**

```text
Full Name : Afif Febriandy
Matric No : BC264825
Address   : [your address here]
```

**3 — `Welcome.java`**

```text
Welcome

Java
Programming!
```

**4 — `MakingMoneyATM.java`**

```text
********************************************************************
*                                                                  *
*                    Making Money Bank ATM Service                 *
*                                                                  *
********************************************************************

Welcome!
```

## ▶️ Compile & Run

```bash
javac Name.java           && java Name
javac Student.java        && java Student
javac Welcome.java        && java Welcome
javac MakingMoneyATM.java && java MakingMoneyATM
```

No `javac` yet? Install the latest **JDK** — or use **Eclipse**: *Run As → Java Application*.

## ✅ Before presenting

- [ ] Replace the **address placeholder** in `Student.java` with your own address.
- [ ] Run all four programs in front of the demonstrator.
- [ ] Show the commit history / branch on GitHub (see [`GIT-GUIDE.md`](GIT-GUIDE.md)).
