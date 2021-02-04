package View.ManterUsuarios;

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
        panBotaoCadastrarAluno = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelCursoTitulacao = new javax.swing.JLabel();
        jTextFieldCursoTitulacao = new javax.swing.JTextField();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR ALUNO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("EDITAR USUARIO");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNumero.setText("NUMERO");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("NOME");

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLogin.setText("LOGIN");

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

        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(panBotaoCadastrarAluno);
        panBotaoCadastrarAluno.setLayout(panBotaoCadastrarAlunoLayout);
        panBotaoCadastrarAlunoLayout.setHorizontalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotaoCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );
        panBotaoCadastrarAlunoLayout.setVerticalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotaoCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar))
                .addContainerGap())
        );

        jLabelCursoTitulacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCursoTitulacao.setText("CURSO");
        jLabelCursoTitulacao.setEnabled(false);

        jTextFieldCursoTitulacao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCursoTitulacao)
                    .addComponent(jTextFieldCursoTitulacao, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldLogin)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (alterarUsuario()) {
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar usuario");
        }
        
        limpar();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
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
    private javax.swing.JPanel panBotaoCadastrarAluno;
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
