package br.com.alura.ScreenMatchFrases.repository;

import br.com.alura.ScreenMatchFrases.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CitacaoRepository extends JpaRepository<Citacao, Long> {
    @Query("SELECT c FROM Citacao c ORDER BY function('RANDOM') LIMIT 1")
    Citacao buscaCitacaoAleatoria();
}
