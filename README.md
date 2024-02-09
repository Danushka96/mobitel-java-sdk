# Mobitel ESMS Gateway Test

## How to setup

### Prerequisites

1. Java 8.0
2. Any IDE
3. Mobitel e-sms username and password

#### 1. Run this command inside the project folder to install the e-sms java sdk to your local maven repository

    mvn install:install-file -Dfile=lib/ESMSlibV4.01.jar -DgroupId=lk.mobitel.esms -DartifactId=esmslib -Dversion=1.0 -Dpackaging=jar

#### 2. Run the main method in ESMS.java file 