
import javax.swing.DefaultListModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class withdrawal extends javax.swing.JFrame {

  
    public withdrawal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AMT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        WID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 460, 94, 35);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 460, 91, 35);
        getContentPane().add(AMT);
        AMT.setBounds(433, 405, 94, 25);

        jLabel6.setText("    Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(299, 405, 86, 25);
        getContentPane().add(TFname);
        TFname.setBounds(433, 358, 94, 28);

        jLabel5.setText("        Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(299, 359, 86, 27);
        getContentPane().add(WID);
        WID.setBounds(433, 310, 94, 30);

        jLabel4.setText("   Withdrawal ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(292, 311, 93, 28);
        getContentPane().add(Date);
        Date.setBounds(434, 261, 93, 31);

        jLabel2.setText("         Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(292, 261, 89, 31);

        TID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDActionPerformed(evt);
            }
        });
        getContentPane().add(TID);
        TID.setBounds(150, 240, 97, 31);

        jLabel1.setText("     Transaction ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 240, 110, 31);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 460, 97, 36);

        List1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payee ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        List1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        List1.setModel(new DefaultListModel());
        List1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 290, 191, 150);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 10, 550, 200);

        jLabel18.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.orange);
        jLabel18.setText("          Withdraw Money");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 210, 410, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 580, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        // On Click on Clear Button.
        Date.setText("");
        WID.setText("");
        TFname.setText("");
        AMT.setText("");
        TID.setText("");
        List1.clearSelection();                                  
                                                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

// On click on Save Button.        
String DB="jdbc:mysql://localhost/Bank";
int a=JOptionPane.showConfirmDialog(null,"Do you want WITHDRAW MONEY.");
if(a==JOptionPane.YES_OPTION){
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    String tID=TID.getText();
    String date=Date.getText();
    String wID=WID.getText();
    String name=TFname.getText();
    float amt=Float.parseFloat(AMT.getText());
    String qr1="insert into withdraw values('"+tID+"','"+date+"'"
                + ",'"+wID+"','"+name+"','"+amt+"')";
    stmt.executeUpdate(qr1);
    JOptionPane.showMessageDialog(null,"WITHDRAWAL successfull."); }
    catch(Exception e){
    System.out.println(e);
    JOptionPane.showMessageDialog(null,e.getMessage()); }
    String accno=WID.getText();
    float amt=Float.parseFloat(AMT.getText());
    String qr2="select * from account where Account_Number='"+accno+"';";
    try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr2);
    if(rs.next()){
    float bal=rs.getFloat("Balance");
    String qr3="update account SET Balance='"+(bal-amt)+"'"
            + " where Account_Number='"+accno+"';";
    stmt.executeUpdate(qr3);}}
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());}

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        // On click on Back Button.
        new Menu().setVisible(true);
        dispose();                                                                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void List1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List1MouseClicked
        // Extracting supplier id and name into a variable SidName
        String Name = (String) List1.getSelectedValue();
        String wid = Name.substring(0, 3);
        String sname= Name.substring(4);

        // Displays ID and name from ComboBox1
        WID.setText(wid);
        TFname.setText(sname);
    }//GEN-LAST:event_List1MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
      DefaultListModel Model=(DefaultListModel)List1.getModel();
      Model.clear();
String DB="jdbc:mysql://localhost/Bank";
String qr="select * from account";
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr);
    while(rs.next()){
        String wid=rs.getString("Account_Number");
        String name=rs.getString("Name");
        Model.addElement(wid+"-"+name);   }
    List1.setModel(Model);}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());}     


// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void TIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIDActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMT;
    private javax.swing.JTextField Date;
    private javax.swing.JList List1;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField WID;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
