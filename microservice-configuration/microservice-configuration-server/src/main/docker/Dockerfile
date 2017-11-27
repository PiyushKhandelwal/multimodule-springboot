FROM openjdk:8u131-jdk-alpine
RUN mkdir config-repo
COPY @project.build.finalName@.jar /
EXPOSE 8888
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "@project.build.finalName@.jar"]