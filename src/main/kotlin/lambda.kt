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
}