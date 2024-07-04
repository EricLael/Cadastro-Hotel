/******************************************************
 *                                                    *
 *        ReservaDao - Data Access Object (DAO)       *
 *            para Manipulação de Reservas            *
 *                                                    *
 ******************************************************/

package dao;

import conexao.Conexao;
import modelo.Reserva;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDao {

    public static int salvar(Reserva reserva) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("INSERT INTO Reservas (Id_Cliente, Id_Quarto, Check_In, Check_Out, Data_Reserva) VALUES (?, ?, ?, ?, ?)");
        ps.setInt(1, reserva.getId_Cliente());
        ps.setInt(2, reserva.getId_Quarto());
        ps.setDate(3, new java.sql.Date(reserva.getCheck_In().getTime())); // Convert java.util.Date to java.sql.Date
        ps.setDate(4, new java.sql.Date(reserva.getCheck_Out().getTime())); // Convert java.util.Date to java.sql.Date
        ps.setTimestamp(5, reserva.getData_Reserva());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int atualizar(Reserva reserva) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("UPDATE Reservas SET Id_Cliente = ?, Id_Quarto = ?, Check_In = ?, Check_Out = ?, Data_Reserva = ? WHERE Id_Reserva = ?");
        ps.setInt(1, reserva.getId_Cliente());
        ps.setInt(2, reserva.getId_Quarto());
        ps.setDate(3, new java.sql.Date(reserva.getCheck_In().getTime())); // Convert java.util.Date to java.sql.Date
        ps.setDate(4, new java.sql.Date(reserva.getCheck_Out().getTime())); // Convert java.util.Date to java.sql.Date
        ps.setTimestamp(5, reserva.getData_Reserva());
        ps.setInt(6, reserva.getId_Reserva());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int excluir(int Id_Reserva) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("DELETE FROM Reservas WHERE Id_Reserva = ?");
        ps.setInt(1, Id_Reserva);
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static List<Reserva> listar() throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("SELECT * FROM Reservas");
        ResultSet rs = ps.executeQuery();
        List<Reserva> reservas = new ArrayList<>();
        while (rs.next()) {
            Reserva reserva = new Reserva(
                    rs.getInt("Id_Reserva"),
                    rs.getInt("Id_Cliente"),
                    rs.getInt("Id_Quarto"),
                    rs.getDate("Check_In"),
                    rs.getDate("Check_Out"),
                    rs.getTimestamp("Data_Reserva")
            );
            reservas.add(reserva);
        }
        return reservas;
    }
}
