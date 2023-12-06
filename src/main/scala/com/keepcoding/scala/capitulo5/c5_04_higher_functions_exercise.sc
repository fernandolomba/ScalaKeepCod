// Hacer que sea posible que se escriba por consola un texto y despues que se escriba a un fichero
// intentar que no se duplique codigo lo maximo posible

import java.io.PrintWriter
/**
new PrintWriter("/home/agutierrez/keepcoding/curso_scala/scala_worksheets/src/main/scala/capitulo5/solution.txt")
{ write(str); close }
**/

def printConsole(s: String): Unit = println(s)
def printFile(s: String): Unit = {
  val pathWindows = "C:\\Users\\ferni\\Desktop\\CursoScalaKeepCoding\\Curso-online-Introduccion-Scala-2022\\src\\main\\scala\\com\\keepcoding\\scala\\capitulo5\\exercises\\solution.txt"
  val pathLinux = "/home/agutierrez/keepcoding/curso_scala/scala_worksheets/src/main/scala/capitulo5/solution.txt"
  new PrintWriter(pathWindows)
  { write(s); close }
}

def printSomething(s: String, printer: String => Unit) = printer(s)

printSomething("el texto a imprimir", printConsole)
printSomething("el texto a imprimir", printFile)