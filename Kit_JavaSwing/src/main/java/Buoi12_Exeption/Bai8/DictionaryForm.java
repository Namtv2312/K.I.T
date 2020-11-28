/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai8;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author NAM SYSTEM
 */
public class DictionaryForm extends javax.swing.JFrame {

    String[] wordEn = {"Apple", "Bank", "Cow", "Door", "Egg", "Fun", "Global", "Hot", "Implement", "Knowledge", " Love", " Money", " Nation"};
    String[] wordVi = {"Qua tao", "Ngan hang", "Con bo", "Cua ra vao", "Qua trung", "Vui ve", "Toan cau", "Nong", "Trien khai, thuc hien", "Hieu biet", "Tinh yeu", "Tien", "Dan toc"};
    Word w = new Word(0, wordEn[0], wordVi[0]);
    Word w1 = new Word(1, wordEn[1], wordVi[1]);
    Word w2 = new Word(2, wordEn[2], wordVi[2]);
    Word w3 = new Word(3, wordEn[3], wordVi[3]);
    Word w4 = new Word(4, wordEn[4], wordVi[4]);
    Word w5 = new Word(5, wordEn[5], wordVi[5]);
    Word w6 = new Word(6, wordEn[6], wordVi[6]);
    Word w7 = new Word(7, wordEn[7], wordVi[7]);
    Word w8 = new Word(8, wordEn[8], wordVi[8]);
    Word w9 = new Word(9, wordEn[9], wordVi[9]);
    Word w10 = new Word(10, wordEn[10], wordVi[10]);
    Word w11 = new Word(11, wordEn[11], wordVi[11]);
    Word w12 = new Word(12, wordEn[12], wordVi[12]);

    public static Comparator<Word> getCompBywordEn() {
        Comparator<Word> comp = new Comparator<Word>() {
            @Override
            public int compare(Word s1, Word s2) {
                return s1.getEn().compareTo(s2.getEn());
            }
        };
        return comp;
    }

    /**
     * Creates new form DictionaryForm
     */
    public DictionaryForm() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        txtNhap = new javax.swing.JTextField();
        txtMean = new javax.swing.JTextField();
        btnDicch = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Download\\Hackers-icon.png")); // NOI18N
        jLabel1.setText("DICTIONARY");

        txtNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapActionPerformed(evt);
            }
        });

        btnDicch.setText("Dich");
        btnDicch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDicchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnDicch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(txtMean, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMean, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDicch)
                .addGap(184, 184, 184))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(rootPane, "Cam on ban da ghe tham");
    }//GEN-LAST:event_formWindowClosing

    private void txtNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapActionPerformed

    }//GEN-LAST:event_txtNhapActionPerformed


    private void btnDicchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDicchActionPerformed

        try {
            int index = Arrays.binarySearch(wordEn, txtNhap.getText());
            txtMean.setText(wordVi[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showConfirmDialog(rootPane, "Them vao nhe", "Khong co trong tu  dien ", JOptionPane.INFORMATION_MESSAGE);
            String en = JOptionPane.showInputDialog("en");
            String vi = JOptionPane.showInputDialog("vi");
            wordEn[wordEn.length + 1] = en;
            wordVi[wordVi.length + 1] = vi;
        }

    }//GEN-LAST:event_btnDicchActionPerformed

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
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDicch;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtMean;
    private javax.swing.JTextField txtNhap;
    // End of variables declaration//GEN-END:variables
}
