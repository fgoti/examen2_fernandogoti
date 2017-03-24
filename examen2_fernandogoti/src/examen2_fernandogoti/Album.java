/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fernandogoti;

import java.util.ArrayList;

/**
 *
 * @author Fernando Goti
 */
public class Album {

    private String Nombre_album;
    private String Artista_album;
    private ArrayList Lcanciones = new ArrayList();

    public Album() {
    }

    public Album(String Nombre_album, String Artista_album) {
        this.Nombre_album = Nombre_album;
        this.Artista_album = Artista_album;
    }

    public String getNombre_album() {
        return Nombre_album;
    }

    public void setNombre_album(String Nombre_album) {
        this.Nombre_album = Nombre_album;
    }

    public String getArtista_album() {
        return Artista_album;
    }

    public void setArtista_album(String Artista_album) {
        this.Artista_album = Artista_album;
    }

    public ArrayList getLcanciones() {
        return Lcanciones;
    }

    public void setLcanciones(ArrayList Lcanciones) {
        this.Lcanciones = Lcanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "Nombre_album=" + Nombre_album + ", Artista_album=" + Artista_album + ", Lcanciones=" + Lcanciones + '}';
    }

}
