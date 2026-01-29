fun main(){
    //T1
    val fish = 2.plus(71).plus(233).minus(13)
    val aquariums = fish.div(30)

    println("numero de peces: $fish")
    println("aquarios necesarios: $aquariums")

    //T2
    var rainbowColor = "Red"
    rainbowColor = "Blue"   // se puede cambiar

    val blackColor = "Black" // no se puede cambiar

    //T3
    //rainbowColor = null // NO se puede cambiar

    var greenColor: String? = null //ya lo podemos nullear, el ? lo indica
    var blueColor: String? = "Blue"
    blueColor = null

    //t4
    //listas de elementos null
    val list1 = listOf(null, null)
    val list2 = listOf<String?>(null, null)

    //lista que puede ser nula
    val nullList: List<String>? = null

    //t5
    val nullTest: Int? = null

    val result = nullTest?.plus(1) ?: 0
    println(result)


}