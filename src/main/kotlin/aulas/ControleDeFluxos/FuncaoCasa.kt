package aulas.ControleDeFluxos

// funções dependentes

fun casa(){
    println("Entrando na casa...")
    quarto()
}
fun quarto(){
    println("Passando pelo quarto...")
    guarda_roupa()
}
fun guarda_roupa(){
    println("Abrindo o guarda-groupa...")
    sapato()
}
fun sapato(){
    println("Apanhando o sapato...")
    cadarco()
}
fun cadarco(){
    println("Amarrando o cadarco do sapato... Pronto para sair!/")

}

fun main() {
    casa()
}