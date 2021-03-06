package View.Professor.ManterDiario;

import Controller.MatriculaController;
import Controller.UsuarioController;
import Model.Matricula;
import javax.swing.JOptionPane;

public class JanelaAlterarNota extends javax.swing.JFrame {

    private final Matricula matricula;

    public JanelaAlterarNota(Matricula matricula) {
        initComponents();
        this.matricula = matricula;
        preencher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNota1 = new javax.swing.JTextField();
        jTextFieldNota2 = new javax.swing.JTextField();
        jTextFieldExame = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Notas");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("NOTAS");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("Numero:");

        jLabelNumero.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel7.setText("Nota 1:");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel9.setText("Nota 2:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel11.setText("Exame:");

        jTextFieldNota1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jTextFieldNota2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jTextFieldExame.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextFieldExame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApenasNumerosKeyTyped(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N

        jButtonEditar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCancelar.setText("Cancelar");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldExame, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldExame, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ApenasNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApenasNumerosKeyTyped
        char entrada = evt.getKeyChar();
        if (!(Character.isDigit(entrada))) {
            evt.consume();
        }
    }//GEN-LAST:event_ApenasNumerosKeyTyped

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        matricula.setNota1(Integer.valueOf(jTextFieldNota1.getText()));
        matricula.setNota2(Integer.valueOf(jTextFieldNota2.getText()));
        matricula.setExame(Integer.valueOf(jTextFieldExame.getText()));

        if (MatriculaController.alterar(matricula)) {
            JOptionPane.showMessageDialog(null, "Notas alteradas com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar as notas");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JTextField jTextFieldExame;
    private javax.swing.JTextField jTextFieldNota1;
    private javax.swing.JTextField jTextFieldNota2;
    // End of variables declaration//GEN-END:variables

    private void preencher() {
        jLabelNumero.setText(String.valueOf(matricula.getNumAluno()));
        jLabelNome.setText(UsuarioController.pesquisar(matricula.getNumAluno()).getNome());
        jTextFieldNota1.setText(String.valueOf(matricula.getNota1()));
        jTextFieldNota2.setText(String.valueOf(matricula.getNota2()));
        jTextFieldExame.setText(String.valueOf(matricula.getExame()));
    }
}
