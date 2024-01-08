fun main() {
    println("==================== List ========================")
    val numbers: List<Int> = listOf<Int>(100, 200)

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()){
        println("$idx: $value")
    }

    val mutableListNumbers = mutableListOf<Int>(100, 200)

    val list1 = List(10) {it}
    val mutableList = MutableList(5) { it + 1 }
    val (pos, neg) = list1.partition { it > 0 }
    println("pos : $pos")
    println("neg : $neg")



    println(list1.takeLast(3))
    println(list1)
    val list2 = list1.takeLastWhile { it > 5 }
    println(list2)
    println(list1.takeLastWhile { it > 7 })

    println("==================== Set ========================")






    println("==================== Map ========================")
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }


    println("==================== Collection - null ========================")


}