package Starter

/**
 * String 타입은 같은 문자열을 넣으면 같은 객체를 참조함
 * 리터럴로만 이루워지지않으면, 같은문자열이여도 다른 객체를 참조함
 *
 * 자바의 == 는 코틀린에서 === (객체 비교)
 * 자바의 equals 는 코틀린에서 == (참조값 비교)
 */
fun main(args: Array<String>){

    var a = "one"
    var b = "one"

    println(a === b)

    b = "on"
    b += "e"
    println(a !== b)

    b = a
    println(a ===b)
}