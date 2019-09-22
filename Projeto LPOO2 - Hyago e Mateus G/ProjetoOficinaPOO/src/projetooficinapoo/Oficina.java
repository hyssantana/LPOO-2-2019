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
public class Oficina extends Usuario {
    
    private String endereco;
    private String contato;
    private String tipoServico;
    
    public Oficina(){
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String TipoServico) {
        this.tipoServico = TipoServico;
    }
    
    public Oficina (String enderco, String contato, String tipoServico){
        this.endereco = endereco;
        this.contato = contato;
        this.tipoServico = tipoServico;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpfCnpj() {
        return CpfCnpj;
    }

    @Override
    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }
    
    
}
