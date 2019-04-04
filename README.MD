A simple Java Servlet-based web-app which connects to PostgreSQL and prints Database version.

Web application and database are dockerized.

## How to

1. Clone the repository `git clone https://github.com/statut/docker-web.git`
2. Build web-app `grandle build war`
3. Build docker images `docker-compose build`
4. Run docker images `docker-compose up`
5. Make a GET request `http://localhost:8080/docker-web/hi`
