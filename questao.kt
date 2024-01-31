import java.time.LocalDateTime

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class Professor(val nome: String)

data class ConteudoEducacional(var nome: String,
                               val duracao: Int = 60,
                               var nivel: Nivel = Nivel.BASICO,
                               var professor: Professor? = null)

data class Matricula(val usuario: Usuario,
                     val dataMatricula: LocalDateTime = LocalDateTime.now())

class Formacao(val nome: String,
               var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscricoes = mutableListOf<Matricula>()

    fun matricular(usuario: Usuario) {
        inscricoes.add(Matricula(usuario))
    }

    fun desmatricular(usuario: Usuario) {
        inscricoes.removeAll { it.usuario == usuario }
    }

    fun atualizarConteudos(conteudosNovos: List<ConteudoEducacional>) {
        conteudos = conteudosNovos.toMutableList()
    }
}

fun main() {
    val professor1 = Professor("Joao")
    val professor2 = Professor("Marcos")

    val usuario1 = Usuario("Luis")
    val usuario2 = Usuario("Luiz")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90, Nivel.BASICO, professor1)
    val conteudo2 = ConteudoEducacional("Algoritmos Avançados", 120, Nivel.DIFICIL, professor2)

    val formacao = Formacao("Ciência da Computação", mutableListOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Inscritos:")
    formacao.inscricoes.forEach {
        println("${it.usuario.nome} - Matriculado em: ${it.dataMatricula}")
    }

    // desmatriculando
    formacao.desmatricular(usuario1)
    println("\nInscritos após desmatrícula:")
    formacao.inscricoes.forEach {
        println("${it.usuario.nome} - Matriculado em: ${it.dataMatricula}")
    }

    // atualizando conteudos
    val conteudoNovo = ConteudoEducacional("Estruturas de Dados", 100, Nivel.INTERMEDIARIO, professor1)
    formacao.atualizarConteudos(listOf(conteudoNovo))

    println("\nConteúdos após atualização:")
    formacao.conteudos.forEach {
        println("${it.nome} - Nível: ${it.nivel} - Professor: ${it.professor?.nome ?: "Sem Professor"}")
    }
}