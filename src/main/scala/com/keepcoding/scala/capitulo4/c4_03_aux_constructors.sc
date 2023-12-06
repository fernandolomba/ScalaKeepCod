class Book(var title: String,
          var author: String,
          var price: Double) {

  // constructor adicional sin parametros
  def this() {
    this("", "", 0.0)
    println("fin metodo sin parametros")
  }

  // constructor adicional con un parametro
  def this(title: String) {
    this(title, "", 0.0)
    println("fin metodo con un parametro")
  }
  override def toString: String = s"$title - $author - $price"
}

val b = new Book("Programming Scala", "Martin", 30.0)
val c = new Book()
val d = new Book("Programming Scala")

// mejor usar valores por defecto o companion objets
class Book2(var title: String,
           var author: String = "",
           var price: Double = 0.0){
  override def toString: String = s"$title - $author - $price"
}

val b1 = new Book2("I'm programmer Scala", "FER", 100)
b1.toString

val b2 = new Book2("I'm Scaler programmer", "FER")
b2.toString

val b3 = new Book2("I'm Scala programmer")
b3.toString

val b4 = new Book2("I'm Scala programmer", price = 100)
b4.toString