package br.mil.eb.cds.controle_entrada_saida_kt.service

import br.mil.eb.cds.controle_entrada_saida_kt.dto.VisitanteCivilDTO
import br.mil.eb.cds.controle_entrada_saida_kt.model.VisitanteCivil
import br.mil.eb.cds.controle_entrada_saida_kt.repository.VisitanteCivilRepository
import org.springframework.stereotype.Service

@Service
class VisitanteCivilService(private val repository: VisitanteCivilRepository) {

    fun salvarRegistro(registroDto: VisitanteCivilDTO) {
        val registro = VisitanteCivil(
            nomeCompleto = registroDto.nomeCompleto.uppercase(),
            empresa = registroDto.empresa.uppercase(),
            numeroTelefone = registroDto.numeroTelefone,
            horaEntrada = registroDto.horaEntrada,
            horaSaida = registroDto.horaSaida
        )
        repository.save(registro)
    }

}