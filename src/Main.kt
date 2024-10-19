val fruits: MutableList<String> = mutableListOf("Banana", "Apple", "Mango")

fun main() {
    println("Size of the fruits is ${fruits.size}")

    fruits.forEach {
        i -> println("This is $i")
    }
    fruits.add("Orange")
    println("Size of fruits is ${fruits.size}")
    fruits.forEach {
        i -> println("This is $i")
    }
}
