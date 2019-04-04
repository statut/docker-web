FROM tomcat:9-jre8
MAINTAINER "aliaksei.statut@gmail.com"

COPY /build/libs/docker-web-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/docker-web.war
