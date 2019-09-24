/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaderevisaoq3;

/**
 *
 * @author Hyago Santana
 */
public class Funcionario {
    int matricula;
    String nome;
    String cpf;
    double salario;
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Funcionario(int matricula) {
        this.matricula = matricula;
    }
    
    public void exibeDados(){}
    
    
    
}
