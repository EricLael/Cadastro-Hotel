/******************************************************
 *                                                    *
 *           Classe Quarto - Modelo de Dados          *
 *                                                    *
 ******************************************************/

package modelo;

public class Quarto {

    private int idQuarto;
    private String tipo;
    private String descricao;
    private int numero;
    private double diaria;

    public Quarto(int idQuarto, String tipo, String descricao, int numero, double diaria) {
        this.idQuarto = idQuarto;
        this.tipo = tipo;
        this.descricao = descricao;
        this.numero = numero;
        this.diaria = diaria;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
}
