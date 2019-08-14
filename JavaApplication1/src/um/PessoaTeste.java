package um;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PessoaTeste {

public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();
    DateTimeFormatter padraobrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // variável do padrão brasileiro
    
    System.out.println("Qual o seu nome?");
    pessoa.setNome(sc.nextLine());
    
    System.out.println("Qual a sua altura?");
    pessoa.setAltura(Double.parseDouble(sc.nextLine()));
    
    System.out.println("Qual a sua data de nascimento?");
    pessoa.setDataDeNascimento(LocalDate.parse(sc.nextLine(), padraobrasil));
    
    System.out.println("Seu nome é: " + pessoa.getNome());
    System.out.println("Sua altura é: " +pessoa.getAltura());
    System.out.println("Sua data de Nascimento é: " + pessoa.getDataDeNascimento().format(padraobrasil));
    System.out.println("Sua idade é: " + pessoa.CalcularIdade());
    
    
    
    
            
            }
        
        
}
