# Use an official OpenJDK 17 image as base
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven build files first for caching
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Copy source code
COPY src ./src

# Build the application inside the image
RUN ./mvnw clean package -DskipTests

# Copy the generated JAR to the root
RUN cp target/*.jar app.jar

# Expose port 9090 (the port your app runs on)
EXPOSE 9090

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
