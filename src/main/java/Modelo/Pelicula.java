/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Pelicula {
    public String nombre;
    public String genero;
    public String paisOrigen;
    public int fechaPublicacion;

    public Pelicula(String nombre, String genero, String paisOrigen, int fechaPublicacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", paisOrigen=" + paisOrigen + ", fechaPublicacion=" + fechaPublicacion + '}';
    }
    
    
}
