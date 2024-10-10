package catApp_Week2

class Cat (nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties (attributes)
    val name: String
    var age: Int
    var weight = 0
        set(newWeight) {
            if (newWeight >= 5) {
                field = newWeight
            }
        }

    // Init block, for performing tasks on creation of the object
    init {
        name = nameIn
        age = ageIn
        weight = weightIn
    }

    fun walk(distance: Int) : Boolean
    {
        if (weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }

    fun eat(amount: Int) : Boolean {
        if (weight + amount < 20) {
            weight += amount
            return true
        }
        return false
    }
}