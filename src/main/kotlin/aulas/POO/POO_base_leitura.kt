package aulas.POO


class People(val ano:Int, var nome:String){
    var idade = 2023 - ano
    fun saudacao(){
        println("Seja bem vindo ${this.nome}")
    }
    fun acordar(x:Boolean){
        if (x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O ${this.nome} está dormindo")
        }
    }
}

fun main() {
    print("Digite o ano de nascimento da pessoa: ")
    var x = readLine()?.toInt() ?: 0
    print("Digite o nome da pessoa: ")
    var n = readln()
    print("A pessoa está acordada? ")
    var d = readln().lowercase()

    var pessoa = People(x,n)
    println(pessoa.ano)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
    pessoa.saudacao()

    if(d == "sim"){pessoa.acordar(true)}
    else{pessoa.acordar(false)}
}