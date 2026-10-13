# GitHub & EGit Workflow Guide (Lab 1)

> Quick reference for the version-control part of the **CCS3100 Lab 1** sheet
> ("Steps to use GitHub") — Eclipse EGit steps plus terminal equivalents.

## 1. As a developer (Eclipse EGit) — following the lab sheet

| Step | Action |
|:---:|--------|
| 1 | Sign in to GitHub — **accept the team leader's invitation** from your GitHub account. |
| 2 | Start Eclipse. |
| 3 | Go to **Perspective → Git Repositories** → click **Clone a Git repository**. |
| 4 | Paste the repository **URI**, then enter your GitHub user ID and password. *Tip: use a **Personal Access Token** — account passwords no longer work for Git operations.* |
| 5 | Right-click in **Package Explorer → Import… → Git → Projects from Git → Existing local repository**. |
| 6 | Modify / add a new `.java` file. |
| 7 | **Add to Index** (stage the change). |
| 8 | **Add to branch** (attach the change to the repo branch). |
| 9 | **Branches → Switch to new branch → New branch**. |
| 10 | **Commit and Push** to the branch for **every change** to the remote repo. |

## 2. Same workflow in the terminal (Git CLI)

```bash
git clone <repository-URI>          # get a local copy
cd <repository-folder>

git status                          # what changed?
git add .                           # stage everything      (Step 7)
git commit -m "Add Lab 1 files"     # commit the snapshot   (Step 8)
git push                            # upload to GitHub      (Step 10)

git checkout -b lab1-my-branch      # create + switch branch (Step 9)
git branch -a                       # list branches
```

## 3. Core concepts

| Term | Meaning |
|------|---------|
| **Repository** | The project tracked by Git (a local copy + a remote on GitHub). |
| **Clone** | Copy a remote repository to your computer. |
| **Index / staging** | The "waiting room" where changes sit before a commit. |
| **Commit** | A saved snapshot of staged changes, with a message. |
| **Branch** | An independent line of development — teammates can work without breaking `main`. |
| **Remote (`origin`)** | The GitHub-hosted copy of the repository. |
| **Push / Pull** | Send / receive commits between local and remote. |

## 4. Common problems

| Problem | Fix |
|---------|-----|
| *Authentication failed* when cloning/pushing | Create a **Personal Access Token** (GitHub → *Settings → Developer settings → Personal access tokens*) and use it as the password. |
| Push rejected (*non-fast-forward*) | Someone pushed before you → `git pull`, fix any conflict, commit, then `git push` again. |
| `javac` error: file/class name mismatch | The file name must match the `public class` name exactly (`Name.java` → `public class Name`). Java is case-sensitive. |
