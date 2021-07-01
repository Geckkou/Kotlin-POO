package curso.poo.kotlin.teste

import curso.poo.kotlin.Cliente
import curso.poo.kotlin.ClienteTipo

fun main() {
    val client = Cliente(nome = "Gerald'd Rívia",
        cpf = "345.456.789-89",
        clienteTipo = ClienteTipo.PF,
        senha = "1234")

    println(client)
    TesteAutenticacao().autentica(client)
}

