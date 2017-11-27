FROM openjdk:8u131-jdk-alpine
RUN apk add --no-cache curl
COPY @project.build.finalName@.jar /
EXPOSE 7001
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "@project.build.finalName@.jar"]