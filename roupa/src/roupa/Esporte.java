/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roupa;

/**
 *
 * @author Lucas
 */
public class Esporte extends Roupa {

    @Override
    public void lavar() {
        super.lavar(); 
        System.out.println("Roupa Esporte lavada.");
    }

    @Override
    public void dobrar() {
        super.dobrar();
        System.out.println("Roupa Esportiva dobrada.");
    }

    @Override
    public String toString() {
        return "Esporte " + super.toString();
    }     
}
