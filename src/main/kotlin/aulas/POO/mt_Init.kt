package aulas.POO

class Animal_(var especie:String){
    var fala: String = ""
    init{
        fala = if (especie.lowercase() == "cachorro"){
            "auau"
        }else if(especie.lowercase() == "gato"){
            "miaumiau"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }
}

fun main(){
    val animal_ = Animal_("Cachorro")
    Animal_("Gato").falar()
    Animal_("Cachorro").fala
}