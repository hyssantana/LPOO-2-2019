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
public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    public DiaDosNamorados() {}

    @Override
    public void retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null, "Querido(a)," + remetente + " Feliz Dia dos Namorados!\n"
                + "Espero que esse tenha sido o único cartão do dia dos namorados\n"
                + "que tenha ganhado nessa data!” De todo meu coração,\n"
                + "João");
    }

}
