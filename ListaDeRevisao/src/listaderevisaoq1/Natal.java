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
public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }
    
    public Natal(){}

    @Override
    public void retornarMensagem(String remetente) {
    JOptionPane.showMessageDialog(null,"Olá," +remetente+ " Você foi um bom menino este ano!\n" +
"Que o seu natal seja prospéro e de muitos presentes\n" +
"lembre-se sempre do verdadeiro sentido do Natal,\n" +
"-Noel");  
    
}
}
