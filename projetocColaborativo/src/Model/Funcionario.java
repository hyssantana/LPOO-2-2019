package Model;

public class Funcionario extends Pessoa {
    private int codigoFunc;
    private String cargo;
    private String dataAdmissao;
    private double salario;
    private String setor;

    public Funcionario(String nome, int idade, float altura) {
        super(nome, idade, altura);
    }

    public int getCodigoFunc() {
        return codigoFunc;
    }

    public void setCodigoFunc(int codigoFunc) {
        this.codigoFunc = codigoFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario(int codigoFunc, String cargo, String dataAdmissao, double salario, String setor, String nome, int idade, float altura) {
        super(nome, idade, altura);
        this.codigoFunc = codigoFunc;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.setor = setor;
    }
      
    
    
}
