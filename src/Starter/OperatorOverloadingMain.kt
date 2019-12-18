package Starter

/**
 * operator 를 붙이고 지정된 이름으로된 함수를 재정의하면 인스턴스끼리의 연산이 가능하다.
 */
fun main(args: Array<String>){

    val pt1 = OperatorOverloadingPoint(3, 7)
    val pt2 = OperatorOverloadingPoint(2, -6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 3

    pt3.print()
    pt4.print()
    pt5.print()
}