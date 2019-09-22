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
public class Usuario {

    protected String nome;
    protected String CpfCnpj;

    public Usuario() {

    }

    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, String CpfCnpj) {
        this.nome = nome;
        this.CpfCnpj = CpfCnpj;

    }
}
