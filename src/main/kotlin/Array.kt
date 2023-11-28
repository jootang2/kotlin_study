fun main(){
    var array : Array<Int> = arrayOf(100, 200)
    useIndex(array)
    useWithIndex(array)
    array = array.plus(300)
    println("================배열에 .plus() 메소드를 통해 원소 추가=====================")
    useIndex(array)
    useWithIndex(array)
}
/**index를 이용해서 배열의 값 출력*/
private fun useIndex(array: Array<Int>) : Unit{
    println("index를 이용해서 배열의 값 출력")
    for(i in array.indices){
        println("index : $i , value : ${array[i]}")
    }
    println()
}
/**index와 value를 한번에 받아서 출력*/
private fun useWithIndex(array: Array<Int>) : Unit{
    println(".withIndex()를 이용해서 배열의 값 출력")
    for((i, value) in array.withIndex()){
        println("index : $i , value : $value")
    }
    println()
}
