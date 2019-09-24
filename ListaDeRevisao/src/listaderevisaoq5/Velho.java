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
public class Velho extends Imovel {
    private double valorVelho = preco - 12000;
    
    public void setValor(double valor){
        valorVelho = valor;
    }
    
    public String getVelho(){
        return "Valor do imovel velho: " + valorVelho;
    }
    
}
