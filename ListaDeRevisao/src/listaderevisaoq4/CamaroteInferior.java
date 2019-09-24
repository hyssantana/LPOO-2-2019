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
public class CamaroteInferior extends VIP {

   private String localizacaoIngresso;
    
    public void setLocalizacao(String localizacao){
        localizacaoIngresso = localizacao;
    }
    
    public String getLocalizacao() {
        return "Localização do Ingresso: " + localizacaoIngresso;
    }  

}
