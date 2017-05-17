/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr_randomization.entités;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author miled
 */
public class Case {
    
    int identifier;
    List<Integer> problem; //partie problem
    List<Itineraire> solution; //partie solution
    
    public static int identifierCmp = 0;

    public Case() {
        this.problem = new ArrayList<>();
        this.solution = new ArrayList<>();  
    }
    
    /**
     *
     * @param problem
     * @param solution
     */
    public Case(List<Integer> problem,List<Itineraire> solution ){
        
        Case.identifierCmp ++;
        this.identifier = identifierCmp;
        this.problem = problem;
        this.solution = solution;
    }
    
    @Override
    public String toString(){
        String prob = "";
        String sol = "";
        Iterator<Integer> itrProb = this.problem.iterator();
        while (itrProb.hasNext()) {
            int element = itrProb.next();
            prob = prob + ", P"+element;
        }
        
        Iterator<Itineraire> itrSol = this.solution.iterator();
        while (itrSol.hasNext()) {
            String element =((Itineraire) itrSol.next()).toString();
            sol = sol + ", "+ element;
        }
        
        return "{"+prob+"} --> ("+sol+")"; 
    }
    
}
