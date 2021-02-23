package View.SecretariaCoordenador.ManterUsuarios;

import Controller.UsuarioController;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import javax.swing.JOptionPane;

public class JanelaEditarUsuario extends javax.swing.JFrame {

    public JanelaEditarUsuario() {
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
        jLabelCursoTitulacao = new javax.swing.JLabel();
        jTextFieldCursoTitulacao = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Usuario");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("EDITAR USUARIO");

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

        jTextFieldNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelLogin.setText("LOGIN");

        jTextFieldLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

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

        jButtonEditar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
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

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCursoTitulacao)
                    .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldLogin))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(304, 304, 304))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
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
                .addComponent(jLabelCursoTitulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (alterarUsuario()) {
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar usuario");
        }

        limpar();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void ApenasNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumeroKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumeroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCursoTitulacao;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JTextField jTextFieldCursoTitulacao;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTextFieldCursoTitulacao.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jButtonEditar.setEnabled(false);
        jTextFieldNumero.setEditable(true);
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

            jButtonEditar.setEnabled(true);
            jTextFieldNumero.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
        }
    }

    private void preencherUsuario(Usuario usuario) {
        jTextFieldNome.setText(usuario.getNome());
        jTextFieldLogin.setText(usuario.getLogin());

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

    private boolean alterarUsuario() {
        Usuario usuario = new Usuario();

        usuario.setNumero(Integer.valueOf(jTextFieldNumero.getText()));
        usuario.setNome(jTextFieldNome.getText());
        usuario.setLogin(jTextFieldLogin.getText());
        String cursoTitulacao = jTextFieldCursoTitulacao.getText();

        if (usuario instanceof Aluno) {
            usuario = new Aluno(cursoTitulacao, usuario);
        } else if (usuario instanceof Professor) {
            usuario = new Professor(cursoTitulacao, usuario);
        }

        return UsuarioController.alterar(usuario);
    }
}
