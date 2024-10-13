package aulas.tratamentodedados

fun main() {
    a(10.888)
    b()
    c()
}

fun a(valor: Any){
    println("Imprimindo o valor $valor")
}

fun b(){
    println("Função sem retorno (Void)")
}

fun c():Nothing{
    TODO("Função ainda a ser completado")
    // A -> B
}
