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

<details> 
  <summary>Лог</summary>

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

</details>

### Скрины  

![screen.png](img%2Fscreen.png)

### Работа с изменениями

<details> 
  <summary>Лог</summary>

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (HEAD -> main, origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900

    workshop of passenger cars

commit 3700332fcc00f08b32a6dd03f92c113b46b12c19
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:05:27 2023 +0900

    truck class

commit d937c066774207c37c46cf61d83ccbdbd3244cfb
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:03:15 2023 +0900

    passenger car class
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff eabbe197
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff eabbe19
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff
diff --git a/img/history.jpg b/img/history.jpg
deleted file mode 100644
index 76a926f..0000000
Binary files a/img/history.jpg and /dev/null differ
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff  eabbe1
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff eabbe1
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff e12601
diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
index 97c161f..b34a97d 100644
Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
index 760793f..f28df7c 100644
Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
index 21cdf98..d926b50 100644
Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
diff --git a/src/Main.java b/src/Main.java
index ab70d7c..27d6673 100644
--- a/src/Main.java
+++ b/src/Main.java
@@ -18,7 +18,7 @@ public class Main {
IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff 370033
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  index 059c35e..b62d9fa 100644
  --- a/src/controller/CarWorkShop.java
  +++ b/src/controller/CarWorkShop.java
  @@ -5,7 +5,7 @@ import model.impl.IProduction;
  import model.impl.IWorkShop;

/**
- * Интерфейс представляет цех по производству легковых автомобилей
+ * Класс представляет цех по производству легковых автомобилей
*
* метод create возвращает экземпляр легкового автомобиля
  */
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff e12601
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

       // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff 370033
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  :
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff 370033
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  index 059c35e..b62d9fa 100644
  --- a/src/controller/CarWorkShop.java
  +++ b/src/controller/CarWorkShop.java
  @@ -5,7 +5,7 @@ import model.impl.IProduction;
  import model.impl.IWorkShop;

/**
- * Интерфейс представляет цех по производству легковых автомобилей
+ * Класс представляет цех по производству легковых автомобилей
*
* метод create возвращает экземпляр легкового автомобиля
  */
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff eabbe1
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff d937c0
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

       // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  index 059c35e..b62d9fa 100644
  diff --git a/src/Main.java b/src/Main.java
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git diff d937c0
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  index 97c161f..b34a97d 100644
  Binary files a/out/production/factorymethod/Main.class and b/out/production/factorymethod/Main.class differ
  diff --git a/out/production/factorymethod/model/Car.class b/out/production/factorymethod/model/Car.class
  index 760793f..f28df7c 100644
  Binary files a/out/production/factorymethod/model/Car.class and b/out/production/factorymethod/model/Car.class differ
  diff --git a/out/production/factorymethod/model/Truck.class b/out/production/factorymethod/model/Truck.class
  index 21cdf98..d926b50 100644
  Binary files a/out/production/factorymethod/model/Truck.class and b/out/production/factorymethod/model/Truck.class differ
  diff --git a/src/Main.java b/src/Main.java
  index ab70d7c..27d6673 100644
  --- a/src/Main.java
  +++ b/src/Main.java
  @@ -18,7 +18,7 @@ public class Main {
  IProduction truck = creator.create();

         // Вызовем метод release выполняющий выпуск автомобилей
-        car.release();
+        //car.release();
         truck.release();
  }
  }
  diff --git a/src/controller/CarWorkShop.java b/src/controller/CarWorkShop.java
  index 059c35e..b62d9fa 100644
  index 059c35e..b62d9fa 100644
  diff --git a/out/production/factorymethod/Main.class b/out/production/factorymethod/Main.class
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git revert eabbe1
  error: your local changes would be overwritten by revert.
  hint: commit your changes or stash them to proceed.
  fatal: revert failed
  PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status
  On branch main
  Your branch is up to date with 'origin/main'.

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file:   img/history.jpg

Changes not staged for commit:
(use "git add/rm <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
deleted:    img/history.jpg

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore img/history.jpg
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                 
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file:   img/history.jpg

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore img/history.jpg
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                 
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file:   img/history.jpg

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore --staged img/history.jpg
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                          
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
(use "git add <file>..." to include in what will be committed)
img/history.jpg

nothing added to commit but untracked files present (use "git add" to track)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (HEAD -> main, origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars


Revert "close the workshop of passenger cars"
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git revert eabbe1
[main 5b4a0a6] Revert "close the workshop of passenger cars"
4 files changed, 1 insertion(+), 1 deletion(-)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status       
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit 5b4a0a66e3592c0741440003f35d6981561a8222 (HEAD -> main)

Revert "workshop of passenger cars"
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900


Revert "truck class"
Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900

    workshop of passenger cars

commit 3700332fcc00f08b32a6dd03f92c113b46b12c19
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:05:27 2023 +0900
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git revert e12601
[main b17d6fd] Revert "workshop of passenger cars"
1 file changed, 1 insertion(+), 1 deletion(-)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git revert 370033
[main 4c40415] Revert "truck class"
1 file changed, 1 insertion(+), 1 deletion(-)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit 4c40415c9f31fbd9ae2ec89649fcd197a4688796 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

    This reverts commit 3700332fcc00f08b32a6dd03f92c113b46b12c19.

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

    This reverts commit e126017bf99115d2076a258e6e3555eff864d1b5.

commit 5b4a0a66e3592c0741440003f35d6981561a8222
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

    This reverts commit 3700332fcc00f08b32a6dd03f92c113b46b12c19.

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

    This reverts commit e126017bf99115d2076a258e6e3555eff864d1b5.

commit 5b4a0a66e3592c0741440003f35d6981561a8222
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

    This reverts commit 3700332fcc00f08b32a6dd03f92c113b46b12c19.

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

    This reverts commit e126017bf99115d2076a258e6e3555eff864d1b5.

commit 5b4a0a66e3592c0741440003f35d6981561a8222
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

:
commit 4c40415c9f31fbd9ae2ec89649fcd197a4688796 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

    This reverts commit 3700332fcc00f08b32a6dd03f92c113b46b12c19.

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

    This reverts commit e126017bf99115d2076a258e6e3555eff864d1b5.

commit 5b4a0a66e3592c0741440003f35d6981561a8222
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900
commit 4c40415c9f31fbd9ae2ec89649fcd197a4688796 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:48 2023 +0900

    Revert "truck class"

    This reverts commit 3700332fcc00f08b32a6dd03f92c113b46b12c19.

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log --oneline --all
4c40415 (HEAD -> main) Revert "truck class"
b17d6fd Revert "workshop of passenger cars"
5b4a0a6 Revert "close the workshop of passenger cars"
eabbe19 (origin/main, origin/HEAD) close the workshop of passenger cars
e126017 workshop of passenger cars
3700332 truck class
d937c06 passenger car class
075104f changed the architecture
60a04ea hw1 solv
6d7618d Merge branch 'main' of https://github.com/roddg86/factorymethod
494a690 factory method
49eab4e Initial commit
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git reset --soft 4c40415
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status
On branch main
Your branch is ahead of 'origin/main' by 3 commits.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit 4c40415c9f31fbd9ae2ec89649fcd197a4688796 (HEAD -> main)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git reset --soft b17d6fd
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status              
On branch main
Your branch is ahead of 'origin/main' by 2 commits.
(use "git push" to publish your local commits)

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
modified:   src/model/Truck.java

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore src/model/Truck.java
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                      
On branch main
Your branch is ahead of 'origin/main' by 2 commits.
(use "git push" to publish your local commits)

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
modified:   src/model/Truck.java

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore --staged src/model/Truck.java
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                               
On branch main
Your branch is ahead of 'origin/main' by 2 commits.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   src/model/Truck.java

no changes added to commit (use "git add" and/or "git commit -a")
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log
commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

commit b17d6fd2f1b2f99dc4806c1440192bd308f1f4f9 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:35:27 2023 +0900

    Revert "workshop of passenger cars"

    This reverts commit e126017bf99115d2076a258e6e3555eff864d1b5.

commit 5b4a0a66e3592c0741440003f35d6981561a8222
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log --oneline --all
b17d6fd (HEAD -> main) Revert "workshop of passenger cars"
5b4a0a6 Revert "close the workshop of passenger cars"
eabbe19 (origin/main, origin/HEAD) close the workshop of passenger cars
e126017 workshop of passenger cars
3700332 truck class
d937c06 passenger car class
075104f changed the architecture
60a04ea hw1 solv
6d7618d Merge branch 'main' of https://github.com/roddg86/factorymethod
494a690 factory method
49eab4e Initial commit
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git reset --mixed 5b4a0a6
Unstaged changes after reset:
M       src/controller/CarWorkShop.java
M       src/model/Truck.java
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status               
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   src/controller/CarWorkShop.java
modified:   src/model/Truck.java

no changes added to commit (use "git add" and/or "git commit -a")
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore ^C
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore src/controller/CarWorkShop.java
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                                 
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   src/model/Truck.java

no changes added to commit (use "git add" and/or "git commit -a")
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git restore src/model/Truck.java           
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status                      
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log                         
commit 5b4a0a66e3592c0741440003f35d6981561a8222 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git reset --hard 5b4a0a
HEAD is now at 5b4a0a6 Revert "close the workshop of passenger cars"
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log                
commit 5b4a0a66e3592c0741440003f35d6981561a8222 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status             
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status             
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
(use "git push" to publish your local commits)

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log   
commit 5b4a0a66e3592c0741440003f35d6981561a8222 (HEAD -> main)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:34:01 2023 +0900

    Revert "close the workshop of passenger cars"

    This reverts commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4.

commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git reset --hard eabbe19
HEAD is now at eabbe19 close the workshop of passenger cars
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log                 
commit eabbe1977eb21b88d373ae28d4ceca6fc92c0cd4 (HEAD -> main, origin/main, origin/HEAD)
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:10:32 2023 +0900

    close the workshop of passenger cars

commit e126017bf99115d2076a258e6e3555eff864d1b5
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:06:34 2023 +0900

    workshop of passenger cars

commit 3700332fcc00f08b32a6dd03f92c113b46b12c19
Author: roddg <roddg@mail.ru>
Date:   Tue Aug 1 12:05:27 2023 +0900

    truck class
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git status              
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> git log --oneline --all                    
eabbe19 (HEAD -> main, origin/main, origin/HEAD) close the workshop of passenger cars
e126017 workshop of passenger cars
3700332 truck class
d937c06 passenger car class
075104f changed the architecture
60a04ea hw1 solv
6d7618d Merge branch 'main' of https://github.com/roddg86/factorymethod
494a690 factory method
49eab4e Initial commit
PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> history

Id CommandLine
  -- -----------
1 git log
2 git diff eabbe197
3 git diff eabbe19
4 git diff
5 git diff  eabbe1
6 git diff eabbe1
7 git diff e12601
8 git diff 370033
9 git diff e12601
10 git diff 370033
11 git diff 370033
12 git diff eabbe1
13 git diff d937c0
14 clear
15 git diff d937c0
16 clear
17 git revert eabbe1
18 git status
19 git restore img/history.jpg
20 git status
21 git restore img/history.jpg
22 git status
23 git restore --staged img/history.jpg
24 git status
25 git status
26 git log
27 git status
28 clear
29 git revert eabbe1
30 git status
31 git log
32 git revert e12601
33 git revert 370033
34 git log
35 git log --online -all
36 git log --oneline -all
37 git log -all                                                                                                                                                                  
38 f
39 clear
40 git log --oneline --all
41 git reset --soft 4c40415
42 git status
43 git log
54 git status
55 git restore src/controller/CarWorkShop.java
56 git status
57 git restore src/model/Truck.java
58 git status
59 git log
60 git reset --hard 5b4a0a
61 git log
62 git status
63 git status
64 git log
65 git reset --hard eabbe19
66 git log
67 git status
68 git log --oneline --all

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod>

</details>

**1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.**

git log

![log.jpg](img%2Flog.jpg)

git diff d937c0

![diff.jpg](img%2Fdiff.jpg)

**2. Верните эти изменения командой git revert последовательно, чтобы в итоге получилось тоже три коммита.**

git revert eabbe1  
git revert e12601  
git revert 370033  

![revert.jpg](img%2Frevert.jpg)

git log

![log-revert.jpg](img%2Flog-revert.jpg)

**3. Попробуйте отменить эти три коммита:**

* последний — командами git reset --soft и git restore;  
  git reset --soft b17d6fd  
  git restore --staged src/model/Truck.java  

* предпоследний — командой git reset --mixed и git restore;  
  git reset --mixed 5b4a0a6  
  git restore src/controller/CarWorkShop.java  
  restore src/model/Truck.java  

* первый — командой git reset --hard.  
  git reset --hard eabbe19  

![reset_restore.jpg](img%2Freset_restore.jpg)

**История команд**

PS D:\3MobileDevelop\3Вне четверти\Контроль версий углублённо (GIT)\seminar1\factorymethod> history

Id CommandLine  
  -- -----------  
1 git log  
2 git diff eabbe197  
3 git diff eabbe19  
4 git diff  
5 git diff  eabbe1  
6 git diff eabbe1  
7 git diff e12601  
8 git diff 370033  
9 git diff e12601  
10 git diff 370033  
11 git diff 370033  
12 git diff eabbe1  
13 git diff d937c0  
14 clear  
15 git diff d937c0  
16 clear  
17 git revert eabbe1  
18 git status  
19 git restore img/history.jpg  
20 git status  
21 git restore img/history.jpg  
22 git status  
23 git restore --staged img/history.jpg  
24 git status  
25 git status  
26 git log  
27 git status  
28 clear  
29 git revert eabbe1  
30 git status  
31 git log  
32 git revert e12601  
33 git revert 370033  
34 git log  
35 git log --online -all  
36 git log --oneline -all  
37 git log -all                                                                                                                                                                    
38 f  
39 clear  
40 git log --oneline --all  
41 git reset --soft 4c40415  
42 git status  
43 git log  
44 clear  
45 git reset --soft b17d6fd  
46 git status  
47 git restore src/model/Truck.java  
48 git status  
49 git restore --staged src/model/Truck.java  
50 git status  
51 git log  
52 git log --oneline --all  
53 git reset --mixed 5b4a0a6  
54 git status  
55 git restore src/controller/CarWorkShop.java  
56 git status  
57 git restore src/model/Truck.java  
58 git status  
59 git log  
60 git reset --hard 5b4a0a  
61 git log  
62 git status  
63 git status  
64 git log  
65 git reset --hard eabbe19  
66 git log  
67 git status  
68 git log --oneline --all  
