package br.mil.eb.cds.controle_entrada_saida_kt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalTime

@Entity
data class Entrada(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var divSec: String,

    var postoGrad: String,

    var nomeGuerra: String,

    var horario: LocalTime
)