package View.SecretariaCoordenador.EmitirDiario;

import Controller.MatriculaController;
import Controller.UsuarioController;
import Model.Matricula;
import Model.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JanelaExibirAlunosMatriculados extends javax.swing.JFrame {

    public JanelaExibirAlunosMatriculados(Turma turma) {
        initComponents();
        listar(turma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("ALUNOS MATRICULADOS");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Nota 1", "Nota 2", "Exame", "Faltas", "Aprovado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableAlunos);

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButtonFechar)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables

    private void listar(Turma turma) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableAlunos.getModel();
        tableModel.setRowCount(0);

        List<Matricula> matriculas = MatriculaController.pesquisarPorTurma(turma.getId());

        matriculas.forEach(matricula -> {
            tableModel.addRow(adicionarLinha(matricula));
        });
    }

    private Object[] adicionarLinha(Matricula matricula) {
        List<Object> linha = new ArrayList<>();

        linha.add(matricula.getNumAluno());
        linha.add(UsuarioController.pesquisar(matricula.getNumAluno()).getNome());
        linha.add(matricula.getNota1());
        linha.add(matricula.getNota2());

        if (matricula.getExame() == -1) {
            linha.add("Necessáio realizar");
        } else {
            linha.add(matricula.getExame());
        }

        linha.add(matricula.getFaltas());

        if (matricula.isAprovado()) {
            linha.add("Sim");
        } else {
            linha.add("Não");
        }

        return linha.toArray();
    }
}
