/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BillingForm.java
 *
 * Created on Nov 14, 2012, 7:21:23 AM
 */
package BaseBox;

import Model.ItemModel;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author paradise lost
 */
public class UserProgram extends javax.swing.JPanel{
    private String stock="1";
    public static int iteration=0;
    private ItemModel im;

    /** Creates new form BillingForm */
    public UserProgram() throws SQLException, IOException {
        initComponents();
        im=new ItemModel();
        this.setSize(1210,710);
        userBanner.setIcon(new ImageIcon(ImageIO.read(new File("kadiansmall.jpg"))));
        userBanner.setVisible(false);
        userBanner.setVisible(true);
        ArrayList<String> str=im.getItemDetailByINIT();
            descriptionLabel.setText(str.get(0));
            itemLabel.setText(str.get(1));
            priceLabel.setText(str.get(2));
            priceLabel.setVisible(false);            
            priceLabel.setVisible(true);
            urlLabel.setText(str.get(3));
            urlLabel.setVisible(false);            
            urlLabel.setVisible(true);
            
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        itemLabel = new javax.swing.JTextField();
        newPriceField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        Product8 = new javax.swing.JLabel();
        Product9 = new javax.swing.JLabel();
        successLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        descriptionLabel = new javax.swing.JTextArea();
        urlLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NewPriceLabel = new javax.swing.JLabel();
        outofstock = new javax.swing.JRadioButton();
        pricechanged = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateCount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 11), new java.awt.Dimension(0, 11), new java.awt.Dimension(32767, 11));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 18), new java.awt.Dimension(0, 18), new java.awt.Dimension(32767, 18));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 18), new java.awt.Dimension(0, 18), new java.awt.Dimension(32767, 18));
        userBanner = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        itemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuantityMouseExited(evt);
            }
        });
        itemLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLabelActionPerformed(evt);
            }
        });
        itemLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemLabelFocusLost(evt);
            }
        });
        itemLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemLabelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        add(itemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 310, 30));

        newPriceField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newPriceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RateMouseExited(evt);
            }
        });
        newPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPriceFieldActionPerformed(evt);
            }
        });
        newPriceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPriceFieldFocusLost(evt);
            }
        });
        newPriceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newPriceFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RateKeyTyped(evt);
            }
        });
        add(newPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 70, 30));
        newPriceField.setVisible(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Description");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("Item No");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 90, 20));

        warningLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 280, 30));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(0, 51, 204));
        printButton.setText("Save -> Continue");
        printButton.setBorder(null);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 150, 30));

        Product8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Product8.setForeground(new java.awt.Color(0, 51, 204));
        Product8.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        Product8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product8MouseClicked(evt);
            }
        });
        add(Product8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 740, 260, 30));
        Product8.setVisible(false);

        Product9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Product9.setForeground(new java.awt.Color(0, 51, 204));
        Product9.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        Product9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product9MouseClicked(evt);
            }
        });
        add(Product9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 770, 260, 30));
        Product9.setVisible(false);

        successLabel.setBackground(new java.awt.Color(153, 153, 153));
        successLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        successLabel.setForeground(new java.awt.Color(255, 0, 51));
        successLabel.setText("* Update Successful");
        add(successLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 140, 30));
        successLabel.setVisible(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("URL");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 60, 30));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 200, -1));

        descriptionLabel.setColumns(20);
        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionLabel.setRows(5);
        jScrollPane5.setViewportView(descriptionLabel);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 320, 100));

        urlLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        urlLabel.setForeground(new java.awt.Color(0, 51, 255));
        urlLabel.setText("http://");
        urlLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlLabelMouseClicked(evt);
            }
        });
        add(urlLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 390, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 204));
        jLabel16.setText("Inventory ");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 130, 30));

        NewPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewPriceLabel.setForeground(new java.awt.Color(0, 51, 204));
        NewPriceLabel.setText("New Price");
        add(NewPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 80, 30));
        NewPriceLabel.setVisible(false);

        outofstock.setText("Out Of  Stock");
        outofstock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                outofstockStateChanged(evt);
            }
        });
        add(outofstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        pricechanged.setText(" Changed");
        pricechanged.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pricechangedStateChanged(evt);
            }
        });
        pricechanged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricechangedActionPerformed(evt);
            }
        });
        add(pricechanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 204));
        jLabel20.setText("Price  (USD):");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 110, 30));

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 51, 204));
        priceLabel.setText("0.00 ");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Updates");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 140, 30));

        updateCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateCount.setText("0");
        add(updateCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 145, 100, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 610, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 310, 10));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        filler2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 10, 780));

        filler3.setBorder(new javax.swing.border.SoftBevelBorder(0));
        add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 10, 790));
        add(userBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 130));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Data Preprocessing");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Data Analytics");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Machine Learning");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Data Mining");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Database Solutions");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Artificial Intelligence");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("Data Migration");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Data Visualization");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText("Business Intelligence");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void itemLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLabelActionPerformed
