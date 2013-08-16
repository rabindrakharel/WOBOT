/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BillingForm.java
 *
 * Created on Nov 14, 2012, 7:21:23 AM
 */
package SimpleItemEnterInterface;


import Model.ItemModel;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author paradise lost
 */
public class AdminProgram extends javax.swing.JPanel{
    private String stock;

    /** Creates new form BillingForm */
    public AdminProgram() throws IOException {
        initComponents();
        this.setSize(1210,710);
        adminBanner.setIcon(new ImageIcon(ImageIO.read(new File("kadian.jpg"))));
        adminBanner.setVisible(false);
        adminBanner.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        itemnoField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        urlField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        urlList = new javax.swing.JList();
        pushButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        Product8 = new javax.swing.JLabel();
        Product9 = new javax.swing.JLabel();
        successLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        priceList = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        itemSelector = new javax.swing.JSpinner();
        DeleteRadio = new javax.swing.JRadioButton();
        EditRadio = new javax.swing.JRadioButton();
        OkButton = new javax.swing.JButton();
        stockStatus = new javax.swing.JCheckBox();
        warningLabel = new javax.swing.JLabel();
        adminBanner = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 18), new java.awt.Dimension(0, 18), new java.awt.Dimension(32767, 18));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Price   *");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 60, 20));

        descriptionField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                descriptionFieldMouseExited(evt);
            }
        });
        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });
        descriptionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descriptionFieldFocusLost(evt);
            }
        });
        descriptionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                particularKeyTyped(evt);
            }
        });
        add(descriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 320, 30));

        itemnoField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemnoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuantityMouseExited(evt);
            }
        });
        itemnoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnoFieldActionPerformed(evt);
            }
        });
        itemnoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemnoFieldFocusLost(evt);
            }
        });
        itemnoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemnoFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        add(itemnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 100, 30));

        priceField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        priceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RateMouseExited(evt);
            }
        });
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        priceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceFieldFocusLost(evt);
            }
        });
        priceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RateKeyTyped(evt);
            }
        });
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 100, 30));

        urlField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        urlField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AmountMouseExited(evt);
            }
        });
        urlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlFieldActionPerformed(evt);
            }
        });
        urlField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                urlFieldFocusLost(evt);
            }
        });
        urlField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                urlFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmountKeyTyped(evt);
            }
        });
        add(urlField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 330, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Description");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("Item No  *");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 90, 20));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N

        descriptionList.setBackground(new java.awt.Color(204, 204, 204));
        descriptionList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        descriptionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(descriptionList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 340));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 480, 20));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N

        itemList.setBackground(new java.awt.Color(204, 204, 204));
        itemList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        itemList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(itemList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 40, 340));

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N

        urlList.setBackground(new java.awt.Color(204, 204, 204));
        urlList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        urlList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(urlList);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 150, 340));

        pushButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pushButton.setForeground(new java.awt.Color(0, 51, 204));
        pushButton.setText("Enter");
        pushButton.setBorder(null);
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushButtonActionPerformed(evt);
            }
        });
        add(pushButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 80, 30));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(0, 51, 204));
        printButton.setText("Save");
        printButton.setBorder(null);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 80, 30));

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
        successLabel.setText("* Successful");
        add(successLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 120, 30));
        successLabel.setVisible(false);

        jScrollPane4.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N

        priceList.setBackground(new java.awt.Color(204, 204, 204));
        priceList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        priceList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(priceList);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 40, 340));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("URL  *");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 60, 30));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 200, -1));
        add(itemSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 80, 30));

        DeleteRadio.setText("Delete");
        DeleteRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DeleteRadioStateChanged(evt);
            }
        });
        add(DeleteRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 623, 80, 30));

        EditRadio.setText("Edit");
        EditRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EditRadioStateChanged(evt);
            }
        });
        EditRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRadioActionPerformed(evt);
            }
        });
        add(EditRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 623, 70, 30));

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        add(OkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 80, 30));

        stockStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stockStatus.setForeground(new java.awt.Color(0, 51, 255));
        stockStatus.setText("Stock Available");
        stockStatus.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stockStatusStateChanged(evt);
            }
        });
        add(stockStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 150, -1));

        warningLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 230, 30));
        add(adminBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 420, 160));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 610, 20));

        filler3.setBorder(new javax.swing.border.SoftBevelBorder(0));
        add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 10, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

    private void itemnoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnoFieldActionPerformed

    private void urlFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlFieldActionPerformed
