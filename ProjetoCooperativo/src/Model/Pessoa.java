package Model;

public class Pessoa {
    protected String nome;
    protected String Cpf;
    
    public Pessoa (){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public Pessoa(String nome, String Cpf) {
        this.nome = nome;
        this.Cpf = Cpf;
    }
    
}
