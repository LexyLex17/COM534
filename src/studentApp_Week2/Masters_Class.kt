package studentApp_Week2

class Masters_Class(override val id: String, override val name: String, override val course: String): Student_Abstract(id, name, course) {

    override fun getGrade(): String {
        val degree = when(mark) {
            in (70..100) -> "Disctinction"
            in (60..69) -> "Merit"
            in (40..59) -> "Pass"
            else -> "Fail"
        }
        return degree
    }

}