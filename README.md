### Работа с удалёнными репозиториями

### Команды

git init  
git status  
git remote -v  
git remote add origin https://github.com/roddg86/factorymethod.git  
git remote -v  
git add .  
git commit -a  
git branch -M main  
git pull origin main --allow-unrelated-histories  
git status  
git push origin main  

---

### Лог

PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git init  
Initialized empty Git repository in C:/Users/Dmitry/Desktop/seminar1/factorymethod/.git/  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git status  
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        model.Car.java
        controller.CarWorkShop.java
factory method
        model.impl.IProduction.java
        model.impl.IWorkShop.java
        Main.java
        model.Truck.java
        controller.TruckWorkShop.java

nothing added to commit but untracked files present (use "git add" to track)
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git remote -v  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git remote add origin https://github.com/roddg86/factorymethod.git  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git remote -v  
origin  https://github.com/roddg86/factorymethod.git (fetch)  
origin  https://github.com/roddg86/factorymethod.git (push)  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git add .  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git commit -a  
[master (root-commit) 494a690] factory method
 7 files changed, 93 insertions(+)
 create mode 100644 model.Car.java
 create mode 100644 controller.CarWorkShop.java
 create mode 100644 model.impl.IProduction.java
 create mode 100644 model.impl.IWorkShop.java
 create mode 100644 Main.java
 create mode 100644 model.Truck.java
 create mode 100644 controller.TruckWorkShop.java
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git branch -M main  
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git status
On branch main
Your branch and 'origin/main' have diverged,
and have 1 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

nothing to commit, working tree clean
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git pull origin main --allow-unrelated-histories      
From https://github.com/roddg86/factorymethod
 * branch            main       -> FETCH_HEAD
Merge made by the 'ort' strategy.
 README.md | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git status  
On branch main
Your branch is ahead of 'origin/main' by 2 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git push origin main  
Enumerating objects: 12, done.
Counting objects: 100% (12/12), done.
Delta compression using up to 8 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (11/11), 2.22 KiB | 1.11 MiB/s, done.
Total 11 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/roddg86/factorymethod.git
   49eab4e..6d7618d  main -> main
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> 
PS C:\Users\Dmitry\Desktop\seminar1\factorymethod> git log origin/main  
commit 6d7618d35bbb7f3aca16578b5e76da1b94af8e88 (HEAD -> main, origin/main)
Merge: 494a690 49eab4e
Author: roddg <roddg@mail.ru>
Date:   Tue Jul 25 13:06:20 2023 +0900

    Merge branch 'main' of https://github.com/roddg86/factorymethod

commit 494a69069db8e21657aebb510d71bac0d1722c47
Author: roddg <roddg@mail.ru>
Date:   Tue Jul 25 12:55:16 2023 +0900

    factory method

commit 49eab4e0426973ea4a128e13567de05ea808b8f4
Author: Dmitry <110647769+roddg86@users.noreply.github.com>
Date:   Tue Jul 25 12:53:36 2023 +0900

    Initial commit
(END)

### Скрины  

![screen.png](img%2Fscreen.png)

### Работа с изменениями

