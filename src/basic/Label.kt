package basic

/**
 * break 는 가장 가까운 반복문 한개만 벗어난다.
 * Label을 지정해주면 해당 반복문을 벗어난다.
 * Label은 특정 반복문에 붙인 이름
 */
fun main(args: Array<String>){

    var x = 0
    var y = 9

    outer@ while (x <= 20){

        y = 0

        while (y <= 20){

            if (x + y == 15 && x - y == 5) break@outer

            y += 1
        }

        x += 1
    }

    println("x:$x, y:$y")
}