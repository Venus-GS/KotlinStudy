package basic

/**
 * if-else가 모두 있으면 if-else 전체가 표현식이 된다.
 * 표현식의 값은 실행되는 블록안의 가장 마지막 표현식이 된다.
 *
 * if와 else의 마지막 표현식의 타입은 일치해야 한다.
 *
 * if나 else의 블록값이 비었을경우는 타입은 Unit이고 의미없는 값이 저장된다.
 *
 * if-else 문을 삼항연산자처럼 사용가능하므로 코틀린은 삼항연산자가 없다.
 */
fun main(args: Array<String>){

    val value: Int = if(10>5) {
        println("10은 5보다 크다")
        10
    }else{
        println("10은 5보다 크지 않다")
        5
    }

    println(value)
}