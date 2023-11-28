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