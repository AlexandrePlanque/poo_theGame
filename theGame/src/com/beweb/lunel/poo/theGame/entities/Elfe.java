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
public class Elfe extends Personnage{
    public Elfe(){
        //this.endurance -= 3;
        //this.force += 4;
        //this.nom = "tata";
    }
    
    public Elfe(String a){
        this.endurance -= 3;
        this.force += 4;
        this.nom = a;
    
    }
        void showStat(){
        System.out.println(endurance);
        System.out.println(pv);
        System.out.println(force);
        System.out.println(nom);
    }
}
