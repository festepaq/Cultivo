/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Thing;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cultivo extends City{
 private int tamanoX;   
 private int tamanoY;  
private ArrayList<Drone> drones;
private ArrayList<Thing> objetos;

    public Cultivo(int tamanoX, int tamanoY) {
        this.tamanoX = tamanoX;
        this.tamanoY = tamanoY;
        this.drones= new ArrayList<>();
        this.objetos= new ArrayList<>();
     }
 
    public boolean cambiarHumedad(int x, int y){
        return true;
    }
 public boolean cambiarTemperatura(int x, int y){
    return true; 
 }
  public void sembrar(double humedad, double temperatura, double fertilizante, int x, int y,int state){
Planta planta= new Planta(humedad, temperatura, fertilizante, this, y, y,state);      
  }  
}
