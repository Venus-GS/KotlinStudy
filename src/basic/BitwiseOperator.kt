package basic

/**
 * 코틀린 비트연산자는 기호가 아닌 문자
 */
fun main(args: Array<String>){

    println(15 and 7)
    println(5 or 2)
    println(15 xor 5)
    println(32767.inv())
    println(1 shl 3)
    println(8 shr 1)
    println(-17 ushr 2)
}