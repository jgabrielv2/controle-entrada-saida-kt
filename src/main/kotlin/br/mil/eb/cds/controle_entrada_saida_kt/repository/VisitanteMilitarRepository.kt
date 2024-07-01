package br.mil.eb.cds.controle_entrada_saida_kt.repository

import br.mil.eb.cds.controle_entrada_saida_kt.model.VisitanteMilitar
import org.springframework.data.jpa.repository.JpaRepository

interface VisitanteMilitarRepository : JpaRepository<VisitanteMilitar, Long> {
}