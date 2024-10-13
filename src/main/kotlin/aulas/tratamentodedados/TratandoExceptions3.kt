package aulas.tratamentodedados

import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun ler_arquivo(){
    val arquivo = File("E:\\Irede\\AndroidDev\\src\\main\\kotlin\\aulas\\tratamentodedados\\Vida")
    try {
        Scanner(arquivo).use {
            while (it.hasNext()) {
                println(it.next())
            }
            it.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")
    }

}

fun main() {
    ler_arquivo()
}