/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalmanagement;

import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mook
 */
public class AdminPage extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DBConnect db;


    public AdminPage() {
        initComponents();
        setDataTableUser();
        setDataTableCar();
        setDataTableBooking();
    }


    public void setDataTableBooking() {
        String[] colname = {"Car Name", "Total Price", "Day", "User ID"};
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
            String query = "SELECT * FROM car_history_booking";
            db = new DBConnect();
            db.getConnect();
            ResultSet rs = db.getStatement().executeQuery(query);


            while (rs.next()) {
                // String user_id = rs.getString("user_id");
                String car_name = rs.getString("car_name");
                String total_price = rs.getString("totalPrice");
                String day = rs.getString("day");
                String user_id = rs.getString("user_id");

                model.addRow(new Object[]{ car_name, total_price, day, user_id});
            }
            rs.close();
            db.disconect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        jTable1.setModel(model);
        
    }
  
    public void setDataTableUser() {
        String[] colname = {"username", "password", "role"};
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
            String query = "SELECT * FROM user";
            db = new DBConnect();
            db.getConnect();
            ResultSet rs = db.getStatement().executeQuery(query);


            while (rs.next()) {
                // String user_id = rs.getString("user_id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");

                model.addRow(new Object[]{ username, password, role});
            }
            rs.close();
            db.disconect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        jTable2.setModel(model);
        
    }

    public void setDataTableCar() {
        String[] colname = {"Car Name", "Color", "Type", "Price"};
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
                // String user_id = rs.getString("user_id");
                String Car_name = rs.getString("car_name");
                String Color = rs.getString("color");
                String Type = rs.getString("type");
                String Price = rs.getString("price");

                model.addRow(new Object[]{ Car_name, Color, Type, Price});
            }
            rs.close();
            db.disconect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        jTable3.setModel(model);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Management_Car = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Delete_Car = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Add_Car = new javax.swing.JButton();
        Edit_Car = new javax.swing.JButton();
        Management_Booing = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add_Booking = new javax.swing.JButton();
        Edit_Booking = new javax.swing.JButton();
        Delete_Booking = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Field_userID = new javax.swing.JTextField();
        Field_CarName = new javax.swing.JTextField();
        Field_Day = new javax.swing.JTextField();
        Field_TotalPrice = new javax.swing.JTextField();
        Management_User = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        Delete_User = new javax.swing.JButton();
        Add_User = new javax.swing.JButton();
        Edit_User = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Management User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Management Car");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new java.awt.CardLayout());

        Management_Car.setBackground(new java.awt.Color(204, 255, 204));
        Management_Car.setPreferredSize(new java.awt.Dimension(468, 425));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Management Car");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Type");

        jLabel3.setText("Car");

        Delete_Car.setText("Delete");
        Delete_Car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_CarActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        jLabel7.setText("Color");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        Add_Car.setText("Add");
        Add_Car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_CarActionPerformed(evt);
            }
        });

        Edit_Car.setText("Edit");
        Edit_Car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_CarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Management_CarLayout = new javax.swing.GroupLayout(Management_Car);
        Management_Car.setLayout(Management_CarLayout);
        Management_CarLayout.setHorizontalGroup(
            Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_CarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_CarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_CarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_CarLayout.createSequentialGroup()
                        .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Management_CarLayout.createSequentialGroup()
                                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Management_CarLayout.createSequentialGroup()
                                .addComponent(Add_Car)
                                .addGap(18, 18, 18)
                                .addComponent(Edit_Car)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete_Car)))
                        .addGap(87, 87, 87))))
        );
        Management_CarLayout.setVerticalGroup(
            Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_CarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(Management_CarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Car)
                    .addComponent(Add_Car)
                    .addComponent(Edit_Car))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(Management_Car, "card2");

        Management_Booing.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Management Booking");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Add_Booking.setText("Add");
        Add_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_BookingActionPerformed(evt);
            }
        });

        Edit_Booking.setText("Edit");
        Edit_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_BookingActionPerformed(evt);
            }
        });

        Delete_Booking.setText("Delete");
        Delete_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_BookingActionPerformed(evt);
            }
        });

        jLabel8.setText("Car Name");

        jLabel13.setText("Day");

        jLabel14.setText("user_id");

        jLabel15.setText("Total Price");

        javax.swing.GroupLayout Management_BooingLayout = new javax.swing.GroupLayout(Management_Booing);
        Management_Booing.setLayout(Management_BooingLayout);
        Management_BooingLayout.setHorizontalGroup(
            Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_BooingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Management_BooingLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_BooingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_BooingLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_BooingLayout.createSequentialGroup()
                                .addComponent(Add_Booking)
                                .addGap(18, 18, 18)
                                .addComponent(Edit_Booking)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete_Booking)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_BooingLayout.createSequentialGroup()
                                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Field_Day, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_CarName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Field_userID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_TotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))))))
        );
        Management_BooingLayout.setVerticalGroup(
            Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_BooingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field_CarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Field_userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Field_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(Management_BooingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Booking)
                    .addComponent(Add_Booking)
                    .addComponent(Edit_Booking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(Management_Booing, "card4");

        Management_User.setBackground(new java.awt.Color(255, 204, 204));
        Management_User.setPreferredSize(new java.awt.Dimension(468, 425));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Management User");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Name");

        jLabel11.setText("Password");

        jLabel12.setText("Role");

        Delete_User.setText("Delete");
        Delete_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_UserActionPerformed(evt);
            }
        });

        Add_User.setText("Add");
        Add_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_UserActionPerformed(evt);
            }
        });

        Edit_User.setText("Edit");
        Edit_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_UserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Management_UserLayout = new javax.swing.GroupLayout(Management_User);
        Management_User.setLayout(Management_UserLayout);
        Management_UserLayout.setHorizontalGroup(
            Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_UserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Management_UserLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(24, 24, 24)
                            .addComponent(jTextField5))
                        .addGroup(Management_UserLayout.createSequentialGroup()
                            .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField8)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Management_UserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_User)
                .addGap(18, 18, 18)
                .addComponent(Edit_User)
                .addGap(18, 18, 18)
                .addComponent(Delete_User)
                .addGap(84, 84, 84))
        );
        Management_UserLayout.setVerticalGroup(
            Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Management_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(Management_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_User)
                    .addComponent(Add_User)
                    .addComponent(Edit_User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(Management_User, "card3");

        jButton10.setText("History Booking");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Management_User.setVisible(false);
        Management_Car.setVisible(true);
        Management_Booing.setVisible(false);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Management_User.setVisible(true);
        Management_Car.setVisible(false);
        Management_Booing.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void Delete_CarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_CarActionPerformed
        String car_name = jTextField1.getText();
        String price = jTextField2.getText();
        String type = jTextField3.getText();
        String color = jTextField4.getText();

        if ((car_name.equals("") || color.equals("") || type.equals("") || price.equals(""))){
            JOptionPane.showMessageDialog(this, "Please select car to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this car?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String query = "DELETE FROM car_list WHERE car_name = '"+car_name+"' AND color = '"+color+"' AND type = '"+type+"' AND price = '"+price+"'";
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableCar();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                System.out.println("Cancel");

            }
        }


    }//GEN-LAST:event_Delete_CarActionPerformed

    private void Delete_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_UserActionPerformed
        

        String username = jTextField5.getText();
        String password = jTextField7.getText();
        String role = jTextField8.getText();
      
        
        
        if ((username.equals("") || password.equals("") || role.equals(""))){
            JOptionPane.showMessageDialog(this, "Please select user to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if ((confirm == JOptionPane.YES_OPTION)) {
                
                String query = "DELETE FROM user WHERE username = '"+username+"' AND password = '"+password+"' AND role = '"+role+"'";
                
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableUser();
                    jTextField5.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            
            } else {
                jTextField5.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                System.out.println("Cancel");

            }
        }
            
        
        
    }//GEN-LAST:event_Delete_UserActionPerformed

    private void Add_CarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_CarActionPerformed
        String car_name = jTextField1.getText();
        String price = jTextField2.getText();
        String type = jTextField3.getText();
        String color = jTextField4.getText();

        if ((car_name.equals("") || price.equals("") || type.equals("") || color.equals(""))){
            JOptionPane.showMessageDialog(this, "Please fill to 'ADD' Car", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this car?", "Confirm Add", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String query = "INSERT INTO car_list (car_name, color, type, price) VALUES ('"+car_name+"', '"+color+"', '"+type+"', '"+price+"')";
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableCar();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Cancel");
            }

           
        }
        
    }//GEN-LAST:event_Add_CarActionPerformed

    private void Edit_CarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_CarActionPerformed
        int row = jTable3.getSelectedRow();
        String Old_carnew = jTable3.getValueAt(row, 0).toString();
        String Old_price = jTable3.getValueAt(row, 3).toString();
        String Old_type = jTable3.getValueAt(row, 2).toString();
        String Old_color = jTable3.getValueAt(row, 1).toString();


        String new_car_name = jTextField1.getText();
        String new_price = jTextField2.getText();
        String new_type = jTextField3.getText();
        String new_color = jTextField4.getText();   

        int row_count = jTable3.getSelectedRowCount();
        if (row_count == 0){
            JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' Car", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (row_count > 1) {
            JOptionPane.showMessageDialog(this, "Please Select Only One Car to 'EDIT' Car", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            if ((new_car_name.equals("") || new_price.equals("") || new_type.equals("") || new_color.equals(""))){
                JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' Car", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this car?", "Confirm Add", JOptionPane.YES_NO_OPTION);
    
                if (confirm == JOptionPane.YES_OPTION) {
                String query = String.format("UPDATE car_list SET car_name = '%s', color = '%s', type = '%s', price = '%s' WHERE car_name = '%s' AND color = '%s' AND Type = '%s' AND price = '%s';", new_car_name, new_color, new_type, new_price, Old_carnew, Old_color, Old_type, Old_price);
                    try {
                        db = new DBConnect();
                        db.getConnect();
                        db.getStatement().executeUpdate(query);
                        db.disconect();
                        setDataTableCar();
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Cancel");
                }
    
               
            }
        }

        
        
    }//GEN-LAST:event_Edit_CarActionPerformed

    private void Add_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_UserActionPerformed
        String username = jTextField5.getText();
        String password = jTextField7.getText();
        String role = jTextField8.getText();

        if (username.equals("") || password.equals("") || role.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill to 'ADD' User", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this user?", "Confirm Add", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String query = "INSERT INTO user (username, password, role) VALUES ('"+username+"', '"+password+"', '"+role+"')";
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableUser();
                    jTextField5.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Cancel");
            }

        }
    }//GEN-LAST:event_Add_UserActionPerformed

    private void Edit_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_UserActionPerformed
        int row = jTable2.getSelectedRow();
        String Old_username = jTable2.getValueAt(row, 0).toString();
        String Old_password = jTable2.getValueAt(row, 1).toString();
        String Old_role = jTable2.getValueAt(row, 2).toString();
        
        String new_username = jTextField5.getText();
        String new_password = jTextField7.getText();
        String new_role = jTextField8.getText();

        int row_count = jTable2.getSelectedRowCount();
        if (row_count == 0){
            JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' User", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (row_count > 1) {
            JOptionPane.showMessageDialog(this, "Please Select Only One User to 'EDIT' User", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            if ((new_username.equals("") || new_password.equals("") || new_role.equals(""))){
                JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' User", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this user?", "Confirm Add", JOptionPane.YES_NO_OPTION);
    
                if (confirm == JOptionPane.YES_OPTION) {
                String query = String.format("UPDATE user SET username = '%s', password = '%s', role = '%s' WHERE username = '%s' AND password = '%s' AND role = '%s';", new_username, new_password, new_role, Old_username, Old_password, Old_role);
                    try {
                        db = new DBConnect();
                        db.getConnect();
                        db.getStatement().executeUpdate(query);
                        db.disconect();
                        setDataTableUser();
                        jTextField5.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Cancel");
                }
            }
        }
    }//GEN-LAST:event_Edit_UserActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Management_User.setVisible(false);
        Management_Car.setVisible(false);
        Management_Booing.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Add_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_BookingActionPerformed
        String car_name = Field_CarName.getText();
        String total_price = Field_TotalPrice.getText();
        String day = Field_Day.getText();
        String user_id = Field_userID.getText();

        if (car_name.equals("") || total_price.equals("") || day.equals("") || user_id.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill to 'ADD' Booking", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this booking?", "Confirm Add", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                String query = String.format("INSERT INTO car_history_booking (car_name, totalPrice, day, user_id) VALUES ('%s', '%s', '%s', '%s')", car_name, total_price, day, user_id);
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableBooking();
                    Field_CarName.setText("");
                    Field_TotalPrice.setText("");
                    Field_Day.setText("");
                    Field_userID.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Cancel");
            }

        }
    }//GEN-LAST:event_Add_BookingActionPerformed

    private void Edit_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_BookingActionPerformed
        int row = jTable2.getSelectedRow();
        String Old_carnew = jTable2.getValueAt(row, 0).toString();
        String Old_TotalPrice = jTable2.getValueAt(row, 1).toString();
        String Old_Day = jTable2.getValueAt(row, 2).toString();
        String Old_userID = jTable2.getValueAt(row, 3).toString();

        String new_car_name = Field_CarName.getText();
        String new_TotalPrice = Field_TotalPrice.getText();
        String new_Old_Day = Field_Day.getText();
        String new_userID = Field_userID.getText();

        int row_count = jTable2.getSelectedRowCount();
        if (row_count == 0){
            JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' Booking", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (row_count > 1) {
            JOptionPane.showMessageDialog(this, "Please Select Only One Booking to 'EDIT' Booking", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            if ((new_car_name.equals("") || new_TotalPrice.equals("") || new_Old_Day.equals("") || new_userID.equals(""))){
                JOptionPane.showMessageDialog(this, "Please Select to 'EDIT' Booking", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this Booking?", "Confirm Add", JOptionPane.YES_NO_OPTION);
    
                if (confirm == JOptionPane.YES_OPTION) {
                String query = String.format("UPDATE car_history_booking SET car_name = '%s', totalPrice = '%s', day = '%s', user_id = '%s' WHERE car_name = '%s' AND totalPrice = '%s' AND day = '%s' AND user_id = '%s';", new_car_name, new_TotalPrice, new_Old_Day, new_userID, Old_carnew, Old_TotalPrice, Old_Day, Old_userID);
                    try {
                        db = new DBConnect();
                        db.getConnect();
                        db.getStatement().executeUpdate(query);
                        db.disconect();
                        setDataTableBooking();
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Cancel");
                }
    
               
            }
        }
    }//GEN-LAST:event_Edit_BookingActionPerformed

    private void Delete_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_BookingActionPerformed
        
        String car_name = Field_CarName.getText();
        String total_price = Field_TotalPrice.getText();
        String day = Field_Day.getText();
        String user_id = Field_userID.getText();

        if ((car_name.equals("") || total_price.equals("") || day.equals("") || user_id.equals(""))){
            JOptionPane.showMessageDialog(this, "Please select booking to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this booking?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String query = "DELETE FROM car_history_booking WHERE car_name = '"+car_name+"' AND totalPrice = '"+total_price+"' AND day = '"+day+"' AND user_id = '"+user_id+"'";
                try {
                    db = new DBConnect();
                    db.getConnect();
                    db.getStatement().executeUpdate(query);
                    db.disconect();
                    setDataTableBooking();
                    Field_CarName.setText("");
                    Field_TotalPrice.setText("");
                    Field_Day.setText("");
                    Field_userID.setText("");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                Field_CarName.setText("");
                Field_TotalPrice.setText("");
                Field_Day.setText("");
                Field_userID.setText("");
                System.out.println("Cancel");

            }
        }
    }//GEN-LAST:event_Delete_BookingActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // String TotalPrice = Field_TotalPrice.getText();
        // String CarName = Field_CarName.getText();
        // String Day = Field_Day.getText();
        // String user_id = Field_userID.getText();


       int row = jTable1.getSelectedRow();
       
       Field_CarName.setText(jTable1.getValueAt(row, 0).toString());
       Field_Day.setText(jTable1.getValueAt(row, 2).toString());
       Field_TotalPrice.setText(jTable1.getValueAt(row, 1).toString());
       Field_userID.setText(jTable1.getValueAt(row, 3).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.getSelectedRow();
        jTextField1.setText(jTable3.getValueAt(row, 0).toString());
        jTextField2.setText(jTable3.getValueAt(row, 3).toString());
        jTextField3.setText(jTable3.getValueAt(row, 2).toString());
        jTextField4.setText(jTable3.getValueAt(row, 1).toString());
        
        
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        //!@param jTextField5 = username
        //!@param jTextField7 = Password
        //!@param jTextField8 = Role
        int row = jTable2.getSelectedRow();
        jTextField5.setText(jTable2.getValueAt(row, 0).toString()); //username
        jTextField7.setText(jTable2.getValueAt(row, 1).toString()); //Password
        jTextField8.setText(jTable2.getValueAt(row, 2).toString()); //Role
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Booking;
    private javax.swing.JButton Add_Car;
    private javax.swing.JButton Add_User;
    private javax.swing.JButton Delete_Booking;
    private javax.swing.JButton Delete_Car;
    private javax.swing.JButton Delete_User;
    private javax.swing.JButton Edit_Booking;
    private javax.swing.JButton Edit_Car;
    private javax.swing.JButton Edit_User;
    private javax.swing.JTextField Field_CarName;
    private javax.swing.JTextField Field_Day;
    private javax.swing.JTextField Field_TotalPrice;
    private javax.swing.JTextField Field_userID;
    private javax.swing.JPanel Management_Booing;
    private javax.swing.JPanel Management_Car;
    private javax.swing.JPanel Management_User;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
