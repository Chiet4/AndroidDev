package aulas.POO

class OBJT(){
    fun amanhecer(h:Int){
        if(h<=4 && h>=0){
            println("Está de madrugada")
        }else{
            println("Está de dia")
        }
    }
    fun acordar(h:Int){
        if(h==0){
            println("Está dormindo")
        }else{
            println("Está acordado")
        }
    }
}

fun main(){
    var obj = OBJT()
    obj.amanhecer(5)
    obj.acordar(5)

    println("--------------------------------------------")
    with(obj){ // Acessa as funções diretamente, já que instancia o elemento no parametro
        amanhecer(5)
        acordar(5)
    }
}