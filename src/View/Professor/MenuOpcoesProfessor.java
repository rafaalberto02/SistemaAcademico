package View.Professor;

import Model.Usuario;
import View.Professor.FecharTurma.JanelaFecharTurmas;
import View.Professor.ManterDiario.JanelaListarTurmas;

public class MenuOpcoesProfessor extends javax.swing.JFrame {

    private Usuario usuario;

    public MenuOpcoesProfessor(Usuario usuario) {
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
        jMenuItemManterDiario = new javax.swing.JMenuItem();
        jMenuItemFecharTurma = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Professor");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setText("MENU PROFESSOR");

        jMenuMatricula.setText("Diario");

        jMenuItemManterDiario.setText("Manter Diario");
        jMenuItemManterDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManterDiarioActionPerformed(evt);
            }
        });
        jMenuMatricula.add(jMenuItemManterDiario);

        jMenuItemFecharTurma.setText("Fechar Turma");
        jMenuItemFecharTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharTurmaActionPerformed(evt);
            }
        });
        jMenuMatricula.add(jMenuItemFecharTurma);

        jMenuBar1.add(jMenuMatricula);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemManterDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManterDiarioActionPerformed
        new JanelaListarTurmas(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemManterDiarioActionPerformed

    private void jMenuItemFecharTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharTurmaActionPerformed
        new JanelaFecharTurmas(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemFecharTurmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemFecharTurma;
    private javax.swing.JMenuItem jMenuItemManterDiario;
    private javax.swing.JMenu jMenuMatricula;
    // End of variables declaration//GEN-END:variables
}
