fun sum(x: Int, y: Int): Int {
    return x+y
}

fun msgWithPrefix(msg: String, pfx: String = "Info"){
    println("[$pfx] $msg")
}

fun msg(msgg:String): Unit{
    println(msgg)
}

fun mu(x:Int,y:Int) = x*y

fun main(){
    println(sum(1,2))
    println(mu(2,3))
    msgWithPrefix("HELLO")
    msgWithPrefix("HELLO", "Log")
    msg("HELLO EVERYONE")
    msgWithPrefix(pfx="Log", msg="Test")
}

/////////////////////////////////////////////////////////

fun printAll(vararg msgs: String): Unit{
    for(msg in msgs) println(msg)
}

fun printAllwPrefix(vararg msgs: String, pfx: String="[Info] "){
    for(msg in msgs) println(pfx+ msg)
}
//printAllwPrefix(prefix="[Info] ")

fun main() {
    printAll("luis","rayssa","miu","larissa","robertinho")
    printAllwPrefix("Hello")
}

/////////////////////////////////////////////////////////

fun descript(str: String?): String{
    if(str != null && str.length > 0){
        return "Tamanho: ${str.length}" 
    }else{
        return "Vazio"
    }
}

fun main() {
    println(descript(null))
    println(descript(""))
    println(descript("MIU E ROBERTINHO"))
}

/////////////////////////////////////////////////////////

class Cliente

class Contato(val id: Int, val email: String)

fun main() {
    val cliente = Cliente()
    val contato = Contato(1,"user@email.com")
    
    println(contato.id)
    println(contato.email)
    println(cliente)
    

}

/////////////////////////////////////////////////////////

class Pilha<E>(vararg items: E){
    private val elements = items.toMutableList()
        
    fun push(element: E) = elements.add(element)
    
    fun pop(): E = elements.removeAt(elements.size-1)
    
    fun peek(): E = elements.last()
    
    fun isEmpty() = elements.isEmpty()
    
    fun size() = elements.size
    
    override fun toString() = "Pilha(${elements.joinToString()})"
}

fun  <E> mutablePilha(vararg elements: E) = Pilha(*elements)

fun main() {
    val pilha = Pilha(0.35,4.5,3.33,2.7)
    pilha.push(6.9)
    println(pilha)
    
    println("PEEK: ${pilha.peek()}") 
    
    for(i in 1..pilha.size()){
        println("POP: ${pilha.pop()}")
        println(pilha)
    }
    
    val pilhax = mutablePilha("BRASIL","PORTUGAL","PINDAIABA")
    println(pilhax)

}

/////////////////////////////////////////////////////////

fun cases(obj: Any){
    when(obj){
        1 -> println("one")
        "Hello" -> println("BOM DEMAIS")
        is Long -> println("Long")
        !is String -> println("ñ string")
        else -> println("default")
    }
}

class MyClass

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hi")
}

/////////////////////////////////////////////////////////

fun whenTestes(obj: Any): Any{
   val valor = when(obj){
        1 -> "one"
        "Hello" -> 1
        is Long -> true
        else -> "defaulty"
    }
    return valor
}

class MyClass

fun main() {
 println(whenTestes(1))
 println(whenTestes("Hello"))
 println(whenTestes(MyClass()))
 println(whenTestes(3.4))
 println(whenTestes("helo"))
}


/////////////////////////////////////////////////////////

fun main() {

    val cakes = listOf("mole", "chocolate", "bjin")

    for (cake in cakes){
        println("Delicious esse bolo: $cake")
    }

}

/////////////////////////////////////////////////////////

fun comer() = println("comer")
fun assar() = println("assar")

fun main(/*args: Array<String>*/){
    var comido = 0
    var assado = 0

    while(comido < 5){
        comer()
        comido++
    }
    
    do{
        assar()
        assado++
    }while(assado < comido)


}

/////////////////////////////////////////////////////////

class Animal(val nome:String)
class Zoologico(val animais: List<Animal>){
    operator fun iterator(): Iterator<Animal>{
        return animais.iterator()
    }
}

fun main(){
    val animales = listOf(Animal("Macaco"), Animal("Soin"))

    val zoo = Zoologico(animales)
    
    for (animal in zoo){
        println("Olha um ${animal.nome}")
    }
}

/////////////////////////////////////////////////////////

