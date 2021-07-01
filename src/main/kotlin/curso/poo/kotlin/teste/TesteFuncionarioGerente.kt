package curso.poo.kotlin.teste


import curso.poo.kotlin.Gerente

fun main() {

    val func = Gerente("Alexandre","345.867.789-11", 4000.00,"senha123")
    RelatorioFuncionario.relatorio(func)

    TesteAutenticacao().autentica(func)
}

