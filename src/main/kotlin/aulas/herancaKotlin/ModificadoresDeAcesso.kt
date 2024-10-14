package aulas.herancaKotlin


open class eletronic(marca:String){
    private fun ativarCorrente(){
    }

    protected fun relogio(){
        println("contando tempo...1..2..")
    }
    var modelo:String = "Teste de herança"
    private var F:String = "Testando..."

    fun ligar(){
        println("ligando...")
    }
    fun desligar(){
        println("Desligado")
    }
}

class computador(marca: String) : eletronic(marca) {
    fun InstalarSoftware(){
        println("Instalando softwares no computador...")
        relogio()
    }
    fun varredura(){
        println("Realizando varredura no computador...")
    }
}

fun main() {
    var c:computador = computador("Dell")

    with(c){
        ligar()
        println(modelo)
        InstalarSoftware()
        varredura()
        desligar()
    }

    var te:F = F()
    println(te.teste)
}

private class F(){ // está restrita somente ao arquivo
    var teste:String = "Classe F"
}


