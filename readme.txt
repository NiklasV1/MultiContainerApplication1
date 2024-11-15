This project was created to practice implementing a Java Quarkus backend and
using it to communicate with a PostgreSQL database and a simple web frontend.
Additionally, this project employs docker for containerization.

Technologies used:

Backend:
- Java
- Maven
- Quarkus
- Quarkus REST
- Quarkus Hibernate with Panache
- Quarkus Jackson

Database:
- PostgreSQL

Frontend:
- Java Script
- HTML
- Tailwind CSS

Other:
- Docker


WARNING:
THE .env FILES AND PASSWORDS ARE UPLOADED TO THE REPO ON PURPOSE!!!
DO NOT DO THIS IN A REAL WORLD SETTING!!!


INSTALLATION:

1. cd ./Backend/backend-service

2. ./mvnw package

3. docker compose build

4. docker compose up -d