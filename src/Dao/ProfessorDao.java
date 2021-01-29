package Dao;

import Factory.ConnectionFactory;
import Model.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfessorDao {

    static private PreparedStatement stmt;
    static private ResultSet rs;
    static private Connection connection;

    public static boolean inserir(Professor professor) {
        ProfessorDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "insert into Professor values (?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, professor.getNumero());
            stmt.setString(2, professor.getTitulacao());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Professor pesquisar(int numero) {
        ProfessorDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Professor where numero = ?";

        Professor professorRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, numero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                professorRetorno = criarObjetoProfessor(rs);
            }

            fecharConexoes();

            return professorRetorno;

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return professorRetorno;
        }
    }

    public static List<Professor> listar() {
        ProfessorDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Professor";

        try {
            List<Professor> professores = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                professores.add(criarObjetoProfessor(rs));
            }

            fecharConexoes();
            return professores;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static boolean alterar(Professor professor) {
        ProfessorDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Professor set titulacao = ? where numero = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setString(1, professor.getTitulacao());
            stmt.setInt(2, professor.getNumero());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
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

    private static Professor criarObjetoProfessor(ResultSet rs) throws SQLException {
        return new Professor(rs.getInt("numero"), rs.getString("titulacao"));
    }

}
