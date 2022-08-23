fun main() {
    print("Enter Number: ")
    var n = readLine()!!.toInt()

    println(
        if(n % 2 == 0) {
            "$n is even"
        } else {
            "$n is odd"
        }
    )
}