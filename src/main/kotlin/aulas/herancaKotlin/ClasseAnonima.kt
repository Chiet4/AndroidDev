package aulas.herancaKotlin


interface Evento{
    fun ok(){}
}

class Programa{
    fun salvar(v:Evento){
        println("Abrindo arquivos")
        println("Salvando valores")
        println("Salvando arquivos")
        println("Conexões salvas")
        v.ok()
    }

}
//
//class Event():Evento{
//    override fun ok() {
//        println("Programa está ok")
//    }
//}

fun main() {
    val p:Programa = Programa()
    //val e:Event = Event()

    p.salvar( object : Evento{ //CLASS ANONIMA, uma forma de modificar uma função de uma interface sem implementá la
        override fun ok() {
            println("Programa está ok")
        }
    })
}