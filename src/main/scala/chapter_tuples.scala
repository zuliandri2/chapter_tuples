object chapter_tuples {

  def main(args: Array[String]): Unit = {

    val ingredient = ("Sugar", 25)
    println(ingredient._1)
    println(ingredient._2)

    val (name, quantity) = ingredient
    println(name)
    println(quantity)

    val planet = List(
      ("Mercury", 57.0),
      ("Venus", 149.0),
      ("Earth", 108.2),
      ("Mars", 209.8),
      ("Jupiter", 309.9)
    )

    planet.foreach {
      case ("Earth", disntance) => println(s"Our planet is $disntance million kilometers from the sun")
      case (name, distance) => println(s"Planet $name berjarak $distance dari matahari")
      case _ =>
    }

    val pairs = List((2,5), (3, -7), (20, 56))
    for ((a, b) <- pairs) {
      println(s"($a, $b)")
    }
  }

}

