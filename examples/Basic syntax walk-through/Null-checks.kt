package multiplier

// Return null if str does not hold a number
fun parseInt(str : String) : Int? {
  try{
    return  Integer.parseInt(str)
  } catch (e: NumberFormatException) {
    println("Some argument isn't an Int")
  }
  return null
}

fun main(args : Array<String>) {
  if (args.size < 2) {
    println("Expecting two numbers");
  } else {
    val x = parseInt(args[0])
    val y = parseInt(args[1])

    // We cannot say 'x * y' now because they may hold nulls
    if (x != null && y != null) {
      print(x * y) // Now we can
    } else {
      println("Some argument is null")
    }
  }
}