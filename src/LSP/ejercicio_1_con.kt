package LSP

open class Figura {
    open fun calcularArea(): Int {
        return 0
    }
}

class Cuadrado(var lado: Int) : Figura() {
    override fun calcularArea(): Int {
        return lado * lado
    }
}

class Rectangulo(var ancho: Int, var altura: Int) : Figura() {
    override fun calcularArea(): Int {
        return ancho * altura
    }
}

fun main() {
    val figuras: List<Figura> = listOf(Cuadrado(5), Rectangulo(5, 10))

    for (figura in figuras) {
        println("Área: ${figura.calcularArea()}")
    }
}