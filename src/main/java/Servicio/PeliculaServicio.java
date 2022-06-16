/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class PeliculaServicio {
    
    private final List<Pelicula> peliculaList = new ArrayList<>();
    

    public Pelicula crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula); 
        return pelicula; 
    }


    public List<Pelicula> listar() {
        return this.peliculaList; 
    }
}
