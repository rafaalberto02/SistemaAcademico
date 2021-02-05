package Dao;

import Factory.ConnectionFactory;
import Model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TurmaDao {

    static private PreparedStatement stmt;
    static private ResultSet rs;
    static private Connection connection;

    public static boolean inserir(Turma turma) {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "insert into Turma values (?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, turma.getId());
            stmt.setInt(2, turma.getSemestre());
            stmt.setInt(3, turma.getAno());
            stmt.setInt(4, turma.getNumProfessor());
            stmt.setInt(5, turma.getcodDisciplina());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static boolean alterar(Turma turma) {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Turma set semestre = ?, ano = ?, numProfessor = ?, codDisciplina = ? where id = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, turma.getSemestre());
            stmt.setInt(2, turma.getAno());
            stmt.setInt(3, turma.getNumProfessor());
            stmt.setInt(4, turma.getcodDisciplina());
            stmt.setInt(5, turma.getId());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Turma pesquisar(int id) {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Turma where id = ?";

        Turma turmaRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                turmaRetorno = criarObjetoTurma(rs);
            }

            fecharConexoes();

            return turmaRetorno;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return turmaRetorno;
        }
    }

    public static List<Turma> listar() {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Turma";

        try {
            List<Turma> turmas = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                turmas.add(criarObjetoTurma(rs));
            }

            fecharConexoes();
            return turmas;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static boolean remover(int id) {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "delete from Turma where id = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, id);
            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static int quantidadeDeAlunos(int idTurma) {
        TurmaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "SELECT id, count(*) as numAlunos from Turma "
                + "INNER JOIN Matricula "
                + "on Turma.id = Matricula.idTurma and Matricula.idTurma = ? ";

        try {
            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, idTurma);
            rs = stmt.executeQuery();

            rs.next();
            int quantidade = rs.getInt("numAlunos");

            fecharConexoes();
            return quantidade;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return 0;
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
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Turma criarObjetoTurma(ResultSet rs) throws SQLException {
        return new Turma(rs.getInt("id"), rs.getInt("semestre"), rs.getInt("ano"), rs.getInt("numProfessor"), rs.getInt("codDisciplina"));
    }

}
