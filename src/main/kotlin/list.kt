fun main() {
    val list1: MutableList<Int>  = mutableListOf()
    val list2: MutableList<Int>  = mutableListOf()
    val list3: MutableList<Int>  = mutableListOf()
    add1(list1)
    println(list1)

    add2(list2)
    println(list2[0])

    add3(list3)
    println(list3)


}

fun add1(list :MutableList<Int>) : MutableList<Int> {
    val _list = list.toMutableList()
    _list.add(10000)
    return _list
}

fun add2(list :MutableList<Int>) : MutableList<Int> {
    val _list = list
    _list.add(10000)
    return _list
}

fun add3(list :MutableList<Int>) : MutableList<Int> {
    list.add(10000)
    return list
}