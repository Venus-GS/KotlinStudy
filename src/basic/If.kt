package basic

/**
 * if문의 블록에 몇문장이던 if문 전체를 한문장으로 인식한다.
 */
fun main(args: Array<String>){
    var a = 15
    val b = 11

    if (a>b){
        println("if 안으로 들어옴")
        a -= b
    }

    println(a)
}