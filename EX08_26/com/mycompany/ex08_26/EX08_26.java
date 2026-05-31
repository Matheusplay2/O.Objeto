package com.mycompany.ex08_26;

import classes.Album;
import classes.Artista;
import classes.GerenciadorArtista;
import classes.Musica;

public class EX08_26 {

    public static void main(String[] args) {


        GerenciadorArtista gerenciador = new GerenciadorArtista();

        Artista artista1 = new Artista();
        artista1.setNome("Matue");

        
        Album album1 = new Album("333" , 2024);
        Album album2 = new Album("Maquina do Tempo" , 2020);

        
        artista1.getAlbuns().add(album1);
        artista1.getAlbuns().add(album2);

        
        artista1.adicionarMusica("333", new Musica("Isso e serio", 3.30));
        artista1.adicionarMusica("333", new Musica("1993", 4.00));

        artista1.adicionarMusica("Maquina do Tempo", new Musica("777-666", 3.30));

        
        gerenciador.adicionarArtista(artista1);

        Artista artista2 = new Artista();
        artista2.setNome("Hariel");

        Album album3 = new Album("Funk superacao(Ao vivo)", 2022);

        
        album3.adicionarMusica(new Musica("Salve Jorge", 2.5));
        album3.adicionarMusica(new Musica("Golpe de vista", 3.0));
        album3.adicionarMusica(new Musica("Forte pra da Sorte", 4.5));

        artista2.getAlbuns().add(album3);

        gerenciador.adicionarArtista(artista2);


        System.out.println("=== LISTAR ARTISTAS ===");
        gerenciador.Listar();

        System.out.println("=== ARTISTA COM MAIS ALBUNS ===");
        Artista maior = gerenciador.artistaComMaisAlbuns();
        if (maior != null) {
            System.out.println(maior);
        }

        System.out.println("=== ALBUM COM MAIS MUSICAS ===");
        Album maiorAlbum = gerenciador.albumComMaisMusicas();
        if (maiorAlbum != null) {
            System.out.println(maiorAlbum);
        }
    }
}