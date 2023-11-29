fun main() {
    val test: String = "test"

    println(test.lastChar())

    println(3.add(4))
    println(3.add2(4))
    println(3 add2 4)
}

/**문자열에 존재하는 가장 마지막 문자를 가져오는 확장 함수 : String class의 확장함수*/
fun String.lastChar(): Char {
    return this[this.length - 1]
}

/**
 * 1. 확장함수와 멤버함수의 시그니처가 같은 경우 -> 멤버함수가 호출됨
 * 2. 확장함수는 현재 타입을 기준으로 호출됨
 */


/**====================infix 함수 : 중위함수 =========================*/
fun Int.add(other: Int): Int {
    return this + other
}
infix fun Int.add2(other: Int) : Int {
    return this + other
}

/**======================inline 함수 ===============================*/
/**======================지역 함수 ===============================*/

