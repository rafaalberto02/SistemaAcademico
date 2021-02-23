package View.Aluno.ManterMatriculas;

import Controller.DisciplinaController;
import Controller.MatriculaController;
import Controller.TurmaController;
import Controller.UsuarioController;
import Exceptions.LimiteDeAlunosAtingido;
import Model.FiltroTurmaDisciplina;
import Model.Matricula;
import Model.Turma;
import Model.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaRealizarMatricula extends javax.swing.JFrame {

    private final Usuario USUARIO;

    public JanelaRealizarMatricula(Usuario usuario) {
        initComponents();
        this.USUARIO = usuario;
        listar(new FiltroTurmaDisciplina());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarTurmas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldAno = new javax.swing.JTextField();
        jCheckBoxAno = new javax.swing.JCheckBox();
        jCheckBoxSemestre = new javax.swing.JCheckBox();
        jTextFieldSemestre = new javax.swing.JTextField();
        jTextFieldDisciplina = new javax.swing.JTextField();
        jCheckBoxDisciplina = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonMatricular = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Matricula");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("REALIZAR MATRICULA");

        jTableListarTurmas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableListarTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Semestre", "Ano", "Disciplina", "Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarTurmas);

        jTextFieldAno.setEditable(false);
        jTextFieldAno.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jCheckBoxAno.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxAno.setText("Ano");
        jCheckBoxAno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAnoActionPerformed(evt);
            }
        });

        jCheckBoxSemestre.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxSemestre.setText("Semestre");
        jCheckBoxSemestre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSemestreActionPerformed(evt);
            }
        });

        jTextFieldSemestre.setEditable(false);
        jTextFieldSemestre.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jTextFieldDisciplina.setEditable(false);
        jTextFieldDisciplina.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jCheckBoxDisciplina.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxDisciplina.setText("Disciplina");
        jCheckBoxDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDisciplinaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("Filtros:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBoxDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxDisciplina)
                        .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxSemestre)
                        .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxAno)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        jButtonMatricular.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonMatricular.setText("Matricular");
        jButtonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatricularActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonMatricular))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDisciplinaActionPerformed
        if (jCheckBoxDisciplina.isSelected()) {
            jTextFieldDisciplina.setEditable(true);
        } else {
            jTextFieldDisciplina.setText("");
            jTextFieldDisciplina.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBoxDisciplinaActionPerformed

    private void jCheckBoxSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSemestreActionPerformed
        if (jCheckBoxSemestre.isSelected()) {
            jTextFieldSemestre.setEditable(true);
        } else {
            jTextFieldSemestre.setText("");
            jTextFieldSemestre.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBoxSemestreActionPerformed

    private void jCheckBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAnoActionPerformed
        if (jCheckBoxAno.isSelected()) {
            jTextFieldAno.setEditable(true);
        } else {
            jTextFieldAno.setText("");
            jTextFieldAno.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBoxAnoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String disciplina = jTextFieldDisciplina.getText();
        int semestre = Integer.valueOf(jTextFieldSemestre.getText());
        int ano = Integer.valueOf(jTextFieldAno.getText());

        FiltroTurmaDisciplina filtro = new FiltroTurmaDisciplina(disciplina, semestre, ano);

        listar(filtro);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatricularActionPerformed
        if (jTableListarTurmas.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "E necessario selecionar uma disciplina da lista");
        } else {
            int linha = jTableListarTurmas.getSelectedRow();
            int idTurma = (int) jTableListarTurmas.getValueAt(linha, 0);

            Matricula matricula = new Matricula(USUARIO.getNumero(), idTurma);

            matricular(matricula);
        }
    }//GEN-LAST:event_jButtonMatricularActionPerformed

    private void ApenasNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumerosKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumerosKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMatricular;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxAno;
    private javax.swing.JCheckBox jCheckBoxDisciplina;
    private javax.swing.JCheckBox jCheckBoxSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarTurmas;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldDisciplina;
    private javax.swing.JTextField jTextFieldSemestre;
    // End of variables declaration//GEN-END:variables

    private void listar(FiltroTurmaDisciplina filtro) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableListarTurmas.getModel();
        tableModel.setRowCount(0);

        List<Turma> turmas = TurmaController.listarComFiltroAtivas(filtro);

        turmas.forEach(turma -> {
            tableModel.addRow(adicionarLinha(turma));
        });
    }

    private Object[] adicionarLinha(Turma turma) {

        Object[] linha = {
            turma.getId(),
            turma.getSemestre(),
            turma.getAno(),
            DisciplinaController.pesquisarPorCodigo(turma.getCodDisciplina()).getNome(),
            UsuarioController.pesquisar(turma.getNumProfessor()).getNome()
        };

        return linha;
    }

    private void matricular(Matricula matricula) {
        try {
            if (MatriculaController.inserir(matricula)) {
                JOptionPane.showMessageDialog(null, "Aluno matriculado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao matricular aluno");
            }
        } catch (LimiteDeAlunosAtingido ex) {
            Logger.getLogger(JanelaRealizarMatricula.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Essa turma está completamente cheia");
        }
    }
}
