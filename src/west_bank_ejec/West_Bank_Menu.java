
package west_bank_ejec;


public class West_Bank_Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(West_Bank_Menu.class.getName());
    private Banco banco;

public West_Bank_Menu() {
    initComponents();
    this.banco = new Banco();  
}

public West_Bank_Menu(Banco banco) {
    initComponents();
    this.banco = banco;  
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txttitulo = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btndepositar = new javax.swing.JButton();
        btngirar = new javax.swing.JButton();
        btntransferir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txttitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        txttitulo.setText("West Bank");

        btnRegistro.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTRO CLIENTE");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btnBuscarCliente.setText("BUSCAR CLIENTE");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btndepositar.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btndepositar.setText("DEPOSITAR");
        btndepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositarActionPerformed(evt);
            }
        });

        btngirar.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btngirar.setText("GIRAR");
        btngirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirarActionPerformed(evt);
            }
        });

        btntransferir.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        btntransferir.setText("TRANSFERIR");
        btntransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(txttitulo)
                .addGap(108, 173, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btngirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btndepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btngirar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btntransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        txttitulo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro ventanaRegistro = new Registro(banco);
        ventanaRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
       BuscarCliente ventanaBuscar = new BuscarCliente(banco);
       ventanaBuscar.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btntransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferirActionPerformed
        Transferir ventanaTransferir = new Transferir(banco);
        ventanaTransferir.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btntransferirActionPerformed

    private void btndepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositarActionPerformed
        Depositar ventanaDepositar = new Depositar(banco);
        ventanaDepositar.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_btndepositarActionPerformed

    private void btngirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirarActionPerformed
        Girar ventanaGirar = new Girar(banco);
        ventanaGirar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngirarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new West_Bank_Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btndepositar;
    private javax.swing.JButton btngirar;
    private javax.swing.JButton btntransferir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel txttitulo;
    // End of variables declaration//GEN-END:variables
}
