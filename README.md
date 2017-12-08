## Deploying a SpringBoot service in Docker container
- Implement a sample SpringBoot application
- Add Dockerfile at the root of the project

```
#Enter all the required tools like java, mysql, redis etc inside Dockerfile
FROM openjdk:8
ADD target/springboot-docker-demo.jar springboot-docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
```