//^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]
        
    }//GEN-LAST:event_urlFieldActionPerformed

    private void particularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_particularKeyTyped

  // TODO add your handling code here:
    }//GEN-LAST:event_particularKeyTyped

    private void descriptionFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionFieldMouseExited

    }//GEN-LAST:event_descriptionFieldMouseExited

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped

    }//GEN-LAST:event_QuantityKeyTyped

    private void QuantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityMouseExited
 
    }//GEN-LAST:event_QuantityMouseExited

    private void RateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RateKeyTyped
  
    }//GEN-LAST:event_RateKeyTyped

    private void RateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateMouseExited

      
  // TODO add your handling code here:
    }//GEN-LAST:event_RateMouseExited

    private void AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountKeyTyped
    // TODO add your handling code here:
    }//GEN-LAST:event_AmountKeyTyped

    private void AmountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmountMouseExited
// TODO add your handling code here:
    }//GEN-LAST:event_AmountMouseExited

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed
    
    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushButtonActionPerformed
if(itemnoField.getText().length()>0)
{
String description=" ";
String url="";
String price="";
String itemNo="";
if(!"".equals(descriptionField.getText().trim()))
description=descriptionField.getText();
if(!"".equals(urlField.getText().trim()))
url=urlField.getText();
if(!"".equals(priceField.getText().trim()))
price=priceField.getText();
if(!"".equals(itemnoField.getText().trim()))
itemNo=itemnoField.getText();
if(!"".equals(itemnoField.getText().trim()+urlField.getText().trim()))
{
        ArrayList<String> smallBill=new ArrayList<String>(); 
        smallBill.add(0,description); // add the product name to list 
        smallBill.add(1,itemNo);   // product quantity to the list
        smallBill.add(2,price);//  product value to the list 
        smallBill.add(3,url); 
        smallBill.add(4,stock); 
        billData.add(smallBill);                        // add to the big bill 
        ArrayList<String> illusion1=new ArrayList<String>();
        ArrayList<String> illusion2=new ArrayList<String>();
        ArrayList<String> illusion3=new ArrayList<String>();
        ArrayList<String> illusion4=new ArrayList<String>();
        ArrayList<String> illusion5=new ArrayList<String>();
        int sn=0;
            
        for( ArrayList<String> smallBil : billData) {
            illusion1.add(++sn+"."+smallBil.get(0));
            illusion2.add(smallBil.get(1));
            illusion3.add(smallBil.get(2));
            illusion4.add(smallBil.get(3));
            illusion5.add(smallBil.get(4));
        }    
          
        descriptionList.setListData(illusion1.toArray());
        descriptionList.setVisible(false); // printing the list on the bill 
        descriptionList.setVisible(true);
        itemList.setListData(illusion2.toArray());
        itemList.setVisible(false);
        itemList.setVisible(true);
       priceList.setListData(illusion3.toArray());
        priceList.setVisible(false);
        priceList.setVisible(true);
        urlList.setListData(illusion4.toArray());
        urlList.setVisible(false);
        urlList.setVisible(true);
}
        
        descriptionField.setText("");// reset the field after push
        priceField.setText("");
        itemnoField.setText("");
        urlField.setText("");
        row_wid="";


this.remove(jScrollPane1);
this.remove(jScrollPane2);
this.remove(jScrollPane3);
this.remove(jScrollPane4);

billHeight+=50;

add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, billHeight));
  add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 40, billHeight));
 add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, billHeight));
add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 40, billHeight));
 jScrollPane1.setVisible(false);
  jScrollPane2.setVisible(false);
   jScrollPane3.setVisible(false);
    jScrollPane4.setVisible(false);
