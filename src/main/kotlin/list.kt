fun main() {
    val numbers = mutableListOf<Int>()

    numbers.add(1)
    numbers.addAll(listOf(2, 3))

    numbers.forEach {
        println(it)
    }

    /**var / val / list / mutableList*/
    /**val + list*/
    val list1: List<Int> = listOf(1, 2, 3)
//    list1 += 4
//    list1 = list1 + 4
    /**val + mutableList*/
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)
    list2 += 4
    //컴파일러가 '+='를 .plusAssign() 호출로 변환
    list2.plusAssign(5)
    // val , var 상관없음 -> 재대입되는 일이 없음

    /**var + list*/
    var list3: List<Int> = listOf(1, 2, 3)
    list3 += 4
    //위 식은 아래 식과 같음
    val newList3 = list3 + 4
    list3 = newList3
    /**var + mutableList*/
    var list4: MutableList<Int> = mutableListOf(1,2,3)
    //예시 1번과 같음
}