//ranges
fun main() {
    for( i in 0..3){
        print(i)
    }
    println()
    for( i in 0 until 3){
        print(i)
    }
    println()
    for( i in 2..12 step 2){
        print(i)
    }
    println()
    for( i in 5 downTo 0){
        print(i)
    }
    println()
    for( c in 'a' until 'e'){
        print(c)
    }
    println()
    for( c in 'a'..'e'){
        print(c)
    }
    println()
    for( c in 'z' downTo 'l' step 2){
        print(c + " ")
    }
    println()
    val x = 5
    if(x in 1..5){
        println("Verificado 1")
    }

    if(x !in 6 until 10){
        println("Verificado 2")
    }else{
        println("Else 1")
    }
    println()
}

/////////////////////////////////////////////////////////

//setOf
fun main() {
    val atores = setOf("1", "2", "3")
    val escritores = setOf("1", "2", "3")
    val escritores2 = setOf("3", "1", "2")
    
    println(atores == escritores2)
    println(atores === escritores)

    fun max(a: Int, b: Int) = if (a>b) a else b
    
    println(max(4,7)
}

/////////////////////////////////////////////////////////

//mutableList list collection
val Users: MutableList<Int> = mutableListOf(1,2,3)
val aux: List<Int> = Users

fun addUsers(newUser: Int){
    Users.add(newUser)
}

fun getAuxs(): List<Int>{
    return aux
}

fun main(){
    addUsers(4)
    getAuxs().forEach{
        i -> println("$i")
    }
}

/////////////////////////////////////////////////////////

//mutableSet set collection
val Users: MutableSet<String> = mutableSetOf("un1","un2","un3")

fun addUsers(newUser: String): Boolean{
   return Users.add(newUser)
}

fun getStat(isADD: Boolean): Boolean{
    return isADD// "OK" else "DUPLICATED"
}

fun main(){
    val newU: String = "un4"
    val newUD: String = "un2"
    
    println("$newU : ${getStat(addUsers(newU))}")
    println("$newUD : ${getStat(addUsers(newUD))}")
}

/////////////////////////////////////////////////////////

//mutableMap map collection
const val POINT_X: Int = 15
val Accounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val Report: Map<Int, Int> = Accounts

fun updatePoints(accountID: Int){
    if(Accounts.containsKey(accountID)){
        println("Updating $accountID...")
        Accounts[accountID] = Accounts.getValue(accountID) + POINT_X
    }else{
        println("Erro (ID: $accountID)")
    }
}

fun Reports(){
    println("PASS REPORT:")
    Report.forEach{
        k, v -> println("ID: $k: Credito $v")
    }
}

fun main(){
    Reports()
    updatePoints(2)
    updatePoints(4)
    updatePoints(3)
    Reports()
}

/////////////////////////////////////////////////////////

//filter e map function collection
fun main() {
   val num = listOf(1,-2,3,-4,-5)
   val positivos = num.filter{x -> x>0}
   val negativos = num.filter{it < 0}
   val doubled = num.map{x -> x*2}
   val tripled = num.map{it * 3}
   println("$positivos")
   println("$negativos")
   println("$doubled")
   println("$tripled")
}

/////////////////////////////////////////////////////////

//map e flatmap function collection
fun main() {
   val fruit = listOf("apple","orange","banana")
   val clothe = listOf("shirt","pants","short")
   val carrinho = listOf(fruit, clothe)
   val mapCarrinho = carrinho.map{it}
   val flatMapCarrinho = carrinho.flatMap{it}
   println("$mapCarrinho")
   println("$flatMapCarrinho")
 
}

/////////////////////////////////////////////////////////

//herança e passagem de arrgumentos p superclassex
open class Dog{
    open fun say(){
        println("au au")
    }
}

class Pinscher: Dog(){
    override fun say(){
        println("aaaaaaaaau aaaaaaaaau")
    }
}

fun main(){
    val dog: Dog = Pinscher()
    dog.say()
}

/////////////////////////////////////////////////////////

//herança e passagem de arrgumentos p superclassex
open class Tigre(val origem: String){
    open fun local(){
        println("Tigre localizado: $origem.")
    }
}

class TigreSiberiano: Tigre("Siberia")

fun main(){
    val tigre: Tigre = TigreSiberiano()
    tigre.local()
}

/////////////////////////////////////////////////////////

//herança e passagem de arrgumentos p superclasse
open class Leao(val nome: String, val origem: String){
    open fun local(){
        println("$nome. Leão localizado: $origem.")
    }
}

class Asiatico(nome: String): Leao(nome = nome, "Asia")

fun main(){
    val leao: Leao = Asiatico("Miu")
    leao.local()
}

/////////////////////////////////////////////////////////

//data class
data class User(val nome: String, val id: Int){
    override fun equals(other: Any?) = 
        other is User && other.id == this.id
}

fun main(){
    val user = User("Miu",1)
    val user2 = User("Miu",1)
    val user3 = User("Roberrtin", 2)
    println(user)
    println(user2)
    println(user3)
    
    println(user.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())
    
    println(user.copy())
    println(user === user.copy())
    println(user2.copy("Minho"))
    println(user2.copy(id=4))
    
    println(user.component1())
    println(user.component2())
}

/////////////////////////////////////////////////////////
    
//enum class
enum class State{
    ESPERA, EXECUTANDO, FINALIZADO
}

fun main(){
    val state = State.EXECUTANDO
    val msg = when(state){
        State.ESPERA -> "ESPERANDO."
        State.EXECUTANDO -> "EXECUTANDO."
        State.FINALIZADO -> "FINALIZADO."
    }    
    println(msg)
}

/////////////////////////////////////////////////////////

//enum class
enum class Cor(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
    
    fun containRed() = (this.rgb and 0xFF0000 != 0)
}

fun main(){
   val red =  Cor.RED
   println(red)
   println(red.containRed())
   println(Cor.BLUE.containRed())
   println(Cor.YELLOW.containRed())
}

/////////////////////////////////////////////////////////

//sealed class
sealed class Animal(val nome: String)

class Cat(nomeCat: String) : Animal(nomeCat)
class Human(nomeHuman: String, val hobbie: String) : Animal(nomeHuman)

fun meetAnimal(animal: Animal): String {
    return when (animal) {
        is Human -> "${animal.nome}. Likes ${animal.hobbie}"
        is Cat -> "Cat name: ${animal.nome}"
    }
}

fun main() {
    val cat = Cat("Miu")
    val human = Human("Luis", "NONE")
    println(meetAnimal(cat))
    println(meetAnimal(human))
}


/////////////////////////////////////////////////////////

//objject keyword
class BigBen{
    companion object Bonger{
        fun getBong(n: Int){
            for ( i in 1 ..n){
                print("BONG ")
            }
        }
    }
}

fun main(){
    BigBen.getBong(10)
}

/////////////////////////////////////////////////////////

fun rentPreco(dias: Int, diasFestivos: Int,
              diasEspeciais: Int) : Unit{
    val diasRate = object {
        var normais: Int = 30 * dias
        var festivos: Int = 50 * diasFestivos
        var especiais: Int = 100 * diasEspeciais
    }
    
    val total = diasRate.normais + diasRate.festivos + diasRate.especiais
    
    println("Total: $$total")
}

fun main(){
    rentPreco(10,4,2)
}

/////////////////////////////////////////////////////////

//escopo let
fun custonP(s: String){
    print(s.uppercase())
}

fun main(){
    val vazio = "test".let{
        custonP(it)
        it.isEmpty()
    }
    println(" é vazio: $vazio")
    
    fun printNonNull(str: String?){
        println("Printando \"$str\":")
        str?.let{
            print("\t")
            custonP(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("tester")
    
    fun bothNonNull(strOne: String?, strTwo: String?){
        strOne?.let{ firstString ->
                strTwo?.let{ secondString ->
                    custonP("$firstString : $secondString")
                    println()
                }
            
        }
    }
    bothNonNull("null","null")
}

/////////////////////////////////////////////////////////

//escopo run
fun main(){
    fun getNullableTam(str: String?) : Int{
        println("for \"$str\":")
        return str?.run{
            println("\tvazio? "+ isEmpty())
            println("\ttamanho = $length")
            length
        } ?: 0
    }
    println(getNullableTam(null))
    println(getNullableTam(""))
    println(getNullableTam("teste"))
}

/////////////////////////////////////////////////////////

//escopo with
class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host= "127.0.0.1", port = 9000)
    
    with(configuration){
        println("$host:$port")
    }
    println()
    println("${configuration.port}:${configuration.host}")
}

/////////////////////////////////////////////////////////

//escopo apply
data class Pessoa(var nome: String, var idade: Int, var sobre: String){
    constructor() : this("",0,"")
}

fun main(){
    val jake = Pessoa()
    val pessoaDescr = jake.apply{
        nome = "Jake"
        idade = 50
        sobre = "Runner"
    }.toString()
    println(pessoaDescr)
}

/////////////////////////////////////////////////////////

//escopo also
data class Pessoa(var nome: String, var idade: Int, var sobre: String){
    constructor() : this("",0,"")
}

fun escrevendo(p: Pessoa){
    println("Nova pessoa: ${p.nome} nasceu")
}

fun main(){
    val jake = Pessoa("Jake", 50, "Runner").also{
        escrevendo(it)
    }
 
}

/////////////////////////////////////////////////////////

//infinx functions
fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(5 times "Bye ")
    
    val pair = "Uno" to "Two" to "Tier" to "Master"
    println(pair)
    
    infix fun String.onto(str: String) = Pair(this, str)
    val myPair = "Four" onto "Five" to "Tier" to "Master"
    println(myPair)
    
    val luis = Pessoa("Luis")
    val miu = Pessoa("Miu")
    luis likes miu
}
class Pessoa(val nome: String){
    val likedPessoa = mutableListOf<Pessoa>()
    infix fun likes(p: Pessoa){ likedPessoa.add(p) }
}

/////////////////////////////////////////////////////////

//operator funcions
fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2* "Bye ")
    
    operator fun String.get(range: IntRange) = substring(range)
    val str = "SEMPRE FAÇA OQ TIVER DE SER FEITO PARA FINALIZAR."
    println(str[0..19])

}

