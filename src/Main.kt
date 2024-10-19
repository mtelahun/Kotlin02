fun main() {
    showGreeting()
    showGreeting("Mike")
    showGreeting("John", 3)
}

fun showGreeting() {
    println("Welcome !")
}

fun showGreeting(name: String, city: String="London") {
    println("Welcome $name, from $city!")
}

fun showGreeting(name: String, count: Int) {
    println("Welcome $name, your index is $count!")
}
