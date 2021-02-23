package View.SecretariaCoordenador.ManterUsuarios;

import Controller.UsuarioController;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import javax.swing.JOptionPane;

public class JanelaExcluirUsuario extends javax.swing.JFrame {

    public JanelaExcluirUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelPerfil = new javax.swing.JLabel();
        jTextFieldPerfil = new javax.swing.JTextField();
        jLabelCursoTitulacao = new javax.swing.JLabel();
        jTextFieldCursoTitulacao = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR ALUNO");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("EXCLUIR USUARIO");

        jLabelNumero.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelNumero.setText("NUMERO");

        jTextFieldNumero.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumeroKeyTyped(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelNome.setText("NOME");

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelLogin.setText("LOGIN");

        jTextFieldLogin.setEditable(false);
        jTextFieldLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelPerfil.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelPerfil.setText("PERFIL");

        jTextFieldPerfil.setEditable(false);
        jTextFieldPerfil.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

        jTextFieldCursoTitulacao.setEditable(false);
        jTextFieldCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldCursoTitulacao.setEnabled(false);

        jButtonDeletar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCursoTitulacao)
                    .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelLogin)
                        .addComponent(jLabelNome)
                        .addComponent(jLabelPerfil)
                        .addComponent(jLabelNumero)
                        .addComponent(jTextFieldNumero)
                        .addComponent(jTextFieldNome)
                        .addComponent(jTextFieldLogin)
                        .addComponent(jTextFieldPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabelNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelLogin)
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
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int numero = Integer.valueOf(jTextFieldNumero.getText());

        if (UsuarioController.remover(numero)) {
            JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover usuario");
        }

    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void ApenasNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumeroKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumeroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCursoTitulacao;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JTextField jTextFieldCursoTitulacao;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPerfil;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTextFieldCursoTitulacao.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jTextFieldPerfil.setText("");
        jButtonDeletar.setEnabled(false);
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
            jButtonDeletar.setVisible(true);
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
