object Funciones {

  def main(args: Array[String]){

    def cuenta(a:List[Any]) : Int = {
      return a.length
    }

    var Lista = List(1, 2, 3, 4)
    println("PRUEBA FUNCION CUENTA")
    println("\t" + cuenta(Lista))

    def divide(aa:Double, bb:Double) : Double = {
      return aa/bb
    }

    var a = 10
    var b = 2

    println("PRUEBA FUNCION DIVIDE")
    println("\t" + divide(a, b))

    def divide2(aa:Double = 20.0, bb:Double = 10.0) : Double = {
      return aa/bb
    }

    var a2 = 10
    var b2 = 2

    println("PRUEBAS FUNCION DIVIDE2")
    println("\t" + divide(a2, b2))
    println("\t" + divide(aa = a2, bb = b2))
  }
}
