/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Divisao;


/**
 *
 * @author Douglas
 */
public class JanelaAdicionarDivisao extends javax.swing.JFrame {

    /**
     * Creates new form JanelaAdicionarDivisao
     */
    
    private Divisao divisao; 
    private List<Divisao> divisoes;
    private JanelaPrincipal janela;
    
    public JanelaAdicionarDivisao() {
        divisao = new Divisao();
        divisoes = new ArrayList<Divisao>();
        janela = new JanelaPrincipal();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeDivisao = new javax.swing.JLabel();
        textNomeDivisao = new javax.swing.JTextField();
        botaoAddDivisao = new javax.swing.JButton();
        BotaoSairDivisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNomeDivisao.setText("Nome:");

        botaoAddDivisao.setText("Adicionar");
        botaoAddDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddDivisaoActionPerformed(evt);
            }
        });

        BotaoSairDivisao.setText("Sair");
        BotaoSairDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairDivisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(botaoAddDivisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoSairDivisao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNomeDivisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNomeDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDivisao)
                    .addComponent(textNomeDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAddDivisao)
                    .addComponent(BotaoSairDivisao))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAddDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddDivisaoActionPerformed
       divisao.setNomeDivisao(textNomeDivisao.getText());
       divisoes.add(divisao);
       JOptionPane.showMessageDialog(null, "Divisão Cadastrada com sucesso!!");
       textNomeDivisao.setText("");
       textNomeDivisao.requestFocus();
       janela.preencherCombo();
    }//GEN-LAST:event_botaoAddDivisaoActionPerformed

    private void BotaoSairDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairDivisaoActionPerformed
      this.fechar(); 
    }//GEN-LAST:event_BotaoSairDivisaoActionPerformed

                                             
    private void fechar(){  
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÂO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            this.dispose();  
        }  
    }     
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
            java.util.logging.Logger.getLogger(JanelaAdicionarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAdicionarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAdicionarDivisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSairDivisao;
    private javax.swing.JButton botaoAddDivisao;
    private javax.swing.JLabel labelNomeDivisao;
    private javax.swing.JTextField textNomeDivisao;
    // End of variables declaration//GEN-END:variables
}
