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
import com.github.britooo.looca.api.group.rede.RedeInterface;
import com.github.britooo.looca.api.group.rede.RedeInterfaceGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;

import static com.github.britooo.looca.api.util.Conversor.formatarBytes;
import com.sun.tools.javac.Main;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.login.tood.java.swing.slack.Slack;

/**
 * youtube
 *
 * @author bruna
 */
public class TelaLogin extends javax.swing.JFrame {

    private static String idTotem;

    public static void setIdTotem(String id) {
        idTotem = id;
    }

    //SLACK
    JSONObject json = new JSONObject();

    // LOG //
    FileWriter fileWriter;
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter) + System.lineSeparator();

    // SQL SERVER
    SqlServer conexao = new SqlServer();
    JdbcTemplate conNuvem = conexao.getConexaoDoBanco();
    // MYSQL
    MySql conexaoLocal = new MySql();
    JdbcTemplate conLocal = conexaoLocal.getConexaoDoBanco();
    // -----------------------------------------------------------

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    public void deuErro() {
        try (FileWriter fileWriter = new FileWriter("writerFile.txt", true)) {
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
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAprovacao = new javax.swing.JButton();
        lbLoginRealizado = new javax.swing.JLabel();
        lbDeuErrado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTituloTela = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotem = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
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

        jLabel6.setText("idTotem:");

        txtTotem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDeuErrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLoginRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLoginRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(lbDeuErrado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAprovacao)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnAprovacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprovacaoActionPerformed
        try {
            // TODO add your handling code here:

            String emailDigitado = txtSenha.getText();
            String senhaDigitada = txtEmail.getText();
            String idTotem = txtTotem.getText();

            setIdTotem(idTotem);

            try {
                Usuario usuario = conNuvem.queryForObject("SELECT * FROM usuario WHERE email = ?  AND senha = ?",
                        new BeanPropertyRowMapper<>(Usuario.class), emailDigitado, senhaDigitada);
                txtSenha.setVisible(false);
                txtEmail.setVisible(false);
                btnAprovacao.setVisible(false);
                lblTituloTela.setVisible(false);
                lbLoginRealizado.setText("Login realizado!");
                System.out.println("login realizado!");
                lbDeuErrado.setText("");

                //SLACK 
                json.put("text", "%s - Programa foi iniciado no totem %s.".formatted(Utils.obterDataFormatada(), idTotem));
                conNuvem.update("update [dbo].[Totem] set ativo = 'true' where idTotem = ?;", idTotem);
                Slack.sendMessage(json);

                //TOTEM AI
                Totem totem = conNuvem.queryForObject("SELECT * FROM [dbo].[Totem] where idTotem = ?;",
                        new BeanPropertyRowMapper<>(Totem.class), idTotem);

                try (FileWriter fileWriter = new FileWriter("writerFile.txt", true)) {
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

                // AQ OH
                Looca looca = new Looca();

                // pegando os dados
                Memoria memoria = looca.getMemoria();

                DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
                List<Disco> discos = grupoDeDiscos.getDiscos();
                Disco disco = discos.get(0);
                List<Volume> volumes = grupoDeDiscos.getVolumes();
                Volume volume = volumes.get(0);

                Processador processador = looca.getProcessador();

                RedeInterfaceGroup redes = looca.getRede().getGrupoDeInterfaces();
                List<RedeInterface> redeInterfaces = redes.getInterfaces();

                RedeInterface rede = redeInterfaces.get(0);
                new Timer().scheduleAtFixedRate(new TimerTask() {
                    Integer qtdAlertaCpu = 0;
                    String id;

                    {
                        this.id = idTotem;
                    }

                    @Override
                    public void run() {
                        Totem totemAtualiza = conNuvem.queryForObject("SELECT * FROM [dbo].[Totem] where idTotem = ?;",
                                new BeanPropertyRowMapper<>(Totem.class), idTotem);

                        String ram = formatarBytes(memoria.getEmUso());

                        Long volumeEmUsoLong = volume.getTotal() - volume.getDisponivel();
                        String volumeString = formatarBytes(volumeEmUsoLong);

                        long totalPacotesRecebidos = redeInterfaces.stream()
                                .mapToLong(RedeInterface::getPacotesRecebidos)
                                .sum();

                        long totalPacotesEnviados = redeInterfaces.stream()
                                .mapToLong(RedeInterface::getPacotesEnviados)
                                .sum();

                        // Rede 
                        //SLACK
                        try {

                            Double ramGigas = Utils.formatarRamMibEmGib(ram);

                            Double ramPorcentagem = ramGigas * 100 / 8;
//                    Double volumePorcentagem = volumeEmUsoLong * 100 / 30.0;

                            System.out.println("Porcentagem da Ram %.2f".formatted(ramPorcentagem));
                            System.out.println("Ram usada: %.2f".formatted(ramGigas));

                            // VOLUME agora
                            System.out.println("Porcentagem volume %.2f".formatted(Utils.formatarArmazenamento(volumeString)));
                            System.out.println("Volume usado: %s".formatted(volumeString));

                            System.out.println("Processador %.2f".formatted(processador.getUso()));

                            if (ramPorcentagem > totemAtualiza.getAlertaRam()) {
                                json.put("text", "%s - Totem %s - A porcentagem da RAM antigiu %.2f %%".formatted(Utils.obterDataFormatada(), idTotem, ramPorcentagem));
                                Slack.sendMessage(json);
                            }
                            if (Utils.formatarArmazenamento(volumeString) > totemAtualiza.getAlertaDisco()) {
                                json.put("text", "%s - Totem %s - A porcentagem do volume do disco antigiu %.2f %%".formatted(Utils.obterDataFormatada(), idTotem, Utils.formatarArmazenamento(volumeString)));
                                Slack.sendMessage(json);
                            }

                            if (processador.getUso() > totemAtualiza.getAlertaProcessador()) {
                                qtdAlertaCpu += 1;

                                if (qtdAlertaCpu == 5) {
                                    json.put("text", "%s - Totem %s - Por 25s a porcentagem da cpu passou do limite de %d %%".formatted(Utils.obterDataFormatada(), idTotem, totemAtualiza.getAlertaProcessador()));
                                    Slack.sendMessage(json);
                                    qtdAlertaCpu = 0;
                                }
                            }

                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        Double ramGigas = Utils.formatarRamMibEmGib(ram);
                        Double ramPorcentagem = ramGigas * 100 / 8;

                        if (totemAtualiza.getRebootProcessador() > processador.getUso() && totemAtualiza.getRebootRam() > ramPorcentagem) {
                            try {
                                json.put("text", "%s - Totem %s - Programa foi encerrado".formatted(Utils.obterDataFormatada(), idTotem));
                                try {
                                    Slack.sendMessage(json);
                                } catch (IOException ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                conNuvem.update("update [dbo].[Totem] set ativo = 'false' where idTotem = ?;", idTotem);

                                // Comando que você deseja executar
                                String comando = "sudo reboot";

                                // Cria o ProcessBuilder com o comando
                                ProcessBuilder pb = new ProcessBuilder("bash", "-c", comando);

                                // Redireciona a saída de erro para a saída padrão
                                pb.redirectErrorStream(true);

                                // Inicia o processo
                                Process processo = pb.start();

                                // Obtém a saída do processo
                                BufferedReader reader = new BufferedReader(new InputStreamReader(processo.getInputStream()));
                                String linha;
                                while ((linha = reader.readLine()) != null) {
                                    System.out.println(linha);
                                }

                                // Aguarda a finalização do processo
                                int status = processo.waitFor();
                                System.out.println("O comando foi executado com sucesso. Código de saída: " + status);
                            } catch (IOException | InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        try (FileWriter fileWriter = new FileWriter("writerFile.txt", true)) {
                            fileWriter.write(now.format(formatter) + String.format("\n \nInseridos os valores: qtdRam: %.2f, Volume: %s, Processador: %.2f ",
                                    ramGigas, volumeString, processador.getUso()));
                        } catch (IOException e) {
                            System.err.println("Erro ao criar o arquivo de log");
                        }

//                System.out.println("Processador " + String.format("%.2f", processador.getUso()));
                        conNuvem.update("insert into [dbo].[DadoTotem] values (?, CONVERT(VARCHAR(19), GETDATE()) , ?, ?, ?, ?, ?)",
                                idTotem, ramGigas, volumeString, processador.getUso(), formatarBytes(totalPacotesEnviados), formatarBytes(totalPacotesRecebidos));

                        conLocal.update("insert into dadoTotem values (null, now(), ?, ?, ?)", ramGigas, volumeString, processador.getUso());
                        // insert local
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
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                SqlServer conexao = new SqlServer();
                JdbcTemplate conNuvem = conexao.getConexaoDoBanco();
                conNuvem.update("update [dbo].[Totem] set ativo = 'false' where idTotem = ?;", idTotem);
                json.put("text", "%s - Programa foi encerrado no totem %s.".formatted(Utils.obterDataFormatada(), idTotem));
                try {
                    Slack.sendMessage(json);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("Encerrando programa");
            }
        });

    }//GEN-LAST:event_btnAprovacaoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTotemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotemActionPerformed

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbDeuErrado;
    private javax.swing.JLabel lbLoginRealizado;
    private javax.swing.JLabel lblTituloTela;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTotem;
    // End of variables declaration//GEN-END:variables
}