jScrollPane1.setVisible(true);
  jScrollPane2.setVisible(true);
   jScrollPane3.setVisible(true);
    jScrollPane4.setVisible(true);
}
 else 
         new javax.swing.JOptionPane().showMessageDialog(this,"Item No cannot be empty!! ");
    }//GEN-LAST:event_pushButtonActionPerformed

    private void priceFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFieldFocusLost
         // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldFocusLost

    private void itemnoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemnoFieldFocusLost
if("".equals(itemnoField.getText().trim()))
{      warningLabel.setText("Item Number cannot be left empty !");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
}
else{
warningLabel.setText(" ");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
}
  // TODO add your handling code here:
    }//GEN-LAST:event_itemnoFieldFocusLost

    private void priceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyReleased
 if(!priceField.getText().matches("[0-9]*\\.?[0-9]*"))
{      warningLabel.setText("Invalid Price Value !");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);
}
   else {    warningLabel.setText(" ");
       warningLabel.setVisible(false);
       warningLabel.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldKeyReleased

    private void itemnoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemnoFieldKeyReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_itemnoFieldKeyReleased

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            ItemModel im=new ItemModel();
                  
          
                     // end Exception catch  
                      //   Be sure all happening in your life is my plan for you .  
                  try {
                     
                      for(ArrayList<String> list: billData) {    
                        
                              im.insertItemDim(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4));  // insert in PROD_DIM table
                              
                          } 
                      
                             } 
                  catch (SQLException ex) {
                      Logger.getLogger(AdminProgram.class.getName()).log(Level.SEVERE, null, ex);
                  }
          descriptionField.setText("");
          warningLabel.setText("");
          priceField.setText("");
          ArrayList<String> a=new ArrayList<String>();
          a.add(" ");
          descriptionList.setListData(a.toArray());
          urlList.setListData(a.toArray());
          itemList.setListData(a.toArray());
          priceList.setListData(a.toArray());
          totalAmount=new Float(0);
          billData =new ArrayList<ArrayList<String>>();
          successLabel.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_printButtonActionPerformed

    private void descriptionFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionFieldKeyReleased
     
    }//GEN-LAST:event_descriptionFieldKeyReleased

    private void descriptionFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionFieldFocusLost
 // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldFocusLost

    private void Product8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product8MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_Product8MouseClicked

    private void Product9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product9MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_Product9MouseClicked

    private void urlFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urlFieldKeyReleased
if(urlField.getText().matches("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]")) {
            warningLabel.setText("Invalid URL !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {    warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldKeyReleased

    private void urlFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_urlFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldFocusLost

    private void EditRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRadioActionPerformed
        // TODO add your handling code here
if(EditRadio.isSelected()&& new Integer(itemSelector.getValue().toString())>0)
{
 ArrayList<String> smallBill=billData.get(new Integer(itemSelector.getValue().toString())-1);
  
        descriptionField.setText(smallBill.get(0)); // add the product name to list 
        itemnoField.setText(smallBill.get(1));   // product quantity to the list
        priceField.setText(smallBill.get(2));//  product value to the list 
        urlField.setText(smallBill.get(3)); 
}
    }//GEN-LAST:event_EditRadioActionPerformed

    private void EditRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EditRadioStateChanged
if(EditRadio.isSelected()&& new Integer(itemSelector.getValue().toString())>0)
{
    

}// TODO add your handling code here:
    }//GEN-LAST:event_EditRadioStateChanged

    private void DeleteRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DeleteRadioStateChanged
       // TODO add your handling code here:
    }//GEN-LAST:event_DeleteRadioStateChanged

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
if(DeleteRadio.isSelected()&& new Integer(itemSelector.getValue().toString())>0)
{
System.out.println(billData);
totalAmount-=new Float(billData.get(new Integer(itemSelector.getValue().toString())-1).get(4));
billData.remove(new Integer(itemSelector.getValue().toString())-1);
System.out.println(billData);
}

