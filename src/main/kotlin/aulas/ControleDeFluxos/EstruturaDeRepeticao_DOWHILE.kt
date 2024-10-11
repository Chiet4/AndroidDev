package aulas.ControleDeFluxos

fun main() {
    var i = 0
    do {
        print("$i ")
        i++
    }while (i != 10)

    while (i == 10) {
        print("Loop While")
        i++
    }

    println()
    do {
        println("Qual o seu nome? ")
        val nome = readLine().toString()
    }while (nome == "")
}