package basic

/**
 * 함수의 문장이 하나면 return을 생략하고 = 를 이용해 줄일 수 있다.
 * 타입 추론이 가능한 연산이면 반환타입도 생략 가능하다.
 */
fun main(args: Array<String>){

    println(myFunction())
    println(myFunction() + 10)
}

fun myFunction(): Int{

    val a = 3
    val b = 6

    println("a: $a, b: $b")
    return a+b
}