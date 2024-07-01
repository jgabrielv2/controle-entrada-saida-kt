package br.mil.eb.cds.controle_entrada_saida_kt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalTime

@Entity
data class VisitanteCivil(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var nomeCompleto: String,
    var empresa: String,
    var numeroTelefone: String,
    var horaEntrada: LocalTime,
    var horaSaida: LocalTime,



)
