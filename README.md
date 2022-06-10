This is a starter template for [Learn Next.js](https://nextjs.org/learn).  

---

## About our website 👋
This website contains 200 multiple choice questions about traffic laws to help you practice, do sample test to prepare for your A1 driver license.  
The website currently only have questions for A1 driver license, we will update more questions for A2, B1, B2 license.  

## This repository is just Backend of our website.
You need our [Frontend](https://github.com/IT0505/gplx-app) repository to run full website on localhost.

## How to run this repository on localhost
1. After download and extract, you need to create database for our website first, we using MySQL for the database.  
2. Open any MySQL GUI (We recommend using MySQL Workbench) and create an empty schema.
3. Run `Fresh_DB_create_script.sql` located in `gplx-app-be/src/main/resources` on the schema you just created.

4. After the script above run successfully then open file `application.properties` located in `gplx-app-be/src/main/resources` and change as following instruction:
    - spring.datasource.url=jdbc:mysql://localhost:`PORT`/`schema_name` (`PORT` is the port your MySQL runs on, default is 3306. `schema_name` is the name of the schema you created in step 2)  
    - spring.datasource.username=`your_mysql_username`  
    - spring.datasource.password=`your_mysql_password`  
5. Save all your changes and run the project. It will run on default `PORT` which is 8080.
