package br.mil.eb.cds.controle_entrada_saida_kt.repository

import br.mil.eb.cds.controle_entrada_saida_kt.enums.TipoAcaoSecao
import br.mil.eb.cds.controle_entrada_saida_kt.model.AcaoSecao
import org.springframework.data.jpa.repository.JpaRepository

interface AcaoSecaoRepository : JpaRepository<AcaoSecao, Long> {


    fun findByTipo(tipo: TipoAcaoSecao): List<AcaoSecao>


    fun deleteByTipo(tipo: TipoAcaoSecao)


}