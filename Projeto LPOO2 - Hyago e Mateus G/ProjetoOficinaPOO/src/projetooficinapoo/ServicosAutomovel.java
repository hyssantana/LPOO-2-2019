/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooficinapoo;

/**
 *
 * @author Home
 */
public abstract class ServicosAutomovel {
    protected String preco;
    protected String tipoServico;
    protected String proprietario;
    
 

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    
    public ServicosAutomovel (String preco, String tipoServico, String proprietario){
        this.preco = preco;
        this.tipoServico = tipoServico;
        this.proprietario = proprietario;
    }
       public ServicosAutomovel(){
        
    }
}
