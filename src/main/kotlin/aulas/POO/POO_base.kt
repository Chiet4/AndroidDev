package aulas.POO

class Pessoa(val ano: Int, var nome: String) {
    var idade = 2023 - ano
    fun saudacao() {
        println("Seja bem vindo ${this.nome}")
    }

    fun acordar(x: Boolean) {
        if (x == true) {
            println("O ${this.nome} está acordado")
        } else {
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    var pessoa = People(1993, "Joao")
    println(pessoa.ano)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()
    pessoa.acordar(true)
}