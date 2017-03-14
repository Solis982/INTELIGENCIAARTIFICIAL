/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_inteligencia_artificial01;

import java.util.ArrayList;
import javax.swing.text.Position;

/**
 *
 * @author Amairany Solis Pech 
 */
public class State {

    public enum position { DERECHA , IZQUIERDA }
    
    public position oveja;
    public position repollo;
    public position lobo;
    public position granjero;
    

    
    public boolean isValid(){
        if((oveja == position.DERECHA ) && (repollo == position.DERECHA) 
                && (granjero == position.IZQUIERDA))
                return false;
        if((oveja == position.DERECHA ) && (lobo == position.DERECHA) 
                && (granjero == position.IZQUIERDA))
            //denominar toda la lista de estados
                return false;
    
    return true;
    }

        public boolean isFinal(){
            if ((oveja == position.IZQUIERDA) && (repollo == position.IZQUIERDA) 
                    && (lobo == position.IZQUIERDA) && (granjero == position.IZQUIERDA))
                return true;
            //termina toda la lista de estados validos
                return false;
            
            
        
        }
        public ArrayList<transition> validTransition(){
                 ArrayList<transition> result = new 
                 ArrayList<transition>();
             
                result.add(new transition(this, transition.Action.MOVER_GRANJERO));
                
                     if (oveja == granjero) {
                     result.add(new transition(this, transition.Action.MOVER_OVEJA));
                     
                     
                     }
                     //Mover a los demas objetos queda en la comodidad de su hogar
                     return result;
}
        public static void main(String[] args ){
            State test = new State();
            test.granjero = position.DERECHA;
            System.out.println(test);
        }
        @Override
        public String toString(){
            return "posicion oveja: " + oveja + ", " + 
                    "posicion repollo: " + repollo + ", " + 
                    "posicion lobo: " + lobo + ", " +
                    "posicion granjero: " + granjero;
        }
}


