fun main() {
    val media = readLine()?.toDoubleOrNull()

    if (media != null) {
        when {
            media < 5 -> println("REP")
            media in 5.0..6.99 -> println("REC")
            media >= 7 -> println("APR")
            else -> println("Condição não esperada")
        }
    } else {
        println("Entrada inválida")
    }
}
