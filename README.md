# Sakila-Spring-Project

## I. Introduction

This is a project contains a spring rest backend and a Angular Js frontend. Which will allows the user to operate the DataBase, here for instance is MySQL-sakila.

## II. Structure of Project

Here is two sub-project:

Sakila-business-dao: this sub-project contains the DAO layer, it connects with sakila database with JDBC driver. Also, for entities, we use JPA to generation entities from tables.

pa: sakila, you could download the database from mysql offical website and import into your mysql database.

Sakila-business-webapi: this sub-project contains a spring rest-server, Angular GUI and also sakila-business-dao as dependency.

## III. Run

Go to Sakila-businees-webapi, run the SakilaBusinessWebapiApplication.java with Spring Boot App. It will start a embeded Tomcat Server, and then go to localhost:8080/ActorManagement.html, you'll see the webpage.

In addition, you could use Postman or RestClient to test the WebApi.
