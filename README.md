# A Spring Boot Starter App
A simple starter project to get a understanding on 
1. spring-boot
2. Entity Relationship in spring-boot
3. JPA and Postgres DB integration
4. Build CRUD Apis
5. Swapper API documentation

## Application

We are building an app `Topics_Courses` – An API to get topics details as well as each course details.

## Postgres
### Setup

```bash
# Open a terminal and run 
psql
```

```sql
-- Create database
srout# create database topics;
-- Quit
srout# \q

```

```bash
# Open a terminal and run 
psql "topics"
```

```sql
-- Create new User
topics# create role sarada;
-- Grant required permission to the user
topics# grant all privileges on database topics to sarada;
topics# grant all on schema public to sarada;
```

## API Documentation

Swagger Doc - http://localhost:8081/swagger-ui.html
