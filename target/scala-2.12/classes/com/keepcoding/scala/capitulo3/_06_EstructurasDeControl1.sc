// IF
/*
if (condicion) expresion
else if (condicion) expresion
else expresion
*/

val n = 2

if (n%2 == 0 ) "par" else "impar"

val boolean1 = if (n%2 == 0) "par" else "impar"

def esPar(n:Int) = {
  if (n==0) "cero"
  else if (n%2==0) "par"
  else "impar"
}
esPar(9)
esPar(0)
esPar(8)

// WHILE
/*
while(condicion) expresion
 */

var i = 0
while (i<3) {
  println(s"current: $i")
  i += 1
}

/*
//Solo para Scala 3
//equivale a un do while
i = 0
while
  println(s"El cuadrado de $i es ${i*i}")
  i+=1
  i<10
do
  ()
*/


// FOR
/*
for (name <- iterable) expresion
 */


val itera = 0 to 10
for (i <- itera){
  println(i)
}

val itera = List.range(1,10,2)
for (i <- itera){
  println(i)
}


for (i <- "itera"){
  println(i)
}

for (i <- "ite"; j <-1 to 3){
  println(s"$i - $j")
}

val itera = List.range(1,10,2)

for (i <- 0 to 10 if i != 5) {
  println(i)
}

for (i <- 0 to 10 if (i%2 != 0);
     j <- 1 to 2) {
  println(s"$i - $j")
}