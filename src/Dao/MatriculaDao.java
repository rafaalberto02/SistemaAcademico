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
        String SQLQuery = "insert into Matricula values (?, ?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, matricula.getNumAluno());
            stmt.setInt(2, matricula.getCodDisciplina());
            stmt.setInt(3, matricula.getNota1());
            stmt.setInt(4, matricula.getNota2());
            stmt.setInt(5, matricula.getExame());
            stmt.setInt(6, matricula.getFaltas());

            stmt.execute();
            fecharConexoes();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            fecharConexoes();
            return false;
        }
    }

    public static Matricula pesquisar(int numAluno, int codDisciplina) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula where numAluno = ? and codDisciplina = ?";

        Matricula matriculaRetorno = null;

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, numAluno);
            stmt.setInt(2, codDisciplina);

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

    public static List<Matricula> pesquisarPorDisciplina(int codDisciplina) {
        MatriculaDao.connection = ConnectionFactory.getConnection();
        String SQLQuery = "select * from Matricula where codDisciplina = ?";

        try {
            List<Matricula> matriculas = new ArrayList();

            stmt = connection.prepareStatement(SQLQuery);
            stmt.setInt(1, codDisciplina);
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
        String SQLQuery = "update Matricula set nota1 = ?, nota2 = ?, exame = ?, faltas = ? where numAluno = ? and codDisciplina = ?";

        try {
            stmt = connection.prepareStatement(SQLQuery);

            stmt.setInt(1, matricula.getNota1());
            stmt.setInt(2, matricula.getNota2());
            stmt.setInt(3, matricula.getExame());
            stmt.setInt(4, matricula.getFaltas());

            stmt.setInt(5, matricula.getNumAluno());
            stmt.setInt(6, matricula.getCodDisciplina());

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
                rs.getInt("codDisciplina"),
                rs.getInt("nota1"),
                rs.getInt("nota2"),
                rs.getInt("exame"),
                rs.getInt("faltas")
        );
    }

}
