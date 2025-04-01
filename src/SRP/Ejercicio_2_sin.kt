package SRP

class Cliente(val nombre: String, val edad: Int)

class ClienteRepositorio {
    fun guardar(cliente: Cliente) {
        println("Guardando cliente ${cliente.nombre} en la base de datos...")
    }
}

class NotificadorCorreo {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}...")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)
    val repositorio = ClienteRepositorio()
    val notificador = NotificadorCorreo()

    repositorio.guardar(cliente)
    notificador.enviarCorreo(cliente)
}