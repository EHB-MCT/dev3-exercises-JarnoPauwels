fun main(){
    println("Welcome to the game!")
    Thread.sleep(1000)
    challengeOne()
}

// Solve a riddle
fun challengeOne(){
<<<<<<< Updated upstream
    val correctAnswer = listOf("One", "Two")
=======
    val correctAnswer = setOf<String>("One", "Two")
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
=======
}

// minigame
fun challengeTwo(){

    println("For you're second challenge you will have to predict a dice roll!")
    Thread.sleep(1000)
    println("Pick between 'low' and 'high'")

    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low" && (1..3).contains(diceResult)) {
        // win
        challengeThree()
    } else if (userAnswer == "high" && (4..6).contains(diceResult)){
        // win
        challengeThree()
    } else {
        // game over
        gameOver()
    }


>>>>>>> Stashed changes

}

fun challengeThree(){
    //val weapon = arrayOf("Sword", "Axe", "Bow")
    println("Pick a weapon, choose between 'Sword', 'Axe' or 'Bow'")
    val userAnswer = readLine()
    if (userAnswer == "Sword") {
        // win
        println("You Win")
        challengeFour()
    } else if(userAnswer == "Axe"){
        // flee
        println("You flee to the previous Challenge")
        challengeTwo()
    } else if (userAnswer == "Bow") {
        // game over
        println("You died")
        gameOver()
    } else{
        //game over
        println("You died")
        gameOver()
    }
}

fun challengeFour(){
    println("Welcome to challenge four")
}

fun gameOver(){
    println("You lost")
    Thread.sleep(500)
    println("Game over")
}

