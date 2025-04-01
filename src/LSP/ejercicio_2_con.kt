package LSP

abstract class Dispositivo {
    abstract fun encender()
}

class Televisor : Dispositivo() {
    override fun encender() {
        println("Encendiendo televisor...")
    }
}

class Radio : Dispositivo() {
    override fun encender() {
        println("Encendiendo radio correctamente...")
    }
}

fun main() {
    val dispositivos: List<Dispositivo> = listOf(Televisor(), Radio())

    for (dispositivo in dispositivos) {
        dispositivo.encender()
    }
}