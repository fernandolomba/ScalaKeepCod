

def descuento(precio: Double): Double = {
  if (precio<50){
    precio
  }else if (precio>=50 && precio<100){
    precio*0.90
  }else{
    precio*0.85
  }
}

descuento(49)
descuento(50)
descuento(51)
descuento(99)
descuento(100)
descuento(101)