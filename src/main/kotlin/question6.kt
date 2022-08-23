fun main() {
    var add = cal('+', 111, 123, -6)
    println(add)

    var sub = cal('-', 123, 99, -5)
    println(sub)

    var mul = cal('*', 234, 87, -7)
    println(mul)

    var div = cal('/', 678, 4)
    println(div)
}

fun cal(c: Char, vararg numArray: Int) : String? {
    when(c) {
        '+' -> {
            var res = 0
            var nums = ""
            for(num in numArray) {
                res += num
                nums += "$num "
            }
            return "Addition of " + nums + " is $res"
        }

        '-' -> {
            var res = 2 * numArray[0]
            var nums = ""
            for (num in numArray) {
                res -= num
                nums += "$num "
            }
            return "Subtraction of " + nums + " is $res"
        }

        '*' -> {
            var res = 1
            var nums = ""
            for (num in numArray) {
                res *= num
                nums += "$num "
            }
            return "Multiplication of " + nums + " is $res"
        }

        '/' -> {
            var res = numArray[0] * numArray[0]
            var nums = ""
            for (num in numArray) {
                res /= num
                nums += "$num "
            }
            return "Division of " + nums + " is $res"
        }
    }

    return null
}