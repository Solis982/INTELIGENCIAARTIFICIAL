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
public class transition {

    
    public enum Action {
        MOVER_OVEJA, MOVER_REPOLLO, MOVER_LOBO, MOVER_GRANJERO
    }
    public State initial;
    public Action action;
    public State doTransition() {
    
        State result = new State();
         if (action == Action.MOVER_GRANJERO) {
           
            result.oveja = initial.oveja;
            result.repollo = initial.repollo;
            result.lobo = initial.lobo;
         if(initial.granjero == position.DERECHA)
             result.granjero = position.IZQUIERDA;
         else
         result.granjero = position.DERECHA;
         }
         if (action == Action.MOVER_OVEJA) {
             if(initial.oveja == position.DERECHA)
                 result.oveja = position.IZQUIERDA;
             else 
                result.oveja = position.DERECHA;
             result.repollo = initial.repollo;
             result.lobo = initial.lobo;
             if(initial.granjero == position.DERECHA)
                 result.granjero = position.IZQUIERDA;
        else 
                result.granjero = position.DERECHA;
        }
         return result;

    }
          
         public transition(State initial, Action action){
             this.initial = initial;
             this.action = action;
         }
         }