if(EditRadio.isSelected()&& new Integer(itemSelector.getValue().toString())>0)
{ 
String description=" ";
String url="0";
String price="0";
String itemNo="0";
String stockVal="0";
if(!"".equals(descriptionField.getText().trim()))
description=descriptionField.getText();
if(!"".equals(urlField.getText().trim()))
url=urlField.getText();
if(!"".equals(priceField.getText().trim()))
price=priceField.getText();
if(!"".equals(itemnoField.getText().trim()))
itemNo=itemnoField.getText();
stockVal=stock;
if(!"".equals(descriptionField.getText().trim()+urlField.getText().trim()))
{       totalAmount-=new Float(billData.get(new Integer(itemSelector.getValue().toString())-1).get(4));
       ArrayList<String> smallBill=new ArrayList<String>(); 
        smallBill.add(0,row_wid);
        smallBill.add(0,description); //add the product name to list 
        smallBill.add(1,itemNo);      //product quantity to the list
        smallBill.add(2,price);     //product value to the list 
        smallBill.add(3,url); 
        smallBill.add(4,stockVal); 
billData.set(new Integer(itemSelector.getValue().toString())-1,smallBill);
}
}
        ArrayList<String> illusion1=new ArrayList<String>();
        ArrayList<String> illusion2=new ArrayList<String>();
        ArrayList<String> illusion3=new ArrayList<String>();
        ArrayList<String> illusion4=new ArrayList<String>();
        int sn=0;
            
        for( ArrayList<String> smallBil : billData) {
           
               illusion1.add(++sn+". "+smallBil.get(0)); 
               illusion2.add(smallBil.get(1));
               illusion3.add(smallBil.get(2)); 
               illusion4.add(smallBil.get(3));
                illusion4.add(smallBil.get(4));
        }    
        descriptionList.setListData(illusion1.toArray());
        descriptionList.setVisible(false); // printing the list on the bill 
        descriptionList.setVisible(true);
        itemList.setListData(illusion2.toArray());
        itemList.setVisible(false);
        itemList.setVisible(true);
       priceList.setListData(illusion4.toArray());
        priceList.setVisible(false);
        priceList.setVisible(true);
        urlList.setListData(illusion3.toArray());
        urlList.setVisible(false);
        urlList.setVisible(true);
        
        descriptionField.setText("");// reset the field after push
        priceField.setText("");
        itemnoField.setText("");
        urlField.setText("");
        row_wid="";
        
add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, billHeight));
add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 40, billHeight));
add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, billHeight));
add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 40, billHeight));

  jScrollPane1.setVisible(false);
  jScrollPane2.setVisible(false);
  jScrollPane3.setVisible(false);
  jScrollPane4.setVisible(false);
jScrollPane1.setVisible(true);
jScrollPane2.setVisible(true);
jScrollPane3.setVisible(true);
jScrollPane4.setVisible(true);
System.out.println(billData);
    }//GEN-LAST:event_OkButtonActionPerformed

    private void stockStatusStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stockStatusStateChanged
if(stockStatus.isSelected())      
{
stock="1";
}
else stock="0";
// TODO add your handling code here:
    }//GEN-LAST:event_stockStatusStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DeleteRadio;
    private javax.swing.JRadioButton EditRadio;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel Product8;
    private javax.swing.JLabel Product9;
    private javax.swing.JLabel adminBanner;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JList descriptionList;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JList itemList;
    private javax.swing.JSpinner itemSelector;
    private javax.swing.JTextField itemnoField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField priceField;
    private javax.swing.JList priceList;
    private javax.swing.JButton printButton;
    private javax.swing.JButton pushButton;
    private javax.swing.JCheckBox stockStatus;
    private javax.swing.JLabel successLabel;
    private javax.swing.JTextField urlField;
    private javax.swing.JList urlList;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
private ArrayList<ArrayList<String>> billData =new ArrayList<ArrayList<String>>();
Float totalAmount=new Float(0);
String row_wid="";
private int billHeight=30;
boolean isPack=false;
float discAmt=0;   
}  


