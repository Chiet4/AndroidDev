package aulas.herancaKotlin


interface selvagem{ // quando utilizado interface a gente implementa
    // interfaces não podem inicializar variaveis
    fun atacar(){
        println("O animal está prestes a atacar")
    }
}

interface quatro_patas{
    fun locomocao(){
        println("O animal se locomove em quatros patas")
    }
}


abstract class mamifero(var nome:String ){
    abstract fun habitat()
    abstract fun acordar()
    abstract fun fala()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}
// multiplas interfaces ...
class Cachorro( nome: String): mamifero(nome), selvagem, quatro_patas { // como é interface, a mesma somente implementa e não herdar, assim pode se ter n interfaces
    override fun acordar() {
        println("Cachorro está acordado")
    }

    override fun alimentacao() {
        println("cachorro come ração")
    }

    override fun fala() {
        println("AUAUAU")
    }

    override fun habitat() {
        println("Casa cachorro")
    }

    override fun atacar() {
        println("o cachorro está atacando")
    }

    override fun locomocao() {
        println("O cachorro se locomove em 4 patas")
    }
}

fun main() {
    //var m:Mamifero = mamifero() // class abstratas não podem ser instanciadas
    // serve para fazer molder, base de herança

    var d: Cachorro = Cachorro("Cachorro")
    with(d) {
        tempo()
        acordar()
        fala()
        habitat()
        alimentacao()
        atacar()
        locomocao()
    }
}