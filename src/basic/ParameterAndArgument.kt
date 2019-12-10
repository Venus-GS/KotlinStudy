package basic

/**
 * 매개변수 선언시에는 val, var를 붙이지 않음
 * 매개변수는 무조건 val로 선언되므로 값 변경 불가능
 */
fun main(args: Array<String>){

    println(cToF(30));
    println(getAverage(89, 96))
}

fun cToF(celsius: Int) : Double{
    return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int): Double{
    return (a + b) / 2.0
}