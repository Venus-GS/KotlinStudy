package basic

/**
 * if와 else를 묶어서 하나의 문장으로 본다.
 */
fun main(args: Array<String>){

    val a = 10
    val b = 5

    if (a<b)
        println("if")
    else
        println("else")

    if (a > b)
        println("a가 크다")
    else
        println("b는 a이상이다.")
}