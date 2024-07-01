package br.mil.eb.cds.controle_entrada_saida_kt.model

import br.mil.eb.cds.controle_entrada_saida_kt.enums.TipoAcaoSecao
import jakarta.persistence.*
import java.time.LocalTime

@Entity
class AcaoSecao(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Enumerated(EnumType.STRING)
        val tipo: TipoAcaoSecao,

        var divSec: String,

        var postoGrad: String,

        var nomeGuerra: String,

        var horario: LocalTime,

        ) {



    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcaoSecao) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}