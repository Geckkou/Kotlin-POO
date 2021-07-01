package curso.poo.kotlin.teste

import curso.poo.kotlin.Funcionario

class RelatorioFuncionario {
    companion object {
        fun relatorio(func : Funcionario) = println(func.toString())
    }
}