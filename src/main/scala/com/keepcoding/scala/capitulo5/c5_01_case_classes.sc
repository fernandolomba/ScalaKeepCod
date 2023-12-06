case class Person(name: String, age: Int)

// companion object with apply
// No necesitamos usar un new porque crea un companion object con un new person
val person = Person("Juan", 25)

// getters
// genera unos getters y no serían privadas los atributos
// case esta orientado a ser inmutable por lo que no genera setters
person.name
person.age

// copy
// como son inmutables podemos crear copiar y modificarlas
val persona2 = person.copy(name = "Mark")
persona2.name

// case class sobreescribe los metodos
// override de toString, hashCode y equals
person.toString
Person("Juan", 2).hashCode() == Person("Juan", 2).hashCode()
Person("Juan", 2).equals(Person("Juan", 2))

// case class crea los metodos apply y unapply
// companion object with unapply
Person.apply("Juan", 25)  //metes los parámetros y te crea el objeto
Person.unapply(person).get //metes el objeto y te devuelve los parámetros


// pattern matching
Person("Juan", 17) match {
  case Person(name, _) if name.equals("Mark") => println("tiene pase vip")
  // aunque solo usa la edad en el if, toma todoel objeto para luego poder usar el nombre
  // hubiera sido igual que case Person(name, age) if age >= 18 => println(s"$name es mayor de edad")
  case p @ Person(_, age) if age >= 18 => println(s"${p.name} es mayor de edad")
  case Person(_ , _) => println("No puede entrar")
}