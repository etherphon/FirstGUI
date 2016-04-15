/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

import javax.swing.JOptionPane;

/**
 *
 * @author jhedding
 */
public class fToCConverter extends javax.swing.JFrame {

    /**
     * Creates new form fToCConverter
     */
    public fToCConverter() {
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

        bgTempScaleSelect = new javax.swing.ButtonGroup();
        lblFtemp = new javax.swing.JLabel();
        txtTempInput = new javax.swing.JTextField();
        lblTemp = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        lblNewTemp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        btnQuit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFtemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFtemp.setText("Temperature:");

        txtTempInput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTemp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTemp.setText("Temp in:");
        lblTemp.setToolTipText("");

        btnConvert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConvert.setText("Convert Temperature");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblNewTemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewTemp.setText("Temp");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bgTempScaleSelect.add(rbCelcius);
        rbCelcius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbCelcius.setText("Celcius");
        rbCelcius.setFocusPainted(false);

        bgTempScaleSelect.add(rbFahrenheit);
        rbFahrenheit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFahrenheit.setText("Fahrenheit");
        rbFahrenheit.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCelcius)
                .addGap(18, 18, 18)
                .addComponent(rbFahrenheit)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbFahrenheit))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        btnQuit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Convert to:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTemp)
                        .addGap(121, 121, 121)
                        .addComponent(lblNewTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnConvert)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTempInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFtemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFtemp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTempInput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnQuit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(lblNewTemp))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        
        //public static final String FAH = "";
        String FAH = "Fahrenheit";
        String CEL = "Celcius";
        String TEMP_IN = "Temp in ";
        String NO_TEMP_SELECTED = "Please choose a temperature scale to convert to.";
        
        if (!rbCelcius.isSelected() && !rbFahrenheit.isSelected()) {
            JOptionPane.showMessageDialog(null, NO_TEMP_SELECTED);
        }
        
        
        if (rbCelcius.isSelected()) {
            TempFormatStrategy tf = new StandardTempFormat();
            TempConverterStrategy fToC = new FahrenheitToCelciusConverter();
            Double tempF;
        
        try {
            tempF = fToC.convertTemp(txtTempInput.getText());
            lblNewTemp.setText(tf.formatTemp(tempF));
            lblTemp.setText(TEMP_IN + rbCelcius.getText());
            } catch (IllegalTempException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        }
        
        if (rbFahrenheit.isSelected()) {
            TempFormatStrategy tf = new StandardTempFormat();
            TempConverterStrategy cToF = new CelciusToFahrenheitConverter();
            Double tempF;
        
        try {
            tempF = cToF.convertTemp(txtTempInput.getText());
            lblNewTemp.setText(tf.formatTemp(tempF));
            lblTemp.setText(TEMP_IN + rbFahrenheit.getText());
            } catch (IllegalTempException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        }
        
        
        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(fToCConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fToCConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fToCConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fToCConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fToCConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTempScaleSelect;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFtemp;
    private javax.swing.JLabel lblNewTemp;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JTextField txtTempInput;
    // End of variables declaration//GEN-END:variables
}
