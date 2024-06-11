package model;

public class Musica {

    private String nome;

    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String informacoesMusica() {
        return String.format("Artista: %s\nMúsica: %s",artista,nome);
    }



}   