/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr_randomization;


import cbr_randomization.entités.Case;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miled
 */
public class KnowledgeGeneration {
    
    public static Deque<Case> fifo = new ArrayDeque<>();
    public static Map<Integer,Case> knowledgeBase = new HashMap<>();
    public static 

    //Chercher tous les cas de substitution de c
    private void chercherCasSubstitution(Case c) {
        for (Map.Entry pair : knowledgeBase.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }

    private void insererCasSubstitution(Case c) {

    }

    private void apparailler(Case c) {

    }
    
    
    
    public KnowledgeGeneration(){
        
        while (!fifo.isEmpty())
        {
            Case c = (Case)fifo.removeFirst();
            System.out.println("Cas à traiter: "+c.toString());
            
            //Chercher tous les cas de substitution de c
            chercherCasSubstitution(c);
            
            //Insérer c comme cas de substitution
            insererCasSubstitution(c);
            
            //Apparailler c avec autres cas similaires
            apparailler(c);
        }
        
    }
    
}
