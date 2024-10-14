package aulas.herancaKotlin

open class eletronico (marca:String){
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Desligado")
    }
    var modelo:String = "Teste de herança"
}

class Computador(marca:String): eletronico(marca){
    fun instalarSoftware(){
        println("Instalando Software no computador...")
    }
    fun varredura(){
        println("Fazendo varredura no computador...")
    }
}

fun main() {
    var c:Computador= Computador("Dell")
    with(c){
        ligar()
        instalarSoftware()
        varredura()
        println(modelo)
        desligar()
    }
}