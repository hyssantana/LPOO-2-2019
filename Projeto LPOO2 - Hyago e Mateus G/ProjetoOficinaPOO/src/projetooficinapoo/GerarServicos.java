/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooficinapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class GerarServicos {

    ClienteOficina c1;
    Oficina c2;
    Automovel c3;
    MecanicaGeral p1;
    Lanternagem p2;

    GerarServicos(int txt1) {

    }

    GerarServicos() {

    }

    public void gerarServicos() {

    }

    public ServicosAutomovel gerarServicos(ClienteOficina x, Oficina y, Automovel z, int tipo) {
        if (tipo == 1) {
            MecanicaGeral px = new MecanicaGeral();

        }
        if (tipo == 2) {
            Lanternagem py = new Lanternagem();
        }
        return null;

    }

    public Usuario criaUsuario(int tipoUsuario) {
        if (tipoUsuario == 2) {
            return new ClienteOficina();
        }
        if (tipoUsuario == 1) {
            Oficina oficina = new Oficina();
            oficina.setEndereco(JOptionPane.showInputDialog("Endereço da Oficina: "));
            oficina.setContato(JOptionPane.showInputDialog("Contatos da Oficina"));
            oficina.setTipoServico(JOptionPane.showInputDialog("Especialidade da Oficina: "));
            return oficina;
        }
        return null;
    }

    public Automovel criaAutomovel(int tipoAutomovel) {
        
        if (tipoAutomovel == 1) {
            return new Caminhao ();

        }
        if (tipoAutomovel == 2) {

            return new Automovel();

        }
        return null;

    }
        

    public GerarServicos(ClienteOficina c1, Oficina c2, Automovel c3, MecanicaGeral p1, Lanternagem p2) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.p1 = p1;
        this.p2 = p2;
    }

    ServicosAutomovel ServicosAutomovel(int txt1) {
        return null;

    }

}
