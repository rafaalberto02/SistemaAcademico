package View.SecretariaCoordenador.ManterUsuarios;

import Controller.UsuarioController;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import javax.swing.JOptionPane;

public class JanelaCadastrarUsuario extends javax.swing.JFrame {

    public JanelaCadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPerfil = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabelCursoTitulacao = new javax.swing.JLabel();
        jTextFieldCursoTitulacao = new javax.swing.JTextField();
        jRadioButtonAluno = new javax.swing.JRadioButton();
        jRadioButtonProfessor = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSecretaria = new javax.swing.JRadioButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuario");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("CADASTRAR USUARIO");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("CÓDIGO");

        jTextFieldCodigo.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel3.setText("NOME");

        jTextFieldNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel4.setText("LOGIN");

        jTextFieldLogin.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel5.setText("SENHA");

        jTextFieldSenha.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabelCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

        jTextFieldCursoTitulacao.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldCursoTitulacao.setEnabled(false);

        buttonGroupPerfil.add(jRadioButtonAluno);
        jRadioButtonAluno.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jRadioButtonAluno.setText("Aluno");
        jRadioButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAlunoActionPerformed(evt);
            }
        });

        buttonGroupPerfil.add(jRadioButtonProfessor);
        jRadioButtonProfessor.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jRadioButtonProfessor.setText("Professor");
        jRadioButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProfessorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel7.setText("PERFIL");

        buttonGroupPerfil.add(jRadioButtonSecretaria);
        jRadioButtonSecretaria.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jRadioButtonSecretaria.setText("Secretaria");
        jRadioButtonSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSecretariaActionPerformed(evt);
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

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonSecretaria))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldCodigo)
                        .addComponent(jTextFieldNome)
                        .addComponent(jTextFieldLogin)
                        .addComponent(jTextFieldSenha)
                        .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCursoTitulacao)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonAluno)
                    .addComponent(jRadioButtonProfessor)
                    .addComponent(jRadioButtonSecretaria))
                .addGap(18, 18, 18)
                .addComponent(jLabelCursoTitulacao)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonVoltar)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar))
                        .addGap(23, 23, 23))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparTextFields();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (!verificarCamposPreenchidos()) {
            cadastrarUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "E necessario preencher todos os campos para o cadastro");
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jRadioButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAlunoActionPerformed
        habilitarCadastroAluno();
    }//GEN-LAST:event_jRadioButtonAlunoActionPerformed

    private void jRadioButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonProfessorActionPerformed
        habilitarCadastroProfessor();
    }//GEN-LAST:event_jRadioButtonProfessorActionPerformed

    private void jRadioButtonSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSecretariaActionPerformed
        habilitarCadastroSecretaria();
    }//GEN-LAST:event_jRadioButtonSecretariaActionPerformed

    private void ApenasNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumerosKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumerosKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPerfil;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCursoTitulacao;
    private javax.swing.JRadioButton jRadioButtonAluno;
    private javax.swing.JRadioButton jRadioButtonProfessor;
    private javax.swing.JRadioButton jRadioButtonSecretaria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCursoTitulacao;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables

    private void limparTextFields() {
        jTextFieldNome.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldCursoTitulacao.setText("");
        jTextFieldLogin.setText("");
        jTextFieldSenha.setText("");
    }

    private boolean verificarCamposPreenchidos() {
        return jTextFieldNome.getText().isEmpty()
                || jTextFieldCodigo.getText().isEmpty()
                || jTextFieldCursoTitulacao.getText().isEmpty() && jRadioButtonAluno.isSelected()
                || jTextFieldCursoTitulacao.getText().isEmpty() && jRadioButtonProfessor.isSelected()
                || jTextFieldLogin.getText().isEmpty()
                || jTextFieldSenha.getText().isEmpty()
                || !jRadioButtonAluno.isSelected() && !jRadioButtonProfessor.isSelected() && !jRadioButtonSecretaria.isSelected();
    }

    private void habilitarCadastroAluno() {
        jLabelCursoTitulacao.setText("CURSO");
        habilitarCursoTitulacao();
    }

    private void habilitarCadastroProfessor() {
        jLabelCursoTitulacao.setText("TITULACAO");
        habilitarCursoTitulacao();
    }

    private void habilitarCadastroSecretaria() {
        desabilitarCursoTitulacao();
    }

    private void habilitarCursoTitulacao() {
        jLabelCursoTitulacao.setEnabled(true);
        jTextFieldCursoTitulacao.setEnabled(true);
    }

    private void desabilitarCursoTitulacao() {
        jLabelCursoTitulacao.setEnabled(false);
        jTextFieldCursoTitulacao.setEnabled(false);
    }

    private void cadastrarUsuario() {
        if (inserirUsuario()) {
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
            limparTextFields();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar Usuario");
        }
    }

    private boolean inserirUsuario() {
        Usuario usuario = null;

        if (jRadioButtonAluno.isSelected()) {
            usuario = criarObjetoAluno();
        } else if (jRadioButtonProfessor.isSelected()) {
            usuario = criarObjetoProfessor();
        } else if (jRadioButtonSecretaria.isSelected()) {
            usuario = criarObjetoSecretaria();
        }

        return UsuarioController.inserir(usuario);
    }

    private Usuario criarObjetoAluno() {
        return new Aluno(jTextFieldCursoTitulacao.getText(), criarObjetoUsuario());
    }

    private Usuario criarObjetoProfessor() {
        return new Professor(jTextFieldCursoTitulacao.getText(), criarObjetoUsuario());
    }

    private Usuario criarObjetoSecretaria() {
        Usuario usuario = criarObjetoUsuario();
        usuario.setPerfil("secretaria");

        return usuario;
    }

    private Usuario criarObjetoUsuario() {
        return new Usuario(
                Integer.valueOf(jTextFieldCodigo.getText()),
                jTextFieldNome.getText(),
                jTextFieldLogin.getText(),
                jTextFieldSenha.getText(),
                ""
        );
    }

}
