package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            
            
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            
            
            Cultivo cultivo = new Cultivo(5, 5);
          
            cultivo.sembrar(45, 78, 45,  1, 0, 0);
            
            Sembrador s_1= new Sembrador(cultivo, 0, 1, Direction.EAST,5,5,5);
            Monitor m_1= new Monitor("HD", cultivo, 1, 1, Direction.EAST, 7, 5);
            Panel p= new Panel(8, cultivo, 0, 3);
            Planta t_1= new Planta(45, 78, 45, cultivo, 1, 0, 0);
            Planta t_2= new Planta(45, 78, 45, cultivo, 2, 0, 1);
            
            
            
            
           
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            s_1.turnLeft();
            s_1.turnLeft();
            s_1.move();
            
            Thing t = estudiante.examineThings(new FlorPred()).next();
            if(t instanceof Flor){
               estudiante.pickThing();
            }
            
            estudiante.move();
           
           
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

