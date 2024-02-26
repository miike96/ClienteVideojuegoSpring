package org.cliente.clientevideojuego;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String plataforma;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String lanzamiento;

    @Column(nullable = false)
    private Boolean favorito;

    @Column(nullable = false)
    private String desarrollador;

    public Videojuego() {

    }

    public Videojuego(Integer id, String titulo, String plataforma, String genero, String lanzamiento, Boolean favorito, String desarrollador) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
        this.favorito = favorito;
        this.desarrollador = desarrollador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
}
