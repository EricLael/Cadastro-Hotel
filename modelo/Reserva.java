/******************************************************
 *                                                    *
 *          Classe Reserva - Modelo de Dados          *
 *                                                    *
 ******************************************************/

package modelo;

import java.sql.Timestamp;
import java.util.Date;

public class Reserva {

    private int Id_Reserva;
    private int Id_Cliente;
    private int Id_Quarto;
    private Date Check_In;
    private Date Check_Out;
    private Timestamp Data_Reserva;

    public Reserva (int Id_Reserva, int Id_Cliente, int Id_Quarto, Date Check_In, Date Check_Out, Timestamp Data_Reserva) {
        this.Id_Reserva = Id_Reserva;
        this.Id_Cliente = Id_Cliente;
        this.Id_Quarto = Id_Quarto;
        this.Check_In = Check_In;
        this.Check_Out = Check_Out;
        this.Data_Reserva = Data_Reserva;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public int getId_Quarto() {
        return Id_Quarto;
    }

    public void setId_Quarto(int Id_Quarto) {
        this.Id_Quarto = Id_Quarto;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public Date getCheck_In() {
        return Check_In;
    }

    public void setCheck_In(Date Check_In) {
        this.Check_In = Check_In;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public Date getCheck_Out() {
        return Check_Out;
    }

    public void setCheck_Out(Date Check_Out) {
        this.Check_Out = Check_Out;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public Timestamp getData_Reserva() {
        return Data_Reserva;
    }

    public void setData_Reserva(Timestamp Data_Reserva) {
        this.Data_Reserva = Data_Reserva;
    }
}
