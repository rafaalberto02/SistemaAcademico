package View.SecretariaCoordenador.ManterUsuarios;

import Controller.UsuarioController;
import Model.Aluno;
import Model.Professor;
import Model.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JanelaListarUsuarios extends javax.swing.JFrame {

    public JanelaListarUsuarios() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarUsuarios = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Clientes");

        jTableListarUsuarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableListarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Perfil", "Curso", "Titulacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarUsuarios);

        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel4.setText("LISTA DE USUÁRIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarUsuarios;
    // End of variables declaration//GEN-END:variables

    private Object[] adicionarLinha(Usuario usuario) {
        Object curso = "";
        Object titulacao = "";

        if (usuario instanceof Aluno aluno) {
            curso = aluno.getCurso();
        } else if (usuario instanceof Professor professor) {
            titulacao = professor.getTitulacao();
        }

        Object[] linha = {
            usuario.getNumero(),
            usuario.getNome(),
            usuario.getPerfil(),
            curso,
            titulacao
        };

        return linha;
    }

    private void listar() {
        DefaultTableModel tableModel = (DefaultTableModel) jTableListarUsuarios.getModel();
        tableModel.setRowCount(0);
        List<Usuario> usuarios = UsuarioController.listar();

        usuarios.forEach(usuario -> {
            tableModel.addRow(adicionarLinha(usuario));
        });
    }
}
