package Starter

/**
 * 미아객체 (힙 영역의 해당값을 가르키는 참조변수가 사라져서 접근할수 없는 객체)는 GC에 의에 메모리에서 제거됨
 */
fun main(args: Array<String>){

    var result = ""
    var i = 1

    while (i <= 100){

        result += "$i "
        i += 1
    }

    println(result)
}