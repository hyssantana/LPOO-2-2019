/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GerarAluguel;
import Model.AluguelDeAutomovel;
import Model.Automovel;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class principal {
    public static void main(String []args){
        ArrayList <Pessoa> Funcionarios= new ArrayList<Pessoa>();
        ArrayList <Pessoa> Cliente= new ArrayList<Pessoa>();
        ArrayList <Automovel> automoveis= new ArrayList<Automovel>();
        ArrayList <AluguelDeAutomovel> Algueis= new ArrayList<AluguelDeAutomovel>();
        int txt = 0;
        
    

Object[] opcoes = {"1 - Cadastrar Funcionario", "2 - Cadastrar Cliente", "3 - Cadastrar Automóvel",
            "4 - Criar Aluguel", "5 - Sair"};

        String Escolha = String.valueOf(JOptionPane.showInputDialog(null, "MENU", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes));
    
        
        
        GerarAluguel c1 = new GerarAluguel();
        
        
         switch (Escolha){
            case "1 - Cadastrar Funcionario":
                String c = null;
                String f = null;
                String a = null;
                String txta = null;
                c1.gerarAluguel(c, f, a, txta);
                
        
}

    
    
    
    
    
    
}
        
       
    
    
    
}
