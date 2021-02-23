package View.SecretariaCoordenador.ManterDisciplinas;

import Controller.DisciplinaController;
import Model.Disciplina;
import javax.swing.JOptionPane;

public class JanelaCadastrarDisciplina extends javax.swing.JFrame {

    public JanelaCadastrarDisciplina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCredito = new javax.swing.JTextField();
        panBotaoCadastrarAluno = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Disciplina");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("CADASTRAR DISCIPLINA");

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
        jLabel4.setText("CREDITO");

        jTextFieldCredito.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        panBotaoCadastrarAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panBotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(panBotaoCadastrarAluno);
        panBotaoCadastrarAluno.setLayout(panBotaoCadastrarAlunoLayout);
        panBotaoCadastrarAlunoLayout.setHorizontalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panBotaoCadastrarAlunoLayout.setVerticalGroup(
            panBotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCadastrar.setText("CADASTRAR");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(panBotaoCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
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

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (verificaCampoVazio()) {
            JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos");
        } else {
            cadastrarDisciplina();
        }

        limpar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void ApenasNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumerosKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumerosKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCredito;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panBotaoCadastrarAluno;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTextFieldCodigo.setText("");
        jTextFieldCredito.setText("");
        jTextFieldNome.setText("");
    }

    private boolean verificaCampoVazio() {
        return jTextFieldCodigo.getText().isBlank()
                || jTextFieldCredito.getText().isBlank()
                || jTextFieldNome.getText().isBlank();
    }

    private void cadastrarDisciplina() {
        Disciplina disciplina = new Disciplina(
                Integer.valueOf(jTextFieldCodigo.getText()),
                jTextFieldNome.getText(),
                Integer.valueOf(jTextFieldCredito.getText())
        );

        if (DisciplinaController.inserir(disciplina)) {
            JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir disciplina");
        }

    }
}
