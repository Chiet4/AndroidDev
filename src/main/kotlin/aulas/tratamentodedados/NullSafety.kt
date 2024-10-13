package aulas.tratamentodedados

fun main() {
    var str: String? = null
    println(str?.length) // O kotlin faz o tratamento da exception

    str = "Teste"
    println(str!!.length) // Eu trato a exception
    println("O codigo não quebra.")
}