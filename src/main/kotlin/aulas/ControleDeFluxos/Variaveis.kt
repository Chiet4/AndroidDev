package aulas.ControleDeFluxos

// var - tipo de variavel mutavel
// val - tipo constante, imutavel

fun main() {
    var x: Int = 12
    val y: Int
    var a: Float = 12.32f
    var b: Double = 12.43
    var c: Long = 101010100101
    var d: Char = 'F'
    var e: String = "palavras"
    var f: Short = 100
    var g: Byte = 0b11
    var h: Byte = 0x10
    var i: UInt = 12u // unsigned

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)

    println("------------------------------------------")
    println("Capacidade de variaveis")
    capacidade()

    println("------------------------------------------")
    println("Constantes")
    constantes()

}

fun capacidade() {
    println("ULong máximo: ${ULong.MAX_VALUE} ULong mínimo: ${ULong.MIN_VALUE}")
    println("UInt máximo: ${UInt.MAX_VALUE} UInt mínimo: ${UInt.MIN_VALUE}")
    println("UShort máximo: ${UShort.MAX_VALUE} UShort mínimo: ${UShort.MIN_VALUE}")
    println("Long máximo: ${Long.MAX_VALUE} Long mínimo: ${Long.MIN_VALUE}")
}

fun constantes() {
    val t:Int = 19
    val str: String = "Total"

    // São constantes logo não podem ser alteradas depois de definidas
    //t++
    //str += " somando"

    // tipo boolean, pode ser usada como flag
    var b:Boolean = false

    println(t)
    println(str)
    println(b)
}