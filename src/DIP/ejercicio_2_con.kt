package DIP

interface Motor {
    fun encender()
}


class MotorElectrico : Motor {
    override fun encender() {
        println("Motor eléctrico encendido")
    }
}


class MotorCombustion : Motor {
    override fun encender() {
        println("Motor de combustión encendido")
    }
}


class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}

fun main() {
    val motorElectrico = MotorElectrico()
    val vehiculoElectrico = Vehiculo(motorElectrico)
    vehiculoElectrico.arrancar()

    val motorCombustion = MotorCombustion()
    val vehiculoCombustion = Vehiculo(motorCombustion)
    vehiculoCombustion.arrancar()
}