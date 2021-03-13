fun main() {
    school()
    data("Loyce Velma ", 18 )
    shoes("LOVING LOYCE")


    me ("Loyce")



}
fun school(){
    var school="Akirachix"
    print(school[0])
    print(school[2])
    println(school[3])

}
fun data (name:String,age:Int) {
    println("Hi, my name is $name  I am $age years old")

}

fun  shoes (message:String){
    var length = message.length
    println(length)



}
fun me  (name:String) {
    if (name == "Loyce") {
        print("That's me !")
    }


    else {
        println("i dont know who that is")
    }

}