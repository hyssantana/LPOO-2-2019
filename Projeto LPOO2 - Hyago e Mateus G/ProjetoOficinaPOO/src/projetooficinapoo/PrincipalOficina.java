/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetooficinapoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class PrincipalOficina {

    /**
     * 1
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Usuario> Oficina = new ArrayList<Usuario>();
        ArrayList<Usuario> ClienteOficina = new ArrayList<Usuario>();
        ArrayList<Automovel> Automovel = new ArrayList<Automovel>();

        int txt = 0;
        int txt1 = 0;
        do {
            txt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Cadastrar Oficina\n2.Cadastrar Cliente\n3.Cadastrar Automóvel\n4.Serviços\n5. Sair"));
            if (txt == 1) {
                String nome = JOptionPane.showInputDialog("Digite o Nome da Oficina: ");
                String CpfCnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
                Usuario usuario = new GerarServicos().criaUsuario(txt);
                usuario.setNome(nome);
                usuario.setCpfCnpj(CpfCnpj);
                Oficina.add(usuario);
                JOptionPane.showMessageDialog(null, "Cadastro de Oficina realizado com sucesso!");

            }
            if (txt == 2) {
                String nome = JOptionPane.showInputDialog("Nome do Cliente : ");
                String CpfCnpj = JOptionPane.showInputDialog("Digite o CPF: ");
                Usuario u = new GerarServicos().criaUsuario(txt);
                u.setNome(nome);
                u.setCpfCnpj(CpfCnpj);
                ClienteOficina.add(u);
                JOptionPane.showMessageDialog(null, "Cadastro de usuário realizado com sucesso!");

            }

            if (txt == 3) {
                String automovel = JOptionPane.showInputDialog("1. Cadastrar Caminhão\n2.Cadastrar Carro");
                String modelo = JOptionPane.showInputDialog("Digite o Modelo: ");
                String cor = JOptionPane.showInputDialog("Digite a cor: ");
                String placa = JOptionPane.showInputDialog("Digite a placa: ");
                Automovel a = new GerarServicos().criaAutomovel(Integer.parseInt(automovel));
                a.setModelo(modelo);
                a.setCor(cor);
                a.setPlaca(placa);
                Automovel.add(a);
                JOptionPane.showMessageDialog(null, "Cadastro de veículo realizado com sucesso!:");

            }
            if (txt == 4) {

                String of = JOptionPane.showInputDialog("Oficina que Realizou o serviço:");
                String pre = JOptionPane.showInputDialog("Preco do Serviço: ");
                String TipoServ = JOptionPane.showInputDialog("Tipo do Serviço: ");
                String prop = JOptionPane.showInputDialog("Proprietario do Veículo: ");
                JOptionPane.showMessageDialog(null, "Consulta de serviços realizado com sucesso!");
                

            }
        } while (txt != 5);

    }
}
