package ISP

interface DispositivoBasico {
    fun encender()
    fun apagar()
}

interface DispositivoConectado {
    fun conectarWifi()
    fun actualizarFirmware()
}


class Lampara : DispositivoBasico {
    override fun encender() {
        println("Encendiendo la lámpara")
    }

    override fun apagar() {
        println("Apagando la lámpara")
    }
}


class SmartTV : DispositivoBasico, DispositivoConectado {
    override fun encender() {
        println("Encendiendo la Smart TV")
    }

    override fun apagar() {
        println("Apagando la Smart TV")
    }

    override fun conectarWifi() {
        println("Conectando la Smart TV a WiFi")
    }

    override fun actualizarFirmware() {
        println("Actualizando firmware de la Smart TV")
    }
}

fun main() {
    val lampara = Lampara()
    lampara.encender()
    lampara.apagar()

    val smartTv = SmartTV()
    smartTv.encender()
    smartTv.conectarWifi()
    smartTv.actualizarFirmware()
    smartTv.apagar()
}