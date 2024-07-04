/******************************************************
 *                                                    *
 *        QuartoDao - Data Access Object (DAO)        *
 *            para Manipulação de Quartos             *
 *                                                    *
 ******************************************************/

package dao;

import conexao.Conexao;
import modelo.Quarto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuartoDao {

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int salvar(Quarto quarto) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("INSERT INTO Quartos (Tipo, Descricao, Numero, Diaria) VALUES (?, ?, ?, ?)");
        ps.setString(1, quarto.getTipo());
        ps.setString(2, quarto.getDescricao());
        ps.setInt(3, quarto.getNumero());
        ps.setDouble(4, quarto.getDiaria());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int atualizar(Quarto quarto) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("UPDATE Quartos SET Tipo = ?, Descricao = ?, Numero = ?, Diaria = ? WHERE Id_Quarto = ?");
        ps.setString(1, quarto.getTipo());
        ps.setString(2, quarto.getDescricao());
        ps.setInt(3, quarto.getNumero());
        ps.setDouble(4, quarto.getDiaria());
        ps.setInt(5, quarto.getIdQuarto());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int excluir(int idQuarto) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("DELETE FROM Quartos WHERE Id_Quarto = ?");
        ps.setInt(1, idQuarto);
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static List<Quarto> listar() throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("SELECT * FROM Quartos");
        ResultSet rs = ps.executeQuery();
        List<Quarto> quartos = new ArrayList<>();
        while (rs.next()) {
            Quarto quarto = new Quarto(rs.getInt("Id_Quarto"), rs.getString("Tipo"), rs.getString("Descricao"), rs.getInt("Numero"), rs.getDouble("Diaria"));
            quartos.add(quarto);
        }
        return quartos;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
}
