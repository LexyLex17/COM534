package studentApp_Week2

abstract class Student_Abstract(protected open val id: String, protected open val name: String, protected open val course: String) {

    open var mark = 0
        set(newMark) {
            if (newMark in 0..100) {
                field = newMark
            }
        }

    abstract fun getGrade(): String


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