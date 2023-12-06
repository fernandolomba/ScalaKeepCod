val name = "John"
val age = "13"
val country = "Spain"

// Sin interpolación
val message = "message is: "+ name +", "+ age +", "+ country

// Con interpolación
val message2 = s"message is: $name, $age, $country"
val message3 = s"message is: $name, ${age.toInt + 10}, $country"


// Se puede dar formato como en Java
val height = 1.98
val message4 = f"$height%2.1f"
val message4 = f"$height%2.2f"

// Interpolador RAW
val message = "a \n b"
println(message)

val message = raw"a \n b"
println(message)

//Se pueden hacer interpoladores custom. Consultar documentación
