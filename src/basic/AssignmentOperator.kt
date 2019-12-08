package basic

/**
 * '=''연산자는 결과값을 내놓지 않기 때문에 =가 포함된 수식은 표현식이 아니다.
 */
fun main(args: Array<String>){

    val a: Int
    var b: Int

    a = 10 + 5
    b = 10

    b += a
    println(b)

    b %= 3
    println(b)
}