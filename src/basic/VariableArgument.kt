package basic

/**
 * 매개변수의 갯수가 정해지지 않으면 vararg를 써서 가변인수를 받을 수 있다.
 * 일반 매개변수와 같이 쓸 수 있다.(단, 가변인수보다 일반인수가 오른쪽에 있으면 매개변수 이름을 붙여야 한다)
 */
fun main(args: Array<String>){

    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())
}

fun getSumOf(vararg numbers: Int): Int{

    val count = numbers.size
    var i = 0
    var sum = 0

    while (i < count){

        sum += numbers[i]
        i += 1
    }

    return sum
}