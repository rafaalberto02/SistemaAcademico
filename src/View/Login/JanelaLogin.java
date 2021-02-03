package View.Login;

import Controller.UsuarioController;
import Model.Usuario;
import View.Menus.*;
import View.Sobre.JanelaSobre;
import javax.swing.JOptionPane;

public class JanelaLogin extends javax.swing.JFrame {

    public JanelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuButtonSobre = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();
        jMenuButtonSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 153, 255));
        lblUsername.setText("URSERNAME");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 153, 255));
        lblPassword.setText("PASSWORD");

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(0, 255, 0));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(153, 153, 153));
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jMenuButtonSobre.setText("Sobre");

        MenuSobre.setText("Sobre o Software");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        jMenuButtonSobre.add(MenuSobre);

        jMenuBar1.add(jMenuButtonSobre);

        jMenuButtonSair.setText("Sair");
        jMenuButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuButtonSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuButtonSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(lblUsername)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lblPassword)
                .addGap(23, 23, 23)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jMenuButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuButtonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenuButtonSairMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jPasswordField.setText("");
        txtUsername.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        new JanelaSobre(this, true).setVisible(true);
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        if (!verificaCamposVazios()) {
            validaLogin();
        } else {
            JOptionPane.showMessageDialog(null, "E necessario preencher todos os campos para realizar login");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new JanelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuSobre;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuButtonSair;
    private javax.swing.JMenu jMenuButtonSobre;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void validaLogin() {
        String senha = String.valueOf(jPasswordField.getPassword());
        String login = txtUsername.getText();

        Usuario usuario = UsuarioController.validaLogin(login, senha);

        if (usuario != null) {
            verificaTelaSeguinte(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Username e/ou Password incorretos");
        }

    }

    private void verificaTelaSeguinte(Usuario usuario) {
        if (usuario.getPerfil().equalsIgnoreCase("secretaria")) {
            this.setVisible(false);
            new MenuOpcoesSecretaria().setVisible(true);
        } else if (usuario.getPerfil().equalsIgnoreCase("coordenador") || usuario.getPerfil().equalsIgnoreCase("coordenadora")) {
            this.setVisible(false);
            new MenuOpcoesCoordernador().setVisible(true);
        } else if (usuario.getPerfil().equalsIgnoreCase("aluno") || usuario.getPerfil().equalsIgnoreCase("aluna")) {
            this.setVisible(false);
            new MenuOpcoesAluno(usuario).setVisible(true);
        } else if (usuario.getPerfil().equalsIgnoreCase("professor") || usuario.getPerfil().equalsIgnoreCase("professora")) {
            this.setVisible(false);
            new MenuOpcoesProfessor().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Em construcao");
        }
    }

    private boolean verificaCamposVazios() {
        return String.valueOf(jPasswordField.getPassword()).isBlank()
                || txtUsername.getText().isBlank();
    }
}
