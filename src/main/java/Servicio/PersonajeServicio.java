/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Personaje;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author paulp
 */
public class PersonajeServicio {
 
    private final List<Personaje> personajeList = new ArrayList<>();
    

    public Personaje crear(Personaje personaje) {
        this.personajeList.add(personaje); 
        return personaje; 
    }


    public List<Personaje> listar() {
        return this.personajeList; 
    }
         
}
