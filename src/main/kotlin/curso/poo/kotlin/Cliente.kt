package curso.poo.kotlin

class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String) : Pessoa(nome, cpf), Login {

    override fun login(): Boolean = "1234" == senha

    override fun toString(): String = """
         Nome: $nome
         Cpf:  $cpf
         Tipo: ${clienteTipo.description}
     """.trimIndent()
}