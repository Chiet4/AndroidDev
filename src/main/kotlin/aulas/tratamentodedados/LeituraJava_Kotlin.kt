package aulas.tratamentodedados

import java.util.Scanner

fun ler_int(){
    val l = Scanner(System.`in`)
    print("Digite um numero int: ")
    val num = l.nextInt()
    println("Você digitou ${num}")

}

fun ler_double(){
    val l = Scanner(System.`in`)
    print("Digite um numero double: ")
    val num = l.nextDouble()
    println("Você digitou ${num}")

}

fun ler_String(){
    val l = Scanner(System.`in`)
    print("Digite um nome: ")
    val num = l.next()
    println("Você digitou ${num}")

}

fun ler_float(){
    val l = Scanner(System.`in`)
    print("Digite um numero float: ")
    val num = l.nextFloat()
    println("Você digitou ${num}")

}

fun main() {
    ler_int()
    ler_double()
    ler_String()
    ler_float()
    ler_boolean()
}

fun ler_boolean(){
    val l = Scanner(System.`in`)
    print("Digite um valor boolean: ")
    val num = l.nextBoolean()
    println("Você digitou ${num}")
    l.close()
}
