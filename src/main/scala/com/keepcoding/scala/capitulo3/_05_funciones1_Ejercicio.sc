import scala.math.pow

def potencia(exponente: Int, base: Int = 2): Double = {
  pow(base,exponente)
}

potencia(2)
potencia(2,5)

val exponente = 10
val range = 1 to exponente
range.foreach(x => println("10"))


def p(expo: Int, bas: Int = 2):Double = {
  var acc = 1
  val range = 1 to expo
  range.foreach(x => acc = acc * bas)
  acc
 }

p(2)
p(2,5)



def p1(expo: Int, bas: Int = 2):Double = {
  (1 to expo).map(ele => bas).reduce(_ * _)
}

p1(2)
p1(2,5)
