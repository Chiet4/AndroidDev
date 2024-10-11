package aulas.ControleDeFluxos

fun main() {
    Impressao()
    println(soma(12, 13))
    soma_2(15, 11)
}

fun Impressao(){
    println("Função sem parametro e sem retorno")
}

fun soma(a: Int, b: Int): Int { // Funcao com paramentro e retorno
    return a + b
}

fun soma_2(a: Int, b: Int){
    println("A soma dos parametros são: ${a+b}")
}