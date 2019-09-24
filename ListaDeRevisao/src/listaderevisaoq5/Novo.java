/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaderevisaoq5;

/**
 *
 * @author Hyago Santana
 */
public class Novo extends Imovel {
   private double valorAdicional = preco + 12000;
    
    public void setValor(double valor){
        valorAdicional = valor;
    }
    
    public String getNovo(){
        return "Valor do Imovel novo: " + valorAdicional;
    }
}
}
