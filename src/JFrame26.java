
import java.awt.Component;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrame26.java
 *
 * Created on 8 Jun, 2018, 11:43:59 PM
 */

/**
 *
 * @author Anish Chamaria
 */
public class JFrame26 extends javax.swing.JFrame {

    /** Creates new form JFrame26 */
    public JFrame26() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setLocationByPlatform(boolean locationByPlatform) {
        super.setLocationByPlatform(locationByPlatform);
    }


    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("START UP PAGE");

        jPanel1.setBackground(new java.awt.Color(-65536,true));
        jPanel1.setForeground(new java.awt.Color(-65536,true));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ravie", 2, 18));
        jLabel3.setText("Welcome to AIRCTC");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 60, 238, 25);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-10.57.26[30.04.2018] modified.png")); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 20, 66, 69);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\Untitled modified1.png")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 20, 71, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\33-people1n.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 330, 284, 111);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\customer-care-executive_1558569n1n.jpg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 330, 208, 111);

        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/IP Project/Images and docx/indian_railway_660_050418065654.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 660, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        JFrame1 jf1 = new JFrame1();
        jf1.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
        JFrame27 jf27 = new JFrame27();
        jf27.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame26().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}