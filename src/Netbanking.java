import javax.swing.DefaultListModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Netbanking extends javax.swing.JFrame {
    public Netbanking() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList();
        Date = new javax.swing.JTextField();
        SName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BID = new javax.swing.JTextField();
        AMT = new javax.swing.JTextField();
        BName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.orange);
        jLabel3.setText(" Transfer Money - Net Banking");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 204, 438, 50);

        jLabel1.setText("   Transaction ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(8, 259, 102, 32);
        getContentPane().add(TID);
        TID.setBounds(128, 259, 120, 32);

        jLabel5.setText("     Sender's ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(9, 306, 107, 29);
        getContentPane().add(SID);
        SID.setBounds(128, 306, 120, 29);

        List1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        List1.setModel(new DefaultListModel());
        List1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(49, 364, 199, 102);
        getContentPane().add(Date);
        Date.setBounds(412, 260, 122, 31);
        getContentPane().add(SName);
        SName.setBounds(412, 304, 122, 33);

        jLabel6.setText("Sender's Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(293, 306, 100, 29);

        jLabel4.setText("     Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(313, 260, 87, 31);

        jLabel7.setText("     Amount");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(149, 494, 99, 37);

        jLabel9.setText(" Beneficiary ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(149, 538, 90, 34);

        jLabel10.setText("Beneficiary Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(149, 579, 99, 33);
        getContentPane().add(BID);
        BID.setBounds(309, 538, 123, 34);
        getContentPane().add(AMT);
        AMT.setBounds(309, 494, 123, 37);
        getContentPane().add(BName);
        BName.setBounds(309, 579, 123, 33);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(219, 631, 91, 35);

        List2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beneficiary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        List2.setModel(new DefaultListModel());
        List2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(List2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(309, 364, 198, 102);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(375, 631, 94, 35);

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(58, 630, 97, 36);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 10, 550, 200);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 570, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
    // On click on Save Button.    
    String DB="jdbc:mysql://localhost/Bank";
    int a=JOptionPane.showConfirmDialog(null,"Do you want TRANSFER MONEY.");
      if(a==JOptionPane.YES_OPTION){
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection(DB,"root","1234");
            Statement stmt=con.createStatement();
            String tid= TID.getText();
            String date=Date.getText();
            String Sname=SName.getText();
            String Bid=BID.getText();
            float amt=Float.parseFloat(AMT.getText());
            String qr1="insert into transaction values('"+tid+"','"+date+"'"
            + ",'"+Sname+"','"+Bid+"','"+amt+"')";
            stmt.executeUpdate(qr1);}
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,e.getMessage());}
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    String date=Date.getText();
    String tid=TID.getText();
    String sid=SID.getText();
    String sname=SName.getText();
    float amt=Float.parseFloat(AMT.getText());
    String qr1="insert into withdraw values('"+tid+"','"+date+"'"
                + ",'"+sid+"','"+sname+"','"+amt+"')";
    stmt.executeUpdate(qr1);
    }
catch(Exception e){
System.out.println(e);
JOptionPane.showMessageDialog(null,e.getMessage());}            
    String Saccno=SID.getText();
    float amt=Float.parseFloat(AMT.getText());
    String qr2="select * from account where Account_Number='"+Saccno+"';";
    try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr2);
    if(rs.next()){
    float bal=rs.getFloat("Balance");
    String qr3="update account SET Balance='"+(bal-amt)+"'"
            + " where Account_Number='"+Saccno+"';";
                    stmt.executeUpdate(qr3); }}
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());}
           String Baccno=BID.getText();
    try{
        Class.forName("java.sql.DriverManager");
        Connection con=DriverManager.getConnection(DB,"root","1234");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(qr2);
        if(rs.next()){
        float bal=rs.getFloat("Balance");
        String qr3="update account SET Balance='"+(bal+amt)+"'"
                + " where Account_Number='"+Baccno+"';";
                    stmt.executeUpdate(qr3);}}
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());}          
        JOptionPane.showMessageDialog(null,"Money Transfer Successfully.");}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        // On click on Clear Button.
        Date.setText("");
        SID.setText("");
        SName.setText("");
        BName.setText("");
        BID.setText("");
        AMT.setText("");
        TID.setText("");
        List1.clearSelection();      
        List2.clearSelection();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Menu().setVisible(true);
        dispose();       

// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void List1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List1MouseClicked
String Name = (String) List1.getSelectedValue();
        String sid = Name.substring(0, 3);
        String sname= Name.substring(4);

        // Displays ID and name from ComboBox1
        SID.setText(sid);
        SName.setText(sname);        // TODO add your handling code here:
    }//GEN-LAST:event_List1MouseClicked

    private void List2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List2MouseClicked
String Name = (String) List2.getSelectedValue();
        String Bid = Name.substring(0, 3);
        String Bname= Name.substring(4);

        // Displays ID and name from ComboBox1
        BID.setText(Bid);
        BName.setText(Bname);        // TODO add your handling code here:
    }//GEN-LAST:event_List2MouseClicked

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
        String sid=rs.getString("Account_Number");
        String sname=rs.getString("Name");
        Model.addElement(sid+"-"+sname);   
    }
    List1.setModel(Model);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
 DefaultListModel Model2=(DefaultListModel)List2.getModel();
      Model2.clear();
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection(DB,"root","1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr);
    while(rs.next()){
        String bid=rs.getString("Account_Number");
        String Bname=rs.getString("Name");
        Model2.addElement(bid+"-"+Bname);   
    }
    List2.setModel(Model2);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    }// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Netbanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMT;
    private javax.swing.JTextField BID;
    private javax.swing.JTextField BName;
    private javax.swing.JTextField Date;
    private javax.swing.JList List1;
    private javax.swing.JList List2;
    private javax.swing.JTextField SID;
    private javax.swing.JTextField SName;
    private javax.swing.JTextField TID;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
