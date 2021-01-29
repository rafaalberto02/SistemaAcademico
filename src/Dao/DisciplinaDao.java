package Dao;

import Factory.ConnectionFactory;
import Model.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisciplinaDao {

    static private PreparedStatement stmt;
    static private ResultSet rs;
    static private Connection connection;

    public static boolean inserir(Disciplina disciplina) {
        DisciplinaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "insert into Disciplina values (?, ?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, disciplina.getCodigo());
            stmt.setString(2, disciplina.getNome());
            stmt.setInt(3, disciplina.getCredito());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static boolean alterar(Disciplina disciplina) {
        DisciplinaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Disciplina set nome = ?, credito = ? where codigo = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCredito());
            stmt.setInt(3, disciplina.getCodigo());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Disciplina pesquisar(int codigo) {
        DisciplinaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Disciplina where codigo = ?";

        Disciplina disciplinaRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                disciplinaRetorno = criarObjetoDiscuplina(rs);
            }

            fecharConexoes();

            return disciplinaRetorno;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return disciplinaRetorno;
        }
    }

    public static List<Disciplina> listar() {
        DisciplinaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Disciplina";

        try {
            List<Disciplina> disciplinas = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                disciplinas.add(criarObjetoDiscuplina(rs));
            }

            fecharConexoes();
            return disciplinas;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static boolean remover(int codigo) {
        DisciplinaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "delete from Disciplina where codigo = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, codigo);
            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Disciplina criarObjetoDiscuplina(ResultSet rs) throws SQLException {
        return new Disciplina(rs.getInt("codigo"), rs.getString("nome"), rs.getInt("credito"));
    }
}
