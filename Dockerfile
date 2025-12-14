FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY Hello.java .
RUN javac Hello.java
CMD ["java", "Hello"]

docker build -t hello .
docker run -it hello


FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY LoginApp.java .
RUN javac LoginApp.java
CMD ["java", "LoginApp"]

docker build -t loginApp .
docker run -it loginApp
