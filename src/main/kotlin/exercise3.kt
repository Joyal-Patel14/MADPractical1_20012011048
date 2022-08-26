open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Joyal","Patel",20,1,"CE","C","AB7")
    var s2=Student("Het","Kikani",20,2,"CE","C","AB7")
    var s3=Student("Ravi","Gohel",21,3,"CE","C","AB7")
    var s4=Student("Aryan","Patel",20,4,"CE","C","AB8")
    var s5=Student("Prasanna","Pandit",20,5,"CE","C","AB8")

}