//Match

val day = 2 //martes

day match {
  case 1 => println("Lunes")
  case 2 => println("Martes")
  case 3 => println("Miercoles")
  case 4 => println("Jueves")
  case 5 => println("Viernes")
  case 6 => println("Sabado")
  case 7 => println("Domingo")
  case _ => println("not valid day")
}

val dayName = day match {
  case 1 => "Lunes"
  case 2 => "Martes"
  case 3 => "Miercoles"
  case 4 => "Jueves"
  case 5 => "Viernes"
  case 6 => "Sabado"
  case 7 => "Domingo"
  case _ => "not valid day"
}

println(dayName)



def isWeekend(day: Int) ={
  day match {
    case 6 => "yes, is weekend"
    case 7 => "yes, is weekend"
    case _ => "no, isn't weekend"
  }
}

isWeekend(6)

val result = isWeekend(7)


def isWeekend(day: Int) = day match {
  case 1|2|3|4|5 => "no, isn't weekend"
  case 6 | 7 => "yes, is weekend"
  case _ => "is not valid day"
}

isWeekend(6)


def isWeekend(day: Int) = day match {
  case d if (d>=1 && d<=5) => "no, isn't weekend"
  case d if (d==6 || d==7) => "yes, is weekend"
  case _ => "is not valid day"
  // d toma su valor de day
}

isWeekend(9)



def isWeekend(day: Int) = day match {
  case d if (d>=1 && d<=5) =>
    "no, isn't weekend"
  case d if (d==6 || d==7) => {
    println("yeah!")
    "yes, is weekend"
      }
  case _ => "is not valid day"
  // d toma su valor de day
}

isWeekend(7)