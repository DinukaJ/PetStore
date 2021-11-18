# PetStore Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Pre-Installations

If you want to build an _??ber-jar_, execute the following command:
    
    ./1) Intellij IDEA
    ./2) Java Version 11.0
    ./3) Docker Composer & Desktop
    ./git clone https://github.com/DinukaJ/PetStore.git

## Packaging and running the application

If you want to build an _??ber-jar_, execute the following command:

    ./gradlew build -Dquarkus.package.type=uber-jar

To run the application:

    java -jar build/petstore-runner.jar

The application can be also packaged using simple:

    ./gradlew build

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it is not an _??ber-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

To launch the test page, open your browser at the following URL

    http://localhost:8080/index.html

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

    ./gradlew quarkusDev

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Creating a native executable

Mind having GRAALVM_HOME set to your Mandrel or GraalVM installation.

You can create a native executable using:

    ./gradlew build -Dquarkus.package.type=native

Or, if you don't have [Mandrel](https://github.com/graalvm/mandrel/releases/) or
[GraalVM](https://github.com/graalvm/graalvm-ce-builds/releases) installed, you can run the native executable
build in a container using:

    ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true

Or to use Mandrel distribution:

    ./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true -Dquarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-mandrel:20.3-java11

You can then execute your native executable with:

    ./build/petstore-runner

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Building and Running the API using IntelliJ IDEA
    
1) Clone the git repository and install java version 11 & IntelliJ IDEA
    
    https://github.com/DinukaJ/PetStore.git

2) Install Quarkus Plugin in IntelliJ

    ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup1.png)

3) Edit Configuration and Create Configuration with Quarkus
   
   ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup2.png)

4) Configure Database

   ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup222.png)

6) Create Database "petstore" in phpMyAdmin and Export the Database File I have Attached here

   https://github.com/DinukaJ/PetStore/blob/main/Database/petstore.sql

5) Build the Project Using this Tool

   ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup22.png)

6) Run the Project Using this Tool

   ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup3.png)

7) After Successfully Running it will Look Like this

   ![IntelliJ](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Setup4.png)


## Testing API

I have included automated testing in IntelliJ in the following path

    ./src -> test -> java

###Automated Testing

1.Pets Test Cases (Right Click on PetTest and Click Run)

   ![AutoTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/TestPet.png)

2.Pets Type Test Cases (Right Click on PetTypeTest and Click Run)

   ![AutoTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/TestPetType.png)

###Manual Testing

I have done manual testing using postman

####Pet

1) Pet Get All

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Pet%20View.png)

2) Pet Search By Id

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/SearchPetById.png)

3) Pet Search By Name

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/SearchPetByName.png)

4) Pet Search By Age

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/SearchPetByAge.png)

5) Add Pet

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/Pet%20Add.png)

6) Update Pet

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/UpdatePet.png)

7) Delete Pet

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/DeletePet.png)

####Pet Type

1) Pet Type Get All

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/PetType%20Get.png)

2) Add Pet Type

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/PetType%20Add.png)

3) Update Pet Type

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/UpdatePetType.png)

4) Delete Pet Type

   ![ManualTest](https://github.com/DinukaJ/PetStore/blob/main/TestScreenshots/DeletePetType.png)

## Deploying Application

To deploy the demo app on a docker-compose please visit [./deploy](https://github.com/DinukaJ/PetStore/tree/main/deploy)
