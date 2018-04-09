/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.icons.Icon;

/**
 *
 * @author Estudiante
 */
public class Panel extends Thing{
    private int cantidadEnergia;

    public Panel(int cantidadEnergia, City city, int i, int i1) {
        super(city, i, i1);
        this.cantidadEnergia = cantidadEnergia;
        setIcon(new Bicon("panel.png")); 
    }

    

   
    
}
