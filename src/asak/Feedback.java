/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author bansh
 */
public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form Feedback
     */
    public Feedback() {
        super("Feedback Form");
        initComponents();
        groupButton();
    }
    
    public Feedback(String name, String meter) {
        super("Feedback Form");
        initComponents();
        groupButton();
        this.name.setText(name);
        setmeternumber(meter);
        
    }
    
    
    void setmeternumber(String meter) {
        try {
            a.setText("" + meter.charAt(0));
            b.setText("" + meter.charAt(1));
            c.setText("" + meter.charAt(2));
            d.setText("" + meter.charAt(3));
            e.setText("" + meter.charAt(4));
            f.setText("" + meter.charAt(5));
            g.setText("" + meter.charAt(6));
            h.setText("" + meter.charAt(7));
        } catch (Exception ex) {
        }

    }
    
    
    private void groupButton(){
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rate1);
        bg1.add(rate2);
        bg1.add(rate3);
        bg1.add(rate4);
        bg1.add(rate5);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rate1 = new javax.swing.JRadioButton();
        rate2 = new javax.swing.JRadioButton();
        rate3 = new javax.swing.JRadioButton();
        rate4 = new javax.swing.JRadioButton();
        rate5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviews = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feedback2.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 173, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COSTUMER");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 173, 239));
        jLabel3.setText("FEEDBACK");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Meter Number");

        a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aKeyPressed(evt);
            }
        });

        b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bKeyPressed(evt);
            }
        });

        c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cKeyPressed(evt);
            }
        });

        d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        d.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dKeyPressed(evt);
            }
        });

        e.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        e.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eKeyPressed(evt);
            }
        });

        f.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        f.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fKeyPressed(evt);
            }
        });

        g.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        g.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gKeyPressed(evt);
            }
        });

        h.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        h.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rate your experience with ASAK");

        rate1.setText("Poor");

        rate2.setText("Satisfactory");

        rate3.setText("Good");

        rate4.setText("Very Good");

        rate5.setText("Amazing");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Any other reviews or complains");

        reviews.setColumns(20);
        reviews.setRows(5);
        jScrollPane1.setViewportView(reviews);

        jButton1.setBackground(new java.awt.Color(0, 173, 239));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(131, 131, 131)
                                .addComponent(rate4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(rate5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(name)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rate1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rate3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate1)
                            .addComponent(rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rate3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate4)
                            .addComponent(rate5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        UserPortal show = new UserPortal("");
        show.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ASAKDatabase","asakadmin","asakadmin");
            String command = "Insert into feedback (name, meter_number, rating, feedback)"
                    + " values ( ?,?,?,?)";    //arg of prep stat so ? i used
            
            
            PreparedStatement ps = con.prepareStatement(command);
            String meter_no = a.getText().concat( b.getText().concat(c.getText().concat(d.getText().concat(e.getText().concat(f.getText().concat(g.getText().concat(h.getText())))))));
            
            int meter = Integer.parseInt(meter_no);
            String ratingText="";
            if(rate1.isSelected()){
                ratingText = rate1.getText();
            }
            if(rate2.isSelected()){
                ratingText = rate2.getText();
            }
            if(rate3.isSelected()){
                ratingText = rate3.getText();
            }
            if(rate4.isSelected()){
                ratingText = rate4.getText();
            }
            if(rate5.isSelected()){
                ratingText = rate5.getText();
            }
           // String uname = username.getText(),upass = password.getText(),add = address.getText(),cityy = city.getText(),lmark = landmark.getText(),mail = email.getText();
          
            ps.setString(1, name.getText());
            ps.setInt(2, meter);
            ps.setString(3, ratingText);
            ps.setString(4, reviews.getText());
            
           
            
            int row = ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Thanks For your Feedback");
            dispose();
            new UserPortal("").setVisible(true);
            
        }catch(SQLException cerr){
            JOptionPane.showMessageDialog(this, cerr);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
    a.addKeyListener(new KeyAdapter(){
          public void keyPressed(KeyEvent e){
             String value=a.getText();
             if(value.length()==1){
             b.requestFocus();
          }
             
          }   
});
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyPressed
        if (evt.getKeyCode() == 8 && a.getText().length()==1){
            
        }
        else if (a.getText().length()==0){
            b.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_aKeyPressed

    private void bKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyPressed
        if (evt.getKeyCode() == 8 && b.getText().length()==1){
            a.requestFocus();
        }
        else if (b.getText().length()==0){
            c.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bKeyPressed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void cKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyPressed
        if (evt.getKeyCode() == 8 && c.getText().length()==1){
            b.requestFocus();
        }
        else if (c.getText().length()==0){
            d.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cKeyPressed

    private void dKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyPressed
        if (evt.getKeyCode() == 8 && d.getText().length()==1){
            c.requestFocus();
        }
        else if (d.getText().length()==0){
            e.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dKeyPressed

    private void eKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eKeyPressed
        if (evt.getKeyCode() == 8 && e.getText().length()==1){
            d.requestFocus();
        }
        else if (e.getText().length()==0){
            f.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_eKeyPressed

    private void fKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fKeyPressed
        if (evt.getKeyCode() == 8 && f.getText().length()==1){
            e.requestFocus();
        }
        else if (f.getText().length()==0){
            g.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fKeyPressed

    private void gKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gKeyPressed
        if (evt.getKeyCode() == 8 && g.getText().length()==1){
            f.requestFocus();
        }
        else if (g.getText().length()==0){
            h.requestFocus();
        }
           // TODO add your handling code here:
    }//GEN-LAST:event_gKeyPressed

    private void hKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyPressed
        if (evt.getKeyCode() == 8 && h.getText().length()==1){
            g.requestFocus();
        }
        else if (h.getText().length()==0){
            reviews.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hKeyPressed

    
    
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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField g;
    private javax.swing.JTextField h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton rate1;
    private javax.swing.JRadioButton rate2;
    private javax.swing.JRadioButton rate3;
    private javax.swing.JRadioButton rate4;
    private javax.swing.JRadioButton rate5;
    private javax.swing.JTextArea reviews;
    // End of variables declaration//GEN-END:variables
}
