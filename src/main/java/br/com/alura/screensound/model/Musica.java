package br.com.alura.screensound.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    @ManyToOne
    private Artista artista;

    public Musica() {}
    public Musica(String nomeMusica) {
        this.titulo = nomeMusica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    // Temos que fazer uma alteração nesse too string - Vamos pegar apenas o nome do artista, para não ter a recursividade
    @Override
    public String toString() {
        return
                "Música='" + titulo + '\'' +
                ", artista=" + artista.getNome();
    }
}
