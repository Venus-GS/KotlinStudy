package Starter

/**
 * 어떤 객체의 프로퍼티는 해당객체의 힙영역에 저장됨
 */
fun main(args: Array<String>){

    val person = object {

        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)
}