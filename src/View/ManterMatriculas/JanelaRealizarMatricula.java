package View.ManterMatriculas;

import Controller.DisciplinaController;
import Controller.MatriculaController;
import Controller.TurmaController;
import Controller.UsuarioController;
import Model.Filtro;
import Model.Matricula;
import Model.Turma;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaRealizarMatricula extends javax.swing.JFrame {

    private Usuario usuario;

    public JanelaRealizarMatricula() {
        initComponents();
    }

    public JanelaRealizarMatricula(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBoxDisciplina = new javax.swing.JCheckBox();
        jCheckBoxSemestre = new javax.swing.JCheckBox();
        jCheckBoxAno = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDisciplina = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldSemestre = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarTurmas = new javax.swing.JTable();
        jButtonMatricular = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel1.setText("REALIZAR MATRICULA");

        jCheckBoxDisciplina.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBoxDisciplina.setText("Disciplina");
        jCheckBoxDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDisciplinaActionPerformed(evt);
            }
        });

        jCheckBoxSemestre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBoxSemestre.setText("Semestre");
        jCheckBoxSemestre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSemestreActionPerformed(evt);
            }
        });

        jCheckBoxAno.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jCheckBoxAno.setText("Ano");
        jCheckBoxAno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Filtros:");

        jTextFieldDisciplina.setEditable(false);
        jTextFieldDisciplina.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jTextFieldAno.setEditable(false);
        jTextFieldAno.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jTextFieldSemestre.setEditable(false);
        jTextFieldSemestre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jButtonPesquisar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

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

        jButtonMatricular.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonMatricular.setText("Matricular");
        jButtonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatricularActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBoxDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jButtonMatricular)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPesquisar)
                        .addGap(85, 85, 85)
                        .addComponent(jButtonCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxDisciplina)
                            .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxSemestre)
                            .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxAno)
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonMatricular)
                    .addComponent(jButtonCancelar))
                .addGap(49, 49, 49))
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String disciplina = jTextFieldDisciplina.getText();
        int semestre = paraNumero(jTextFieldSemestre.getText());
        int ano = paraNumero(jTextFieldAno.getText());

        Filtro filtro = new Filtro(disciplina, semestre, ano);

        listar(filtro);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatricularActionPerformed
        if (jTableListarTurmas.getSelectedRow() != -1) {
            int linha = jTableListarTurmas.getSelectedRow();
            int idDisciplina = (int) jTableListarTurmas.getValueAt(linha, 0);

            Matricula matricula = new Matricula(usuario.getNumero(), idDisciplina);
            
            matricular(matricula);
        } else {
            JOptionPane.showMessageDialog(null, "E necessario selecionar uma disciplina da lista");
        }
    }//GEN-LAST:event_jButtonMatricularActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JanelaRealizarMatricula().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonMatricular;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JCheckBox jCheckBoxAno;
    private javax.swing.JCheckBox jCheckBoxDisciplina;
    private javax.swing.JCheckBox jCheckBoxSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarTurmas;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldDisciplina;
    private javax.swing.JTextField jTextFieldSemestre;
    // End of variables declaration//GEN-END:variables

    private void listar(Filtro filtro) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableListarTurmas.getModel();
        tableModel.setRowCount(0);

        List<Turma> turmas = TurmaController.listar(filtro);

        turmas.forEach(turma -> {
            tableModel.addRow(adicionarLinha(turma));
        });
    }

    private Object[] adicionarLinha(Turma turma) {
        List<Object> linha = new ArrayList<>();

        linha.add(turma.getId());
        linha.add(turma.getSemestre());
        linha.add(turma.getAno());
        linha.add(DisciplinaController.pesquisarPorCodigo(turma.getcodDisciplina()).getNome());
        linha.add(UsuarioController.pesquisar(turma.getNumProfessor()).getNome());

        return linha.toArray();
    }

    private int paraNumero(String text) {
        try {
            int numero = Integer.valueOf(text);
            return numero;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void matricular(Matricula matricula) {
        if(MatriculaController.inserir(matricula)){
            JOptionPane.showMessageDialog(null, "Aluno matriculado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao matricular aluno");
        }
    }
}