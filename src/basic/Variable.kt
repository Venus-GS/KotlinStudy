package basic

/**
 * 변수
 * 코틀린에는 원시타입이 없음!
 */
fun main(args: Array<String>){

    var total: Int
    total = 0

    val a: Int = 10 + 50 - 7
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)
}