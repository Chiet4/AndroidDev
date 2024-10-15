package aulas.herancaKotlin


/*/  Com interface
interface dev{
    var salario:Float
    fun bonus():Float
}

class mobile(override var salario:Float): dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(override var salario: Float): dev{
    override fun bonus(): Float {
        return salario*0.6f
    }
}
class back(override var salario: Float): dev{
    override fun bonus(): Float {
        return salario*0.5f
    }
}
// SEM POLIMORFISMO
fun mostrar_bonus(m:mobile){
    println(m.bonus())
}
fun mostrar_bonus(g:game){
    println(g.bonus())
}
fun mostrar_bonus(b:back){
    println(b.bonus())
}

*/


fun main() {
    mostrar_bonus(mobile(1000f))
    mostrar_bonus(game(1000f))
    mostrar_bonus(back(1000f))

}

// modelo com class abstrata e com POLIMORFISMO
abstract class dev(var salario:Float){
    abstract fun bonus():Float
}

class mobile(salario:Float): dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(salario: Float): dev(salario){
    override fun bonus(): Float{
        return salario*0.6f
    }
}
class back(salario: Float): dev(salario){
    override fun bonus(): Float {
        return salario*0.5f
    }
}
fun mostrar_bonus(dev: dev){
    println(dev.bonus())
}
