package studentApp_Week2

class StudentClass(private val id: String, private val name: String, private val course: String) {

    var mark = 0
        set(newMark) {
            if (newMark in 0..100) {
                field = newMark
            }
        }

    fun getGrade(): String {
        val degree = when(mark) {
            in (70..100) -> "First"
            in (60..69) -> "2.1"
            in (50..59) -> "2.2"
            in (40..49) -> "Third"
            else -> "Fail"
        }
        return degree
    }

    fun didPass(): Boolean {
        val passed = when(mark) {
            in (40..100) -> true
            else -> false
        }
        return passed
    }

    override fun toString() : String {
        return "Name: $name, Course: $course, Mark: $mark"
    }

}