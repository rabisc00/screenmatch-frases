package br.com.alura.ScreenMatchFrases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "citacoes")
public class Citacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Citacao() {}

    public Citacao(String titulo, String frase, String personagem, String poster) {
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
