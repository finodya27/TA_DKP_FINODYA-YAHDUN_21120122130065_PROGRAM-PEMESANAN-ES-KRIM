/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Frame1 extends javax.swing.JFrame {
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Frame1().setVisible(true);
        }
    });
}

public String nama(){
    String nama = name.getText();
    return "Nama               :" + name.getText();

}
public String Antrian(){
    String nomorAntrian = antrian.getText();
    return "No. Antrian      :" +antrian.getText();
}
public Frame1() {
    initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        antrian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frame2");
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(550, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Data Pemesan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Nama               :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 237, 141, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("No. Antrian       :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 279, 133, -1));

        name.setBackground(new java.awt.Color(0, 153, 153));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 239, 208, -1));

        antrian.setBackground(new java.awt.Color(0, 153, 153));
        antrian.setForeground(new java.awt.Color(255, 255, 255));
        antrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antrianActionPerformed(evt);
            }
        });
        antrian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antrianKeyTyped(evt);
            }
        });
        jPanel1.add(antrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 279, 208, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 428, -1, -1));

        jLabel6.setFont(new java.awt.Font("STLiti", 0, 55)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("NOSTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/gambar/icon2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 206, 173));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cek Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 335, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/gambar/BG (2).jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(name.getText().isEmpty() || antrian.getText().isEmpty())
    {JOptionPane.showMessageDialog(null,"Harap isi data Anda");
    }else{
        Frame2 jf2 =new Frame2();
        jf2.show();

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    if(name.getText().isEmpty() || antrian.getText().isEmpty())
    {JOptionPane.showMessageDialog(null,"Harap isi data Anda");
    }else
        JOptionPane.showMessageDialog(null,nama()+"\n" +Antrian(),"Data Pemesan",1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void antrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antrianActionPerformed

    private void antrianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antrianKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((c >= '0') && (c <= '9') && antrian.getText().length() < 5
        || (c == KeyEvent.VK_BACK_SPACE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_antrianKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        char d = evt.getKeyChar();
        if (!((Character.isLetter(d)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antrian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
