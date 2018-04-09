/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Estudiante
 */
public class Monitor extends Drone{
private String tipoCamara;

    public Monitor(String tipoCamara, City city, int i, int i1, Direction drctn, int i2, int energia) {
        super(city, i, i1, drctn, i2, energia);
        this.tipoCamara = tipoCamara;
        setIcon(new Bicon("monitor.png"));  
    }
    
    public int moverVecindario(double h,double t){
     
        // quitar
    return 2;    
    }

  
 

    
    
}
