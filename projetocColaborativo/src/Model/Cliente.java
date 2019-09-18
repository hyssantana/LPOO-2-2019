/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa{
    private int codCliente;
    private double descontoEspecial;
    private String vendedor;

    public Cliente(String nome, int idade, float altura) {
        super(nome, idade, altura);
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public double getDescontoEspecial() {
        return descontoEspecial;
    }

    public void setDescontoEspecial(double descontoEspecial) {
        this.descontoEspecial = descontoEspecial;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }


    
    
}
