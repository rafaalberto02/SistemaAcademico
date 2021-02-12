package View.Aluno;

import Model.Usuario;
import View.Aluno.ConsultarNotas.JanelaConsultaNotas;
import View.Aluno.ConsultarFaltas.JanelaConsultaFaltas;
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
        jPanelOpcoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMatricula = new javax.swing.JMenu();
        jMenuItemRealizarMatricula = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemVerificaNotas = new javax.swing.JMenuItem();
        jMenuItemVerificarFaltas = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanelOpcoesLayout = new javax.swing.GroupLayout(jPanelOpcoes);
        jPanelOpcoes.setLayout(jPanelOpcoesLayout);
        jPanelOpcoesLayout.setHorizontalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );
        jPanelOpcoesLayout.setVerticalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
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

        jMenuItemVerificaNotas.setText("Verificar Notas");
        jMenuItemVerificaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerificaNotasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVerificaNotas);

        jMenuItemVerificarFaltas.setText("Verificar Faltas");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRealizarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarMatriculaActionPerformed
        new JanelaRealizarMatricula(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemRealizarMatriculaActionPerformed

    private void jMenuItemVerificaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerificaNotasActionPerformed
        new JanelaConsultaNotas(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemVerificaNotasActionPerformed

    private void jMenuItemVerificarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerificarFaltasActionPerformed
        new JanelaConsultaFaltas(usuario).setVisible(true);
    }//GEN-LAST:event_jMenuItemVerificarFaltasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemRealizarMatricula;
    private javax.swing.JMenuItem jMenuItemVerificaNotas;
    private javax.swing.JMenuItem jMenuItemVerificarFaltas;
    private javax.swing.JMenu jMenuMatricula;
    private javax.swing.JPanel jPanelOpcoes;
    // End of variables declaration//GEN-END:variables
}
