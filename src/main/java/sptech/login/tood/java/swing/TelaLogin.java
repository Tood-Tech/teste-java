/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sptech.login.tood.java.swing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.janelas.Janela;
import com.github.britooo.looca.api.group.janelas.JanelaGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;

import static com.github.britooo.looca.api.util.Conversor.formatarBytes;
import java.io.FileWriter;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * youtube
 *
 * @author bruna
 */
public class TelaLogin extends javax.swing.JFrame {

    // LOG //
    FileWriter fileWriter;
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter) + System.lineSeparator();

    // SQL SERVER
    ConexaoSqlServer conexao = new ConexaoSqlServer();
    JdbcTemplate con = conexao.getConexaoDoBanco();
    // MYSQL
    ConexaoMysql conexaoLocal = new ConexaoMysql();
    JdbcTemplate conLocal = conexaoLocal.getConexaoDoBanco();
    // -----------------------------------------------------------
    Looca looca = new Looca();
    Memoria memoria = looca.getMemoria();
    Processador processador = looca.getProcessador();
    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
    List<Disco> discos = grupoDeDiscos.getDiscos();
    List<Volume> volumes = grupoDeDiscos.getVolumes();
    Long memoriaEmUso = memoria.getEmUso();
    Double processadorEmUso = processador.getUso();

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    public void deuErro() {
        try ( FileWriter fileWriter = new FileWriter("/root/Desktop/writerFile.txt", true)) {
            fileWriter.write(now.format(formatter) + "\n \nTentativa de Login realizada. (Sem Sucesso) \n \n");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo de log");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnAprovacao = new javax.swing.JButton();
        lbLoginRealizado = new javax.swing.JLabel();
        lbDeuErrado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTituloTela = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnAprovacao.setText("Entrar");
        btnAprovacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprovacaoActionPerformed(evt);
            }
        });

        lbLoginRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbDeuErrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tood-logo-black.png"))); // NOI18N

        jLabel4.setText("Login:");

        jLabel5.setText("Senha:");

        lblTituloTela.setText("Acesse sua conta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbDeuErrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbLoginRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(lblTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLoginRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDeuErrado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAprovacao)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAprovacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovacaoActionPerformed
        try {
            // TODO add your handling code here:

            String emailDigitado = txtEmail.getText();
            String senhaDigitada = txtSenha.getText();

            try {
                Usuario listaUsuario = con.queryForObject("SELECT * FROM usuario WHERE email = ?  AND senha = ?",
                        new BeanPropertyRowMapper<>(Usuario.class), emailDigitado, senhaDigitada);
                txtEmail.setVisible(false);
                txtSenha.setVisible(false);
                btnAprovacao.setVisible(false);
                lblTituloTela.setVisible(false);
                lbLoginRealizado.setText("Login realizado!");
                System.out.println("login realizado!");
                lbDeuErrado.setText("");

                Disco disco = discos.get(0);
                Volume volume = volumes.get(0);

                ProcessoGrupo processoGrupo = looca.getGrupoDeProcessos();
                List<Processo> processos = processoGrupo.getProcessos();

                try ( FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\writerFile.txt", true)) {
                    fileWriter.write(now.format(formatter) + " \nLogin realizado pelo usuario:" + emailDigitado + "\n\n ");
//                    fileWriter.write(LocalDateTime.now() + " - Log de aviso\n");
//                    fileWriter.write(LocalDateTime.now() + " - Log de erro grave\n");
                } catch (IOException e) {
                    deuErro();
                }
//                Objects.requireNonNull(printWriter).println(textToBeWritten);
//                Objects.requireNonNull(printWriter).println(textToBeWritten1);
//                Objects.requireNonNull(printWriter).println(formattedDateTime);
//                printWriter.close();

                new Timer().scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        memoriaEmUso = memoria.getEmUso();
                        processadorEmUso = processador.getUso();

                        System.out.println(String.format("Inseridos os valores: qtdRam: %s, Volume: %s, Processador: %s",
                                formatarBytes(memoria.getEmUso()), formatarBytes(volume.getDisponivel()), String.format("%.2f",
                                processador.getUso())));
                        try ( FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\aleex\\\\OneDrive\\\\Área de Trabalho\\\\writerFile.txt", true)) {
                            fileWriter.write(now.format(formatter) + String.format("\n \nInseridos os valores: qtdRam: %s, Volume: %s, Processador: %s",
                                    formatarBytes(memoria.getEmUso()), formatarBytes(volume.getDisponivel()), String.format("%.2f",
                                    processador.getUso())));
                        } catch (IOException e) {
                            System.err.println("Erro ao criar o arquivo de log");
                        }
                        con.update("insert into [dbo].[DadoTotem] values (2, CONVERT(VARCHAR(19), GETDATE(), 120) , ?, ?, ?)",
                                formatarBytes(memoria.getEmUso()), formatarBytes(volume.getDisponivel()), String.format("%.2f",
                                processador.getUso()));

                        conLocal.update("insert into DadoTotem(qtdRam, qtdFaltaDisco, qtdProcessador) values (?, ?, ?)",
                                formatarBytes(memoria.getEmUso()), formatarBytes(volume.getDisponivel()), String.format("%.2f",
                                processador.getUso()));
                    }
                }, 0, 5000);
            } catch (Exception e) {
                deuErro();
                System.out.println("Não entrou!!!");
                lbDeuErrado.setText("Falha no login!");
            }

//        if (!emailDigitado.contains("@")) {
//            System.out.println("O e-mail não contém o caractere '@'.");
//        } else if (senhaDigitada.length() < 6) {
//            System.out.println("A senha tem menos de 6 caracteres.");
//        }
        } catch (Exception e) {
            System.out.println("Erro");
        }

//        if (!emailDigitado.contains("@")) {
//            System.out.println("O e-mail não contém o caractere '@'.");
//        } else if (senhaDigitada.length() < 6) {
//            System.out.println("A senha tem menos de 6 caracteres.");
//        } 

    }//GEN-LAST:event_btnAprovacaoActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprovacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbDeuErrado;
    private javax.swing.JLabel lbLoginRealizado;
    private javax.swing.JLabel lblTituloTela;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
