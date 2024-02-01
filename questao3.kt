fun main() {
    val entrada: String? = readLine()
    
    // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
    val (dia, mes, ano) = entrada?.split("/") ?: listOf("0", "0", "0")

    // Converte para inteiros
    val diaInt = dia.toIntOrNull() ?: 0
    val mesInt = mes.toIntOrNull() ?: 0
    val anoInt = ano.toIntOrNull() ?: 0

    // Validação dos componentes da data
    if (diaInt in 1..31 && mesInt in 1..12 && anoInt > 0) {
        val mesPorExtenso = when (mesInt) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Marco"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Mês Inválido!"
        }
        if(diaInt > 0 && diaInt < 10){
          println("0$diaInt de ${mesPorExtenso.capitalize()} de $anoInt")
        }else{
          println("$diaInt de ${mesPorExtenso.capitalize()} de $anoInt")
        }
    } else {
        println("Data Inválida!")
    }
}
