package View.Professor.ManterDiario;

import Controller.DisciplinaController;
import Controller.TurmaController;
import Model.FiltroTurmaDisciplina;
import Model.Turma;
import Model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaListarTurmas extends javax.swing.JFrame {

    private final Usuario USUARIO;

    public JanelaListarTurmas(Usuario usuario) {
        initComponents();
        this.USUARIO = usuario;

        FiltroTurmaDisciplina filtro = new FiltroTurmaDisciplina();
        filtro.setNumProfessor(USUARIO.getNumero());
        listar(filtro);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarTurmas = new javax.swing.JTable();
        jTextFieldTurma = new javax.swing.JTextField();
        jCheckBoxTurma = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Turma");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("SELECIONAR TURMA");

        jCheckBoxDisciplina.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxDisciplina.setText("Disciplina");
        jCheckBoxDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDisciplinaActionPerformed(evt);
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

        jCheckBoxAno.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxAno.setText("Ano");
        jCheckBoxAno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("Filtros:");

        jTextFieldDisciplina.setEditable(false);
        jTextFieldDisciplina.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jTextFieldAno.setEditable(false);
        jTextFieldAno.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jTextFieldSemestre.setEditable(false);
        jTextFieldSemestre.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jTableListarTurmas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableListarTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Semestre", "Ano", "Disciplina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarTurmas);

        jTextFieldTurma.setEditable(false);
        jTextFieldTurma.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jCheckBoxTurma.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jCheckBoxTurma.setText("Turma");
        jCheckBoxTurma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBoxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTurmaActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonSelecionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxTurma)
                            .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String disciplina = jTextFieldDisciplina.getText();
        int semestre = Integer.valueOf(jTextFieldSemestre.getText());
        int ano = Integer.valueOf(jTextFieldAno.getText());
        int turma = Integer.valueOf(jTextFieldTurma.getText());
        int numProfessor = USUARIO.getNumero();

        FiltroTurmaDisciplina filtro = new FiltroTurmaDisciplina(disciplina, semestre, ano, turma, numProfessor);

        listar(filtro);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        if (jTableListarTurmas.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "E necessario selecionar uma disciplina da lista");
        } else {
            int linha = jTableListarTurmas.getSelectedRow();
            int numero = (int) jTableListarTurmas.getValueAt(linha, 0);
            Turma turma = TurmaController.pesquisar(numero);

            new View.Professor.ManterDiario.JanelaListarAlunosTurma(turma).setVisible(true);
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jCheckBoxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTurmaActionPerformed
        if (jCheckBoxTurma.isSelected()) {
            jTextFieldTurma.setEditable(true);
        } else {
            jTextFieldTurma.setText("");
            jTextFieldTurma.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBoxTurmaActionPerformed

    private void ApenasNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumerosKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumerosKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JCheckBox jCheckBoxAno;
    private javax.swing.JCheckBox jCheckBoxDisciplina;
    private javax.swing.JCheckBox jCheckBoxSemestre;
    private javax.swing.JCheckBox jCheckBoxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarTurmas;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldDisciplina;
    private javax.swing.JTextField jTextFieldSemestre;
    private javax.swing.JTextField jTextFieldTurma;
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
            DisciplinaController.pesquisarPorCodigo(turma.getCodDisciplina()).getNome()
        };

        return linha;
    }
}
