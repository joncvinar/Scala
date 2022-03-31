import scala.io.StdIn
//The scala worksheet executes the contents of the object test{....} if all the code is inside that object.
// If there is some code outside the object, it will just define that Test object (and not run it).

object Calculator extends App {
  def square(x:Int) = math.pow(x,2)
  def cube(x:Double) = math.pow(x,3)




  println("1. Square, 2. Cube")
  val selection = scala.io.StdIn.readInt()
  if (selection == 1) {
    println("Enter the value to square")
    val squareVal = scala.io.StdIn.readInt()
    println("The value of this squared is " + square(squareVal))
  }
  else{
    println("Enter the value to cube")
    val cubeVal = StdIn.readDouble()
    println("The Value of this cubed is " + cube(cubeVal))

  }

}

