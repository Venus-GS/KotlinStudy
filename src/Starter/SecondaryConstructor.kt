package Starter

/**
 * 주생성자가 있다면 마지막에 꼭 주생성자를 호출 해야 한다.
 */
class Time(val second: Int){

    init {
        println("init 블록 실행중")
    }

    constructor(minute: Int, second: Int) : this(minute * 60 + second){
        println("보조 새엉자 1 실행 중")
    }

    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second){
        println("보조 생성자2 실행 중")
    }

    init {
        println("또 다른 init블록 실행 중")
    }
}

fun main(args: Array<String>){
    println("${Time(15, 6).second}초")
    println("${Time(6, 3, 17).second}초")
}