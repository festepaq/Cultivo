/*
Imagenes tomadas de:
 https://www.flaticon.com/free-icon/drone_90905
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Fabian Giraldo
 */
public class Drone extends Robot{
protected int energia;    
    
    public Drone(City city, int i, int i1, Direction drctn, int i2, int energia) {
        super(city, i, i1, drctn, i2);
        this.energia= energia;
        setIcon(new Bicon("drone.png"));
    }
public void cargarEnergia(int cantidad){
    
}

public void consumirEnergia(){
    
}
}
