## Problem Description

Our Frontend developers want to refactor their homepage using modular approach, they need us as a backend developers to
create a new service they need, their homepage is similar like other Ecommerce Mobile Apps, which there is Promo 
Caroussel, Category Menu, Flash Sale Section, Transaction History and News Section.

But from our business guys they want to create 3 Groups of users which every group contains many users that have 
different order of section. For Example:
UserA : Promo, Category, FlashSale, History and News
UserB : Promo, News, FlashSale, Category and News
UserC : Promo, FlashSale, Category, News and History

## Dev environment setup

```
Java JDK 11
```

#### Installing Java

To install Java JDK 11 using Homebrew, please use the following commands:
```
brew tap caskroom/versions
brew cask install java
```

To install Java JDK 11 from the source, please go to the following link and
unpack the respective build corresponding to your machine:
[Java JDK 11](https://jdk.java.net/11/)

To unpack the file, ensure that you have a shell running and cd to the same
directory as the downloaded file. To unpack the .tar.gz file in terminal,
use the following command:

```gunzip -c openjdk-11.0.2_osx-x64_bin.tar.gz | tar xopf -```

Make sure that the above command uses the correct version of the tar file.


#### Installing PostreSQL

Version `11.2`

To install PostreSQL, please you can click this [link](https://www.postgresql.org/download/macosx/)


## How to run

```
    mvn clean spring-boot:run
```
