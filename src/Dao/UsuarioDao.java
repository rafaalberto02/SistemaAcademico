package Dao;

import Factory.ConnectionFactory;
import Model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDao {

    private static PreparedStatement stmt;
    private static ResultSet rs;
    private static Connection connection;

    public static boolean inserir(Usuario usuario) {
        UsuarioDao.connection = ConnectionFactory.getConnection();

        String SQLQuery = "insert into Usuario values (?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, usuario.getNumero());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getPerfil());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }

    }

    public static Usuario pesquisarPorNumero(int numero) {
        UsuarioDao.connection = ConnectionFactory.getConnection();

        String SQLQuery = "select * from Usuario where numero = ?";

        try {
            Usuario usuarioRetorno = null;

            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, numero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioRetorno = criarObjetoUsuario(rs);
            }

            fecharConexoes();
            return usuarioRetorno;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static Usuario pesquisarPorLogin(String login) {
        UsuarioDao.connection = ConnectionFactory.getConnection();

        String SQLQuery = "select * from Usuario where login = ?";

        try {
            Usuario usuarioRetorno = null;

            stmt = connection.prepareStatement(SQLQuery);
            stmt.setString(1, login);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuarioRetorno = criarObjetoUsuario(rs);
            }

            fecharConexoes();
            return usuarioRetorno;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static List<Usuario> listar() {
        UsuarioDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Usuario";

        try {
            List<Usuario> usuarios = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuarios.add(criarObjetoUsuario(rs));
            }

            fecharConexoes();
            return usuarios;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }

    }

    public static boolean alterar(Usuario usuario) {
        UsuarioDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Usuario set nome = ?, login = ? where numero = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setInt(3, usuario.getNumero());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }

    }

    public static boolean remover(int numero) {
        UsuarioDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "delete from Usuario where numero = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, numero);

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }

    }

    private static Usuario criarObjetoUsuario(ResultSet rs) throws SQLException {

        return new Usuario(rs.getInt("numero"),
                rs.getString("nome"),
                rs.getString("login"),
                rs.getString("senha"),
                rs.getString("perfil"));

    }

    private static void fecharConexoes() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
