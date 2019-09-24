/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaderevisaoq4;

/**
 *
 * @author Hyago Santana
 */
public abstract class VIP extends Ingresso {
    protected double valorAdicional;
    
public String ingressoVip() {
        double valorIngresso = preco + valorAdicional;
       return "Ingresso VIP: " + preco;
    }

}

  
    

