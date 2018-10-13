FROM openjdk:8-jdk-alpine

RUN apk add mariadb mariadb-client
RUN mysql_install_db --user=mysql --datadir=/var/lib/mysql
RUN apk add openrc --no-cache

COPY . .

RUN ./gradlew build

EXPOSE 8080

CMD ./gradlew bootRun 
