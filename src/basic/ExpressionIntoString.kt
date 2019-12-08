package basic

/**
 * String 문자열에 변수의값을 넣고싶으면 $변수 / 표현식을 넣고싶으면 ${표현식} 으로 명령어수를 줄여서 표현 할 수 있다.
 * $ 는 Syntactic Sugar(문법적 설탕)이라고 부름
 */
fun main(args: Array<String>){

    val a = 10
    val b = 20

    println("a의 값:$a")
    println("b의 값:$b")

    println("a + b = ${a + b}")
    
}