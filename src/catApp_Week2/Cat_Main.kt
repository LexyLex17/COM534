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
        println(if (flathead.eat()) "Cat CONSUMED" else "Fat fucking cat (walk them)")
    }
    println("$flathead")

    for (i in 1..4) {
        println(if (cupra.walk(3)) "Cat walked successfully" else "Feed your damn cat")
    }
    println("$cupra")
}