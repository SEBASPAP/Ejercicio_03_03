/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Actor {
    public String nombre;
    public String nacionalidad;
    public int fechanacimiento;
    public int edad;

    public Actor(String nombre, String nacionalidad, int fechanacimiento, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(int fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechanacimiento=" + fechanacimiento + ", edad=" + edad + '}';
    }
 
    
}
