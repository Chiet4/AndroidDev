package aulas.ControleDeFluxos


fun main() {
    for (i in 1..20) { // Estrutura crescente de 1 em 1
        print("${i} ")
    }
    println()

    for (i in 20 downTo 1) { // Descrescente com o downTo
        print("${i} ")
    }

    println()
    for (i in 20 downTo 1 step 2) { // Crescente tomando de 2 a 2 STEP
        print("${i} ")
    }

    println()
    for (i in 20 downTo 1 step 3) {
        print("${i} ")
    }
    println()
    println("Percorrendo uma String")
    val str = "Criação de Aplicativos Android"
    for (i in str) {
        print("${i}-")
    }
}