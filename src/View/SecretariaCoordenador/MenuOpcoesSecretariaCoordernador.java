package View.SecretariaCoordenador;

import View.SecretariaCoordenador.ManterDisciplinas.JanelaCadastrarDisciplina;
import View.SecretariaCoordenador.ManterDisciplinas.JanelaConsultarDisciplina;
import View.SecretariaCoordenador.ManterDisciplinas.JanelaListarDisciplinas;
import View.SecretariaCoordenador.ManterDisciplinas.JanelaEditarDisciplina;
import View.SecretariaCoordenador.ManterDisciplinas.JanelaExcluirDisciplina;
import View.SecretariaCoordenador.ManterUsuarios.JanelaEditarUsuario;
import View.SecretariaCoordenador.ManterUsuarios.JanelaListarUsuarios;
import View.SecretariaCoordenador.ManterUsuarios.JanelaCadastrarUsuario;
import View.SecretariaCoordenador.ManterUsuarios.JanelaExcluirUsuario;
import View.SecretariaCoordenador.ManterUsuarios.JanelaConsultarUsuario;
import Controller.TurmaController;
import Model.Turma;
import Model.Usuario;
import javax.swing.JFrame;

public class MenuOpcoesSecretariaCoordernador extends javax.swing.JFrame {

    private final Usuario usuario;

    public MenuOpcoesSecretariaCoordernador(Usuario usuario) {
        initComponents();
        this.usuario = usuario;

        jMenuDiario.setVisible(false);
        jMenuHistorico.setVisible(false);

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
        jMenuDiario = new javax.swing.JMenu();
        jMenuItemEmitirDiario = new javax.swing.JMenuItem();
        jMenuHistorico = new javax.swing.JMenu();
        jMenuItemEmitirHistorico = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelMenuUsuario.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
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

        jMenuDiario.setText("Diario");

        jMenuItemEmitirDiario.setText("Emitir Diario");
        jMenuItemEmitirDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuDiario.add(jMenuItemEmitirDiario);

        jMenuBar1.add(jMenuDiario);

        jMenuHistorico.setText("Historico");

        jMenuItemEmitirHistorico.setText("Emitir Historico");
        jMenuItemEmitirHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPressionadoActionPerformed(evt);
            }
        });
        jMenuHistorico.add(jMenuItemEmitirHistorico);

        jMenuBar1.add(jMenuHistorico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabelMenuUsuario)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenuUsuario)
                .addContainerGap(543, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPressionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPressionadoActionPerformed

        //Turma
        if (evt.getSource() == jMenuItemAbrirTurma) {
            TurmaController.abrirTurma(new Turma());
        } else {

            JFrame frame = null;

            //Disciplina
            if (evt.getSource() == jMenuItemCadastrarDisciplina) {
                frame = new JanelaCadastrarDisciplina();
            } else if (evt.getSource() == jMenuItemConsultarDisciplina) {
                frame = new JanelaConsultarDisciplina();
            } else if (evt.getSource() == jMenuItemEditarDisciplina) {
                frame = new JanelaEditarDisciplina();
            } else if (evt.getSource() == jMenuItemExcluirDisciplina) {
                frame = new JanelaExcluirDisciplina();
            } else if (evt.getSource() == jMenuItemListarDisciplinas) {
                frame = new JanelaListarDisciplinas();
            }

            //Usuario
            if (evt.getSource() == jMenuItemCadastrarUsuario) {
                frame = new JanelaCadastrarUsuario();
            } else if (evt.getSource() == jMenuItemConsultarUsuario) {
                frame = new JanelaConsultarUsuario();
            } else if (evt.getSource() == jMenuItemEditarUsuario) {
                frame = new JanelaEditarUsuario();
            } else if (evt.getSource() == jMenuItemExcluirUsuario) {
                frame = new JanelaExcluirUsuario();
            } else if (evt.getSource() == jMenuItemListarUsuarios) {
                frame = new JanelaListarUsuarios();
            }

            //Diario
            if (evt.getSource() == jMenuItemEmitirDiario) {
                frame = new View.SecretariaCoordenador.EmitirDiario.JanelaListarTurmas();
            }

            //Historico
            if (evt.getSource() == jMenuItemEmitirHistorico) {
                frame = new View.SecretariaCoordenador.EmitirHistorico.JanelaListarAlunos();
            }

            frame.setVisible(true);
        }

    }//GEN-LAST:event_BotaoPressionadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMenuUsuario;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDiario;
    private javax.swing.JMenu jMenuDisciplinas;
    private javax.swing.JMenu jMenuHistorico;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirTurma;
    private javax.swing.JMenuItem jMenuItemCadastrarDisciplina;
    private javax.swing.JMenuItem jMenuItemCadastrarUsuario;
    private javax.swing.JMenuItem jMenuItemConsultarDisciplina;
    private javax.swing.JMenuItem jMenuItemConsultarUsuario;
    private javax.swing.JMenuItem jMenuItemEditarDisciplina;
    private javax.swing.JMenuItem jMenuItemEditarUsuario;
    private javax.swing.JMenuItem jMenuItemEmitirDiario;
    private javax.swing.JMenuItem jMenuItemEmitirHistorico;
    private javax.swing.JMenuItem jMenuItemExcluirDisciplina;
    private javax.swing.JMenuItem jMenuItemExcluirUsuario;
    private javax.swing.JMenuItem jMenuItemListarDisciplinas;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JMenu jMenuTurma;
    // End of variables declaration//GEN-END:variables

    private void modificarParaSecretaria() {
        jMenuTurma.setVisible(false);
        jMenuDiario.setVisible(true);
        jMenuHistorico.setVisible(true);

        jLabelMenuUsuario.setText("MENU SECRETARIA");
    }
}
