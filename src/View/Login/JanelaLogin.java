package View.Login;

import View.Professor.MenuOpcoesProfessor;
import View.Aluno.MenuOpcoesAluno;
import View.SecretariaCoordenador.MenuOpcoesSecretariaCoordernador;
import Controller.UsuarioController;
import Model.Usuario;
import View.Sobre.JanelaSobre;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaLogin extends javax.swing.JFrame {

    public JanelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelSenha = new javax.swing.JPanel();
        jPasswordField = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuButtonSobre = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();
        jMenuButtonSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jButtonEntrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(0, 255, 0));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonLimpar.setForeground(java.awt.Color.black);
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setText("SAIR");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEntrar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPasswordField.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jPasswordField.setForeground(java.awt.Color.black);

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblPassword.setForeground(java.awt.Color.black);
        lblPassword.setText("SENHA");

        javax.swing.GroupLayout jPanelSenhaLayout = new javax.swing.GroupLayout(jPanelSenha);
        jPanelSenha.setLayout(jPanelSenhaLayout);
        jPanelSenhaLayout.setHorizontalGroup(
            jPanelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(jPanelSenhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSenhaLayout.setVerticalGroup(
            jPanelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSenhaLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        txtUsername.setForeground(java.awt.Color.black);

        lblUsername.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblUsername.setForeground(java.awt.Color.black);
        lblUsername.setText("LOGIN");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuButtonSobre.setText("Sobre");
        jMenuButtonSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MenuSobre.setText("Sobre o Software");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        jMenuButtonSobre.add(MenuSobre);

        jMenuBar1.add(jMenuButtonSobre);

        jMenuButtonSair.setText("Sair");
        jMenuButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        new JanelaSobre().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelSenha;
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

        JFrame frame = null;

        if (usuario.getPerfil().equalsIgnoreCase("coordenador") || usuario.getPerfil().equalsIgnoreCase("coordenadora") || usuario.getPerfil().equalsIgnoreCase("secretaria")) {
            frame = new MenuOpcoesSecretariaCoordernador(usuario);
        } else if (usuario.getPerfil().equalsIgnoreCase("aluno") || usuario.getPerfil().equalsIgnoreCase("aluna")) {
            frame = new MenuOpcoesAluno(usuario);
        } else if (usuario.getPerfil().equalsIgnoreCase("professor") || usuario.getPerfil().equalsIgnoreCase("professora")) {
            frame = new MenuOpcoesProfessor(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Em construcao");
            this.dispose();
        }

        frame.setVisible(true);
        this.dispose();
    }

    private boolean verificaCamposVazios() {
        return String.valueOf(jPasswordField.getPassword()).isBlank()
                || txtUsername.getText().isBlank();
    }
}