/////////////////////////////////////////////////////////

//high order functions
fun calculate(x: Int, y: Int, operation: (Int,Int) -> Int) : Int{
    return operation(x,y)
}   

fun sum(x:Int, y: Int) = x + y

fun main(){
    var sum = calculate(4,5, ::sum)
    var mult = calculate(5, 6, {a, b -> a * b})
    
    println(sum)
    println(mult)
}

/////////////////////////////////////////////////////////

//lambda functions
fun main(){
    val upperCase1 : (String) -> String = {str: String -> str.uppercase()}
    val upperCase2 : (String) -> String = {str -> str.uppercase()}
    val upperCase3 = {str: String -> str.uppercase()} 
    val upperCase4 : (String) -> String = {it.uppercase()} 
    val upperCase5 : (String) -> String = String::uppercase 
    println(upperCase1("ola amigos"))
    println(upperCase2("ola amigos"))
    println(upperCase3("ola amigos"))
    println(upperCase4("ola amiigos"))
    println(upperCase5("ola amiigos"))
    
}

/////////////////////////////////////////////////////////

//extension functions and properties
data class Item(val name: String, val price: Float)                                         // 1  

data class Order(val items: Collection<Item>)  

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2  
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    
    println("Item com preço maior: ${order.maxPricedItemName()}")                           // 4
    println("preço do item: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

}

