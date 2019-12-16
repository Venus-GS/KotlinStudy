package Starter

/**
 * 생성자의 매개변수 앞에 val, var를 붙이면 동일한이름의 프로퍼티가 자동으로 생성됨
 * 프로퍼티 자동생성시 매개변수에 들어온 인수가 프로퍼티의 초기값이 된다.
 */
class Car(val name:String, val speed: Int = 0)

fun main(agrs: Array<String>){

    val car = Car("My car")

    println(car.name)
    println(car.speed);
}