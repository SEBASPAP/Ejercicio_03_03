/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Actor;
import Servicio.ActorServicio;
import java.util.List;

/**
 *
 * @author paulp
 */
public class ActorControl {
    private final ActorServicio actorServicio = new ActorServicio(); 
    
    public Actor crear(String [] params){
        var actor = new Actor(params[0],params[1],Integer.valueOf(params[2]),
                                        Integer.valueOf(params[3])); 
        this.actorServicio.crear(actor);
        return actor;
    }
    
    public List<Actor> listar()
    {
        return this.actorServicio.listar();
    }
}
