package curso.poo.kotlin.teste

import curso.poo.kotlin.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        elemento -> println("${elemento.name} - ${elemento.description}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.description}")
}