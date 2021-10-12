fun main(){
    println("Welcome to the game!")
    Thread.sleep(1000)
    challengeOne()
}

// Solve a riddle
fun challengeOne(){
    val correctAnswer = setOf("One", "Two")

    println("For you're first challenge you will have to solve this riddle!")
    Thread.sleep(1000)
    println("What is ...? ")
    val userAnswer = readLine()!!
    determineWinner(userAnswer, correctAnswer )
}

fun determineWinner(userAnswer: String?, correctAnswer: Set<String>){
    if (correctAnswer.contains(userAnswer)) {
        println("You won")
        Thread.sleep(1000)
        challengeTwo()
    } else {
        gameOver()
    }
}

// minigame
fun challengeTwo(){
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low" && (1..3).contains(diceResult)) {
        // win
    } else if (userAnswer == "high" && (4..6).contains(diceResult)){
        // win
    } else {
        // game over
    }

    println("For you're second challenge you will have to predict a dice roll!")
    Thread.sleep(1000)
    println("Pick between 'low' and 'high'")

    //if (readLine() == null) {
    //    Thread.sleep(3000)
    //    println("So... what is you're prediction?")
    //}
}

fun gameOver(){
    println("You lost")
    Thread.sleep(500)
    println("Game over")
}

