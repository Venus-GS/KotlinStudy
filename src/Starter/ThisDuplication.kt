package Starter

/**
 * 변수앞에 this.를 붙이면 property로 인식
 */
class AAA{

    var num = 15

    fun memberFunc(num: Int){
        println(num)
        println(this.num)
    }
}

fun main(args: Array<String>){

    val a = AAA()
    a.memberFunc(53)
}