/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagecars;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * GarageCarsGUI.java
 * @author Aaron - x19404024
 * 03/01/2021
 */
public class GarageCarsGUI extends javax.swing.JFrame {

    /**
     * Creates new form GarageCarsGUI
     */
        
    // Variables
    DefaultTableModel model;
    private int counter;
    private GarageCars cars[]; // Instance of GarageCars
    private String search; // String search for search function

    
    public GarageCarsGUI() {
        counter = 0;
        cars = new GarageCars[10];
        
        initComponents();

        model = (DefaultTableModel) table.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGrp = new javax.swing.ButtonGroup();
        headLbl = new javax.swing.JLabel();
        newCarLbl = new javax.swing.JLabel();
        newCarTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        carRegLbl = new javax.swing.JLabel();
        carRegTf = new javax.swing.JTextField();
        carPriTf = new javax.swing.JTextField();
        carPriLbl = new javax.swing.JLabel();
        nCarBtn = new javax.swing.JRadioButton();
        secCarBtn = new javax.swing.JRadioButton();
        vrtLbl = new javax.swing.JLabel();
        vrtTf = new javax.swing.JTextField();
        milLbl = new javax.swing.JLabel();
        milTf = new javax.swing.JTextField();
        addCarBtn = new javax.swing.JButton();
        searchLbl = new javax.swing.JLabel();
        searchTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headLbl.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        headLbl.setText("Garage Cars");

        newCarLbl.setText("Add New Car (make):");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Registration", "Price (€)", "VRT (€)", "Mileage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        carRegLbl.setText("Car Registration:");

        carPriLbl.setText("Car Price:");

        typeGrp.add(nCarBtn);
        nCarBtn.setText("New Car");
        nCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCarBtnActionPerformed(evt);
            }
        });

        typeGrp.add(secCarBtn);
        secCarBtn.setText("SecondHand Car");
        secCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secCarBtnActionPerformed(evt);
            }
        });

        vrtLbl.setText("VRT:");

        milLbl.setText("Current Mileage:");

        addCarBtn.setText("Add Car");
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });

        searchLbl.setText("Search cars by price: ");

        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addCarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLbl)
                            .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(vrtTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(milTf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(vrtLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(milLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newCarTf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newCarLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carRegLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(carPriLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carRegTf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(carPriTf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nCarBtn)
                                    .addComponent(secCarBtn))))
                        .addContainerGap(79, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(headLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCarLbl)
                    .addComponent(carRegLbl)
                    .addComponent(carPriLbl)
                    .addComponent(nCarBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newCarTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carRegTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carPriTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vrtLbl)
                            .addComponent(milLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(secCarBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vrtTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(searchLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCarBtn)
                    .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarBtnActionPerformed
        // TODO add your handling code here:
        // If new car button is selected, add values to NewCars subclass
        if(nCarBtn.isSelected()){
            NewCars nc = new NewCars();
            nc.setMake(newCarTf.getText());
            nc.setRegistration(carRegTf.getText());
            nc.setPrice(Double.parseDouble(carPriTf.getText()));
            nc.setVRT(Double.parseDouble(vrtTf.getText()));
           
            // Add data to array with index counter value
            cars[counter] = nc;
            // Increment counter for next cycle
            counter++;
        }
        // else (Second Hand Cars are selected), add values to SecondHandCars subclass
        else {
            SecondHandCars sc = new SecondHandCars();
            sc.setMake(newCarTf.getText());
            sc.setRegistration(carRegTf.getText());
            sc.setPrice(Double.parseDouble(carPriTf.getText()));
            sc.setCurrentMileage(Integer.parseInt(milTf.getText()));
           
            // Add data to cars array with an index of value counter
            cars[counter] = sc;
            // Increment counter for next cycle
            counter++;
        }
        
        // Take values and insert the values to JTable "table"
        // Referenced Code from https://www.youtube.com/watch?v=TwMXA1S38qg
       model.insertRow(model.getRowCount(),new Object[]{newCarTf.getText(), carRegTf.getText(), carPriTf.getText(), vrtTf.getText(), milTf.getText()});
       
       
       
    }//GEN-LAST:event_addCarBtnActionPerformed

    private void nCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCarBtnActionPerformed
        // TODO add your handling code here:
        // When New Car button is selected, have Current Mileage and text field hidden
        vrtLbl.setVisible(true); 
        vrtTf.setVisible(true);
        milLbl.setVisible(false);
        milTf.setVisible(false);
    }//GEN-LAST:event_nCarBtnActionPerformed

    private void secCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secCarBtnActionPerformed
        // TODO add your handling code here:
        // When SecondHand button is selected, have VRT label and text field hidden
        vrtLbl.setVisible(false); 
        vrtTf.setVisible(false);
        milLbl.setVisible(true);
        milTf.setVisible(true);
    }//GEN-LAST:event_secCarBtnActionPerformed

    private void searchTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyReleased
        // TODO add your handling code here:
        
        // Create a search Funtion that compares the data you entered to the values in 'Table'
        // Code Sourced from https://www.youtube.com/watch?v=DJEXpgLyAtQ
        DefaultTableModel table1; // Create an instance of DefaultTable Model named table1
        table1 = (DefaultTableModel)table.getModel(); // Have table1 get model
        search = searchTf.getText(); // Get text from the search text field and store in the the variable 'search'
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table1); // sort the rows of the table and store it in the instance of default table model
        table.setRowSorter(tr); // Sort the instance of table
        tr.setRowFilter(RowFilter.regexFilter(search)); // Filter the rows by the string of search, it is case sensitive
        
    }//GEN-LAST:event_searchTfKeyReleased

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
            java.util.logging.Logger.getLogger(GarageCarsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GarageCarsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GarageCarsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GarageCarsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GarageCarsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarBtn;
    private javax.swing.JLabel carPriLbl;
    private javax.swing.JTextField carPriTf;
    private javax.swing.JLabel carRegLbl;
    private javax.swing.JTextField carRegTf;
    private javax.swing.JLabel headLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel milLbl;
    private javax.swing.JTextField milTf;
    private javax.swing.JRadioButton nCarBtn;
    private javax.swing.JLabel newCarLbl;
    private javax.swing.JTextField newCarTf;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTf;
    private javax.swing.JRadioButton secCarBtn;
    private javax.swing.JTable table;
    private javax.swing.ButtonGroup typeGrp;
    private javax.swing.JLabel vrtLbl;
    private javax.swing.JTextField vrtTf;
    // End of variables declaration//GEN-END:variables
}
