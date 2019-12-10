package basic

/**
 * 다른패키지에있는 함수도 호출가능 (패키지명 명시)
 *
 * 다른패키지를 import 해놓으면 패키지명 명시 없이 사용가능
 *
 * import package_name as alias 형식으로 명시해놓으면 (as) alias 이름으로 해당함수 호출가능하다.
 */
fun main(args: Array<String>){

    println(basic.min(30, 10))
}