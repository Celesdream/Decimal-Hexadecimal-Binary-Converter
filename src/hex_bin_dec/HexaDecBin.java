/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex_bin_dec;

/**
 *
 * @author pedma
 */
public class HexaDecBin extends javax.swing.JFrame {

    /**
     * Creates new form HexaDecBin
     */
    public HexaDecBin() {
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

        TxtBinario = new javax.swing.JTextField();
        BotonHexadecimal = new javax.swing.JButton();
        BotonDecimal = new javax.swing.JButton();
        txtDecimal = new javax.swing.JTextField();
        txtHexa = new javax.swing.JTextField();
        BotonBinario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(TxtBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 190, 30));

        BotonHexadecimal.setText("Convertir");
        BotonHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHexadecimalActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHexadecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, -1));

        BotonDecimal.setText("Convertir");
        BotonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 120, -1));

        txtDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(txtDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, 31));

        txtHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHexaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 201, 32));

        BotonBinario.setText("Convertir");
        BotonBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        jLabel1.setText("CONVERSOR HEXADECIMAL-BINARIO-DECIMAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel2.setText("Hexadecimal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel3.setText("Binario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel4.setText("Decimal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBinarioActionPerformed

    private void txtHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHexaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHexaActionPerformed

    private void txtDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecimalActionPerformed

    private void BotonBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBinarioActionPerformed
        //Binario a Hexadecimal
        String BINARIO = TxtBinario.getText();
        while (BINARIO.length() % 4 != 0) 
        {
            BINARIO = "0" + BINARIO;
        }

        StringBuilder NUMERO = new StringBuilder();
        for (int i = 0; i < BINARIO.length(); i += 4) 
        {
            String num = BINARIO.substring(i, i + 4);
            switch (num) {
                case "0000":
                    NUMERO.append("0");
                    break;
                case "0001":
                    NUMERO.append("1");
                    break;
                case "0010":
                    NUMERO.append("2");
                    break;
                case "0011":
                    NUMERO.append("3");
                    break;
                case "0100":
                    NUMERO.append("4");
                    break;
                case "0101":
                    NUMERO.append("5");
                    break;
                case "0110":
                    NUMERO.append("6");
                    break;
                case "0111":
                    NUMERO.append("7");
                    break;
                case "1000":
                    NUMERO.append("8");
                    break;
                case "1001":
                    NUMERO.append("9");
                    break;
                case "1010":
                    NUMERO.append("A");
                    break;
                case "1011":
                    NUMERO.append("B");
                    break;
                case "1100":
                    NUMERO.append("C");
                    break;
                case "1101":
                    NUMERO.append("D");
                    break;
                case "1110":
                    NUMERO.append("E");
                    break;
                case "1111":
                    NUMERO.append("F");
                    break;
            }
            System.out.println(NUMERO.toString());
            txtHexa.setText(NUMERO.toString());
        }
        
        //Binario a Decimal
        String BinarioaDecimal = TxtBinario.getText();
        double BIN = 0;
        for (int i = 0; i < BinarioaDecimal.length(); i++) 
        {
            if (BinarioaDecimal.charAt(i) == '1') 
            {
                BIN = BIN + Math.pow(2, BinarioaDecimal.length() - 1 - i);
                String s = String.valueOf(BIN);
                txtDecimal.setText(s);
            }
        }
        
    }//GEN-LAST:event_BotonBinarioActionPerformed

    private void BotonHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHexadecimalActionPerformed
        int num = Integer.parseInt(txtHexa.getText(),16);
        txtDecimal.setText(String.valueOf(num));
        String bin = Integer.toBinaryString(num);
        TxtBinario.setText(bin);
        
        
    }//GEN-LAST:event_BotonHexadecimalActionPerformed

    private void BotonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDecimalActionPerformed
        //Convertir de Decimal a Hexadecimal
        String decimal = txtDecimal.getText();
        int con = Integer.parseInt(decimal);
        String DecimalAHexadecimal =Integer.toHexString(con);
        txtHexa.setText(DecimalAHexadecimal);
        
        //Convertir de Decimal a Binario
        String DecimalABinario = Integer.toBinaryString(con);
        TxtBinario.setText(DecimalABinario);
        
        
    }//GEN-LAST:event_BotonDecimalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(HexaDecBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HexaDecBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HexaDecBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HexaDecBin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HexaDecBin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBinario;
    private javax.swing.JButton BotonDecimal;
    private javax.swing.JButton BotonHexadecimal;
    private javax.swing.JTextField TxtBinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDecimal;
    private javax.swing.JTextField txtHexa;
    // End of variables declaration//GEN-END:variables
}
