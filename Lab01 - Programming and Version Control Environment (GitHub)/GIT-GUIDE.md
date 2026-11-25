# Git untuk Lab 1

Lembar lab mendemokan alur ini lewat Eclipse EGit. Terima undangan repo terlebih dahulu jika kelas memakai repo tim. Di Eclipse buka **Git Repositories → Clone a Git Repository**, lalu impor proyek dari repo lokal. Buat branch sebelum mengedit file jika kelas meminta branch terpisah.

Padanan di terminal, dari folder Lab 1 di repo yang sudah di-clone:

```bash
git switch -c lab1-latihan
git status
git add -- Welcome.java
git diff --staged
git commit -m "Update Welcome exercise"
git push -u origin lab1-latihan
```

`git add` memilih file yang mau ikut commit. `git commit` menyimpan snapshot di mesin sendiri. `git push` baru mengirim commit ke GitHub. `git diff --staged` berguna untuk memastikan tidak ada `.class`, data pribadi, atau file lain yang ikut.

- Kalau GitHub meminta autentikasi untuk HTTPS, pakai credential manager atau token dengan akses minimum; alternatifnya SSH. Jangan simpan token di URL repo atau commit.
- Kalau push ditolak karena branch remote sudah maju, ambil perubahan remote dan cek perbedaannya. Jangan force push untuk menyelesaikan konflik biasa.
- Kalau perubahan sudah di-commit tapi belum muncul di GitHub, periksa branch yang dibuka dan hasil `git status`.
