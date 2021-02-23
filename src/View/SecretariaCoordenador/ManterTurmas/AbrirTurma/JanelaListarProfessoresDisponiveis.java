package View.SecretariaCoordenador.ManterTurmas.AbrirTurma;

import Controller.ProfessorController;
import Controller.TurmaController;
import Model.Professor;
import Model.Turma;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaListarProfessoresDisponiveis extends javax.swing.JFrame {

    private final Turma turma;

    public JanelaListarProfessoresDisponiveis(Turma turma) {
        initComponents();
        listar();
        this.turma = turma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarUsuarios = new javax.swing.JTable();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Professores");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jTableListarUsuarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableListarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Perfil", "Titulacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarUsuarios);

        jButtonSelecionar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel4.setText("PROFESSORES DISPONIVEIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        JOptionPane.showMessageDialog(null, "Operaçao cancelada");
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        if (jTableListarUsuarios.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "E necessario selecionar um professor da lista");
        } else {
            int linha = jTableListarUsuarios.getSelectedRow();
            int numProfessor = (int) jTableListarUsuarios.getValueAt(linha, 0);

            turma.setNumProfessor(numProfessor);
            TurmaController.abrirTurma(turma);

            this.dispose();
        }

    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarUsuarios;
    // End of variables declaration//GEN-END:variables

    private Object[] adicionarLinha(Professor professor) {
        Object[] linha = {
            professor.getNumero(),
            professor.getNome(),
            professor.getPerfil(),
            professor.getTitulacao()
        };

        return linha;
    }

    private void listar() {
        DefaultTableModel tableModel = (DefaultTableModel) jTableListarUsuarios.getModel();
        tableModel.setRowCount(0);

        List<Professor> professores = ProfessorController.listar();

        professores.forEach(professor -> {
            tableModel.addRow(adicionarLinha(professor));
        });
    }
}
