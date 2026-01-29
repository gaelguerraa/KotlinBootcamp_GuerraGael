fun main() {

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy"))
    println(whatShouldIDoToday("happy", "Sunny", 30))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24
): String {

    return when {
        mood == "happy" && weather == "Sunny" && temperature > 25 ->
            "go for a walk"

        mood == "happy" && weather == "Sunny" ->
            "go for a walk"

        mood == "sad" ->
            "Stay home and read."

        else ->
            "Stay home and read."
    }
}
