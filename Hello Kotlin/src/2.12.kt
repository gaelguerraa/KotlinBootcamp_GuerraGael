fun main() {


    val numbers = arrayOf(11, 12, 13, 14, 15)
    val stringList = mutableListOf<String>()

    for (number in numbers) {
        stringList.add(number.toString())
    }

    println("Lista de strings: $stringList")

    val divisibleBySeven = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) {
            divisibleBySeven.add(i)
        }
    }

    println("Números divisibles entre 7 del 0 al 100: $divisibleBySeven")
}
