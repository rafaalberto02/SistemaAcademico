package View.ManterUsuarios;

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
        panBotaoCadastrarAluno = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jRadioButtonAluno = new javax.swing.JRadioButton();
        jRadioButtonProfessor = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSecretaria = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR ALUNO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("CADASTRAR USUARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CÓDIGO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("LOGIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("SENHA");

        jLabelCursoTitulacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

        jTextFieldCursoTitulacao.setEnabled(false);

        panBotaoCadastrarAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(panBotaoCadastrarAluno);
        panBotaoCadastrarAluno.setLayout(panBotaoCadastrarAlunoLayout);
        panBotaoCadastrarAlunoLayout.setHorizontalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotaoCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBotaoCadastrarAlunoLayout.setVerticalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotaoCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        buttonGroupPerfil.add(jRadioButtonAluno);
        jRadioButtonAluno.setText("Aluno");
        jRadioButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAlunoActionPerformed(evt);
            }
        });

        buttonGroupPerfil.add(jRadioButtonProfessor);
        jRadioButtonProfessor.setText("Professor");
        jRadioButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProfessorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("PERFIL");

        buttonGroupPerfil.add(jRadioButtonSecretaria);
        jRadioButtonSecretaria.setText("Secretaria");
        jRadioButtonSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSecretariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPerfil;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
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
    private javax.swing.JPanel panBotaoCadastrarAluno;
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
