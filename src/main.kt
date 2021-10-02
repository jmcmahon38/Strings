fun main(args: Array<String>) {
    // questions -- array
    // answers -- array
    val question = arrayOf(
        "True or False: The Session Layer maintains connections, controlling ports, and sessions.\n",
        "True or False: An device that manages the IP address of a device operates at the Network Layer of the OSI Networking model\n",
        "True or False: Switches typically operate at the Data Link Layer or Network Layer of the OSI model\n",
        "True or False: Antivirus Software is usually run at Session layer of the OSI model\n",
        "True or False: Your browser operates at the Application Layer of the OSI model\n")
    val answers = arrayOf("True","True","True","False","True")
    var questionsAnswers = arrayOf<Array<String>>()
    questionsAnswers += question
    questionsAnswers += answers
    // user answers -- array
    // user score -- double
    var userAnswers = arrayOfNulls<String>(question.size)
    var userScore = 0
    val numberOfQuestions = questionsAnswers[0].size -1
    for (i in 0..numberOfQuestions) {
        print(questionsAnswers[0][i])
        userAnswers[i] = readLine().toString()
        if (userAnswers[i]?.contains(questionsAnswers[1][i], true) == true){
            userScore += 1
        }
    }
    println("Testing is done. your score is ${userScore}/5")
}
// ask questions

// check answer
// report card



// notes
//    var s1 = "thing2"
//    var s2 = "THING"
//    var result = s1.compareTo(s2, true)
//    if (result == 0)
//        println("They are the same")
//    else
//        println("They are not the same")
//
//    println(s2.lowercase().replaceFirstChar { it.uppercase() })
//    if (s1.isEmpty()){
//        println("this is empty")
//    } else if (s1.isBlank()) {
//        println("this is blank")
//    } else {
//        println("This is not blank or empty")
//    }
//    println("the length of this string is ${s2.length}")
//    println("The last character is: ${s2[s2.length-1].lowercase()}")
//
//    var result1 = s2.lowercase().indexOf('h')
//    println("index of h in s2: $result1")
//    println(s2.substring(3))
//
//    println(s1.contains("hi", true))
//    val s1Replacement = s1.replace("thing2", "other thing")
//    println( s1Replacement )








