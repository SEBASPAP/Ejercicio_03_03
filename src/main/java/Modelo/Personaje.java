/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Personaje {
    public String nombre;
    public String funcionPer;
    public String generoMof;

    public Personaje(String nombre, String funcionPer, String generoMof) {
        this.nombre = nombre;
        this.funcionPer = funcionPer;
        this.generoMof = generoMof;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncionPer() {
        return funcionPer;
    }

    public void setFuncionPer(String funcionPer) {
        this.funcionPer = funcionPer;
    }

    public String getGeneroMof() {
        return generoMof;
    }

    public void setGeneroMof(String generoMof) {
        this.generoMof = generoMof;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", funcionPer=" + funcionPer + ", generoMof=" + generoMof + '}';
    }

     
}
