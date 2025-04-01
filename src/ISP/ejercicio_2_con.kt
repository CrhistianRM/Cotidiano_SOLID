package ISP

interface Trabajador {
    fun trabajar()
}

interface Administrador {
    fun administrar()
}

interface Auditor {
    fun auditar()
}


class Desarrollador : Trabajador {
    override fun trabajar() {
        println("Desarrollando software...")
    }
}


class Gerente : Trabajador, Administrador {
    override fun trabajar() {
        println("Supervisando equipos...")
    }

    override fun administrar() {
        println("Gestionando recursos...")
    }
}