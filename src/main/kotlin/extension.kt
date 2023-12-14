
fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

fun main() {
    val test = "test"
    println(test.singleQuote())
    println(test.doubleQuote())
}