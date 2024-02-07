class User(val id: Int, val name: String)

object UserManager {

  private val users = mutableListOf<User>()
  private var idNext = 1
  
  fun addUser(name: String) {
      val novoUser = User(idNext++, name)
      users.add(novoUser)
  }

  fun listUsers() {
	users.forEach {
    	user ->  println("${user.id} - ${user.name}")
    }
  }
}

fun main() {
  val quantity = readLine()?.toIntOrNull() ?: 0

  for (i in 1..quantity) {
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}