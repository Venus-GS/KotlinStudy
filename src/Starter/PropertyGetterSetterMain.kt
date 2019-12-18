package Starter

/**
 * val 프로퍼티는 값을 set할수 없기때문에 getter만 생성된다.
 */
fun main(args: Array<String>){

    val person = PropertyGetterSetterPerson()

    person.age = -30
    println(person.age)
}