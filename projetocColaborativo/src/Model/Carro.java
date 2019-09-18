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
public class Carro extends Automovel{
    private String chassi;
    private String placa;
    private int qtdPorta;
    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdPorta() {
        return qtdPorta;
    }

    public void setQtdPorta(int qtdPorta) {
        this.qtdPorta = qtdPorta;
    }

    public Carro(String chassi, String placa, int qtdPorta, String cor, String modelo) {
        super(cor, modelo);
        this.chassi = chassi;
        this.placa = placa;
        this.qtdPorta = qtdPorta;
    }
    
    
}
