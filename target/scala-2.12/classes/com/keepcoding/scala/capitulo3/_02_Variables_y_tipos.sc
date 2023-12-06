// Scala infiere el tipo de la variable

val myVar1 = 1

// Pero podemos indicarle el tipo

val myVar2: Long = 1

// Podemos usar indicadores para decirle que tipo queremos usar

val myVar3Long = 3L

val myVar4Int = 4
val myVar4Double = 4.0
val myVar4Double = 4d
val myVar4Float = 4.0F

// Otros tipos de datos

val MyBool = true //false

val myString = "hola mundo"

val myChar = 'c'

// Byte, Short, Int, Long (L)
// Float (F), Double
// String ("), Char (')
// Boolean

// Esto son funciones de match
val myBigInt: BigInt = 4
val myBigDouble: BigDecimal = 45

// Mutables e Inmutables
//La variable inmutable tienen preferencia
val a = 2

//La variable mutable solo cuando se necesite
var a = 1
println(a)
a=3
println(a)