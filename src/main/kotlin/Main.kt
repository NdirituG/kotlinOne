fun main() {
    println("Hello World!")
    println("this is my first Kotlin code!! am so happy!!!")
    //fun is a Kotlin keyword showing that a function has been written.
    //var or val used to declare variables. var can be changed while val cannot
    var name = "Denis"
    val birthDate = "2001"
    println("My name is $name and was born in the year $birthDate.")

    //variables can also be written as such to specify datatypes
    var school:String = "Gretsa"
    var age1:Int = 21
    println("I am at $school university at the age of $age1")

    var one = "Duncan"
    var two = "Ndiritu"
    println("$one $two")

    val border = "'-._,-'"
    val timesToRepeat = 4
    fun createBorder(border: String,timesToRepeat: Int){
        repeat(timesToRepeat){
            print(border)
        }
        println("")
    }
    createBorder(border, timesToRepeat)
    println("Happy Birthday, Jhansi!")
    createBorder(border, timesToRepeat)

    var age = 24
    var layers = 5
    fun printCakeTop(age:Int){
        repeat(age + 2){
            print("=")
        }
        println()
    }
    fun printCakeCandles(age:Int){
        print(" ")
        repeat(age){
            print(",")
        }
        println()//print an empty line

        print(" ")
        repeat(age){
            print("|")
        }
        println()
    }

    fun printCakeBottom(age:Int, layers:Int){
        repeat(layers){
            repeat(age + 2){
                print("@")
            }
            println()
        }
    }
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    }