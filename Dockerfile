# Use official OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml first (for dependency caching)
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Copy source code
COPY src ./src

# Make mvnw executable
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Expose port (Render will provide $PORT)
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/DeltaSigma-0.0.1-SNAPSHOT.jar"]
