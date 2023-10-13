/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizza;

import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Pizza extends javax.swing.JFrame {

    /**
     * Creates new form Pizza
     */
    public Pizza() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlPizza = new javax.swing.JPanel();
        rbtPepperoni = new javax.swing.JRadioButton();
        rbtHawaii = new javax.swing.JRadioButton();
        rbtMargharita = new javax.swing.JRadioButton();
        rbtSonkas = new javax.swing.JRadioButton();
        pnlExtra = new javax.swing.JPanel();
        chbOliva = new javax.swing.JCheckBox();
        chbKukorica = new javax.swing.JCheckBox();
        chbGomba = new javax.swing.JCheckBox();
        lblKep = new javax.swing.JLabel();
        lblMeret = new javax.swing.JLabel();
        cmbMeret = new javax.swing.JComboBox<>();
        lblBarab = new javax.swing.JLabel();
        sprDarab = new javax.swing.JSpinner();
        btnMegrendel = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPizza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 0))); // NOI18N

        buttonGroup1.add(rbtPepperoni);
        rbtPepperoni.setText("Pepperoni");

        buttonGroup1.add(rbtHawaii);
        rbtHawaii.setText("Hawaii");

        buttonGroup1.add(rbtMargharita);
        rbtMargharita.setText("Margharita");

        buttonGroup1.add(rbtSonkas);
        rbtSonkas.setText("Sonkás");

        javax.swing.GroupLayout pnlPizzaLayout = new javax.swing.GroupLayout(pnlPizza);
        pnlPizza.setLayout(pnlPizzaLayout);
        pnlPizzaLayout.setHorizontalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtPepperoni)
                    .addComponent(rbtHawaii)
                    .addComponent(rbtMargharita)
                    .addComponent(rbtSonkas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPizzaLayout.setVerticalGroup(
            pnlPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPizzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtPepperoni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtHawaii)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMargharita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtSonkas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlExtra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extra feltét", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 0))); // NOI18N

        chbOliva.setText("Oliva");

        chbKukorica.setText("Kukorica");

        chbGomba.setText("Gomba");

        javax.swing.GroupLayout pnlExtraLayout = new javax.swing.GroupLayout(pnlExtra);
        pnlExtra.setLayout(pnlExtraLayout);
        pnlExtraLayout.setHorizontalGroup(
            pnlExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbOliva)
                    .addComponent(chbKukorica)
                    .addComponent(chbGomba))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlExtraLayout.setVerticalGroup(
            pnlExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbOliva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbKukorica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbGomba)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblKep.setText("Kép");

        lblMeret.setText("Méret:");

        cmbMeret.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 cm", "20 cm", "40 cm" }));

        lblBarab.setText("Darab:");

        sprDarab.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        btnMegrendel.setBackground(new java.awt.Color(255, 153, 51));
        btnMegrendel.setText("Megrendel");
        btnMegrendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegrendelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKep, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMeret)
                                    .addComponent(lblBarab))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbMeret, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sprDarab))))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegrendel)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMegrendel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMeret)
                                    .addComponent(cmbMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBarab)
                                    .addComponent(sprDarab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMegrendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegrendelActionPerformed
        
        JOptionPane.showMessageDialog(rootPane, null);
    }//GEN-LAST:event_btnMegrendelActionPerformed

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
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegrendel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbGomba;
    private javax.swing.JCheckBox chbKukorica;
    private javax.swing.JCheckBox chbOliva;
    private javax.swing.JComboBox<String> cmbMeret;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblBarab;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblMeret;
    private javax.swing.JPanel pnlExtra;
    private javax.swing.JPanel pnlPizza;
    private javax.swing.JRadioButton rbtHawaii;
    private javax.swing.JRadioButton rbtMargharita;
    private javax.swing.JRadioButton rbtPepperoni;
    private javax.swing.JRadioButton rbtSonkas;
    private javax.swing.JSpinner sprDarab;
    // End of variables declaration//GEN-END:variables
}
