# AREP_Taller6

## Secure Application Design
In this workshop, we will design and deploy a secure, scalable application using AWS infrastructure with a focus on best practices for security. Our architecture will feature two primary components:

### Server 1: Apache Server
The Apache server will be responsible for serving an asynchronous HTML+JavaScript client over a secure connection using TLS. Client-side code will be delivered through encrypted channels, ensuring data integrity and confidentiality during download.
### Server 2: Spring Framework
The Spring server will handle backend services, offering RESTful API endpoints. These services will also be protected using TLS, ensuring secure communication between the client and the backend.
# Project Structure

![image](https://github.com/user-attachments/assets/246740d9-6d0c-40b1-a95d-28a343387cc4)

#  Prerequisites
Before running the project, make sure you have the following installed:
- [JDK 21](https://www.oracle.com/co/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)

1. **Ensure You Have Java Installed:**
   ```sh
   java -version
   ```
2. **Ensure You Have Maven Installed:**
   ```sh
   mvn -version
   ```
###  Instalación

1. **Clone this repository:**
   ```sh
   git clone https://github.com/miguel-tellez/Taller6-AREP.git
   ```

2. **Navigate to the workshop directory:**
   ```sh
   cd Taller6-AREP
   ```

2. **By running the following command create the project:**
   ```sh
   mvn clean install
   ```

3. **run the server:**
   ```sh
   java -cp target/AREP_Taller1-1.0-SNAPSHOT.jar edu.escuelaing.arep.WebServer
   ```

4. **Access the web application in your browser:**
   ```
   http://localhost:32500
   ```

![image](https://github.com/user-attachments/assets/bf5b44d1-57ee-4c51-93d0-12fefae46c5e)

![image](https://github.com/user-attachments/assets/602a46e4-5edf-464a-9760-3ffa7e7336e0)


**Get all restaurants**
```sh
http://localhost:32500/api/restaurants
```

##  Web interface
The interface allows you to view restaurants dynamically. Use **HTML, CSS and JavaScript** to interact with the server.


##  Authors
- **Miguel Camilo Tellez** - [miguel-tellez](https://github.com/miguel-tellez)
  
