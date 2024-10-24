package AggregationApp_Week4.studentApp_Week2

class Undergrad_Class_Agg(override val id: String, override val name: String, override val course: String): Student_Abstract_Agg(id, name, course) {

    override fun getGrade(): String {
        val degree = when(mark) {
            in (70..100) -> "First"
            in (60..69) -> "2.1"
            in (50..59) -> "2.2"
            in (40..49) -> "Third"
            else -> "Fail"
        }
        return degree
    }

}