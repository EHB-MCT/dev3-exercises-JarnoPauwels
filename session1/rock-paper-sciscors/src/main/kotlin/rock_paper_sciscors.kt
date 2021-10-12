fun main(){
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()

    println("Your choice: ")
    val userChoice = readLine()!!
    determineWinner(computerChoice, userChoice)
    println("computer's choice was: $computerChoice")
}

fun determineWinner(computerChoice: String, userChoice: String?){
    if(computerChoice == userChoice) {
        println("It's a draw")
        return
    }

    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when (computerChoice) {
        "rock" -> if(userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if(userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> if(userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}