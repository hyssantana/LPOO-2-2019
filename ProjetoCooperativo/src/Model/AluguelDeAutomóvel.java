
package Model;

public abstract class AluguelDeAutomóvel {
    protected double preço;
    protected String prazo;
    protected String proprietario;

    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public String getPrazo() {
        return prazo;
    }
    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public AluguelDeAutomóvel(double preço, String prazo, String proprietario) {
        this.preço = preço;
        this.prazo = prazo;
        this.proprietario = proprietario;
    }
   
    public AluguelDeAutomóvel (){
    }
}
