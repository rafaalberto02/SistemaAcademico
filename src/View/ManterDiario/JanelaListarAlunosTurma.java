package View.ManterDiario;

import Controller.MatriculaController;
import Controller.UsuarioController;
import Model.Matricula;
import Model.Turma;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaListarAlunosTurma extends javax.swing.JFrame {

    private Turma turma;

    public JanelaListarAlunosTurma() {
        initComponents();
    }

    public JanelaListarAlunosTurma(Turma turma) {
        initComponents();
        this.turma = turma;
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNotasFaltas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarAlunos = new javax.swing.JTable();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jRadioButtonNotas = new javax.swing.JRadioButton();
        jRadioButtonFaltas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel1.setText("NOTAS");

        jTableListarAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Nome", "Nota 1", "Nota 2", "Exame", "Faltas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarAlunos);

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        buttonGroupNotasFaltas.add(jRadioButtonNotas);
        jRadioButtonNotas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonNotas.setText("Notas");

        buttonGroupNotasFaltas.add(jRadioButtonFaltas);
        jRadioButtonFaltas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jRadioButtonFaltas.setText("Faltas");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("SELECIONE O QUE DESEJA MODIFICAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionar)
                        .addGap(202, 202, 202)
                        .addComponent(jButtonCancelar)
                        .addGap(216, 216, 216))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jRadioButtonNotas)
                        .addGap(89, 89, 89)
                        .addComponent(jRadioButtonFaltas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNotas)
                    .addComponent(jRadioButtonFaltas))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonCancelar))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        if (jTableListarAlunos.getSelectedRow() != -1) {
            int linha = jTableListarAlunos.getSelectedRow();
            int numero = (int) jTableListarAlunos.getValueAt(linha, 0);

            Matricula matricula = MatriculaController.pesquisar(numero, turma.getCodDisciplina());

            if (jRadioButtonNotas.isSelected()) {
                new JanelaAlterarNota(matricula).setVisible(true);
            } else {
                new JanelaAlterarFalta(matricula).setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "E necessario selecionar um aluno da lista");
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        listar();
    }//GEN-LAST:event_formFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupNotasFaltas;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonFaltas;
    private javax.swing.JRadioButton jRadioButtonNotas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarAlunos;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        DefaultTableModel tableModel = (DefaultTableModel) jTableListarAlunos.getModel();
        tableModel.setRowCount(0);

        List<Matricula> matriculas = MatriculaController.pesquisarPorTurma(turma.getId());

        matriculas.forEach(matricula -> {
            tableModel.addRow(adicionarLinha(matricula));
        });
    }

    private Object[] adicionarLinha(Matricula matricula) {
        List<Object> linha = new ArrayList<>();

        Usuario usuario = UsuarioController.pesquisar(matricula.getNumAluno());

        linha.add(matricula.getNumAluno());
        linha.add(usuario.getNome());
        linha.add(matricula.getNota1());
        linha.add(matricula.getNota2());
        linha.add(matricula.getExame());
        linha.add(matricula.getFaltas());

        return linha.toArray();
    }
}
