/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalmanagement;

import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;


public class mainPage extends javax.swing.JFrame {

    private String userID;
    private String username;
    private String password;
    private String role;
    private DefaultTableModel model;
    private DBConnect db;

    public mainPage() {
        
        initComponents();

        setDataTable();
        setDataTableHistory();
        this.username = "";
        this.password = "";
        this.role = "";
        this.userID = "";

    }
    
    public mainPage(String username, String password, String role, String userID) {
        
        initComponents();
        this.username = username;
        this.password = password;
        this.role = role;
        this.userID = userID;

        System.out.println("Username : "+this.username);
        System.out.println("Password : "+this.password);
        System.out.println("Role : "+this.role);
        System.out.println("userID : "+this.userID);
        JOptionPane.showMessageDialog(null, "Welcome "+this.username+" To Car Rantal Program", "Enter Data", 1);
        setDataTable();
        setDataTableHistory();
         
    }

    public void setDataTable() {
        String[] colname = {"Id", "Car Name", "Color", "Type", "Price"};
        model = new DefaultTableModel(colname, 0) {


            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
        
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        
        try {
            String query = "SELECT * FROM car_list";
            db = new DBConnect();
            db.getConnect();
            ResultSet rs = db.getStatement().executeQuery(query);


            while (rs.next()) {
                String id = rs.getString("id");
                String carName = rs.getString("car_name");
                String color = rs.getString("color");
                String type = rs.getString("type");
                String price = rs.getString("price");

                model.addRow(new Object[]{id, carName, color, type, price});
            }
            rs.close();
            db.disconect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        jTable3.setModel(model);
        
    }



    public void insertHistory(String name, Double price, int day) {

        try {
            db = new DBConnect();
            String query = String.format("INSERT INTO car_history_booking (car_name, totalPrice, day, user_id) VALUES ('%s', %.2f, %d, %d)", name, price, day, Integer.parseInt(this.userID));
            db.getConnect();
            db.getStatement().executeUpdate(query);

            db.disconect();
            setDataTableHistory();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setDataTableHistory() {
        String[] colname = {"Id", "Car Name", "Total Price", "Day"};
        model = new DefaultTableModel(colname, 0) {


            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
        
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        
        try {
            db = new DBConnect();
            String query = "SELECT * FROM car_history_booking WHERE user_id = "+this.userID+"";
            db.getConnect();
            db.getStatement().executeQuery(query);
            ResultSet rs = db.getStatement().executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String carName = rs.getString("car_name");
                String totalPrice = rs.getString("totalPrice");
                String Day = rs.getString("day");

                model.addRow(new Object[]{id, carName,totalPrice, Day});
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        jTable4.setModel(model);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Rental_Page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Day_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Price_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        HistoryRental_Page = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Rental System");
        setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rental");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Rental History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.CardLayout());

        Rental_Page.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Rental Car");

        Day_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Day_TextFieldFocusGained(evt);
            }
        });
        Day_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day_TextFieldActionPerformed(evt);
            }
        });
        Day_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Day_TextFieldKeyTyped(evt);
            }
        });
        Day_TextField.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                Day_TextFieldVetoableChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Day");

        Price_TextField.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Price");

        jButton4.setText("Rent This Car");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "BB", "BB", "BB",  new Integer(1000)},
                {"2", "AA", "AA", "AA",  new Integer(5000)},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Car Name", "Color", "Type", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout Rental_PageLayout = new javax.swing.GroupLayout(Rental_Page);
        Rental_Page.setLayout(Rental_PageLayout);
        Rental_PageLayout.setHorizontalGroup(
            Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rental_PageLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Rental_PageLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Day_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Rental_PageLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Rental_PageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Rental_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        Rental_PageLayout.setVerticalGroup(
            Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rental_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Rental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(Rental_Page, "card3");

        HistoryRental_Page.setBackground(new java.awt.Color(255, 204, 204));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "BB", "BB", "BB",  new Integer(1000)},
                {"2", "AA", "AA", "AA",  new Integer(5000)},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Car Name", "Color", "Type", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Rental History");

        javax.swing.GroupLayout HistoryRental_PageLayout = new javax.swing.GroupLayout(HistoryRental_Page);
        HistoryRental_Page.setLayout(HistoryRental_PageLayout);
        HistoryRental_PageLayout.setHorizontalGroup(
            HistoryRental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryRental_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryRental_PageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(241, 241, 241))
        );
        HistoryRental_PageLayout.setVerticalGroup(
            HistoryRental_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryRental_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel1.add(HistoryRental_Page, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(4, 4, 4)
                        .addComponent(jButton3)
                        .addGap(141, 141, 141)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        setDataTable();
        HistoryRental_Page.setVisible(false);
        Rental_Page.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        setDataTableHistory();
        HistoryRental_Page.setVisible(true);
        Rental_Page.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    int Count_Select = jTable3.getSelectedRowCount();

    if (Count_Select > 1) {
        JOptionPane.showMessageDialog(null,"Please Select Only One Car", "Error", 0);
    } else if (Count_Select < 1) {
        // asdasdasds
        JOptionPane.showMessageDialog(null,"Please Select Car", "Error", 0);
    } else {

        

        if (Day_TextField.getText().equals("") || Day_TextField.getText().equals("0")){
            JOptionPane.showMessageDialog(null,"Please Enter Day", "Error", 0);
        } else {
            int row = jTable3.getSelectedRow();
            String carName = jTable3.getValueAt(row, 1).toString();
            String Price = jTable3.getValueAt(row, 4).toString();
            String Day = Day_TextField.getText();

            System.out.println("[String] Price : "+Price);
            System.out.println("[String] Day : "+Day);

            Double intDay = Double.parseDouble(Day);
            Double intPrice = Double.parseDouble(Price);

            Double TotalPrice = intDay * intPrice;

            DecimalFormat formatter = new DecimalFormat("#,###");
            String formattedTotalPrice = formatter.format(TotalPrice);

            Price_TextField.setText(formattedTotalPrice+" ฿");
            Price_TextField.setText(formattedTotalPrice);


            insertHistory(carName, TotalPrice, Integer.parseInt(Day));
            JOptionPane.showMessageDialog(null, "You Have Rental Car "+carName+" Day :"+Day, "Alert", 1);
            //! SAVE CAR TO DATABASE 
            
            Day_TextField.setText("");
            Price_TextField.setText("");
            
            /*
            
            */
        }



    }

    


    }//GEN-LAST:event_jButton4ActionPerformed

    private void Day_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day_TextFieldActionPerformed
       int row = jTable3.getSelectedRow();

        String Price = jTable3.getValueAt(row, 4).toString();
        String Day = Day_TextField.getText();

        System.out.println("[String] Price : "+Price);
        System.out.println("[String] Day : "+Day);

        Double intDay = Double.parseDouble(Day);
        Double intPrice = Double.parseDouble(Price);

        Double TotalPrice = intDay * intPrice;

        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedTotalPrice = formatter.format(TotalPrice);

        Price_TextField.setText(formattedTotalPrice+" ฿");
        
    }//GEN-LAST:event_Day_TextFieldActionPerformed

    private void Day_TextFieldVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_Day_TextFieldVetoableChange
       
    }//GEN-LAST:event_Day_TextFieldVetoableChange

    private void Day_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Day_TextFieldFocusGained
       
        System.out.println("Focus : " + Day_TextField.getText());
    }//GEN-LAST:event_Day_TextFieldFocusGained

    private void Day_TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Day_TextFieldKeyTyped
       
        // int row = jTable3.getSelectedRow();

        // String Price = jTable3.getValueAt(row, 4).toString();
        // String Day = Day_TextField.getText();

        // System.out.println("[String] Price : "+Price);
        // System.out.println("[String] Day : "+Day);

        // Double intDay = Double.parseDouble(Day);
        // Double intPrice = Double.parseDouble(Price);

        // Double TotalPrice = intDay * intPrice;

        // DecimalFormat formatter = new DecimalFormat("#,###");
        // String formattedTotalPrice = formatter.format(TotalPrice);

        // Price_TextField.setText(formattedTotalPrice+" ฿");

    }//GEN-LAST:event_Day_TextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        JOptionPane.showMessageDialog(null, "TEst","Enter Data", 0);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Day_TextField;
    private javax.swing.JPanel HistoryRental_Page;
    private javax.swing.JTextField Price_TextField;
    private javax.swing.JPanel Rental_Page;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
