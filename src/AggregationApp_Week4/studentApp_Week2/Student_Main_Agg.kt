package AggregationApp_Week4.studentApp_Week2

fun main() {
    val university = University_Agg()

    while (true) {
        println("1. Add a student" +
                "\n2. Search for a student by ID" +
                "\n3. Search for a student by name" +
                "\n4. Display all current students" +
                "\n5. Quit")
        val menuChoice = readln()
        if (menuChoice == "1") {
            university.enrolStudent()
        } else if (menuChoice == "2") {
            val displayStudent = university.findStudentByID()
            println(displayStudent)
        } else if (menuChoice == "3") {
            val displayStudent = university.findStudentByName()
            for (n in displayStudent) {
                println(n.toString())
            }
        } else if (menuChoice == "4") {
            for (n in university.studentList) {
                println(n.toString())
            }
        } else if (menuChoice == "5") {
            break
        }
    }
}



