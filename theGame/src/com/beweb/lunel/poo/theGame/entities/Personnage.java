/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

/**
 *
 * @author alexandreplanque
 */
public class Personnage {
    public int endurance;
    public int force;
    public int pv;
    public String nom;
    
    public Personnage(){
        this.endurance = 10;
        this.force = 20;
        this.pv = 100;
        this.nom = "";
    }
    
    
    
    
    
    public void attaquer(Personnage cible){
        cible.pv = cible.pv - (this.force - cible.endurance);
        
        if(cible.pv <= 0){
            System.out.println(cible.nom + " est mort !!!");
        }else{
            System.out.println(this.nom + " attaque " + cible.nom + ", il reste " + cible.pv + " points de vie !");
        }
    }
}
