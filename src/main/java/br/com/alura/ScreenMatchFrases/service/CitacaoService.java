package br.com.alura.ScreenMatchFrases.service;

import br.com.alura.ScreenMatchFrases.dto.CitacaoDTO;
import br.com.alura.ScreenMatchFrases.model.Citacao;
import br.com.alura.ScreenMatchFrases.repository.CitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CitacaoService {
    @Autowired
    private CitacaoRepository citacaoRepository;

    public CitacaoDTO getCitacaoAleatoria() {
        Citacao citacao = citacaoRepository.buscaCitacaoAleatoria();
        return new CitacaoDTO(citacao.getTitulo(), citacao.getFrase(), citacao.getPersonagem(), citacao.getPoster());
    }
}
