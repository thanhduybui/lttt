package forms;

import java.awt.Color;



public class HomeFrame extends javax.swing.JFrame {
    
    Color DefaultColor, ClickedColor;

  
    
    public HomeFrame() {
        initComponents();
        DefaultColor = new Color(38,80,115); 
        ClickedColor = new Color(255,175,69);
        item1.setBackground(ClickedColor);
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuPan = new javax.swing.JPanel();
        item1 = new javax.swing.JPanel();
        lblBooking2 = new javax.swing.JLabel();
        item2 = new javax.swing.JPanel();
        lblBooking1 = new javax.swing.JLabel();
        item3 = new javax.swing.JPanel();
        lblBooking3 = new javax.swing.JLabel();
        item4 = new javax.swing.JPanel();
        lblBooking4 = new javax.swing.JLabel();
        item7 = new javax.swing.JPanel();
        lblBooking7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        setTitle("Quản lý khách sạn");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        MenuPan.setBackground(new java.awt.Color(38, 80, 115));

        item1.setBackground(new java.awt.Color(38, 80, 115));
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item1MousePressed(evt);
            }
        });

        lblBooking2.setBackground(new java.awt.Color(255, 255, 255));
        lblBooking2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBooking2.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lblBooking2.setText("Đặt phòng");

        javax.swing.GroupLayout item1Layout = new javax.swing.GroupLayout(item1);
        item1.setLayout(item1Layout);
        item1Layout.setHorizontalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBooking2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        item1Layout.setVerticalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBooking2)
                .addContainerGap())
        );

        item2.setBackground(new java.awt.Color(38, 80, 115));

        lblBooking1.setBackground(new java.awt.Color(255, 255, 255));
        lblBooking1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBooking1.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lblBooking1.setText("Quản lý phòng");
        lblBooking1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBooking1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout item2Layout = new javax.swing.GroupLayout(item2);
        item2.setLayout(item2Layout);
        item2Layout.setHorizontalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(item2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblBooking1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        item2Layout.setVerticalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(item2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblBooking1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        item3.setBackground(new java.awt.Color(38, 80, 115));
        item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item3MousePressed(evt);
            }
        });

        lblBooking3.setBackground(new java.awt.Color(255, 255, 255));
        lblBooking3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBooking3.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lblBooking3.setText("Quản lý dịch vụ");

        javax.swing.GroupLayout item3Layout = new javax.swing.GroupLayout(item3);
        item3.setLayout(item3Layout);
        item3Layout.setHorizontalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBooking3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        item3Layout.setVerticalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBooking3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        item4.setBackground(new java.awt.Color(38, 80, 115));
        item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item4MousePressed(evt);
            }
        });

        lblBooking4.setBackground(new java.awt.Color(255, 255, 255));
        lblBooking4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBooking4.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lblBooking4.setText("Tài khoản");

        javax.swing.GroupLayout item4Layout = new javax.swing.GroupLayout(item4);
        item4.setLayout(item4Layout);
        item4Layout.setHorizontalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBooking4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        item4Layout.setVerticalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBooking4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        item7.setBackground(new java.awt.Color(38, 80, 115));

        lblBooking7.setBackground(new java.awt.Color(255, 255, 255));
        lblBooking7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBooking7.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        lblBooking7.setText("Báo cáo & Thống kê");

        javax.swing.GroupLayout item7Layout = new javax.swing.GroupLayout(item7);
        item7.setLayout(item7Layout);
        item7Layout.setHorizontalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBooking7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        item7Layout.setVerticalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBooking7)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuPanLayout = new javax.swing.GroupLayout(MenuPan);
        MenuPan.setLayout(MenuPanLayout);
        MenuPanLayout.setHorizontalGroup(
            MenuPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        MenuPanLayout.setVerticalGroup(
            MenuPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_30.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExit)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(51, 102, 255));
        jDesktopPane1.setDesktopManager(null);
        jDesktopPane1.setDoubleBuffered(true);
        jDesktopPane1.setEnabled(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(MenuPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblBooking1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooking1MousePressed
        item1.setBackground(DefaultColor);
        item2.setBackground(ClickedColor);
        item3.setBackground(DefaultColor);
        item4.setBackground(DefaultColor);
        item7.setBackground(DefaultColor);
    }//GEN-LAST:event_lblBooking1MousePressed

    private void item1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MousePressed
        // TODO add your handling code here:
          item1.setBackground(ClickedColor);
        item2.setBackground(DefaultColor);
        item3.setBackground(DefaultColor);
        item4.setBackground(DefaultColor);
        item7.setBackground(DefaultColor);
    }//GEN-LAST:event_item1MousePressed

    private void item3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item3MousePressed
          item1.setBackground(DefaultColor);
        item2.setBackground(DefaultColor);
        item3.setBackground(ClickedColor);
        item4.setBackground(DefaultColor);
        item7.setBackground(DefaultColor);
    }//GEN-LAST:event_item3MousePressed

    private void item4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item4MousePressed
        // TODO add your handling code here:
          item1.setBackground(DefaultColor);
        item2.setBackground(DefaultColor);
        item3.setBackground(DefaultColor);
        item4.setBackground(ClickedColor);
        item7.setBackground(DefaultColor);
    }//GEN-LAST:event_item4MousePressed

    private void item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MouseClicked
        BookingFrame bf = new BookingFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(bf).setVisible(true);
    }//GEN-LAST:event_item1MouseClicked

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPan;
    private javax.swing.JPanel item1;
    private javax.swing.JPanel item2;
    private javax.swing.JPanel item3;
    private javax.swing.JPanel item4;
    private javax.swing.JPanel item5;
    private javax.swing.JPanel item6;
    private javax.swing.JPanel item7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBooking1;
    private javax.swing.JLabel lblBooking2;
    private javax.swing.JLabel lblBooking3;
    private javax.swing.JLabel lblBooking4;
    private javax.swing.JLabel lblBooking5;
    private javax.swing.JLabel lblBooking6;
    private javax.swing.JLabel lblBooking7;
    private javax.swing.JLabel lblExit;
    // End of variables declaration//GEN-END:variables
}
