package View.Professor.FecharTurma;

import Controller.DisciplinaController;
import Controller.TurmaController;
import Model.FiltroTurmaDisciplina;
import Model.Turma;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaFecharTurmas extends javax.swing.JFrame {

    private final Usuario USUARIO;
    private final FiltroTurmaDisciplina FILTRO = new FiltroTurmaDisciplina();

    public JanelaFecharTurmas(Usuario usuario) {
        initComponents();
        this.USUARIO = usuario;

        FILTRO.setNumProfessor(USUARIO.getNumero());

        listar(FILTRO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarTurmas = new javax.swing.JTable();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel1.setText("FECHAR TURMA");

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

        jButtonSelecionar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButtonSelecionar)
                .addGap(283, 283, 283)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonCancelar))
                .addGap(62, 62, 62))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        if (jTableListarTurmas.getSelectedRow() != -1) {
            int linha = jTableListarTurmas.getSelectedRow();
            int numero = (int) jTableListarTurmas.getValueAt(linha, 0);
            Turma turma = TurmaController.pesquisar(numero);

            fecharTurma(turma);
        } else {
            JOptionPane.showMessageDialog(null, "E necessario selecionar uma turma da lista");
        }

        listar(FILTRO);
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarTurmas;
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
        List<Object> linha = new ArrayList<>();

        linha.add(turma.getId());
        linha.add(turma.getSemestre());
        linha.add(turma.getAno());
        linha.add(DisciplinaController.pesquisarPorCodigo(turma.getCodDisciplina()).getNome());

        return linha.toArray();
    }

    private void fecharTurma(Turma turma) {
        if (TurmaController.fecharTurma(turma)) {
            JOptionPane.showMessageDialog(null, "Turma fechada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fechar a turma");
        }
    }
}
