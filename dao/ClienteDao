/******************************************************
 *                                                    *
 *        ClienteDao - Data Access Object (DAO)       *
 *            para Manipulação de Clientes            *
 *                                                    *
 ******************************************************/

package dao;

import conexao.Conexao;
import modelo.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    public static int salvar(Cliente cliente) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("INSERT INTO Clientes (Nome_Completo, Cpf, Telefone, Email) VALUES (?, ?, ?, ?)");
        ps.setString(1, cliente.getNome_Completo());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEmail());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int atualizar(Cliente cliente) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("UPDATE Clientes SET Nome_Completo = ?, Cpf = ?, Telefone = ?, Email = ? WHERE Id_Cliente = ?");
        ps.setString(1, cliente.getNome_Completo());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getTelefone());
        ps.setString(4, cliente.getEmail());
        ps.setInt(5, cliente.getId_Cliente());
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static int excluir(int Id_Cliente) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("DELETE FROM Clientes WHERE Id_Cliente = ?");
        ps.setInt(1, Id_Cliente);
        return ps.executeUpdate();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static List<Cliente> listar() throws SQLException, ClassNotFoundException {
        PreparedStatement ps = Conexao.getConexao().prepareStatement("SELECT * FROM Clientes");
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getInt("Id_Cliente"), rs.getString("Nome_Completo"), rs.getString("Cpf"), rs.getString("Telefone"), rs.getString("Email"));
            clientes.add(cliente);
        }
        return clientes;
    }
}
