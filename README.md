# Contact us

## Working with Contact us in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 17 or newer
* Maven
* Lombok
* Git command line tool (https://help.github.com/articles/set-up-git)
* Your preffered IDEA
  * Eclipse
  * IntelliJ IDEA

 ### Steps:
 
 1) On the command line
    ```
    git clone https://github.com/ProgIsLove/NHL-webpage.git
    ```
 2) Navigate into application.properties file ->              
    ${yourPath}/contactUs/src/main/resources/application.properties and 
    setup your MySQL configuration

    ```
    Example:
    
    spring.datasource.username=root
    spring.datasource.password=password
     
    ```
    
 3) Open terminal
    ```
    ${yourPath}/contactUs>mvn clean install
    
    ${yourPath}/contactUs>mvn spring-boot:run
    
    ```
###  Visit http://localhost:8080/contact in your browser
  
 5) Enjoy <3

 
