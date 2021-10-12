fun main(){
    println("Welcome to the game!")
    Thread.sleep(1000)
    challengeOne()
}

// Solve a riddle
fun challengeOne(){
<<<<<<< HEAD
<<<<<<< Updated upstream
    val correctAnswer = listOf("One", "Two")
=======
    val correctAnswer = setOf<String>("One", "Two")
>>>>>>> Stashed changes
=======
    val correctAnswer = setOf("One", "Two")
>>>>>>> f61f591862aa8d782f8c36e32f23f4fd2b9dc27a

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
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
=======
>>>>>>> f61f591862aa8d782f8c36e32f23f4fd2b9dc27a
}

// minigame
fun challengeTwo(){
<<<<<<< HEAD

    println("For you're second challenge you will have to predict a dice roll!")
    Thread.sleep(1000)
    println("Pick between 'low' and 'high'")

=======
>>>>>>> f61f591862aa8d782f8c36e32f23f4fd2b9dc27a
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low" && (1..3).contains(diceResult)) {
        // win
<<<<<<< HEAD
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
=======
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
>>>>>>> f61f591862aa8d782f8c36e32f23f4fd2b9dc27a
}

fun gameOver(){
    println("You lost")
    Thread.sleep(500)
    println("Game over")
}

