package pe.edu.upeu.examsc3r.model

data class Result(
    var id_resultado: String,
    var nombre_partida: String,
    var nombre_jugador1:String,
    var nombre_jugador2:String,
    var ganador:String,
    var punto: String,
    var estado:String
)
