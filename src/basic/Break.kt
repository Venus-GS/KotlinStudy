package basic

/**
 * while 문에 break 사용
 */
fun main(args: Array<String>){

    var i = 0

    while(true){

        i += 1

        if (i >= 5) break

        print(i)
    }
}