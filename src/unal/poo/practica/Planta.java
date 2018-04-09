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
public class Planta extends Thing{
private double humedad, temperatura,fertilizante;
private int state;
private String[] images= {"mal.png","bien.png"};

    public Planta(double humedad, double temperatura, double fertilizante, City city, int i, int i1,int state) {
        super(city, i, i1);
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fertilizante = fertilizante;
        this.state= state;
       setIcon(new Bicon(this.images[this.state])); 
    }

  public void cambiarEstado(int state){       
        setIcon(new Bicon(this.images[state]));
    }

  

 

  

    
}
