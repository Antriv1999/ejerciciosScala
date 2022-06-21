object Datos {
  def main(args: Array[String]){
    // INICIALIZO LOS DATOS
    var tupla = (1, 2)
    var lista = List.range(1, 51)
    var mapa:Map[String,String] = Map()
    mapa += ("nombre" -> "Andres")
    mapa += ("direccion" -> "Calle Habana")
    mapa += ("tlf" -> "123456789")
    mapa += ("email" -> "aaaaaaa@gmail.com")

    // IMPRIMO LA TUPLA
    println("TUPLA:")
    tupla.productIterator.foreach{i => println("\tValue = " + i)}
    println()

    // IMPRIMO LA LISTA
    println("LISTA:")
    for (x <- lista) {
      print("\t")
      print(x + " ")
    }
    println()
    println()

    // IMPRIMO EL MAPA
    println("MAPA:")
    mapa.keys.foreach{i =>
      print("\tClave = " + i + ", ")
      println("Valor = " + mapa(i))
    }
    println()

    // ANADO ITEMS A LA LISTA
    var lista2 = List(51, 52, 53)
    lista = lista ::: lista2

    // ANADO CAMPO AL DICCIONARIO
    mapa += ("facturacion total" -> "123456789")

    // IMPRIMO LOS CAMBIOS
    println("CAMBIOS:")
    println("\tLISTA 2:")
    print("\t\t")
    for (x <- lista) {
      print(x + " ")
    }
    println()
    println()

    println("\tMAPA 2:")
    mapa.keys.foreach{i =>
      print("\t\tClave = " + i + ", ")
      println("Valor = " + mapa(i))
    }
    println()

    // DEFINE LOREN IPSUM
    var lorenIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras blandit erat sit amet purus viverra convallis. Vivamus quis lorem enim. Phasellus efficitur suscipit ipsum. Morbi tincidunt euismod elementum. Etiam et magna nec purus faucibus ullamcorper. Praesent imperdiet, dui eu semper efficitur, leo erat sollicitudin justo, eget convallis sem turpis nec justo. Cras eget elementum sem. Maecenas ullamcorper sed nibh quis tincidunt. Fusce neque ligula, pellentesque non urna eget, aliquet laoreet urna. Nullam eu libero facilisis ante tincidunt tristique ultrices vitae sapien. Etiam enim leo, euismod nec dignissim vel, malesuada eu nisi. Pellentesque fringilla est justo, quis mattis arcu mollis eget. In auctor pulvinar neque, ac tempor ex dictum at."
    println("LOREN IPSUM:")
    println("\t" + lorenIpsum)
    println()

    // COUNT CHARS
    var numCaracteres = lorenIpsum.toCharArray.length
    println("NUMERO CARACTERES:")
    println("\t" + numCaracteres)
    println()

    // CHECK IPSUM
    println("CHECK IPSUM:")
    var checkIpsum = lorenIpsum.contains("ipsum")
    var checkIPSUM = lorenIpsum.contains("Ipsum")
    println("\t" + (checkIpsum || checkIPSUM))
    println()

    // LISTA MODIFICADA
    println("LISTA MODIFICADA:")
    var listaModificada = lista.map(a => a+15)
    println("\t" + listaModificada)
  }
}
