package br.com.alura.ScreenMatchFrases.controller;

import br.com.alura.ScreenMatchFrases.dto.CitacaoDTO;
import br.com.alura.ScreenMatchFrases.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitacaoController {
    @Autowired
    private CitacaoService citacaoService;

    @GetMapping("/series/frases")
    private CitacaoDTO getFrase() {
        return citacaoService.getCitacaoAleatoria();
    }
}
