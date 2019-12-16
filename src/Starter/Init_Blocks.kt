package Starter

/**
 * 인스턴스 생성시 init블럭이 무조건 먼저 실행되는것이 아닌 위에서부터 순서대로 실행된다
 */
class Size(width: Int, height: Int){

    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args: Array<String>){

    val size = Size(10, 50)
    println(size.area)
}