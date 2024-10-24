package AggregationApp_Week4.studentApp_Week2

class University_Agg {

    val studentList = mutableListOf<Student_Abstract_Agg>(
        Undergrad_Class_Agg("1", "Alex", "SoftEng"),
        Undergrad_Class_Agg("2", "Sam", "SoftEng"),
        Undergrad_Class_Agg("3", "Dan", "Film"),
        Undergrad_Class_Agg("4", "Jack", "Art"),
        Undergrad_Class_Agg("5", "Jack", "Computing"),
        Undergrad_Class_Agg("6", "Jack", "CGI"),
        Undergrad_Class_Agg("7", "Amy", "Art")

    )

    fun enrolStudent() {
        println("Enter the student's ID:")
        val idIn_UG: String = readln()
        println("Enter the student's name:")
        val nameIn_UG = readln()
        println("Enter the student's course:")
        val courseIn_UG = readln()
        println("Enter the student's mark:")
        val markIn_UG: Int = readln().toInt()
        val undergrad = Undergrad_Class_Agg(idIn_UG, nameIn_UG, courseIn_UG)
        undergrad.mark = markIn_UG
        studentList.add(undergrad)
    }

    fun findStudentByID(): String? {
        println("Enter the ID of the student you want to find: ")
        val searchID = readln()
        for (n in studentList) {
            if (n.id == searchID) {
                return n.toString()
            }
        }
        return null
    }

    fun findStudentByName(): MutableList<Student_Abstract_Agg> {
        val studentSearch = mutableListOf<Student_Abstract_Agg>()
        println("Enter the name of the student you want to find: ")
        val searchName = readln()
        for (n in studentList) {
            if (n.name == searchName) {
                studentSearch.add(n)
            }
        }
        return studentSearch
    }
}