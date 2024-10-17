package studentApp_Week2

fun main() {
    for (i in 1..3) {
        println("Enter the student's ID:")
        val idIn: String = readLine().toString()
        println("Enter the student's name:")
        val nameIn = readLine().toString()
        println("Enter the student's course:")
        val courseIn = readLine().toString()
        println("Enter the student's mark:")
        val markIn: Double? = readLine()?.toDouble()
        val student = StudentClass(idIn, nameIn, courseIn, markIn)
        println("$student")
    }
}



