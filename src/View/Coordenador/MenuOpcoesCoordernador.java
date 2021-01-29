package View.Coordenador;

import Controller.TurmaController;
import Model.Turma;
import View.ManterDisciplinas.JanelaEditarDisciplina;
import View.ManterDisciplinas.JanelaCadastrarDisciplina;
import View.ManterDisciplinas.JanelaConsultarDisciplina;
import View.ManterDisciplinas.JanelaExcluirDisciplina;
import View.ManterDisciplinas.JanelaListarDisciplinas;
import View.ManterUsuarios.JanelaCadastrarUsuario;
import View.ManterUsuarios.JanelaConsultarUsuario;
import View.ManterUsuarios.JanelaDeletarUsuario;
import View.ManterUsuarios.JanelaEditarUsuario;
import View.ManterUsuarios.JanelaListarUsuarios;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuOpcoesCoordernador extends javax.swing.JFrame {

    public MenuOpcoesCoordernador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDisciplinas = new javax.swing.JMenu();
        jMenuItemCadastrarDisciplina = new javax.swing.JMenuItem();
        jMenuItemConsultarDisciplina = new javax.swing.JMenuItem();
        jMenuItemEditarDisciplina = new javax.swing.JMenuItem();
        jMenuItemExcluirDisciplina = new javax.swing.JMenuItem();
        jMenuItemListarDisciplina = new javax.swing.JMenuItem();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemCadastrarUsuario = new javax.swing.JMenuItem();
        jMenuItemConsultarUsuario = new javax.swing.JMenuItem();
        jMenuItemEditarUsuario = new javax.swing.JMenuItem();
        jMenuItemExcluirUsuario = new javax.swing.JMenuItem();
        jMenuItemListarUsuarios = new javax.swing.JMenuItem();
        jMenuTurma = new javax.swing.JMenu();
        jMenuItemAbrirTurma = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("MENU COORDENADOR");

        jMenuDisciplinas.setText("Disciplinas");

        jMenuItemCadastrarDisciplina.setText("Cadastrar Disciplina");
        jMenuItemCadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemCadastrarDisciplina);

        jMenuItemConsultarDisciplina.setText("Consultar Disciplina");
        jMenuItemConsultarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemConsultarDisciplina);

        jMenuItemEditarDisciplina.setText("Editar Disciplina");
        jMenuItemEditarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemEditarDisciplina);

        jMenuItemExcluirDisciplina.setText("Excluir Disciplina");
        jMenuItemExcluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemExcluirDisciplina);

        jMenuItemListarDisciplina.setText("Listar Disciplina");
        jMenuItemListarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemListarDisciplina);

        jMenuBar1.add(jMenuDisciplinas);

        jMenuAlunos.setText("Usuarios");

        jMenuItemCadastrarUsuario.setText("Cadastrar Usuario");
        jMenuItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemCadastrarUsuario);

        jMenuItemConsultarUsuario.setText("Consultar Usuario");
        jMenuItemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemConsultarUsuario);

        jMenuItemEditarUsuario.setText("Editar Usuario");
        jMenuItemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemEditarUsuario);

        jMenuItemExcluirUsuario.setText("Excluir Usuario");
        jMenuItemExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemExcluirUsuario);

        jMenuItemListarUsuarios.setText("Listar Usuarios");
        jMenuItemListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarUsuariosActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemListarUsuarios);

        jMenuBar1.add(jMenuAlunos);

        jMenuTurma.setText("Turma");

        jMenuItemAbrirTurma.setText("Abrir Turma");
        jMenuItemAbrirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirTurmaActionPerformed(evt);
            }
        });
        jMenuTurma.add(jMenuItemAbrirTurma);

        jMenuBar1.add(jMenuTurma);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarUsuariosActionPerformed
        new JanelaListarUsuarios().setVisible(true);
    }//GEN-LAST:event_jMenuItemListarUsuariosActionPerformed

    private void jMenuItemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarUsuarioActionPerformed
        new JanelaCadastrarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarUsuarioActionPerformed

    private void jMenuItemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarUsuarioActionPerformed
        new JanelaEditarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarUsuarioActionPerformed

    private void jMenuItemConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarUsuarioActionPerformed
        new JanelaConsultarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarUsuarioActionPerformed

    private void jMenuItemExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirUsuarioActionPerformed
        new JanelaDeletarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirUsuarioActionPerformed

    private void jMenuItemEditarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarDisciplinaActionPerformed
        new JanelaEditarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarDisciplinaActionPerformed

    private void jMenuItemCadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarDisciplinaActionPerformed
        new JanelaCadastrarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarDisciplinaActionPerformed

    private void jMenuItemConsultarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarDisciplinaActionPerformed
        new JanelaConsultarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarDisciplinaActionPerformed

    private void jMenuItemExcluirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirDisciplinaActionPerformed
        new JanelaExcluirDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirDisciplinaActionPerformed

    private void jMenuItemListarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarDisciplinaActionPerformed
        new JanelaListarDisciplinas().setVisible(true);
    }//GEN-LAST:event_jMenuItemListarDisciplinaActionPerformed

    private void jMenuItemAbrirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirTurmaActionPerformed
        TurmaController.abrirTurma(new Turma());
    }//GEN-LAST:event_jMenuItemAbrirTurmaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuOpcoesCoordernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesCoordernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesCoordernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesCoordernador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new MenuOpcoesCoordernador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDisciplinas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirTurma;
    private javax.swing.JMenuItem jMenuItemCadastrarDisciplina;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItemConsultarDisciplina;
    private javax.swing.JMenuItem jMenuItemConsultarUsuario;
    private javax.swing.JMenuItem jMenuItemEditarDisciplina;
    private javax.swing.JMenuItem jMenuItemEditarUsuario;
    private javax.swing.JMenuItem jMenuItemExcluirDisciplina;
    private javax.swing.JMenuItem jMenuItemExcluirUsuario;
    private javax.swing.JMenuItem jMenuItemListarDisciplina;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JMenu jMenuTurma;
    // End of variables declaration//GEN-END:variables
}
