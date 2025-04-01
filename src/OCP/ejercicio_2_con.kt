package OCP

interface MetodoEnvio {
    fun enviar(archivo: String)
}

// Implementación de envío por FTP
class EnvioFTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
        }
}

// Implementación de envío por HTTP
class EnvioHTTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
        }
}

// Clase que gestiona los envíos de archivos
class EnvioArchivos(private val metodoEnvio: MetodoEnvio) {
    fun enviar(archivo: String) {
        metodoEnvio.enviar(archivo)
        }
}

// Función principal
fun main() {
    val envioFTP = EnvioArchivos(EnvioFTP())
    envioFTP.enviar("documento.txt")

    val envioHTTP = EnvioArchivos(EnvioHTTP())
    envioHTTP.enviar("imagen.png")
}