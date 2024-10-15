package aulas.herancaKotlin


abstract class Mamifero(var nome:String ){
    abstract fun habitat()
    abstract fun acordar()
    abstract fun fala()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}

class cachorro( nome: String): Mamifero(nome){
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

}

fun main() {

    var d: cachorro = cachorro("Cachorro")
    with(d) {
        tempo()
        acordar()
        fala()
        habitat()
        alimentacao()
    }

}