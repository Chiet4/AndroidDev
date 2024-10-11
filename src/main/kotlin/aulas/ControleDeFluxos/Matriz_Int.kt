package aulas.ControleDeFluxos

fun main() {
    val linhas = 5
    val colunas = 3
    val matriz: Array<Array<Int>> = Array(linhas) { Array(colunas) { 0 } }
    var di = -1

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            matriz[i][j] = ++di
        }
    }
    println("Impressão da matriz: ")
    for (linhas in matriz){
        for (valor in linhas){
            print("${valor} ")
        }
        println()
    }

    println("Quantidade de linhas da matriz: ${matriz.size}")
    println("Quantidade de colunas da matriz: ${matriz[0].size}")
}