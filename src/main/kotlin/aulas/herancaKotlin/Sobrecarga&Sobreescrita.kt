package aulas.herancaKotlin

open class Eletronicos(var marca:String){
    private fun corrente(ativo:Boolean){

    }
    open fun ligar(){
        corrente(true)

    }
    open fun desligar(){
        corrente(false)
    }
}

class PC(marca: String): Eletronicos(marca){
    fun salva(){
        println("salva")}

    override fun desligar() {
        salva()
        super.desligar()
    }

    override fun ligar() {
        super.ligar()
    }
}

class SmartTv(marca: String):Eletronicos(marca){
    override fun ligar() {
        super.ligar()
    }

    override fun desligar() {
        super.desligar()
    }
}

// funções com mesmo nome, porém com escrita diferente(tem parametros)
// Sobrecarga de metodos

fun salvar(){}
fun salvar(a:Int){}
fun salvar(a:Int, b:Int){}
fun salvar(a: String, b:Int){} // sobrecarga de metodos exige tipos de paramentros diferentes também

fun main() {
    var pc:PC = PC("Dell")
    pc.ligar()
    pc.salva()
    pc.desligar()
}