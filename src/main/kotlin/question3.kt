fun main() {
    print("Enter enrollment no.: ")
    var en = readLine()!!.toLong()

    print("Enter name: ")
    var name = readLine()

    print("Enter branch: ")
    var branch = readLine()

    print("Enter class: ")
    var cl = readLine()

    print("Enter batch: ")
    var batch = readLine()

    print("Enter age: ")
    var age = readLine()!!.toInt()

    print("Enter college: ")
    var clg = readLine()

    print("Enter university: ")
    var uni = readLine()


    println()
    println("****************************")
    println()

    println("Student Data:")
    println("Enrollment No.: $en")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $cl")
    println("Batch: $batch")
    println("Age: $age")
    println("College: $clg")
    println("University: $uni")
}