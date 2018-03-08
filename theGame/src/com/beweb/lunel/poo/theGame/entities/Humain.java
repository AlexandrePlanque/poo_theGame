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
public class Humain extends Personnage{
    public Humain(){
        this.endurance += 3;
        this.force -= 2;
        this.pv += 10;
        this.nom = "toto";
    }
    public Humain(String a){
        this.endurance += 3;
        this.force -= 2;
        this.pv += 10;
        this.nom = a;
    
    }
        void showStat(){
        System.out.println(endurance);
        System.out.println(pv);
        System.out.println(force);
        System.out.println(nom);
    }
    
}
