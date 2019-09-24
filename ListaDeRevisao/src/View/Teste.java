/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import listaderevisaoq5.Imovel;
import listaderevisaoq5.Novo;
import listaderevisaoq5.Velho;

/**
 *
 * @author Hyago Santana
 */
public class Teste {
    public static void main(String[] args){
        
       Imovel casa = new Imovel();
        
        casa.endereco = "SQ 13 Quadra 03 Casa 53";
        casa.preco = 100000;
        
        String imovel = JOptionPane.showInputDialog("Digite 1 para NOVO e 2 para VELHO:");
        
        if(imovel.equals("1")){
            Novo novo = new Novo();
            JOptionPane.showMessageDialog(null,novo.getNovo());
        } else if(imovel.equals("2")){
            Velho velho = new Velho();
            JOptionPane.showMessageDialog(null,velho.getVelho());
        } else {
           JOptionPane.showMessageDialog(null,"Erro você deve inserir 1 ou 2");
        }
    }
    
    
    
    
} 
  

           
            
    

