package Starter

/**
 * 코틀린에서는 클래스 이름이 파일이름과 같아야할 의무가 없다.
 * 또한 한파일에 여러개의 public 클래스를 선언할 수 있다.
 * 코틀린의 기본 접근지정자는 public
 * 객체생성시 new없이 생성자만 호출
 */
class Person{

    var name: String = ""
    var age: Int = 0
}

fun main(agrs: Array<String>){

    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2 = Person()
    person.name = "김미영"
    person.age = 29

    val person3 = Person()
    person.name = "John"
    person.age = 52
}