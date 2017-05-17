/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr_randomization.entités;

/**
 *
 * @author miled
 */
class Itineraire {
    int start; //pts de départ
    int end;   //pts d'arrivée
    
    public Itineraire(int start, int end){
        this.start = start;
        this.end = end;
        
    }
    
    public String toString(){
        return "P"+start+"-P"+end;
    }
    
}
