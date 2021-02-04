package View.Menus;

import Controller.TurmaController;
import Model.Turma;
import Model.Usuario;
import View.ManterDisciplinas.*;
import View.ManterUsuarios.*;

public class MenuOpcoesSecretariaCoordernador extends javax.swing.JFrame {

    private final Usuario usuario;

    public MenuOpcoesSecretariaCoordernador(Usuario usuario) {
        initComponents();
        this.usuario = usuario;

        if (usuario.getPerfil().equalsIgnoreCase("secretaria")) {
            modificarParaSecretaria();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabelMenuUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDisciplinas = new javax.swing.JMenu();
        jMenuItemCadastrarDisciplina = new javax.swing.JMenuItem();
        jMenuItemConsultarDisciplina = new javax.swing.JMenuItem();
        jMenuItemEditarDisciplina = new javax.swing.JMenuItem();
        jMenuItemExcluirDisciplina = new javax.swing.JMenuItem();
        jMenuItemListarDisciplinas = new javax.swing.JMenuItem();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemCadastrarUsuario = new javax.swing.JMenuItem();
        jMenuItemConsultarUsuario = new javax.swing.JMenuItem();
        jMenuItemEditarUsuario = new javax.swing.JMenuItem();
        jMenuItemExcluirUsuario = new javax.swing.JMenuItem();
        jMenuItemListarUsuarios = new javax.swing.JMenuItem();
        jMenuTurma = new javax.swing.JMenu();
        jMenuItemAbrirTurma = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelMenuUsuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabelMenuUsuario.setText("MENU COORDENADOR");

        jMenuDisciplinas.setText("Disciplinas");

        jMenuItemCadastrarDisciplina.setText("Cadastrar Disciplina");
        jMenuItemCadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemCadastrarDisciplina);

        jMenuItemConsultarDisciplina.setText("Consultar Disciplina");
        jMenuItemConsultarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemConsultarDisciplina);

        jMenuItemEditarDisciplina.setText("Editar Disciplina");
        jMenuItemEditarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemEditarDisciplina);

        jMenuItemExcluirDisciplina.setText("Excluir Disciplina");
        jMenuItemExcluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemExcluirDisciplina);

        jMenuItemListarDisciplinas.setText("Listar Disciplinas");
        jMenuItemListarDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDisciplinas.add(jMenuItemListarDisciplinas);

        jMenuBar1.add(jMenuDisciplinas);

        jMenuAlunos.setText("Usuarios");

        jMenuItemCadastrarUsuario.setText("Cadastrar Usuario");
        jMenuItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemCadastrarUsuario);

        jMenuItemConsultarUsuario.setText("Consultar Usuario");
        jMenuItemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemConsultarUsuario);

        jMenuItemEditarUsuario.setText("Editar Usuario");
        jMenuItemEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemEditarUsuario);

        jMenuItemExcluirUsuario.setText("Excluir Usuario");
        jMenuItemExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemExcluirUsuario);

        jMenuItemListarUsuarios.setText("Listar Usuarios");
        jMenuItemListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemListarUsuarios);

        jMenuBar1.add(jMenuAlunos);

        jMenuTurma.setText("Turma");

        jMenuItemAbrirTurma.setText("Abrir Turma");
        jMenuItemAbrirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuTurma.add(jMenuItemAbrirTurma);

        jMenuBar1.add(jMenuTurma);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabelMenuUsuario)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabelMenuUsuario)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPressionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPressionadoActionPerformed
       
        //Disciplina
        if (evt.getSource() == jMenuItemCadastrarDisciplina) {
            new JanelaCadastrarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemConsultarDisciplina) {
            new JanelaConsultarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemEditarDisciplina) {
            new JanelaEditarDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemExcluirDisciplina) {
            new JanelaExcluirDisciplina(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemListarDisciplinas) {
            new JanelaListarDisciplinas().setVisible(true);
        }

        //Usuario
        if (evt.getSource() == jMenuItemCadastrarUsuario) {
            new JanelaCadastrarUsuario().setVisible(true);
        } else if (evt.getSource() == jMenuItemConsultarUsuario) {
            new JanelaConsultarUsuario().setVisible(true);
        } else if (evt.getSource() == jMenuItemEditarUsuario) {
            new JanelaEditarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemExcluirUsuario) {
            new JanelaExcluirUsuario(this, rootPaneCheckingEnabled).setVisible(true);
        } else if (evt.getSource() == jMenuItemListarUsuarios) {
            new JanelaListarUsuarios().setVisible(true);
        }

        //Turma
        if (evt.getSource() == jMenuItemAbrirTurma) {
            TurmaController.abrirTurma(new Turma());
        }

    }//GEN-LAST:event_BotaoPressionadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMenuUsuario;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDisciplinas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirTurma;
    private javax.swing.JMenuItem jMenuItemCadastrarDisciplina;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItemConsultarDisciplina;
    private javax.swing.JMenuItem jMenuItemConsultarUsuario;
    private javax.swing.JMenuItem jMenuItemEditarDisciplina;
    private javax.swing.JMenuItem jMenuItemEditarUsuario;
    private javax.swing.JMenuItem jMenuItemExcluirDisciplina;
    private javax.swing.JMenuItem jMenuItemExcluirUsuario;
    private javax.swing.JMenuItem jMenuItemListarDisciplinas;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JMenu jMenuTurma;
    // End of variables declaration//GEN-END:variables

    private void modificarParaSecretaria() {
        jMenuTurma.setVisible(false);
        jLabelMenuUsuario.setText("MENU SECRETARIA");
    }
}
