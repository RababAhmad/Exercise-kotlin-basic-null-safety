fun main() {


   // var garde:Int = 8

   // garde = null

    var cityName:String? = "Aberdeen"


    println(cityName?.length)

    cityName = null

    //elvis opertoer
    val cityLength = cityName?.length ?: "0"
    println(cityLength)

    scoreNum(99.0)
    scoreNum(null)

    }


// function with nullable parameter

fun scoreNum( score:Double?) {
    val result = score?.let {
        "score is ${score}"
    } ?: "no score"
    println(result)
}