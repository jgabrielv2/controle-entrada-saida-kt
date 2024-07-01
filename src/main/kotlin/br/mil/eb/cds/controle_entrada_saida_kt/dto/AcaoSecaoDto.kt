package br.mil.eb.cds.controle_entrada_saida_kt.dto

import br.mil.eb.cds.controle_entrada_saida_kt.enums.TipoAcaoSecao
import java.time.LocalTime

data class AcaoSecaoDto(val divSec: String, val postoGrad: String, val nomeGuerra: String, val horario: LocalTime, val tipo: TipoAcaoSecao)
