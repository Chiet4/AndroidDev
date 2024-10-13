package aulas.tratamentodedados

fun main() {
    var nome: String? = null
    nome = "Alban"
        if (nome != null) {
            println("Caiu no IF")
        }
    nome?.let {
        println("Caiu no LET")
    }

}