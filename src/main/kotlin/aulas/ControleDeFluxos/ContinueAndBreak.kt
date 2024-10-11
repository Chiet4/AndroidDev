package aulas.ControleDeFluxos

fun main() {
    var i =0
    while (i < 1000) {
        if (i == 20) {
            break //para a iteração como base em uma requisição logica
        }
        print("$i ")
        i++
    }
    println()
    var str = "Teste de perfil"
    var j =0
        while (j< str.length) {
            if (str[j] == 'r') {
                break
            }
            print("${str[j]} ")
            j++
        }

    println()

    for (i in 0 ..20 ){
        if (i%2== 1) {
            continue
        }
        print("$i ")
    }
}