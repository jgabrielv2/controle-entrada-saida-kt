package br.mil.eb.cds.controle_entrada_saida_kt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalTime

@Entity
data class VisitanteMilitar(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var om: String,
    var postoGrad: String,
    var nomeGuerra: String,
    var horaEntrada: LocalTime,
    var horaSaida: LocalTime
)
