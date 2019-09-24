/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaderevisaoq1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hyago Santana
 */
public class PrincipalCartaoWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CartaoWeb[] array;
        CartaoWeb c1 = new Natal();
        CartaoWeb c2 = new DiaDosNamorados();
        CartaoWeb c3 = new Aniversario();

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        c1.setDestinatario(nome);
        c2.setDestinatario(nome);
        c3.setDestinatario(nome);
        c1.retornarMensagem(nome);
        c3.retornarMensagem(nome);
        c2.retornarMensagem(nome);
    }

}
