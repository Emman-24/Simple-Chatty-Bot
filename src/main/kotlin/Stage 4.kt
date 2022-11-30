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
    chatBootCount()

}


fun chatBootCount(){
    println("Now I will prove to you that I can count to any number you want.")
    val  countNumber = readln().toInt()
    repeat(countNumber +1){
        println("$it!")
    }
    println("Completed, have a nice day!")

}
