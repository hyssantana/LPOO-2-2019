package um;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


public class Pessoa {
private String Nome;
private LocalDate DataDeNascimento;
private Double Altura;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public LocalDate getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

public int CalcularIdade (){
Period idade = Period.between(DataDeNascimento, LocalDate.now());
return idade.getYears();

        
        
}
 


}
