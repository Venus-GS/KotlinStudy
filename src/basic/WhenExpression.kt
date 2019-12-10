package basic

/**
 * When 도 표현식으로 사용가능하다.
 * if-else 처럼 사용 가능
 */
fun main(args: Array<String>){

    val score = 95

    val grade: Char = when(score/10){

        6    -> 'D'
        7    -> 'C'
        8    -> 'B'
        9,10 -> 'A'
        else -> 'F'
    }

    println(grade)

    val grade2: Char = when{

        score >= 90    -> 'A'
        score >= 80    -> 'B'
        score >= 70    -> 'C'
        score >= 60    -> 'D'
        else           -> 'F'
    }

    println(grade2)
}