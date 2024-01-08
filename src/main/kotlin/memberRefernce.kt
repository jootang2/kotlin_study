data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean
)

fun main() {
    val messages = listOf(
        Message("SJH", "HI KMJ", false),
        Message("KMJ", "HI SJH", true),
    )
    val unread = messages.filterNot (Message::isRead)
    val read = messages.filter (Message::isRead)
    println(unread)
    println(read)


}