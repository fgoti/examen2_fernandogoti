/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fernandogoti;

/**
 *
 * @author Fernando Goti
 */
public class Usuarios {

    private String nombre_usuario;
    private int edad;
    private String username;
    private String password;

    public Usuarios() {
    }

    public Usuarios(String nombre_usuario, int edad, String username, String password) {
        this.nombre_usuario = nombre_usuario;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre_usuario + edad + username;
    }

}
