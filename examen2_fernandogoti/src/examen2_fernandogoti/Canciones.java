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
public class Canciones {

    private String Nombre_cancion;
    private String Artista_cancion;
    private int duracion;

    public Canciones() {
    }

    public Canciones(String Nombre_cancion, String Artista_cancion, int duracion) {
        this.Nombre_cancion = Nombre_cancion;
        this.Artista_cancion = Artista_cancion;
        this.duracion = duracion;
    }

    public String getNombre_cancion() {
        return Nombre_cancion;
    }

    public void setNombre_cancion(String Nombre_cancion) {
        this.Nombre_cancion = Nombre_cancion;
    }

    public String getArtista_cancion() {
        return Artista_cancion;
    }

    public void setArtista_cancion(String Artista_cancion) {
        this.Artista_cancion = Artista_cancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return Nombre_cancion + Artista_cancion + duracion;
    }

}
