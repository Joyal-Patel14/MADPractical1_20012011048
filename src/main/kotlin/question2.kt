fun main() {
    var a : Int = 20
    println("Integer value: $a")

    var b : Double = a.toDouble()
    println("Double value from int: $b")

    var c : String = "100"
    println("String value: $c")

    var d : Int = c.toInt()
    println("Int value from string: $d")

    var e : Double = c.toDouble()
    println("Double value from string: $e")
}