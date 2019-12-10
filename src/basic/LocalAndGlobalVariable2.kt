package basic

/**
 * 전역변수와 지역변수의 이름이 중복되면 호출된 곳에서 가장 가까운 스코프에 있는 변수가 사용된다.
 */
var a = 5

fun main(args: Array<String>){

    val a = 30
    println(a)
    func()
}

fun func(){
    println(a)
}