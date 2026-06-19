# Core File Management

## Overview
Core File Management is a Spring Boot application designed to manage files efficiently. It leverages various Spring Boot starters for data persistence, security, web functionalities, and GraphQL support.

## Prerequisites
- Java 17
- Maven

## Dependencies
The project includes the following dependencies:
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-graphql`
- `spring-boot-starter-security`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `h2`
- `lombok`
- `spring-boot-starter-test`
- `spring-webflux`
- `spring-graphql-test`
- `spring-security-test`

## Building and Running the Application
1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd CoreFileManagement

## Fix 20260619

### Phase 1 — Fix broken things
1. Fix `UserController` and `NoteController` to use the right services
2. Implement `HomeController` (was last commit — left empty)
3. Add `@Getter`/`@Setter` to `Note.java` and `File.java` (missing unlike `User.java`)

### Phase 2 — Complete the data model
1. Add `User` → `File` and `User` → `Note` relationships (ownership)
2. Rename `fileDate` → `fileContent` in `File.java`

### Phase 3 — Add what's planned but missing
1. **Security** — listed in the README but `spring-boot-starter-security` is NOT in `pom.xml`
2. **GraphQL** — dependency is included but no `.graphqls` schema files or resolvers exist
3. **DTOs + validation** — no `@Valid` or request/response DTOs anywhere
4. **Exception handling** — no `@ControllerAdvice`

### Phase 4 — Quality
1. Unit tests for services
2. Integration tests for controllers