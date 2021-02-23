package View.SecretariaCoordenador.ManterUsuarios;

import Controller.UsuarioController;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import javax.swing.JOptionPane;

public class JanelaConsultarUsuario extends javax.swing.JFrame {

    public JanelaConsultarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPerfil = new javax.swing.JTextField();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelCursoTitulacao = new javax.swing.JLabel();
        jTextFieldCursoTitulacao = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Usuario");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("CONSULTAR USUARIO");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("NUMERO");

        jTextFieldNumero.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumeroKeyTyped(evt);
            }
        });

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setText("NOME");

        jTextFieldLogin.setEditable(false);
        jTextFieldLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel4.setText("LOGIN");

        jTextFieldPerfil.setEditable(false);
        jTextFieldPerfil.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelPerfil.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelPerfil.setText("PERFIL");

        jLabelCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

        jTextFieldCursoTitulacao.setEditable(false);
        jTextFieldCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldCursoTitulacao.setEnabled(false);

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPerfil)
                            .addComponent(jTextFieldPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCursoTitulacao)
                            .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(145, Short.MAX_VALUE)
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCursoTitulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (!jTextFieldNumero.getText().isBlank()) {
            consultarUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "E necessario preencher o campo numero para a pesquisa");
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void ApenasNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumeroKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumeroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCursoTitulacao;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JTextField jTextFieldCursoTitulacao;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPerfil;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTextFieldCursoTitulacao.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jTextFieldPerfil.setText("");
    }

    private void habilitarCurso() {
        jLabelCursoTitulacao.setText("Curso");
        habilitarCursoTitulacao();
    }

    private void habilitarTitulacao() {
        jLabelCursoTitulacao.setText("Titulacao");
        habilitarCursoTitulacao();
    }

    private void habilitarCursoTitulacao() {
        jLabelCursoTitulacao.setEnabled(true);
        jTextFieldCursoTitulacao.setEnabled(true);
    }

    private void desabilitarCursoTitulacao() {
        jTextFieldCursoTitulacao.setText("");
        jLabelCursoTitulacao.setEnabled(false);
        jTextFieldCursoTitulacao.setEnabled(false);
    }

    private void consultarUsuario() {
        int numero = Integer.valueOf(jTextFieldNumero.getText());

        Usuario usuario = UsuarioController.pesquisar(numero);

        if (usuario != null) {
            preencherUsuario(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
        }
    }

    private void preencherUsuario(Usuario usuario) {
        jTextFieldNome.setText(usuario.getNome());
        jTextFieldLogin.setText(usuario.getLogin());
        jTextFieldPerfil.setText(usuario.getPerfil());

        if (usuario instanceof Aluno) {
            preencherAluno((Aluno) usuario);
        } else if (usuario instanceof Professor) {
            preencherProfessor((Professor) usuario);
        } else {
            desabilitarCursoTitulacao();
        }
    }

    private void preencherAluno(Aluno aluno) {
        habilitarCurso();
        jTextFieldCursoTitulacao.setText(aluno.getCurso());
    }

    private void preencherProfessor(Professor professor) {
        habilitarTitulacao();
        jTextFieldCursoTitulacao.setText(professor.getTitulacao());
    }

}
