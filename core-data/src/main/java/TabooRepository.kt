
class TabooRepository {
    private val cards = listOf(
        TabooCard("Sun", listOf("Hot", "Sky", "Star", "Day", "Bright")),
        TabooCard("Apple", listOf("Fruit", "Red", "Tree", "Pie", "Mac")),
    )

    fun getAllCards(): List<TabooCard> = cards
}
