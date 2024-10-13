package aulas.tratamentodedados

import kotlin.math.sqrt

fun main() {
    try {
        var s:String? = null
        //s = "Felipe"
        println("O tamanho da String é: ${s!!.length}")

        var a: Int = 10/0
        println("O resultado da divisão será ${a}")

        var b = -9.0
        var c:Double = sqrt(b)
            if(b < 0){
                throw IllegalArgumentException()
            }

        var x = 1
            if(x==1){
                throw Exception("O valor de X não pode ser 1")
            }

    }catch (e:NullPointerException){
        println("A variavel está vázia")
    }catch (e:ArithmeticException){
        println("Não existe divisão por zero")
    }catch (e:IllegalArgumentException){
        println("Não exite raiz de numeros negativos, é exclusico dos numeros complexos")
    }catch (e:Exception){
        println("Excerção geral: ${e.message}")
    }finally {
        println("Executando finally, finalizando bloco de codigo")
    }

    println("Continuando execução do programa!")
}