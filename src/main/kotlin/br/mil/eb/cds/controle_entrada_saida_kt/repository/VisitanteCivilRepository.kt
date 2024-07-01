package br.mil.eb.cds.controle_entrada_saida_kt.repository

import br.mil.eb.cds.controle_entrada_saida_kt.model.VisitanteCivil
import org.springframework.data.jpa.repository.JpaRepository

interface VisitanteCivilRepository : JpaRepository<VisitanteCivil, Long> {
}