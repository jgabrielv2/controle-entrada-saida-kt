package br.mil.eb.cds.controle_entrada_saida_kt.service

import br.mil.eb.cds.controle_entrada_saida_kt.dto.AcaoSecaoDto
import br.mil.eb.cds.controle_entrada_saida_kt.enums.TipoAcaoSecao
import br.mil.eb.cds.controle_entrada_saida_kt.model.AcaoSecao
import br.mil.eb.cds.controle_entrada_saida_kt.repository.AcaoSecaoRepository
import org.springframework.stereotype.Service

@Service
class AcaoSecaoService(private val acaoRepository: AcaoSecaoRepository) {

    fun salvarEntrada(formulario: AcaoSecaoDto) {
        val acao = AcaoSecao(
                tipo = TipoAcaoSecao.ENTRADA,
                divSec = formulario.divSec,
                postoGrad = formulario.postoGrad,
                nomeGuerra = formulario.nomeGuerra.uppercase(),
                horario = formulario.horario
        )
        acaoRepository.save(acao)
    }

    fun salvarSaida(formulario: AcaoSecaoDto) {
        val acao = AcaoSecao(
                tipo = TipoAcaoSecao.SAIDA,
                divSec = formulario.divSec,
                postoGrad = formulario.postoGrad,
                nomeGuerra = formulario.nomeGuerra.uppercase(),
                horario = formulario.horario
        )
        acaoRepository.save(acao)
    }

    fun atualizarRegistro(id: Long, formulario: AcaoSecaoDto) {
        val acao = acaoRepository.getReferenceById(id)
        acao.divSec = formulario.divSec
        acao.postoGrad = formulario.postoGrad
        acao.nomeGuerra = formulario.nomeGuerra
        acao.horario = formulario.horario
        acaoRepository.save(acao)
    }

    fun apagarRegistro(id: Long) {
        acaoRepository.deleteById(id)
    }

    fun apagarTodosTipoEntrada() {
        acaoRepository.deleteByTipo(TipoAcaoSecao.ENTRADA)
    }

    fun apagarTodosTipoSaida() {
        acaoRepository.deleteByTipo(TipoAcaoSecao.SAIDA)
    }

    fun apagarTodos() {
        acaoRepository.deleteAll()
    }

    fun listarEntradas(): List<AcaoSecao> {
        return acaoRepository.findByTipo(TipoAcaoSecao.ENTRADA)
    }

    fun listarSaidas(): List<AcaoSecao> {
        return acaoRepository.findByTipo(TipoAcaoSecao.SAIDA)
    }
}