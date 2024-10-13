package studentApp_Week2

class Student_Class(idIn: String, nameIn: String, courseIn: String, markIn: Double?) {

    // Attributes
    val id: String
    val name: String
    val course: String
    val mark: Double?

    init {
        id = idIn
        name = nameIn
        course = courseIn
        mark = markIn
    }

    override fun toString() : String {
        return "Name: $name, Course: $course, Mark: $mark"
    }

}