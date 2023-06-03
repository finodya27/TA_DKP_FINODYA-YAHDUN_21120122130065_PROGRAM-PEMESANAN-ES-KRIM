/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author finod
 */
public class Frame2 extends javax.swing.JFrame {

    private Object Switch;
    public Frame2() {
        initComponents();
    }

public void reset (){
        hargapesanan.setText(String.valueOf(""));
        hargawadah.setText(String.valueOf(""));
        totalharga.setText(String.valueOf(""));
        jumlahbeli.setText(String.valueOf(""));
        jumlahsnack.setText(String.valueOf(""));
        hargasnack.setText(String.valueOf(""));
        pesanan.setSelectedIndex(0);
        wadah.setSelectedIndex(0);
        snack.setSelectedIndex(0);
}
public void total(){
        int totalpesanan = Integer.parseInt(jumlahbeli.getText());
        int totalsnack = Integer.parseInt (jumlahsnack.getText());
        int harga = Integer.parseInt(hargapesanan.getText());
        int harga2 = Integer.parseInt(hargawadah.getText());
        int harga3 = Integer.parseInt (hargasnack.getText());
        totalharga.setText(Integer.toString(totalpesanan*harga + totalpesanan*harga2 + totalsnack*harga3));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hargapesanan = new javax.swing.JTextField();
        hargawadah = new javax.swing.JTextField();
        pesanan = new javax.swing.JComboBox<>();
        hitung = new javax.swing.JButton();
        totalharga = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wadah = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jumlahbeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        snack = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        hargasnack = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jumlahsnack = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/gambar/icon2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -10, 200, 140));

        jLabel2.setFont(new java.awt.Font("STLiti", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("NOSTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 180, 50));

        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Pesanan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, -1));

        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Jumlah");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, -1));

        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Harga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, -1));

        hargapesanan.setEditable(false);
        hargapesanan.setBackground(new java.awt.Color(0, 153, 153));
        hargapesanan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(hargapesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 91, -1));

        hargawadah.setEditable(false);
        hargawadah.setBackground(new java.awt.Color(0, 153, 153));
        hargawadah.setForeground(new java.awt.Color(255, 255, 255));
        hargawadah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargawadahActionPerformed(evt);
            }
        });
        jPanel1.add(hargawadah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 91, -1));

        pesanan.setBackground(new java.awt.Color(0, 153, 153));
        pesanan.setForeground(new java.awt.Color(255, 255, 255));
        pesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Strawberry", "Chocolate", "Vanilla", "Mix 2 Rasa", "Mix 3 Rasa" }));
        pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananActionPerformed(evt);
            }
        });
        jPanel1.add(pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, -1));

        hitung.setBackground(new java.awt.Color(0, 153, 153));
        hitung.setForeground(new java.awt.Color(255, 255, 255));
        hitung.setText("Total Harga");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel1.add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        totalharga.setEditable(false);
        totalharga.setBackground(new java.awt.Color(0, 153, 153));
        totalharga.setForeground(new java.awt.Color(255, 255, 255));
        totalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalhargaActionPerformed(evt);
            }
        });
        jPanel1.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane2.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(257, 176));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("\tMenu\n  Ice Cream\n     \tStrawberry\tRp7000\n     \tVanilla\tRp7000\n     \tChocolate\tRp70000\n     \tMix 2 Rasa\tRp10000\n     \tMix 3 Rasa\tRp15000\n  Snack\t\n     \tFrench Fries\tRp5000\n     \tWaffle\tRp5000\n     \tDonut\tRp5000");
        jTextArea2.setBorder(null);
        jTextArea2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextArea2ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, 200));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 86, -1));

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Wadah");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        wadah.setBackground(new java.awt.Color(0, 153, 153));
        wadah.setForeground(new java.awt.Color(255, 255, 255));
        wadah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Cup", "Cone" }));
        wadah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wadahActionPerformed(evt);
            }
        });
        jPanel1.add(wadah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 91, -1));

        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Harga");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, -1));

        exit.setBackground(new java.awt.Color(0, 153, 153));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jumlahbeli.setBackground(new java.awt.Color(0, 153, 153));
        jumlahbeli.setForeground(new java.awt.Color(255, 255, 255));
        jumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahbeliActionPerformed(evt);
            }
        });
        jumlahbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahbeliKeyTyped(evt);
            }
        });
        jPanel1.add(jumlahbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 91, -1));

        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Snack");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, -1));

        snack.setBackground(new java.awt.Color(0, 153, 153));
        snack.setForeground(new java.awt.Color(255, 255, 255));
        snack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "French Fries", "Waffle", "Donut", "No Snack" }));
        snack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackActionPerformed(evt);
            }
        });
        jPanel1.add(snack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 90, -1));

        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Harga");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        hargasnack.setEditable(false);
        hargasnack.setBackground(new java.awt.Color(0, 153, 153));
        hargasnack.setForeground(new java.awt.Color(255, 255, 255));
        hargasnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargasnackActionPerformed(evt);
            }
        });
        jPanel1.add(hargasnack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 90, -1));

        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Jumlah");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jumlahsnack.setBackground(new java.awt.Color(0, 153, 153));
        jumlahsnack.setForeground(new java.awt.Color(255, 255, 255));
        jumlahsnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahsnackActionPerformed(evt);
            }
        });
        jumlahsnack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahsnackKeyTyped(evt);
            }
        });
        jPanel1.add(jumlahsnack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/gambar/BG (2).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananActionPerformed
        // TODO add your handling code here:
        String pilihanmenu= (String)pesanan.getSelectedItem();
        switch (pilihanmenu){
        case "Strawberry":
                hargapesanan.setText("7000");
        break;
        case "Chocolate":
                hargapesanan.setText("7000");
        break;
        case "Vanilla":
                hargapesanan.setText("7000");
                break;
        case "Mix 2 Rasa":
                hargapesanan.setText("10000");
                break;
        case "Mix 3 Rasa":
                hargapesanan.setText("15000");
                break;
        case "Choose":
                hargapesanan.setText("0");
                jumlahbeli.setText("0");
                break;
    }
    }//GEN-LAST:event_pesananActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        total();
    }//GEN-LAST:event_hitungActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        {
            JOptionPane.showMessageDialog(null,"Daftar Pesanan:"+"\n"+ pesanan.getSelectedItem()+ " " + jumlahbeli.getText()+"\n" + 
                snack.getSelectedItem() +" " + jumlahsnack.getText()+ "\n"+ "Total harga: " + totalharga.getText()+
                "\n"+"\n" + "Silahkan Lanjut ke Pembayaran" + "\n"+"Terima Kasih "  );
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void wadahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wadahActionPerformed
        // TODO add your handling code here:
        String pilihanwadah= (String)wadah.getSelectedItem();
        switch (pilihanwadah){
        case "Cup":
                hargawadah.setText("3000");
        break;
        case "Cone":
                hargawadah.setText("2000");
        break;
        case "Choose":
                hargawadah.setText ("0");
        break;
        }
    }//GEN-LAST:event_wadahActionPerformed

    private void hargawadahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargawadahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargawadahActionPerformed

    private void totalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalhargaActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_totalhargaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void snackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackActionPerformed
        // TODO add your handling code here:
            String pilihansnack= (String)snack.getSelectedItem();
        switch (pilihansnack){
        case "French Fries":
                hargasnack.setText("5000");
        break;
        case "Waffle":
                hargasnack.setText("5000");
        break;
        case "Donut":
                hargasnack.setText("5000");
                break;              
        case "No Snack":
                hargasnack.setText("0");
                jumlahsnack.setText("0");
        break;
        case "Choose":
            hargasnack.setText("0");
            jumlahsnack.setText("0");
        break;
        }
    }//GEN-LAST:event_snackActionPerformed

    private void jumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahbeliActionPerformed

    private void hargasnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargasnackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargasnackActionPerformed

    private void jumlahbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahbeliKeyTyped
        // TODO add your handling code here:
    char c = evt.getKeyChar();
        if(!((c >= '0') && (c <= '9') && jumlahbeli.getText().length() < 2
        || (c == KeyEvent.VK_BACK_SPACE)
        || (c == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jumlahbeliKeyTyped

    private void jumlahsnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahsnackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahsnackActionPerformed

    private void jumlahsnackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahsnackKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
        if(!((c >= '0') && (c <= '9') && jumlahsnack.getText().length() < 2
        || (c == KeyEvent.VK_BACK_SPACE)
        || (c == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jumlahsnackKeyTyped

    private void jTextArea2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextArea2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2ComponentShown

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Frame2().setVisible(true);
////            }
////        });
//    }
 
                    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JTextField hargapesanan;
    private javax.swing.JTextField hargasnack;
    private javax.swing.JTextField hargawadah;
    private javax.swing.JButton hitung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jumlahbeli;
    private javax.swing.JTextField jumlahsnack;
    private javax.swing.JComboBox<String> pesanan;
    private javax.swing.JComboBox<String> snack;
    private javax.swing.JTextField totalharga;
    private javax.swing.JComboBox<String> wadah;
    // End of variables declaration//GEN-END:variables

}
