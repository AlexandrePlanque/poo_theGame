/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

import com.beweb.lunel.poo.theGame.entities.Elfe;
import com.beweb.lunel.poo.theGame.entities.Humain;
import com.beweb.lunel.poo.theGame.entities.Orc;
import com.beweb.lunel.poo.theGame.entities.Personnage;

/**
 *
 * @author alexandreplanque
 */
public class TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Personnage[] domeDuTonnerre = new Personnage[2];
     domeDuTonnerre[0] = new Humain("Yannick");
     //domeDuTonnerre[1] = new Orc("Jonathan");
     domeDuTonnerre[1] = new Elfe("Loïc");
     
     int fin = 1000;
     
     while(fin > 0){
         double choix = Math.random();
         if(choix > 0.5){
             domeDuTonnerre[0].attaquer(domeDuTonnerre[1]);
             fin = domeDuTonnerre[1].pv;
         }else{
             domeDuTonnerre[1].attaquer(domeDuTonnerre[0]);
             fin = domeDuTonnerre[0].pv;
         }
         
    }
    }
    
   
}
