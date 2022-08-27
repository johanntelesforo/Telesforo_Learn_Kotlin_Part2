/*for is a keyword used to declare a for loop.
We define i as the loop variable. This variable holds the current iteration value and can be used within the loop body.
The in keyword is between the variable definition and the iterator.
The range 1..4 is the for loop iterator. */

fun main() {
    // Write your code below
    for (i in 1..5){
      println("Hello, Codey!")
      println("i = $i")
    }
  }


/*The functions downTo, until and step give us more control of a range and therefore more control of our loops. */
// the downTo function simply creates a reverse order group of values, where the starting boundary is greater than the ending boundary.
/*for (i in 4 downTo 1) {
  println("i = $i")
} */


// The until function creates an ascending range, just like the (..) operator, but excludes the upper boundary:
/*for (i in 1 until 4) {
  println("i = $i")
} */


// The step function specifies the amount these functions count by:
/*for (i in 1..8 step 2) {
  println("i = $i")
} */

fun main() {
    println("-- 1st for loop output --")
    // Write your code below
    for (i in 10 downTo 1){
      println("i = $i")
    }
    println("\n-- 2nd for loop output --")
    // Write your code below
    for (j in 1 until 10){
      println("j = $j")
    }
    println("\n-- 3rd for loop output --")
    // Write your code below
    for(k in 1..10 step 2){
      println("k = $k")
    }

}


// iterating through collections 
/*val fruitList = listOf("apples", "oranges", "bananas")
 
for (fruit in fruitList) {
  println("I have $fruit.")
} */



// To iterate through the indices of a collection you can use its indices property:
/*val fruitSet = setOf("apples", "oranges", "bananas")
 
for (setIndex in fruitSet.indices) {
  println("Index = $setIndex")
} */

//We can also get the index AND the iterator element using the collection’s withIndex() function
/*val fruitList = listOf("apples", "oranges", "bananas")
 
for ((listIndex, fruit) in fruitList.withIndex()) {
  println("$listIndex is the index of the element $fruit")
} */


fun main() {
    val mySchedule = listOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
   
    val myTasks = setOf("Eat Breakfast", "Clean Up", "Work", "Eat Lunch",  "Clean Up", "Work", "Eat Dinner", "Clean Up")
  
    println("-- mySchedule Output --")
    // Write your code below
    for (task in mySchedule) {
      println(task)
    }
    println("\n-- myTasks Output --")
    // Write your code below
    for ((taskIndex, task) in myTasks.withIndex()){
      println("$taskIndex: $task")
    }
  }


  // for maps
  /*val myClothes = mapOf("Shirts" to 7, "Pairs of Pants" to 4, "Jackets" to 2)
 
for (itemEntry in myClothes) {
  println("I have ${itemEntry.value} ${itemEntry.key}")
} */

/*val myClothes = mapOf("Shirts" to 7, "Pairs of Pants" to 4, "Jackets" to 2)
 
for ((itemName, itemCount) in myClothes) {
  println("I have $itemCount $itemName")
} */

/* Keys and Values
val myClothes = mapOf("Shirts" to 7, "Pairs of Pants" to 4, "Jackets" to 2)
 
println("KEYS")
for (itemName in myClothes.keys) {
  println(itemName)
}
 
println("\nVALUES")
for (itemCount in myClothes.values) {
  println(itemCount)
} */

fun main() {
    val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")
    
    println("\n-- Key: Value Output --")
    // Write your code below
    for(favoriteEntry in favoriteColors){
      println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }
    println("\n-- Only Values Output --")
    // Write your code below
    for (color in favoriteColors.values) {
      println(color)
    }
  }

//while loop
fun main() {
    var counter = 0
    var index = 0
    val schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")
  
    println("-- counter Output --")
    // Write your code below
    while (counter < 5){
      println(counter)
      counter += 1
    }
    println("\n-- Elementary School Grades --")
    // Write your code below
    while (schoolGrades[index] != "6th"){
      println(schoolGrades[index])
      index++
    }
  }

// do while loops
/*do {
  Is it sunny outside?
  Stay inside.
} while ( not sunny )
Go outside! */

fun main() {
    var index = 0
    val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
    val fahr_ratio = 1.8
    var fahr: Double
  
    println("-- Celsius to Fahrenheit --")
    // Write your code below
    do {
      fahr = celsiusTemps[index] * fahr_ratio + 32.0
      println("${celsiusTemps[index]}C = ${fahr}F")
      index++
    } while (fahr != 212.0)
  } 

//nested loops
/*for (i in 1..2) {
  for (j in 'A'..'C') {
    println("Outer loop: $i - Inner loop: $j")
  }
} 

output:
Outer loop: 1 - Inner loop: A
Outer loop: 1 - Inner loop: B
Outer loop: 1 - Inner loop: C
Outer loop: 2 - Inner loop: A
Outer loop: 2 - Inner loop: B
Outer loop: 2 - Inner loop: C
*/

fun main() {
    // Write your code below
     for (i in 1..6){
       for (j in 'A'..'F'){
         print("$j$i ")
       }
       println()
     }
  }
/*output
A1 B1 C1 D1 E1 F1 
A2 B2 C2 D2 E2 F2 
A3 B3 C3 D3 E3 F3 
A4 B4 C4 D4 E4 F4 
A5 B5 C5 D5 E5 F5 
A6 B6 C6 D6 E6 F6  */

//nested
fun main() {
    val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")
  
    println("-- Room Search --")
    for (room in rooms) {
      print("$room: ")
      // Write your code below
      if (room == "Living Room"){
        println("Found It!")
        break
      }
      println("Found Nothing.")
    }
  
    println("\n-- Divide By Zero --")
    for (number in 12 downTo -12 step 4) {
      // Write your code below
      if (number == 0){
        continue
      }
      println("120/number = ${120/number}")
    }
  }
  
//review
  fun main() {
    // Write your code below
    grid@ for (i in 1..6) {
      for (j in 'A'..'F') {
        // Write your code below
        if (j == 'C'){
            continue@grid
        }
        print("$j$i ")
      }
      println()
    }
  }