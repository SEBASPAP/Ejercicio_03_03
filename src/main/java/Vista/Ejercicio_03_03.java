/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Vista_01.ActorVentana;
import Vista_01.PeliculaVentana;
import Vista_01.PersonajeVentana;

/**
 *
 * @author paulp
 */
public class Ejercicio_03_03 {

    public static void main(String[] args) {
        var ventanaActor= new ActorVentana("Panel Principal ACTOR");
        ventanaActor.setVisible(true);
        
        var ventanaPelicula= new PeliculaVentana("Panel Principal PELICULA");
        ventanaPelicula.setVisible(true);
        
        var ventanaPersonaje= new PersonajeVentana("Panel Principal PERSONAJE");
        ventanaPersonaje.setVisible(true);
    }
}
