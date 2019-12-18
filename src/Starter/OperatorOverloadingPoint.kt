package Starter

class OperatorOverloadingPoint(var x: Int = 0, var y: Int = 0){

    operator fun plus(other: OperatorOverloadingPoint): OperatorOverloadingPoint{

        return OperatorOverloadingPoint(x + other.x, y + other.y)
    }

    operator fun minus(other: OperatorOverloadingPoint): OperatorOverloadingPoint{

        return OperatorOverloadingPoint(x - other.x, y - other.y)
    }

    operator fun times(number: Int): OperatorOverloadingPoint{

        return OperatorOverloadingPoint(x * number, y * number)
    }

    operator fun div(number: Int): OperatorOverloadingPoint{

        return OperatorOverloadingPoint(x / number, y / number)
    }

    fun print(){
        println("x: $x, y: $y")
    }
}