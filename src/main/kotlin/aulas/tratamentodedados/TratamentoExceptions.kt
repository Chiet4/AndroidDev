package aulas.tratamentodedados

import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 0
    try {
        val res = (numerador/denominador)
        println("Resultado: $res")
    }catch (ex:ArithmeticException){
        println("Erro: Não existe divisão por zero.")
    }
    val numero = 4.0
    try {
        val res = sqrt(numero)
        if (numero < 0){
            throw ArithmeticException()
        }
        println("Resultado: $res")
    }catch (ex:ArithmeticException){
        println("Não existe raiz real de numeros negativos")
    }
}