package basic

/**
 * 지역변수, 전역변수 
 * 스코프(scope)는 변수가 인식될 수 있는 범위
 */
var count = 0

fun main(args: Array<String>){

    val a = 15

    println(a)

    count += 1
    printCount()
    println(count)
}

fun printCount(){

    println(count)
    count += 1
}