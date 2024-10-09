package aulas.ControleDeFluxos

fun main() {
    // Classifique as pessoas através da faixa etária
    // Idoso - 60 anos acima | Adulto 21 a 59 anos | Jovem entre 13 a 20
    // Criança 12 anos abaixo
    var idade: Int = 80

    if (idade < 13) {
        println("Criança")
    }
    else if(idade >= 13 && idade <= 20) {
        println("Jovem")
    }
    else if(idade >= 21 && idade <= 59) {
        println("Adulto")
    }
    else{
        println("Idoso")
    }
}