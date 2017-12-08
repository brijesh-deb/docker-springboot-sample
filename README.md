## Deploying a SpringBoot service in Docker container
- Implement a sample SpringBoot application
- Add following entries in application.properties
```      server.port=8080
         server.contextPath=/myApp*
```
- Add Dockerfile at the root of the project with following entries
  - EXPOSE denotes the port at which container will lisent to for connections. Same as server.port in last step
        *#Enter all the required tools like java, mysql, redis etc inside Dockerfile
        FROM openjdk:8
        ADD target/springboot-docker-demo.jar springboot-docker-demo.jar
        EXPOSE 8080
        ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]*
        
 

