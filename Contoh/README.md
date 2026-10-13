# Contoh — Example Programs

Small reference programs kept for practice.

| File | Description | Source |
|------|-------------|--------|
| [`HelloWorld.java`](HelloWorld.java) | The classic **"Hello world!"** application — first Java program, written and compiled *without* an IDE. | CCS3100 Lab 1 sheet |

## Compile & Run

```bash
javac HelloWorld.java   # compile -> produces HelloWorld.class (bytecode)
java HelloWorld         # run
```

Expected output:

```text
Hello world!
```

> ⚠️ `javac` and `java` are **case-sensitive** — the file name must match the
> public class name exactly (`HelloWorld`, not `helloworld`).
