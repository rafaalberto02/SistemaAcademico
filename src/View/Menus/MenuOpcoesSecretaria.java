package View.Menus;

import View.ManterDisciplinas.*;
import View.ManterUsuarios.*;

public class MenuOpcoesSecretaria extends javax.swing.JFrame {

    public MenuOpcoesSecretaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanelOpcoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemAdicionarUsuario = new javax.swing.JMenuItem();
        jMenuItemListarUsuarios = new javax.swing.JMenuItem();
        jMenuItemEditarUsuario = new javax.swing.JMenuItem();
        jMenuItemConsultarUsuario = new javax.swing.JMenuItem();
        jMenuItemExcluirUsuario = new javax.swing.JMenuItem();
        jMenuDisciplinas = new javax.swing.JMenu();
        jMenuItemAlterarDisciplina = new javax.swing.JMenuItem();
        jMenuItemCadastrarDisciplina = new javax.swing.JMenuItem();
        jMenuItemConsultarDisciplina = new javax.swing.JMenuItem();
        jMenuItemExcluirDisciplina = new javax.swing.JMenuItem();
        jMenuItemListarDisciplina = new javax.swing.JMenuItem();

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
        jLabel1.setText("MENU SECRETARIA");

        jMenuAlunos.setText("Usuarios");

        jMenuItemAdicionarUsuario.setText("Adicionar Usuario");
        jMenuItemAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemAdicionarUsuario);

        jMenuItemListarUsuarios.setText("Listar Usuarios");
        jMenuItemListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarUsuariosActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemListarUsuarios);

        jMenuItemEditarUsuario.setText("Editar Usuario");
        jMenuItemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemEditarUsuario);

        jMenuItemConsultarUsuario.setText("Consultar Usuario");
        jMenuItemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemConsultarUsuario);

        jMenuItemExcluirUsuario.setText("Excluir Usuario");
        jMenuItemExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirUsuarioActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemExcluirUsuario);

        jMenuBar1.add(jMenuAlunos);

        jMenuDisciplinas.setText("Disciplinas");

        jMenuItemAlterarDisciplina.setText("Alterar Disciplina");
        jMenuItemAlterarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlterarDisciplinaActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemAlterarDisciplina);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarUsuariosActionPerformed
        new JanelaListarUsuarios().setVisible(true);
    }//GEN-LAST:event_jMenuItemListarUsuariosActionPerformed

    private void jMenuItemAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarUsuarioActionPerformed
        new JanelaCadastrarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemAdicionarUsuarioActionPerformed

    private void jMenuItemEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarUsuarioActionPerformed
        new JanelaEditarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarUsuarioActionPerformed

    private void jMenuItemConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarUsuarioActionPerformed
        new JanelaConsultarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarUsuarioActionPerformed

    private void jMenuItemExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirUsuarioActionPerformed
        new JanelaDeletarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirUsuarioActionPerformed

    private void jMenuItemAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlterarDisciplinaActionPerformed
        new JanelaEditarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemAlterarDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOpcoesSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpcoesSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new MenuOpcoesSecretaria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDisciplinas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAdicionarUsuario;
    private javax.swing.JMenuItem jMenuItemAlterarDisciplina;
    private javax.swing.JMenuItem jMenuItemCadastrarDisciplina;
    private javax.swing.JMenuItem jMenuItemConsultarDisciplina;
    private javax.swing.JMenuItem jMenuItemConsultarUsuario;
    private javax.swing.JMenuItem jMenuItemEditarUsuario;
    private javax.swing.JMenuItem jMenuItemExcluirDisciplina;
    private javax.swing.JMenuItem jMenuItemExcluirUsuario;
    private javax.swing.JMenuItem jMenuItemListarDisciplina;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JPanel jPanelOpcoes;
    // End of variables declaration//GEN-END:variables
}
