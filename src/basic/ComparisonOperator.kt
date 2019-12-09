package basic

/**
 * 코틀린에서의 ==, != 는 자바에서의 equals와 같다.
 * 참조값끼리 비교하기위해서는 ===, !== 를 사용해야 한다.
 */
fun main(args: Array<String>){

    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f + 0.002f
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)
}