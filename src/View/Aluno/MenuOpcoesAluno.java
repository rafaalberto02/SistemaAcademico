package View.Aluno;

import Model.Usuario;
import View.Aluno.ConsultarDiario.JanelaSelecionarTurma;
import View.Aluno.ManterMatriculas.JanelaRealizarMatricula;

public class MenuOpcoesAluno extends javax.swing.JFrame {

    private Usuario usuario;

    public MenuOpcoesAluno() {
        initComponents();
    }

    public MenuOpcoesAluno(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMatricula = new javax.swing.JMenu();
        jMenuItemRealizarMatricula = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemVerificarFaltas = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("MENU ALUNO");

        jMenuMatricula.setText("Matricula");

        jMenuItemRealizarMatricula.setText("Realizar Matricula");
        jMenuItemRealizarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarMatriculaActionPerformed(evt);
            }
        });
        jMenuMatricula.add(jMenuItemRealizarMatricula);

        jMenuBar1.add(jMenuMatricula);

        jMenu1.setText("Diario");

        jMenuItemVerificarFaltas.setText("Consultar Diário");
        jMenuItemVerificarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerificarFaltasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVerificarFaltas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(518, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRealizarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarMatriculaActionPerformed
        new JanelaRealizarMatricula(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemRealizarMatriculaActionPerformed

    private void jMenuItemVerificarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerificarFaltasActionPerformed
        new JanelaSelecionarTurma(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemVerificarFaltasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemRealizarMatricula;
    private javax.swing.JMenuItem jMenuItemVerificarFaltas;
    private javax.swing.JMenu jMenuMatricula;
    // End of variables declaration//GEN-END:variables
}