//        try {
//            
//            ArrayList<String> str=im.getItemDetailByItemNum(itemLabel.getText());
//            descriptionLabel.setText(str.get(0));
//            itemLabel.setText(str.get(1));
//            priceLabel.setText(str.get(2));
//            priceLabel.setVisible(false);            
//            priceLabel.setVisible(true);
//            urlLabel.setText(str.get(3));
//            urlLabel.setVisible(false);            
//            urlLabel.setVisible(true);
//            stock=str.get(4);
//            
//           
//            // TODO add your handling code here:
//        } catch (SQLException ex) {
//            Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_itemLabelActionPerformed

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped

    }//GEN-LAST:event_QuantityKeyTyped

    private void QuantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityMouseExited
 
    }//GEN-LAST:event_QuantityMouseExited

    private void RateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RateKeyTyped
  
    }//GEN-LAST:event_RateKeyTyped

    private void RateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateMouseExited
  if(!newPriceField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Price Amount !");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } 
  // TODO add your handling code here:
    }//GEN-LAST:event_RateMouseExited

    private void newPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPriceFieldActionPerformed
    
    private void newPriceFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPriceFieldFocusLost
         // TODO add your handling code here:
    }//GEN-LAST:event_newPriceFieldFocusLost

    private void itemLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemLabelFocusLost
  if(!itemLabel.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Item Number !");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_itemLabelFocusLost

    private void newPriceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPriceFieldKeyReleased
 if(!newPriceField.getText().matches("[0-9]*\\.?[0-9]*"))
{      warningLabel.setText("Invalid Price Value !");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
}
   else {    warningLabel.setText(" ");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_newPriceFieldKeyReleased

    private void itemLabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemLabelKeyReleased
if(!itemLabel.getText().matches("[0-9]*\\.?[0-9]*"))
{      warningLabel.setText("Invalid Item Number !");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
}   
else {   
       warningLabel.setText(" ");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_itemLabelKeyReleased

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try { 
            
            
            if(stock.equals("0"))
            {
                try {
                    im.updateStockByItem(itemLabel.getText(),stock);
                } catch (SQLException ex) {
                    Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(newPriceField.getText().length()>0)
            {
                try {
                    im.updatePriceByItem(itemLabel.getText(),newPriceField.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
                     descriptionLabel.setText("");
                     itemLabel.setText("Type and hit enter");
                     priceLabel.setText("0.00");
                     urlLabel.setText("http://");
                     successLabel.setVisible(true);
                     newPriceField.setText("");
                     ArrayList<String> str=im.getItemDetailByIter(""+(++UserProgram.iteration));
                     System.out.println(str);
                      updateCount.setText(""+(iteration));
                    if(!"".equals(str.get(1).trim()))
                     {                    
                     descriptionLabel.setText(str.get(0));
                     itemLabel.setText(str.get(1));
                     priceLabel.setText(str.get(2));
                     priceLabel.setVisible(false);            
                     priceLabel.setVisible(true);
                     urlLabel.setText(str.get(3));
                     urlLabel.setVisible(false);            
                     urlLabel.setVisible(true);
                     iteration++;
                     }
                     else{
                          successLabel.setVisible(true);
                          new javax.swing.JOptionPane().showMessageDialog(this,"Thats it ! There are no more records in database!!"); 
                     }
        } catch (SQLException ex) {
            Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_printButtonActionPerformed

    private void Product8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product8MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_Product8MouseClicked

    private void Product9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product9MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_Product9MouseClicked

    private void itemLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemLabelMouseEntered
if(itemLabel.getText().equals("Type and hit enter"))
        itemLabel.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_itemLabelMouseEntered

    private void urlLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlLabelMouseClicked
        try {
            Desktop.getDesktop().browse(new URI(urlLabel.getText()));        
      
      // TODO add your handling code here:
        } catch (URISyntaxException ex) {
            Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_urlLabelMouseClicked

    private void pricechangedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricechangedActionPerformed
if(pricechanged.isSelected())        
{
NewPriceLabel.setVisible(true);
newPriceField.setVisible(true);

}// TODO add your handling code here:
    }//GEN-LAST:event_pricechangedActionPerformed

    private void pricechangedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pricechangedStateChanged
if(pricechanged.isSelected())        
{
NewPriceLabel.setVisible(true);
newPriceField.setVisible(true);

}
else 
{
NewPriceLabel.setVisible(false);
newPriceField.setVisible(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_pricechangedStateChanged

    private void outofstockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_outofstockStateChanged
if(outofstock.isSelected())        
{
stock="0";
}
else stock="1";// TODO add your handling code here:
    }//GEN-LAST:event_outofstockStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NewPriceLabel;
    private javax.swing.JLabel Product8;
    private javax.swing.JLabel Product9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JTextField itemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField newPriceField;
    private javax.swing.JRadioButton outofstock;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JRadioButton pricechanged;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel successLabel;
    private javax.swing.JLabel updateCount;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JLabel userBanner;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
private ArrayList<ArrayList<String>> billData =new ArrayList<ArrayList<String>>();
String row_wid="";
private int billHeight=30; 
int stockVal=0;
}  



