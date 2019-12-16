package Starter

/**
 * 생성자에 매개변수를 줄때는 constructor 사용 - 생략가능
 * 
 * init은 프로퍼티 초기화 - 생성자 호출시 바로 해당 블럭을 탐
 */
class PersonConstructor constructor(name: String, age: Int){

    val name: String
    val age: Int

    init {
        this.name = name
        this.age  = age
    }
}

fun main(args: Array<String>){

    val person = PersonConstructor("홍길동", 46)
    println("이름:${person.name}")
    println("나이:${person.age}")

}