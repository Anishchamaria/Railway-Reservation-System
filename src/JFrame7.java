/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrame7.java
 *
 * Created on 30 Apr, 2018, 4:26:05 PM
 */

/**
 *
 * @author Anish Chamaria
 */
import java.sql.*;
import javax.swing.*;
public class JFrame7 extends javax.swing.JFrame {

    /** Creates new form JFrame7 */
    public JFrame7() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("USER - CREDIT CARD MODE OF PAYMENT GATEWAY");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-16.31.43[30.04.2018] modified.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-16.37.16[30.04.2018] modified.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-16.41.27[30.04.2018] modified.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-16.44.47[30.04.2018].png")); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(jRadioButton1);

        jRadioButton2.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(jRadioButton2);

        jLabel10.setFont(new java.awt.Font("Ravie", 2, 18));
        jLabel10.setText("Credit Card Selection");

        jRadioButton3.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(jRadioButton4);

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-10.57.26[30.04.2018] modified.png")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\Untitled modified1.png")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18));
        jLabel12.setText("Back....");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jRadioButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButton4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
           JFrame10 jf10 = new JFrame10();
        try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
           Statement st = con.createStatement();
           Statement st1 = con.createStatement();
           ResultSet rs1 = st1.executeQuery("select Date_Format(curdate(),'%Y')");
           if(rs1.next()){
              JFrame10.jComboBox2.setSelectedItem(rs1.getString("Date_Format(curdate(),'%Y')") + "");
           }
           Statement st2 = con.createStatement();
           ResultSet rs2 = st2.executeQuery("select Date_Format(curdate(),'%m')");
           if(rs2.next()){
              JFrame10.jComboBox1.setSelectedItem(rs2.getString("Date_Format(curdate(),'%m')"));
            }
        }
   catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
   }
           dispose();
           jf10.setVisible(true);
        }
        else
            if(jRadioButton2.isSelected()){
           JFrame11 jf11 = new JFrame11();
        try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
           Statement st = con.createStatement();
           Statement st1 = con.createStatement();
           ResultSet rs1 = st1.executeQuery("select Date_Format(curdate(),'%Y')");
           if(rs1.next()){
              JFrame11.jComboBox2.setSelectedItem(rs1.getString("Date_Format(curdate(),'%Y')") + "");
           }
           Statement st2 = con.createStatement();
           ResultSet rs2 = st2.executeQuery("select Date_Format(curdate(),'%m')");
           if(rs2.next()){
              JFrame11.jComboBox1.setSelectedItem(rs2.getString("Date_Format(curdate(),'%m')"));
            }
        }
   catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
   }
           dispose();
           jf11.setVisible(true);
        }
            else
                if(jRadioButton3.isSelected()){
           JFrame12 jf12 = new JFrame12();
        try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
           Statement st = con.createStatement();
           Statement st1 = con.createStatement();
           ResultSet rs1 = st1.executeQuery("select Date_Format(curdate(),'%Y')");
           if(rs1.next()){
              JFrame12.jComboBox2.setSelectedItem(rs1.getString("Date_Format(curdate(),'%Y')") + "");
           }
           Statement st2 = con.createStatement();
           ResultSet rs2 = st2.executeQuery("select Date_Format(curdate(),'%m')");
           if(rs2.next()){
              JFrame12.jComboBox1.setSelectedItem(rs2.getString("Date_Format(curdate(),'%m')"));
            }
        }
   catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
   }
           dispose();
           jf12.setVisible(true);
        }
                else
                    if(jRadioButton4.isSelected()){
           JFrame13 jf13 = new JFrame13();
        try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
           Statement st = con.createStatement();
           Statement st1 = con.createStatement();
           ResultSet rs1 = st1.executeQuery("select Date_Format(curdate(),'%Y')");
           if(rs1.next()){
              JFrame13.jComboBox2.setSelectedItem(rs1.getString("Date_Format(curdate(),'%Y')") + "");
           }
           Statement st2 = con.createStatement();
           ResultSet rs2 = st2.executeQuery("select Date_Format(curdate(),'%m')");
           if(rs2.next()){
              JFrame13.jComboBox1.setSelectedItem(rs2.getString("Date_Format(curdate(),'%m')"));
            }
        }
   catch(Exception e){
      JOptionPane.showMessageDialog(null, e.getMessage());
   }
           dispose();
           jf13.setVisible(true);
        }
                    else
                        javax.swing.JOptionPane.showMessageDialog(null, "Please select a credit card for your payment");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dispose();
        JFrame6 jf6 = new JFrame6();
        jf6.setVisible(true);
}//GEN-LAST:event_jLabel12MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

}
