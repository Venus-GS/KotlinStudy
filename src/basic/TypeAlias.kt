package basic

/**
 * 타입에 별칭을 정할 수 있다.(타입의 이름이 길경우 유용하게 사용 가능할듯!)
 * 별칭을 준 타입의 형은 별칭명이 아닌 기존의 타입이다.
 */
typealias Number = Int

fun main(args: Array<String>){

    val a: Number = 10
    println(a)
}