package aulas.herancaKotlin

// Escopo classe e Escopo Objeto

class matematica() {
    companion object M { // Uma classe só pode ter um companion object, o mesmo pode executar sem nome;
        val PI = 3.1415
        fun adc() {

        }
        init {
            println("Iniciando companion")
        }
    }

    object obt01 {
        val PI = 3.1415
        fun adc() {}
        init {
            println("Iniciando objeto 01")
        }
    }

    object obt02 {
        val PI = 3.1415
        fun adc() {}
        init {
            println("Iniciando objeto 02")
        }
    }
}

fun main() {
    matematica.PI // está no companion
    //matematica.adc()
    var M:matematica = matematica()

    println("Acessando objeto 01 ${matematica.obt01.PI}")
    println("Acessando objeto 02 ${matematica.obt02.PI}")
    matematica.PI // obt 01
    matematica.PI // obt 02
    matematica.PI // nao imprimi
}