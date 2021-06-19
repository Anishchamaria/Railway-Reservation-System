/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TicketBooking.java
 *
 * Created on 16 Jun, 2018, 10:24:47 PM
 */

/**
 *
 * @author Anish Chamaria
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
public class TicketBooking extends javax.swing.JFrame {
    /** Creates new form TicketBooking */
    public TicketBooking() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("USER - PASSENGER INFORMATION");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age(above 5)", "Gender(Male/Female/Others)", "Berth(Lower/Middle/Upper)", "Aadhar No.(12 Digits)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\Untitled modified1.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\IP Project\\Images and docx\\screen-10.57.26[30.04.2018] modified.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ravie", 2, 18));
        jLabel7.setText("Your ticket Booking");

        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Train Number: ");

        jTextField1.setEditable(false);

        jLabel2.setText("Source:-");

        jTextField2.setEditable(false);

        jLabel3.setText("Destination:-");

        jTextField3.setEditable(false);

        jLabel4.setText("Coach Type:-");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1A");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2A");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3A");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Sleeper");

        jLabel8.setText("Date:-");

        jTextField4.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18));
        jLabel12.setText("Back....");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel11.setText("Train Name:-");

        jTextField5.setEditable(false);

        jLabel13.setText("Departure Time:-");

        jTextField6.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addGap(283, 283, 283)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TicketBookingConformation tbc = new TicketBookingConformation();
        String u = jLabel10.getText();
        int tn = Integer.parseInt(jTextField1.getText());
        int ne = Integer.parseInt(jLabel6.getText());
        TableModel model = jTable1.getModel();
        String yy = JFrame2.jComboBox1.getSelectedItem().toString();//YYYY
        String mm = JFrame2.jComboBox2.getSelectedItem().toString();//MM
        String dd = JFrame2.jComboBox3.getSelectedItem().toString();//DD
        String date = yy + "-" + mm + "-" + dd;
        String time = jTextField6.getText();
        String datedept = yy + "-" + mm + "-" + dd + " " + time;
        String check = "";
        int gbcheck = 0;
        int checking = 0;
        int isn = 0;
        int cno = 0;
        int coachno = 1;
        if(jRadioButton1.isSelected()){
           check = "1A";
           checking = checking + 1;
        }
        else
        if(jRadioButton2.isSelected()){
           check = "2A";
           checking = checking + 1;
        }
        else
        if(jRadioButton3.isSelected()){
           check = "3A";
           checking = checking + 1;
        }
        else
        if(jRadioButton4.isSelected()){
           check = "S";
           checking = checking + 1;
        }
        String pn = "";String sn = "";
        int pnr = 0;int sni1 = 0;
         try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("Select * from booking order by pnr desc");
           if(rs.next()){
              pn = rs.getString("pnr");
              pnr = Integer.parseInt(pn) + 1;
           }
              TicketBookingConformation.jLabel11.setText(pnr + "");
              TicketBookingConformation.jLabel11.setVisible(false);
            }
         catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
         }
        int i = 0;
        while(i < ne){
           try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
              datedept = date + " " + jTextField6.getText();
           Statement stcn1 = con.createStatement();
           ResultSet rscn1 = stcn1.executeQuery("Select substr(coachtype,2,2) from booking where trainno = " + tn + " and doj = '" + datedept + "' order by coachtype desc");
           if(rscn1.next()){
               String coachcheck = rscn1.getString("substr(coachtype,2,2)");
               if(!coachcheck.equalsIgnoreCase("A")){
               coachno = Integer.parseInt(coachcheck);
               }
 else
     coachno = 1;
           }
           if(check.equals("S")){
           Statement st2 = con.createStatement();
           ResultSet rs2 = st2.executeQuery("Select * from booking where trainno = " + tn + " and doj = '" + datedept + "' and coachtype like('S%')order by seatn desc");
           if(rs2.next()){
              sn = rs2.getString("seatn");
              isn = Integer.parseInt(sn);
              sni1 = isn + 1;
              if(isn % 72 == 0){
                 coachno++;
                 sn = "0";
              }
           }
 else
     sn = "0";
              sni1 = isn + 1;
                }
 else{
           Statement stc2 = con.createStatement();
           ResultSet rsc2 = stc2.executeQuery("Select * from booking where trainno = " + tn + " and doj = '" + datedept + "' and coachtype = '" + check + "' order by seatn desc");
           if(rsc2.next()){
              sn = rsc2.getString("seatn");
              isn = Integer.parseInt(sn);
              sni1 = isn + 1;
           }
 else {
              sn = "0";
              isn = Integer.parseInt(sn);
              sni1 = isn + 1;
           }
                }
    }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
        String n1 = model.getValueAt(i,0).toString();
        String a1 = model.getValueAt(i,1).toString();
        int acheck = Integer.parseInt(a1);
        String g1 = model.getValueAt(i,2).toString();
        String b1 = model.getValueAt(i,3).toString() + " Berth";
        String aa1 = model.getValueAt(i, 4).toString();
        String km = "";
        int kms = 0;
        double r = 0;
        if(aa1.length() == 12){
        if(acheck > 5 && acheck <= 150){
        if(g1.equalsIgnoreCase("Male") || g1.equalsIgnoreCase("Female") || g1.equalsIgnoreCase("Others")){
        if(b1.equalsIgnoreCase("Lower Berth") || b1.equalsIgnoreCase("Upper Berth") || b1.equalsIgnoreCase("Middle Berth")){
            try{
           Class.forName("java.sql.DriverManager");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc" , "root" , "root");
              datedept = date + " " + jTextField6.getText();
           Statement st4 = con.createStatement();
           if(check.equals("S")){
           st4.executeUpdate("Insert into booking values(" + tn + ",'" + n1 + "'," + a1 + ",'" + g1 + "','" + b1 + "','" + check + "" + coachno +"',now()," + pnr + "," + sni1 + ",'" + datedept + "','" + u + "'," + aa1 + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "')");
               }
 else{
           st4.executeUpdate("Insert into booking values(" + tn + ",'" + n1 + "'," + a1 + ",'" + g1 + "','" + b1 + "','" + check +"',now()," + pnr + "," + sni1 + ",'" + datedept + "','" + u + "'," + aa1 + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "')");
               }
           ResultSet rs4 = st4.executeQuery("Select t.*,k." + JFrame2.jComboBox6.getSelectedItem().toString() + " from ikm k,train t where k.fromto = '" + JFrame2.jComboBox5.getSelectedItem().toString() + "' and t.IStation like('%" + JFrame2.jComboBox5.getSelectedItem().toString() + "%') and t.IStation like('%" + JFrame2.jComboBox6.getSelectedItem().toString() + "%')");
           if(rs4.next()){
           kms = Integer.parseInt(rs4.getString("" + JFrame2.jComboBox6.getSelectedItem().toString() + ""));
               }
           Statement st5 = con.createStatement();
           ResultSet rs5 = st5.executeQuery("select r" + check + " from train");
           if(rs5.next()){
              r = Double.parseDouble(rs5.getString("r" + check));
           }
           r = ne * r * kms;
           TicketBookingConformation.jTextField10.setText(r + "");
           Statement str = con.createStatement();
           str.executeUpdate("Insert into amount values(" + pnr + "," + r + ")");
           if(checking == 1){
        DefaultTableModel model1 = (DefaultTableModel) TicketBookingConformation.jTable1.getModel();
        TicketBookingConformation.jTextField1.setText(jTextField1.getText());
        TicketBookingConformation.jTextField2.setText(jTextField2.getText());
        TicketBookingConformation.jTextField3.setText(jTextField3.getText());
        TicketBookingConformation.jTextField5.setText(jTextField5.getText());
        TicketBookingConformation.jTextField6.setText(jTextField6.getText());
        TicketBookingConformation.jTextField4.setText(date);
        if(check.equals("S")){
        model1.addRow(new Object[]{n1,a1,g1,b1,check+coachno,sni1});
        }
 else
     model1.addRow(new Object[]{n1,a1,g1,b1,check,sni1});
        TicketBookingConformation.jTextField9.setText(kms + "");
           }
           else
               JOptionPane.showMessageDialog(null, "Please Select a Coach Type");
              
            }
         catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
         }
            gbcheck++;
            }
 else
     JOptionPane.showMessageDialog(null, "Enter a Vaild Berth");
         gbcheck++;
            }
 else
     JOptionPane.showMessageDialog(null, "Enter a Vaild Gender");
            }
        else
                  JOptionPane.showMessageDialog(null, "Enter a Valid Age");
        }
              else
                  JOptionPane.showMessageDialog(null, "Enter a Valid Aadhar Number");
        i++;
        }
        if(ne ==1 && gbcheck == 2){
        dispose();
        tbc.setVisible(true);
        }
        if(ne == 2 && gbcheck == 4){
        dispose();
        tbc.setVisible(true);
        }
        if(ne == 3 && gbcheck == 6){
        dispose();
        tbc.setVisible(true);
        }
        if(ne == 4 && gbcheck == 8){
        dispose();
        tbc.setVisible(true);
        }
        if(ne == 5 && gbcheck == 10){
        dispose();
        tbc.setVisible(true);
        }
        if(ne == 6 && gbcheck == 12){
        dispose();
        tbc.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dispose();
        JFrame32 jf32 = new JFrame32();
        jf32.setVisible(true);
}//GEN-LAST:event_jLabel12MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
