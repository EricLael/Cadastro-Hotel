/******************************************************
 *                                                    *
 *           Classe Cliente - Modelo de Dados         *
 *                                                    *
 ******************************************************/

package modelo;

public class Cliente {

    private int Id_Cliente;
    private String Nome_Completo;
    private String Cpf;
    private String Telefone;
    private String Email;

    public Cliente (int Id_Cliente, String Nome_Completo, String Cpf, String Telefone, String Email) {
        this.Id_Cliente = Id_Cliente;
        this.Nome_Completo = Nome_Completo;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getNome_Completo() {
        return Nome_Completo;
    }

    public void setNome_Completo (String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getCpf() {
        return Cpf;
    }

    public void setCpf (String Cpf) {
        this.Cpf = Cpf;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone (String Telefone) {
        this.Telefone = Telefone;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public String getEmail() {
        return Email;
    }

    public void setEmail (String Email) {
        this.Email = Email;
    }
}