/////////////////////////////////////////////////////////

//extension functions generic
fun <T> T?.nullSafeToString() = this?.toString() ?: "ausente"  // 1

fun main() {
    println(null.nullSafeToString())
    println("Kotlin .".nullSafeToString())
}

/////////////////////////////////////////////////////////

//suspend functions
import kotlinx.coroutines.*


fun main() = runBlocking {
    doWorld()
}

suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello ")
}

/////////////////////////////////////////////////////////

//exception
fun main(){
    val a = 10
    val b = 0

    // val div : Any? = try { a/b } catch(e: ArithmeticException) { 0 }
    // println(div)

    try{
        val div = a/b
        println(div)
    }catch(e: ArithmeticException){
        println("Erro artimetico . \n" + e.message)
    }catch(e: Throwable){
        println(e.message)
    }finally{
        println("Chegou no finally")
    }
}

/////////////////////////////////////////////////////////

//exception
class IllegalTicketException(msg: String) : Throwable(msg)

@Throws(IllegalTicketException::class)
fun ticket(nome: String, idade: Int) {
    if (idade < 18) {
        throw IllegalTicketException("$nome não pode usar o ticket")
    }
    println("[Ticket: $nome/$idade anos]")
}

fun main() {
    var qntTickets = 0 
    qntTickets += try { ticket("Luis", 26); 1 } catch (e: IllegalTicketException) { 0 }
    qntTickets += try { ticket("Luisi", 17); 1 } catch (e: IllegalTicketException) { 0 }
    qntTickets += try { ticket("Luiz", 50); 1 } catch (e: IllegalTicketException) { 0 }
    println(qntTickets)
}


/////////////////////////////////////////////////////////

//exception
data class Pessoa(val nome: String?)
fun erro(msg: String): Nothing{
    throw IllegalArgumentException(msg)
}

fun main(){
    val pessoa = Pessoa(null)
    val s = pessoa.nome ?: erro("Insira o nome")
    println(s)
}

/////////////////////////////////////////////////////////
