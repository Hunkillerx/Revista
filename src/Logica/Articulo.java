/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.swing.Icon;

/**
 * Representa una tarea para la lista de tareas
 * @author Jose
 * @since 06/03/2017
 * @version 1.0
 */
public class Articulo implements Serializable{

    public Articulo(String nombre,String Imagen, String Cuerpo) {
        this.nombre = nombre;
        this.Imagen = Imagen;
        this.Cuerpo = Cuerpo;
    }
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    private String nombre;
    private String Imagen;
    private String Cuerpo;
    
}
