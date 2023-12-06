
// Función que nos indica si un número es par
def esPar(n: Int): Boolean = {
  n%2 == 0
}

esPar(10)
esPar(9)


// FUNCIONES CON VARIOS PARAMETROS
// Los parámetros tienen que ir en el mismo orden en el que están definidos en la función
def myFunc(a: Int, b: String) = println(s"$a - $b")
myFunc(1, "Fernando")
// myFunc("Fernando", 1) // Daría el error por el orden de los parámetros
// Podemos cambiar el orden de los parámetros indicanco cual es cada uno
myFunc(b = "Fernando", a = 1)

// FUNCIONES CON PARÁMETROS POR DEFECTO
def myFuncDefecto(a: Int =10, b: String = "Fer"): Unit = println(s"$a - $b")
myFuncDefecto(2)
myFuncDefecto(b = "Belén")
// myFuncDefecto(,"Belen") // da error
// myFuncDefecto("Belen") // da error


// FUNCIONES SIN IMPLEMENTAR
def myFunc(a: Int, b: String) = ???


// CUANDO LA FUNCIÓN SOLO TIENE UNA LÍNEA
def esPar(n: Int): Boolean = {
  n%2 == 0
}
def esPar(n: Int): Boolean = n%2 == 0
// CUANDO LA FUNCIÓN TIENE VARIAS LÍNEAS
def esPar(n: Int): Boolean = {
  var boolean1 = n%2 == 0
  boolean1
}