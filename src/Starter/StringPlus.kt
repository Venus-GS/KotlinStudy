package Starter

/**
 * 힙 영역에 실제공간이 할당되는 타입을 참조타입이라고한다
 * 기본형의 랩핑타입을 제외하면 모두 참조타입 - String 포함
 * 
 * String의 + 연산시에 힙영역에서 기존문자열에 덧붙여지는게 아닌 합쳐진 새로운 문자열이 새로 생성됨
 */
fun main(args: Array<String>){

    var first = "Hello"
    var second = "World"

    first += second
}