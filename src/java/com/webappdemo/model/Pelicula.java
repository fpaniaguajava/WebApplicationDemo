package com.webappdemo.model;

public class Pelicula {
    private String titulo;
    private String poster;

    public Pelicula(String titulo, String poster) {
        this.titulo = titulo;
        this.poster = poster;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
    
}
