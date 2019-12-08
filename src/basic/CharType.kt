package basic

/**
 * 코틀린의 문자 저장방식은 Unicode
 */
fun main(args: Array<String>){

    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt())
}