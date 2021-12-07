class Duolingo(var roundSize: Int = 5, val language: String = "English") {
    var words = mutableSetOf<Word> (
        FrenchWord("vache", "koe"),
        FrenchWord("canard", "eend"),
        FrenchWord("bonjour", "hallo"),
        FrenchWord("chien", "hond"),
        FrenchWord("chat", "kat"),
        FrenchWord("café", "koffie"),
        EnglishWord("elephant", "olifant"),
        EnglishWord("table", "tafel"),
        EnglishWord("chair", "stoel"),
        EnglishWord("lion", "leeuw"),
        EnglishWord("grandfather", "grootvader"),
        EnglishWord("grandmother", "grootmoeder"),
    )

    // FrenchWord inherit van word

    init {
        words = words.filter { it.language == language }.toMutableSet()
    }

    init {
        println("Pick a difficulty: 'Easy', 'Hard'")
        val userAnswer = readLine()
        if (userAnswer == "Easy") run {
            roundSize = 3
        }else if (userAnswer == "Hard") run {
            roundSize = 6
        } else {
            throw Exception("You didn't pick a Difficulty")
            
        }
    }

    fun play() {
        val selectedWords =  words.shuffled().take(roundSize).toMutableSet() //= maakt het aanpasbaar (mutableset)

        while (selectedWords.count() > 0) {  //while er zolang er nog woorden zijn
            while (selectedWords.isNotEmpty()) { //blijven vragen tot het goede antwoord komt
                Thread.sleep(1000)
                val selectedWord = selectedWords.random()
            println("Translate: '${selectedWord.original}'")
            val userAnswer = readLine()
            if (userAnswer == selectedWord.translated) {
                //good
                Thread.sleep(500)
                println("Good job")
                selectedWords.remove(selectedWord)
            } else {
                //bad
                Thread.sleep(500)
                println("Wrong")
                Thread.sleep(500)
                println("Correct answer: '${selectedWord.translated}'")
            }

                Thread.sleep(300)
                println("Words left ${selectedWords.count()}") //hoeveel woorden er nog overblijven
                if (selectedWords.count() == 0){
                    println("The End")
                }
            }
        }
    }
}