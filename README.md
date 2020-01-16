###  Springboot/web Banking Application 

## Tech stack
Spring boot, Spring data jpa, thymeleaf, spring-web, spring-mvc lombok, mysql, h2, spring security,
Authentication

## Features 
This is a simple customer bank application to perform customer transactions
Customer Sign Up
Customer Login
Add as many as accounts for single customer 
Perform deposits
Perform withdrawals
You can’t withdrawal money from an account that doesn’t have enough money
You can check the balance of a given account
Check the history of transactions
It supports both in memory DB and mysql

## How to run the application ?

Please Follow Step1
  
## Inherent Tech 
Hibernate , jdbc, embedded tomcat, sql etc..

## Step1: Add the configuration details in application property files 
 -> Add mysql database connection details
        How to install mysql and create schema on mac
        https://www.youtube.com/watch?v=xX9W5dmEpO0
        Run the below command from terminal 
        mysql.server start 
        Mysql  -u root -p 
        enter password for mysql admin 
        Create a schema name : customer-banking-app
        Run the app from terminal  : spring-boot:run
        
 -> Add h2 database connection details
        this in memory database and test data will be volatile on every deplyment run we need to pump data in to tables along with application deployment. 
        
 -> Add hibernate dialect, this will choose better sql for given database 
 
 -> Add hibernate ddl auto : this will create schema automatically and create/update columns
 
 -> Add Thymeleaf and web config
 
 ## Step2: Create Entity classes 
 This application requires below tables like, 
 -> Create Account -- it provide details like account_balance, curreny etc
 -> Role -- role details like role name etc
 -> Withdrawals
 -> Deposits 
 -> User - user details like email, password, username
 
## Step3: Create repository interfaces for all the entities 
 In this section we create the repository interfaces 
 
## Step4: Register user and validate password 
In this section we develop User service interface and implement user service class 
In the User service implementation class has functionality for user registration and password validation 

## Step5: Create POJO's for all the application forms
In this section we create POJO'S like CustomerAccountForm, UserCreateForm, WithdrawalForm, DepositForm 
these java POJO's will store application content that we display in frontend view.

## Step6: Implement authorisation for user 
In this section we have created authorisation for user 

## Step7: Implement web security
In this section we focus on to develop web security 

## Step8: Create controllers
In this section we create controllers for add customer account , list customer account, deposits, withdrawals, 
signup, login, logout, balance etc

## Step9: Crete spring application validation 
In this section we create validations for the username, password, email

## Steps10: Frontend Implementation with Thymeleaf
    Latest complied and minified CSS 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    jQuery library 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    Latest compiled JavaScript 
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
 In this section thymeleaf serves the HTML5 pages for login, register, deposits, withdrawals etc.
 

## References
Spring data Jpa :https://www.petrikainulainen.net/spring-data-jpa-tutorial/
Themeleaf: https://o7planning.org/en/12345/thymeleaf
Spring boot: https://www.javaguides.net
Boostrap template: https://getbootstrap.com/docs/3.3/components/#navbar
