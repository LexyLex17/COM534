package catApp_Week2

fun main (args: Array<String>) {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk(5)
    clyde.walk(1)
    println("$binnie")
    println("$clyde")

    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    for (i in 1..2) {
        println(if (flathead.eat(6)) "Cat CONSUMED" else "Feeding them this much would make them overweight!")
    }
    println("$flathead")

    for (i in 1..4) {
        println(if (cupra.walk(1)) "Cat hath walked" else "Feed your damn cat")
    }
    println("$cupra")
}