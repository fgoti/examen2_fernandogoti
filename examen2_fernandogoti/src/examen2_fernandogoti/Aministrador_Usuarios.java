/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fernandogoti;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Fernando Goti
 */
public class Aministrador_Usuarios {
   ArrayList<Usuarios> L_Usuarios = new ArrayList();
    File archivo = null;

    public Aministrador_Usuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUsuario() {
        return L_Usuarios;
    }

    public void setListaUsuario(ArrayList<Usuarios> listausuarios) {
        this.L_Usuarios = listausuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Administrar_Usuarios{" + "listaguerrero=" + L_Usuarios + '}';
    }

    public void setUsuario(Usuarios g) {
        this.L_Usuarios.add(g);
    }

    public void cargarArchivo() {
        try {
            L_Usuarios = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        L_Usuarios.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : L_Usuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
