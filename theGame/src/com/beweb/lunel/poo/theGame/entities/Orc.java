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
public class Orc extends Personnage{
    public Orc(){
        this.endurance += 2;
        this.force += 5;
        this.pv -= 10;
        this.nom = "titi";
    }
    
    void showStat(){
        System.out.println(endurance);
        System.out.println(pv);
        System.out.println(force);
        System.out.println(nom);
    }
    
    public Orc(String a){
        this.endurance += 2;
        this.force += 5;
        this.pv -= 10;
        this.nom = a;
    
    }
}
