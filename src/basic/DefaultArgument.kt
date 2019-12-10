package basic

/**
 * 매개변수에 기본값을 설정해놓을 수 있다.
 * 인수에 매개변수 이름을 명시하면 생략순서 상관없이 지정가능하다.
 * 인수에 매개변수 이름을 명시하는 부분은 일반 인수들보다 항상 오른쪽에 있어야한다.
 */
fun main(args: Array<String>){

    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30)
}

fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double{

    val result = (a + b) / 2.0

    if (print) println(result)

    return result
}