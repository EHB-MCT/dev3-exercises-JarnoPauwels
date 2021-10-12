fun main(){
    println("Welcome to the game!")
    Thread.sleep(1000)
    challengeOne()
}

// Solve a riddle
fun challengeOne(){
    val correctAnswer = listOf("One", "Two")

    println("Solve this riddle")
    Thread.sleep(1000)
    println("What is ...")
    val userAnswer = readLine()!!
    determineWinner(userAnswer, correctAnswer )
}

fun determineWinner(userAnswer: String?, correctAnswer: List<String>){
    if (correctAnswer.contains(userAnswer)) {
        println("You won")
        Thread.sleep(500)
        challengeTwo()
    } else {
        gameOver()
    }

}

fun gameOver(){
    println("You lost")
    Thread.sleep(500)
    println("Game over")
}

