package Starter

/**
 * 객체에 포함된 변수들은 프로퍼티라고 칭함
 * 프로퍼티는 선언과 동시에 초기화가 되야한다
 * 
 * 프로퍼티는 Java의 필드 + getter + setter 가 합쳐진 개념
 */
fun main(args: Array<String>){

    val person = object {

        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)

}