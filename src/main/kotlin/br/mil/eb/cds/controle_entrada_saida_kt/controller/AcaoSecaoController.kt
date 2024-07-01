package br.mil.eb.cds.controle_entrada_saida_kt.controller

import br.mil.eb.cds.controle_entrada_saida_kt.dto.AcaoSecaoDto
import br.mil.eb.cds.controle_entrada_saida_kt.service.AcaoSecaoService
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/secoes")
class AcaoSecaoController(private val acaoService: AcaoSecaoService) {

    @GetMapping
    fun home(model: ModelMap): String {
        model.addAttribute("entradas", acaoService.listarEntradas())
        model.addAttribute("saidas", acaoService.listarSaidas())
        return "controle-secoes"
    }

    @PostMapping("/entrada")
    fun cadastrarEntrada(@Valid formulario: AcaoSecaoDto): String {
        acaoService.salvarEntrada(formulario)
        return "redirect:/secoes"
    }

    @PostMapping("/saida")
    fun cadastrarSaida(@Valid formulario: AcaoSecaoDto): String {
        acaoService.salvarSaida(formulario)
        return "redirect:/secoes"
    }

    @PostMapping("/editar/{id}")
    fun atualizarRegistro(@PathVariable id: Long, formulario: AcaoSecaoDto): String {
        acaoService.atualizarRegistro(id, formulario)
        return "redirect:/secoes"
    }

    @PostMapping("/remover/{id}")
    fun apagarRegistro(@PathVariable id: Long): String {
        acaoService.apagarRegistro(id)
        return "redirect:/secoes"
    }

    @PostMapping("entradas/remover")
    fun apagarRegistrosEntradas(): String {
        acaoService.apagarTodosTipoEntrada()
        return "redirect:/secoes"
    }

    @PostMapping("saidas/remover")
    fun apagarRegistrosSaidas(): String {
        acaoService.apagarTodosTipoSaida()
        return "redirect:/secoes"
    }

    @PostMapping("/remover-tudo")
    fun apagarTudo(): String {
        acaoService.apagarTodos()
        return "redirect:/secoes"
    }

}