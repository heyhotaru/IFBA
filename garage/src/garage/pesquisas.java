package garage;

/*
 * Daniel Dos Reis Cerqueira
 * Gilmar
 * Noemia Santos Silva
 * Poliano
 */

public class pesquisas extends javax.swing.JFrame {

    
    public pesquisas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pesquisarcliente = new javax.swing.JButton();
        pesquisarvaga = new javax.swing.JButton();
        pesquisarlocacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PESQUISAS");

        pesquisarcliente.setText("CLIENTE");
        pesquisarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarclienteActionPerformed(evt);
            }
        });

        pesquisarvaga.setText("VAGA");
        pesquisarvaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarvagaActionPerformed(evt);
            }
        });

        pesquisarlocacao.setText("LOCAÇÃO");
        pesquisarlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarlocacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pesquisarcliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(pesquisarvaga)))
                .addGap(41, 41, 41)
                .addComponent(pesquisarlocacao)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarcliente)
                    .addComponent(pesquisarvaga)
                    .addComponent(pesquisarlocacao))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarclienteActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para a pesquisa de clientes
        new pesquisarcliente().setVisible(true);
    }//GEN-LAST:event_pesquisarclienteActionPerformed

    private void pesquisarvagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarvagaActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para a pesquisa de vagas
        new pesquisarvagas().setVisible(true);
    }//GEN-LAST:event_pesquisarvagaActionPerformed

    private void pesquisarlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarlocacaoActionPerformed
        // ao clicar nesse botão é exibido ao usuário a tela para a pesquisa de locações
        new pesquisarlocacao().setVisible(true);
    }//GEN-LAST:event_pesquisarlocacaoActionPerformed

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
            java.util.logging.Logger.getLogger(pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesquisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pesquisarcliente;
    private javax.swing.JButton pesquisarlocacao;
    private javax.swing.JButton pesquisarvaga;
    // End of variables declaration//GEN-END:variables
}
