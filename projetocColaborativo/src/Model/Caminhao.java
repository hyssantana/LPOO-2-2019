
package Model;

/**
 *
 * @author aluno
 */
public class Caminhao extends Automovel{
    private int qtdRodas;
    private String tipoCarroceria;
    private int qtdEixo;

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public int getQtdEixo() {
        return qtdEixo;
    }

    public void setQtdEixo(int qtdEixo) {
        this.qtdEixo = qtdEixo;
    }

    public Caminhao(int qtdRodas, String tipoCarroceria, int qtdEixo, String cor, String modelo) {
        super(cor, modelo);
        this.qtdRodas = qtdRodas;
        this.tipoCarroceria = tipoCarroceria;
        this.qtdEixo = qtdEixo;
    }

   
    
}
