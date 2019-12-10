package basic

/**
 * Java 에서의 Switch/case 문과 동일
 * else는 Switch/case문의 default와 동일 (생략가능)
 */
fun main(args: Array<String>){

    val score = 64

    when(score/10){

        6->println('D')
        7->println('C')
        8->{println('B')
            println('B')
        }
        9,10->{println('A')}
        else->{println('F')}
    }

    println("test")
}