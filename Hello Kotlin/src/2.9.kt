fun main() {

    //t1
    val trout = "trucha"
    val haddock = "abadejo"
    val snapper = "pargo"

    println("Sí me gusta comer $trout")
    println("No me gusta comer $haddock")
    println("Sí me gusta comer $snapper")

    // t2
    val fishName = trout

    when (fishName.length) {
        0 -> println("Error: el nombre del pez está vacío")
        in 3..12 -> println("Buen nombre de pez")
        else -> println("Nombre de pez aceptable")
    }
}
