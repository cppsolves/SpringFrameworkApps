
## Frameworks and Languages Used
  * Spring MVC framework.
  * Java 8.
  * Spring Boot.
## Database dependencies
  * In-memory H2 Database.
## Miscellaneous dependencies
  * Lombok.
  * Spring Dev Tools.
  * JSON Path Libraries.
  * Swagger API.
## Data Flow
  * Controller
    - Adduser ==> Adds the user to the Database.
      - ![image](https://user-images.githubusercontent.com/89345896/219857809-cde0c997-9510-4b7c-bb1b-5d899305fd9d.png)
    - Getuser ==> Gets the user with the Matching ID.
      - ![image](https://user-images.githubusercontent.com/89345896/219857984-baef0006-1cdd-42d6-994b-d6d5194d6612.png)
    - GetAll ==> Gets all user in the database
      - ![image](https://user-images.githubusercontent.com/89345896/219858054-7aa430a8-c3ef-486e-a139-b3cfba1c6a88.png)
    - updateUser ==> Updates details of the matching user.
      - ![image](https://user-images.githubusercontent.com/89345896/219858127-ac553e42-2e9c-43a7-a5fa-c9547664724c.png)
    - deleteUser ==> Deletes the matching user
      - ![image](https://user-images.githubusercontent.com/89345896/219859503-1b31b38a-d6d7-4f9e-9368-1ebe46af45c1.png)
  * Services
    - Autowired services interface is reposnsible for JDBC communication via DAO layer.
  * Repository
    - Respository acts as a Data object layer's component.
  * Database Design
    - ![image](https://user-images.githubusercontent.com/89345896/219863796-b1bea64d-6c7a-4abd-9a83-32ac2375845f.png)
 ## Data Structures used
  * In Memory H2 database.
 ## Project summary
  * CRUD Operations using H2 Database demo successfull.
 ## Future Version
  * REST API Automation and UT using Rest Assured.
 


  
