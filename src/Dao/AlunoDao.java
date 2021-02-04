package Dao;

import Factory.ConnectionFactory;
import Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDao {

    static private PreparedStatement stmt;
    static private ResultSet rs;
    static private Connection connection;

    public static boolean inserir(Aluno aluno) {
        AlunoDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "insert into Aluno values (?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, aluno.getNumero());
            stmt.setString(2, aluno.getCurso());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Aluno pesquisar(int numero) {
        AlunoDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Aluno where numero = ?";

        Aluno alunoRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, numero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                alunoRetorno = criarObjetoAluno(rs);
            }
            
            fecharConexoes();

            return alunoRetorno;

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return alunoRetorno;
        }
    }

    public static List<Aluno> listar() {
        AlunoDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Aluno";

        try {
            List<Aluno> alunos = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                alunos.add(criarObjetoAluno(rs));
            }

            fecharConexoes();
            return alunos;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static boolean alterar(Aluno aluno) {
        AlunoDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Aluno set curso = ? where numero = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setString(1, aluno.getCurso());
            stmt.setInt(2, aluno.getNumero());

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

    private static Aluno criarObjetoAluno(ResultSet rs) throws SQLException {
        return new Aluno(rs.getInt("numero"), rs.getString("curso"));
    }

}
