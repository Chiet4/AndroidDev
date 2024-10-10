package aulas.ControleDeFluxos

// pode ser usado facilmente em menu ou escolhar de resultados já setados
fun main() {
    var cargo: String = "Presidente"
        when(cargo) {
            "Gerente" -> println(4500f)
            "Presidente" -> println(6000f)
            "Coordenador" -> println(3000f)
            "Analista" -> println(2400f)
            "Estágiario" -> println(1600f)
            else -> println("Cargo não identificado")
        }
}