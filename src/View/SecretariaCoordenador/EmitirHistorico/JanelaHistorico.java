package View.SecretariaCoordenador.EmitirHistorico;

import Controller.DisciplinaController;
import Controller.MatriculaController;
import Controller.TurmaController;
import Model.Disciplina;
import Model.Matricula;
import Model.Turma;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JanelaHistorico extends javax.swing.JFrame {

    private final Usuario usuario;

    public JanelaHistorico(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisciplinas = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("HISTÓRICO");

        jTableDisciplinas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Disciplina", "Nota 1", "Nota 2", "Exame", "Faltas", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDisciplinas);

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDisciplinas;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        DefaultTableModel tableModel = (DefaultTableModel) jTableDisciplinas.getModel();
        tableModel.setRowCount(0);

        List<Matricula> matriculas = MatriculaController.pesquisarPorAluno(usuario.getNumero());

        matriculas.forEach(matricula -> {
            Turma turma = TurmaController.pesquisar(matricula.getIdturma());
            Disciplina disciplina = DisciplinaController.pesquisarPorCodigo(turma.getCodDisciplina());

            tableModel.addRow(adicionarLinha(matricula, disciplina));
        });

    }

    private Object[] adicionarLinha(Matricula matricula, Disciplina disciplina) {
        List<Object> linha = new ArrayList();

        linha.add(usuario.getNumero());
        linha.add(usuario.getNome());
        linha.add(disciplina.getNome());
        linha.add(matricula.getNota1());
        linha.add(matricula.getNota2());

        if (matricula.getExame() == -1) {
            linha.add("Necessário realizar");
        } else {
            linha.add(matricula.getExame());
        }

        linha.add(matricula.getFaltas());

        if (matricula.isAprovado()) {
            linha.add("Aprovado");
        } else {
            linha.add("Reprovado");
        }

        return linha.toArray();
    }
}
