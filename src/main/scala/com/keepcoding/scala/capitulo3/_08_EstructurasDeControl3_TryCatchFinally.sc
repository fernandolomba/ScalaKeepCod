//Excepciones.
//Son iguales que Java
//Tiene la misma estructura de match

def connectTo(planet: String) = planet match {
  case "Earth" => "connected!"
  case "Mars" => throw new RuntimeException("Something Wrong")
  case unknown => throw new IllegalArgumentException(s"$unknown is not a valid planet")
}

connectTo("Earth")
//connectTo("Mars") //Da error e interrumpe el codigo
//connectTo("Moon") //Da error e interrumpe el codigo


var result = ""
try {
  result = connectTo("Earth")
  //result = connectTo("Mars")
  //result = connectTo("Moon")

}catch{
  case e: IllegalArgumentException => println(s"Illegal Argument: ${e.getMessage}")
  case e: RuntimeException => println(s"Couldn't Connect. Error: ${e.getMessage}")
}finally{
  println(s"Este es el resultado: $result")
}



//try tambien es una expresion que podemos evaluar y asignar
var result = try {
    //connectTo("Earth")
   connectTo("Mars")
   //connectTo("Moon")
  }catch{
    case e: IllegalArgumentException => s"Illegal Argument: ${e.getMessage}"
    case e: RuntimeException => s"Couldn't Connect. Error: ${e.getMessage}"
  }

println(result)