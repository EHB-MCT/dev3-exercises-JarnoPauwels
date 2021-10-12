fun main(){
    println("Welcome to the game!")
    Thread.sleep(1000)
    challengeOne()
}

// Solve a riddle
fun challengeOne(){
    val correctAnswer = listOf("One", "Two")

    println("For you're first challenge you will have to solve this riddle!")
    Thread.sleep(1000)
    println("What is ...? ")
    val userAnswer = readLine()!!
    determineWinner(userAnswer, correctAnswer )
}

fun determineWinner(userAnswer: String?, correctAnswer: List<String>){
    if (correctAnswer.contains(userAnswer)) {
        println("You won")
        Thread.sleep(1000)
        challengeTwo()
    } else {
        gameOver()
    }
}

// Solve a riddle
fun challengeTwo(){
    //val low = arrayOf(1, 2, 3)
    //val high = arrayOf(4, 5, 6)


    println("For you're second challenge you will have to predict a dice roll!")
    Thread.sleep(1000)
    println("Pick between 'low' and 'high'")
    val userAnswer = readLine()!!
    rollDice()
    //if (readLine() == null) {
    //    Thread.sleep(3000)
    //    println("So... what is you're prediction?")
    //}

}

fun rollDice (){
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    val randomNumber = numbers.random()
    println(randomNumber)
    if (randomNumber < 4) {
        println("low")
    } else {
        println("low")
    }
}

fun gameOver(){
    println("You lost")
    Thread.sleep(500)
    println("Game over")
}

