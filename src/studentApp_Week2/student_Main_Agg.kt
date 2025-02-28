package studentApp_Week2

fun main() {
    /*for (i in 1..1) {
        println("Enter the undergrad's ID:")
        val idIn_UG: String = readln()
        println("Enter the undergrad's name:")
        val nameIn_UG = readln()
        println("Enter the undergrad's course:")
        val courseIn_UG = readln()
        println("Enter the undergrad's mark:")
        val markIn_UG: Int = readln().toInt()
        val undergrad = Undergrad_Class(idIn_UG, nameIn_UG, courseIn_UG)
        undergrad.mark = markIn_UG
        println("Enter the Master student's ID:")
        val idIn_MS: String = readln()
        println("Enter the Master student's name:")
        val nameIn_MS = readln()
        println("Enter the Master student's course:")
        val courseIn_MS = readln()
        println("Enter the Master student's mark:")
        val markIn_MS: Int = readln().toInt()
        val mStudent = Masters_Class(idIn_MS, nameIn_MS, courseIn_MS)
        mStudent.mark = markIn_MS

        println("$undergrad")
        println("Did the above student pass? ${undergrad.didPass()} \n Grade:${undergrad.getGrade()}\n")
        println("$mStudent")
        println("Did the above student pass? ${mStudent.didPass()} \n Grade:${mStudent.getGrade()}\n")
     }
     */
    val studentList = mutableListOf<Undergrad_Class>()
    val mastersList = mutableListOf<Masters_Class>()

    for (i in 1..5) {
        println("Enter the student's ID:")
        val idIn_UG: String = readln()
        println("Enter the student's name:")
        val nameIn_UG = readln()
        println("Enter the student's course:")
        val courseIn_UG = readln()
        println("Enter the student's mark:")
        val markIn_UG: Int = readln().toInt()

        while (true) {
            println("Is the student an Undergrad (U), or a Masters (M) student?")
            val choice = readln()
            if (choice == "U") {
                val undergrad = Undergrad_Class(idIn_UG, nameIn_UG, courseIn_UG)
                undergrad.mark = markIn_UG
                studentList.add(undergrad)
                break
            } else if (choice == "M") {
                val master = Masters_Class(idIn_UG, nameIn_UG, courseIn_UG)
                master.mark = markIn_UG
                mastersList.add(master)
                break
            } else {
                println("Invalid input\n")
            }
        }
    }
    println("Student List: ")
    for (n in studentList) {
        println(n.toString())
    }
    println("\nMasters List: ")
    for (n in mastersList) {
        println(n.toString())
    }
}



