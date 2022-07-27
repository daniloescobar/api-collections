package one.digitalinnovation.collection

fun main(){
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }
    println("\n")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria","Záza","Pedro")
    println("\n")
    nomes2.sort()
    nomes2.forEach { println(it) }
}