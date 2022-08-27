//functions
/*the fun keyword is used to declare a function.
The function name is used to call the function throughout the program.
Inside the parentheses are arguments- pieces of data fed to the function.
The return type declares the type of data the function will return; it is also optional to include. */
// Write your code below
fun smores(){
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
    println("Place chocolate on marshmallow.")
    println("Put a new graham cracker on chocolate.")
    println("Enjoy!")
  }
  
  
  fun main() {
    // Write more code below
    smores()
    smores()
  }
  
//arguments with parameters
// Write your code below
fun getSpeed(distance:Int, time:Int){
    var speed = distance/time
    println("$speed meters per second")
  }
  
  
  fun main() {
    // Write more code below
    getSpeed(10,3)
    
  }


// Write your code below
fun getPrice(price:Double, couponCode:String = "None"){
    var finalPrice:Double
  
    if (couponCode == "save15"){
      finalPrice = price* .85
    } else {
      finalPrice = price
    }
    
    println("The total price is $finalPrice")
  }
  
  
  fun main() {
    // Write more code below
    getPrice(price = 48.0, couponCode = "save15")
    getPrice(price = 48.0)
  }


//with return statements 
/*fun listSum(myList: List<Int>): Int {
  var sum = 0
  // iterate through each value and add it to sum
  for (i in myList) {
    sum += i
  }
  // return statement
  return sum
} */

/*we can set total to the return value of listSum() after sending it a list of Int values (billsToPay):
var billsToPay = mutableListOf(44, 29, 104, 79)
 
// Set total to the return value of listSum().
var total = listSum(billsToPay)
println("Your bill total is $total dollars.") */

// Write your code below
fun ozToTsp(oz:Double):Double{
    var tsp = oz * 6
    return tsp
   
   }
   
   
   fun main() {
     // Write more code below
     var tspNeeded = ozToTsp(.75)
     println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
     
   }

//Single Expression Functions
/*fun powerOf2(num: Int): Int {
  return num * num
}

fun powerOf2(num: Int): Int = num * num

fun powerOf2(num: Int) = num * num*/

// Write your code below
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3


fun main() {
  var length = 5
  var width = 8
  var height = 14
  
  // Write more code below
  var volume = pyramidVolume(length, width, height)
  println("The volume of this pyramid is $volume")
  
}


//Function Literals 
/*val quotient = fun(num1: Int, num2: Int): Double { 
  return num1 / num2 
} */

fun main() {
    // Write your code below
    val area = fun(base:Int, height:Int): Int{
      return (base * height) / 2
    }
    println(area(15, 19))
  
    // lambda expression
    var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
    println(perimeter(15, 24))
  }



