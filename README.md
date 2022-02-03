# Backend_Liv2Train_Swoyam”

This is a Restful Web Service API Project for training center based on java 17, spring MVC, Spring Boot, JPA, Hibernate etc. Make sure you have Java 17 and MySQL server installed.


## prerequisite

- Java 17
- MySQL 8 DB
- Java supported IDE
- In order to test Api install applications like postman,Insomnia etc


## Project Setup for Run

- MySQL server should be up and running.

- Create a schema named "trainingcenterapi".

- Open the file "application.properties" in "trainingcenterAPI/src/main/resources".

- Edit your MySQL credentials in the fields "spring.datasource.username" and "spring.datasource.password" in order to connect to MySQL DB.

- Then run the project.


## API Reference

#### Get all centers

```http
  GET /center
```
#### Save a new training center

```http
  POST /center
```

#### JSON Format

{
    "centerCode":"23789",
    "centerName":"Laskhya",
    "studentCapacity":"300",
    "coursesOffered":["java","python","c++","spring boot"],
    "contactEmail":"laskhya@gmail.com",
    "contactPhone":"8984736736",
    "address":{
                "detailedAddress":"plot no- 12,pmg chowk",
                "city":"bhubaneswar",
                "state":"odisha",
                "pinCode":"751026"
    }
}
