package basic

/**
 * 다른 스코프에선 변수명이 같아도 상관없다.
 */
fun main(args: Array<String>){

    val a = 52
    println(a)

    printA()
    printA2()
}

fun printA(){

    val a  = 17
    println(a)
}

fun printA2(){

    val a = 120
    println(a)
}