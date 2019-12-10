package basic

/**
 * 반환형이 Unit이면 생략 가능 (Java의 void)
 * 단 void는 반환값이 없음을 의미하는 특수타입, Unit은 class 키워드로 정의된 일반 타입이다.(엄연히 말하면 void 와 Unit은 다르다)
 *
 * Unit은 return이 없어도 암묵적으로 Unit타입의 객체를 return 한다.
 * Unit은 싱글톤이기때문에 매번 객체를 생성하지는 않는다.
 */
fun main(args: Array<String>){

    celsiusToFah(27)
}

fun celsiusToFah(celsius: Int): Unit{

    println(celsius * 1.8 + 32)
}