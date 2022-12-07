
## Project Structure
### Controller
* It handles api requests. Entry point for CRUD operation
* @RestController annotation is used to signify this is a controller class

### Models
* All Entity Class will be present here
* @Entity annotation

### Repository
* Object to relationship mapping. Helps in getting data from DB side, like
  * findById
  * findAll
  * deleteById etc
* Each entity class have respective Repository <b>interface</b> that extends JpaRepository<Class_Name, ID Type>
* We can create any custom function, like findBy<ClassName><Id> or findAllBy<ClassName><Id>
  > Ex: findAllByTopicsId in `CoursesRepository`

* @Repository annotation


### Services
* A middle layer between Controller and Repository
* Controller ask details to Service class. Service class ask details to Repository class and do the expected operation if neeeded 
* @Service annotation 
