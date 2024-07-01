package br.mil.eb.cds.controle_entrada_saida_kt.dto

import java.time.LocalTime

data class VisitanteCivilDTO(
    val nomeCompleto: String,
    val empresa: String,
    val numeroTelefone: String,
    val horaEntrada: LocalTime,
    val horaSaida: LocalTime
)
