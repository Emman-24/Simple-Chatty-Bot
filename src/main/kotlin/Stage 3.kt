fun main() {

    val name = "Aid"
    val birthYear = 2022
    chatBootMessage(name,birthYear)
    val username = readlnOrNull()
    if (username != null) {
        chatBootMessage2(username)
    }else{
        println("We have an error")
    }

    chatBootGuessAge()

}

fun chatBootMessage2(username:String){
    println("What a great name you have, $username!")
}

fun chatBootGuessAge(){
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()

    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")

}