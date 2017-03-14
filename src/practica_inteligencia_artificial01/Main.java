/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_inteligencia_artificial01;

import java.util.ArrayList;
import practica_inteligencia_artificial01.State.position;

/**
 *
 * @author Amairany Solis Pech
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        State initial = new State();
        initial.oveja = position.DERECHA;
        initial.repollo = position.DERECHA;
        initial.lobo = position.DERECHA;
        initial.granjero = position.DERECHA;
        System.out.print("Estado inicial: " + initial);
        
        ArrayList<transition> next = initial.validTransition();
        System.out.println("Transiciones: " + next.size());
        
        for(transition t: next){
            System.out.println("Action: " + t.action);
            System.out.println(" Resultado: " + t.doTransition());
        }
        // TODO code application logic here
    }
    
}
