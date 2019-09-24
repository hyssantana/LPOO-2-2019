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
public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    public Aniversario(){}

    @Override
    public void retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null, "Parabéns" + remetente + " Que Deus te abençoe!\n"
                + "Que todos os seus sonhos sejam realizados\n"
                + "e que você ganhe muitos presentes\n"
                + "Feliz Aniversário!");
    }

}
