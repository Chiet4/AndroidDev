package aulas.ControleDeFluxos

fun vetores_inteiros(){
    val numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in numeros) {
        print("${numeros[i]} ")
    }
    println()
    println("Acessando a sexta posição:${numeros[6]}")
}

fun vetores_numeros(){
    val numeros = Array(10,{i -> i})
    for (i in numeros) {
        print("${numeros[i]} ")
    }
    println()
}

fun vetores_bool(){
    val a = booleanArrayOf(true, false, true, false, false,true)
    for (i in a) {
        print("${i} ")
    }
    println()
}

fun vetores_string(){
    var s = arrayOf("a", "b", "c", "d", "e", "f", "g", "h")
    for (i in s) {
        print("${i} ")
    }
    println()
    println("Acessando o primeiro elemento: ${s[0]}")
}

fun main() {
    vetores_inteiros()
    vetores_numeros()
    vetores_bool()
    vetores_string()
}