package Dao;

import Factory.ConnectionFactory;
import Model.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MatriculaDao {

    static private PreparedStatement stmt;
    static private ResultSet rs;
    static private Connection connection;

    public static boolean inserir(Matricula matricula) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "insert into Matricula values (?, ?, ?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, matricula.getNumAluno());
            stmt.setInt(2, matricula.getIdturma());
            stmt.setInt(3, matricula.getNota1());
            stmt.setInt(4, matricula.getNota2());
            stmt.setInt(5, matricula.getExame());
            stmt.setInt(6, matricula.getFaltas());
            stmt.setBoolean(7, matricula.isAprovado());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Matricula pesquisar(int numAluno, int idTurma) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula where numAluno = ? and idTurma = ?";

        Matricula matriculaRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, numAluno);
            stmt.setInt(2, idTurma);

            rs = stmt.executeQuery();

            if (rs.next()) {
                matriculaRetorno = criarObjetoMatricula(rs);
            }

            fecharConexoes();

            return matriculaRetorno;

        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return matriculaRetorno;
        }
    }

    public static List<Matricula> pesquisarPorTurma(int idTurma) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula where idTurma = ?";

        try {
            List<Matricula> matriculas = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, idTurma);
            rs = stmt.executeQuery();

            while (rs.next()) {
                matriculas.add(criarObjetoMatricula(rs));
            }

            fecharConexoes();
            return matriculas;

        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static List<Matricula> pesquisarPorAluno(int numAluno) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula where numAluno = ?";

        List<Matricula> matriculas = new ArrayList<>();
        try {

            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, numAluno);
            rs = stmt.executeQuery();

            while (rs.next()) {
                matriculas.add(criarObjetoMatricula(rs));
            }

            fecharConexoes();

            return matriculas;
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return matriculas;
        }
    }

    public static List<Matricula> listar() {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula";

        try {
            List<Matricula> matriculas = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            rs = stmt.executeQuery();

            while (rs.next()) {
                matriculas.add(criarObjetoMatricula(rs));
            }

            fecharConexoes();
            return matriculas;

        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return null;
        }
    }

    public static boolean alterar(Matricula matricula) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "update Matricula set nota1 = ?, nota2 = ?, exame = ?, faltas = ?, aprovado = ? where numAluno = ? and idTurma = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, matricula.getNota1());
            stmt.setInt(2, matricula.getNota2());
            stmt.setInt(3, matricula.getExame());
            stmt.setInt(4, matricula.getFaltas());
            stmt.setBoolean(5, matricula.isAprovado());

            stmt.setInt(6, matricula.getNumAluno());
            stmt.setInt(7, matricula.getIdturma());

            stmt.execute();

            fecharConexoes();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Matricula criarObjetoMatricula(ResultSet rs) throws SQLException {
        return new Matricula(
                rs.getInt("numAluno"),
                rs.getInt("idTurma"),
                rs.getInt("nota1"),
                rs.getInt("nota2"),
                rs.getInt("exame"),
                rs.getInt("faltas"),
                rs.getBoolean("aprovado")
        );
    }

}
