package garage;

/*
 * Daniel Dos Reis Cerqueira
 * Gilmar
 * Noemia Santos Silva
 * Poliano
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class menu extends javax.swing.JFrame {

    
    public menu() {
        try {
            initComponents();
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            Connection con = DriverManager.getConnection("jdbc:firebirdsql:localhost:c:\\banco\\garage77.FDB", "sysdba", "masterkey");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
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
        cadastros = new javax.swing.JButton();
        pesquisas = new javax.swing.JButton();
        locacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PRINCIPAL");

        cadastros.setText("CADASTROS");
        cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosActionPerformed(evt);
            }
        });

        pesquisas.setText("PESQUISAS");
        pesquisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisasActionPerformed(evt);
            }
        });

        locacao.setText("LOCAÇÃO");
        locacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(locacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(cadastros)
                .addGap(41, 41, 41)
                .addComponent(pesquisas)
                .addGap(50, 50, 50)
                .addComponent(locacao)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para selecionar o tipo de cadastro desejado
        new cadastros().setVisible(true);
    }//GEN-LAST:event_cadastrosActionPerformed

    private void pesquisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisasActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para selecionar o tipo de pesquisa desejada
        new pesquisas().setVisible(true);
    }//GEN-LAST:event_pesquisasActionPerformed

    private void locacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locacaoActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para selecionar o tipo de pesquisa desejada
        new cadastros().setVisible(true);
    }//GEN-LAST:event_locacaoActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton locacao;
    private javax.swing.JButton pesquisas;
    // End of variables declaration//GEN-END:variables
}