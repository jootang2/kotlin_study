fun filterEven(list : List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for(i in list){
        if(i % 2 == 0){
            result += i
        }
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(filterEven(list))
    val even = list.filter { it % 2 == 0 }
    val greaterThan2 = list.filter { it > 2 }

    val isEven = {e: Int -> e % 2 == 0}
    val even2 = list.filter(isEven).sum()
}