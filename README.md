# Movie Ticket Sales Website

This project is a Spring Boot-based web application for managing movie ticket sales, a simple project for SE334 - Programming Paradigms. It connects to a MySQL database and uses JPA/Hibernate for persistence.

## Application Properties

The following settings are configured in the `application.properties` file:

```properties
# Application Name
spring.application.name=movie_ticket_sales_website

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/cinema
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

# Hibernate / JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

## Getting Started

1. Replace `yourusername` and `yourpassword` with your MySQL credentials.
2. Ensure the MySQL database `cinema` exists.
3. Run the application using your preferred IDE or with `mvn spring-boot:run`.

## Notes

- `spring.jpa.hibernate.ddl-auto=update` will automatically update the database schema on startup. Use with caution in production.
- The physical naming strategy is set to standard to avoid automatic naming conversions by Hibernate.