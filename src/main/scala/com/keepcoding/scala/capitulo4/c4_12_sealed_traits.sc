// sealed trait y clases en un mismo fichero
// es equivalente con abstract class
sealed trait Respuesta
class Si extends Respuesta
class No extends Respuesta
class Desconocido extends Respuesta

val respuesta: Respuesta = new No

// El compilador nos avisará si no contemplamos todos los casos
respuesta match {
  case x: Si => println(s"$x es una respuesta afirmativa")
  case x: No => println(s"$x es una respuesta negativa")
  case x: Desconocido => println(s"$x es una No sabe no contesta")
}

