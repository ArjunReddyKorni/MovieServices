FROM openjdk
WORKDIR usr/lib

ENV MONGO_DATABASE="userdatabase1"
ENV MONGO_URL="mongodb://localhost:27017/userdatabase1"

ADD ./target/MovieServices-0.0.1-SNAPSHOT.jar /usr/lib/MovieServices-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","MovieServices-0.0.1-SNAPSHOT.jar"]