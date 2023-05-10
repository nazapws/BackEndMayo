FROM amazoncorretto:8-alpine-jdk
MAINTAINER NAZA 
COPY target/nazaguia-0.0.1-SNAPSHOT.jar nazaguia-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/nazaguia-0.0.1-SNAPSHOT.jar"] 