package DIP

interface ServicioDeNotificacion {
    fun enviarMensaje(mensaje: String)
}


class EmailService : ServicioDeNotificacion {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}


class Notificador(private val servicio: ServicioDeNotificacion) {
    fun notificar(mensaje: String) {
        servicio.enviarMensaje(mensaje)
    }
}

fun main() {
    val servicioEmail = EmailService()
    val notificador = Notificador(servicioEmail)
    notificador.notificar("Hola Mundo!")
}