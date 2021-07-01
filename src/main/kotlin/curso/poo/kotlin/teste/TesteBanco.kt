package curso.poo.kotlin.teste

import curso.poo.kotlin.Banco

fun main() {
    val bank = Banco(nome = "Santander",numero = 12)
    println(bank.nome)
    println(bank.numero)

    val bank2 = bank.copy(nome = "Nubank", numero = 45)
    println(bank2.info())
}