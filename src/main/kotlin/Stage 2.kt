fun main() {

    val name = "Aid"
    val birthYear = 2022
    chatBootMessage(name,birthYear)
    val username = readlnOrNull()
    if (username != null) {
        chatBootGreating(username)
    }else{
        println("We have an error")
    }

}

fun chatBootMessage(name:String, birthYear:Int){
    println("Hello! My name is $name.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}
fun chatBootGreating(username:String){
    println("What a great name you have, $username!")
}