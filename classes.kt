//Classes
/*class Name {
  // class body
} */
/*The name of a class should always start with an upper case letter and use the camel case form. 
The class body is contained within curly braces and will hold all of the properties and functions related to that class. */

class Book{
    val pages = 320
    val title = "Harry Potter and the Sorcerer's Stone"
    val author = "J.K. Rowling"
  }
  
  
  // Write your code above 📕
  
  fun main() {
    
  }

//Instance 
// Syntax = val myCar = Car()

class Building {
    val yearBuilt = 2016
    val height = 400 // Feet
    val type = "Limestone"
  }
  
  fun main() {
    // Write your code below 🏙
    val residentialBuilding = Building()
    println(residentialBuilding.yearBuilt)
    println(residentialBuilding.height)
    println(residentialBuilding.type)
    
    //Varialbe is never used causing an error in the output 
    val commercialBuilding = Building()
  }
 
//Primary Constructor
//Shorthand syntax = class Name(val x: String, val y: String)\
// Write your class below 
class Person(var name: String, var age: Int, var favoriteColor: String)


fun main() {
  // Create your instances below 
  val me = Person("Jo", 21, "Red")
  val myFriend = Person("Alex", 20, "Blue")
  println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")

  println("${myFriend.name} is ${myFriend.age} years old and her favorite color is ${myFriend.favoriteColor}.")
}  


//The Init Block
/*class Mascot(val name: String, val platform: String, val yearCreated: Int) 

class Mascot(val name: String, val platform: String, val yearCreated: Int) {
  var age: Int
 
  init {
    age = 2020 - yearCreated
    println("$name is a $platform mascot and is $age years old. ")
  }
}*/

class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
    // Write your code below 
   var fullName = "$firstName $lastName"
  
    init {
      if (yearsWorked > 1){
        println("$fullName is eligible for a raise!")
      } else {
        println("$fullName is not eligible for a raise just yet.")
      }
    }
  } 
  
  fun main() {
    // Create an instance below 👩🏻‍💼
    var projectManager = Employee("Maria", "Gonzalez", 2)
  }


//Member functions
/* Sample Syntax
class Cat(val name: String, val breed: String) {
 
  fun speak() {
    println("Meow!") 
  } 
} */

class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
    init {
      for (comp in competitionsParticipated) {
        println("$name participated in $comp.")
      }
    }
  
    // Write your function below 
    fun speak() {
     println("$name says: Woof!")
    }
  }
  
  fun main() {
    // Write your instance below 🐩
    var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
    maxie.speak()
  
  }

/*A class is an object-oriented concept which resembles a blueprint for individual objects. A class can contain properties and functions and is defined using the class keyword followed by a name and optional body.
An instance is a member of a class created by calling the class name followed by a pair of parentheses, (), and any necessary arguments.
We can use dot syntax to access the value of each class property.
A class can have properties with default values or ones that are customizable with the help of primary constructors.
A primary constructor allows us to set each property value when we instantiate an object.
The init block gets invoked with every instance creation and is used to add logic to the class.
A function declared within a Kotlin class is known as a member function of that class. In order to invoke a member function, we must call the function on an instance of the class.
 */