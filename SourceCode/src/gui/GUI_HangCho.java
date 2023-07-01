/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.Dao_ChiTietHoaDon;
import dao.Dao_HoaDon;
import dao.Dao_SanPham;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import entity.SanPham;

/**
 *
 * @author Admin
 */
public class GUI_HangCho extends javax.swing.JFrame implements ActionListener {
    private Dao_HoaDon dao_HoaDon = new Dao_HoaDon();
    private Dao_ChiTietHoaDon dao_ChiTietHoaDon = new Dao_ChiTietHoaDon();
    private Dao_SanPham dao_SanPham = new Dao_SanPham();
    private double tongTien = 0;

    /**
     * Creates new form GUI_HangCho
     */
    public GUI_HangCho() {
        try {
            ConnectDB.getInstance().connect();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        initComponents();
        updateTable();
        GUI_LapHD.gettxtTienTra().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                Object obj = e.getSource();
                if (obj.equals(GUI_LapHD.gettxtTienTra())) {
                    if (GUI_LapHD.gettxtTienTra().getText().equals("")) {
                        GUI_LapHD.getLbTienTra().setText("");
                    }
                    try {
                        double tienNhan = Double.parseDouble(GUI_LapHD.gettxtTienTra().getText());
                        if (tienNhan < tongTien) {
                            GUI_LapHD.getLbThongBaoTien().setText("Nhỏ hơn tổng tiền hóa đơn");
                            GUI_LapHD.getLbThongBaoTien().setForeground(Color.red);
                            GUI_LapHD.getLbTienTra().setText("");
                        } else {
                            double tienTra = tienNhan - tongTien;
                            GUI_LapHD.getLbTienTra().setText(String.valueOf(df.format(Math.round(tienTra))));
                            GUI_LapHD.getLbThongBaoTien().setText("");
                        }
                    } catch (Exception e2) {

                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

            }
        });
        btnLamMoi.addActionListener(this);
        btnThoat.addActionListener(this);
        btnTim.addActionListener(this);
        btnThanhToan.addActionListener(this);
        btnXoa.addActionListener(this);
        btnXoaTatCa.addActionListener(this);
    }

    private void updateTable() {
        model.setRowCount(0);
        ArrayList<HoaDon> listHD = dao_HoaDon.getALLDHCHO();
        for (HoaDon hd : listHD) {
            model.addRow(new Object[] { hd.getMaHoaDon(), hd.getNgayLap(), hd.getKhachHang().getHoTen(),
                    hd.getKhachHang().getSdt() });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDTKH = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnXoaTatCa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh Sách Hàng Chờ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã HĐ: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên KH:");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số Điện Thoại:");

        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(0, 153, 255));
        btnTim.setIcon(new javax.swing.ImageIcon("img\\timkiem24.png")); // NOI18N
        btnTim.setText("Tìm");

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(0, 153, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon("img\\refresh24.png")); // NOI18N
        btnLamMoi.setText("Làm mới");

        table.setModel(model = new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Mã Hóa Đơn", "Ngày Lập", "Tên Khách Hàng", "Số Điện Thoại"
                }));
        table.setGridColor(new java.awt.Color(51, 153, 255));
        table.setSelectionBackground(new java.awt.Color(0, 153, 255));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 153, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon("img\\delete.png")); // NOI18N
        btnXoa.setText("Xóa");

        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(0, 153, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon("img\\buy.png")); // NOI18N
        btnThanhToan.setText("Thanh Toán");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 153, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon("img\\thoat.png")); // NOI18N
        btnThoat.setText("Thoát");

        btnXoaTatCa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaTatCa.setForeground(new java.awt.Color(0, 153, 255));
        btnXoaTatCa.setIcon(new javax.swing.ImageIcon("img\\xoaall.png")); // NOI18N
        btnXoaTatCa.setText("Xóa Tất Cả");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnXoaTatCa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnThanhToan)
                                .addGap(27, 27, 27))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtTenKH,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 231,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtSDTKH))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtMaHD,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 619,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(222, 222, 222)
                                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)
                                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaHD)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSDTKH, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                        .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTenKHActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_HangCho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_HangCho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_HangCho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_HangCho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_HangCho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTatCa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtTenKH;
    private DefaultTableModel model;

    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        if (o.equals(btnLamMoi)) {
            txtMaHD.setText("");
            txtTenKH.setText("");
            txtSDTKH.setText("");
            updateTable();
        } else if (o.equals(btnThoat)) {
            dispose();
        } else if (o.equals(btnXoa)) {
            if (table.getSelectedRow() != -1) {
                if (JOptionPane.showConfirmDialog(this, "Có chắc chắn xóa không?", "Cảnh báo",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    dao_ChiTietHoaDon.xoaCTHD(model.getValueAt(table.getSelectedRow(), 0).toString());
                    dao_HoaDon.xoaHoaDon(model.getValueAt(table.getSelectedRow(), 0).toString());
                    model.removeRow(table.getSelectedRow());
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hóa đơn cần xóa");
            }
        } else if (o.equals(btnTim)) {
            String ma = "%" + txtMaHD.getText().trim() + "%";
            String ten = "%" + txtTenKH.getText().trim() + "%";
            String sdt = "%" + txtSDTKH.getText().trim() + "%";
            if (txtMaHD.getText().trim().equals(""))
                ma = "%%";
            if (txtTenKH.getText().trim().equals(""))
                ten = "%%";
            if (txtSDTKH.getText().trim().equals(""))
                sdt = "%%";
            model.setRowCount(0);
            ArrayList<HoaDon> listHD = dao_HoaDon.getHDChoTheoDK(ma, ten, sdt);
            for (HoaDon hd : listHD) {
                model.addRow(new Object[] { hd.getMaHoaDon(), hd.getNgayLap(), hd.getKhachHang().getHoTen(),
                        hd.getKhachHang().getSdt() });
            }
        } else if (o.equals(btnThanhToan)) {
            if (table.getSelectedRow() != -1) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                int r = table.getSelectedRow();
                GUI_LapHD.getLbMaHD().setText(model.getValueAt(r, 0).toString());
                GUI_LapHD.getLbNgayLap().setText(model.getValueAt(r, 1).toString());
                GUI_LapHD.getLbSDTKH().setText(model.getValueAt(r, 2).toString());
                GUI_LapHD.getLbTenKH().setText(model.getValueAt(r, 3).toString());
                GUI_LapHD.getModelHoaDon().setRowCount(0);
                for (ChiTietHoaDon c : dao_ChiTietHoaDon.getAllCTHDTheoMa(model.getValueAt(r, 0).toString())) {
                    SanPham s = dao_SanPham.getSPTheoMa(c.getSanPham().getMaSanPham());
                    Double giaBan = s.tinhGiaBan();
                    if (dao_SanPham.getSPTheoNgayGiamGia(s.getMaSanPham(), model.getValueAt(r, 1).toString()) != null) {
                        double giamGia = dao_SanPham
                                .getSPTheoNgayGiamGia(s.getMaSanPham(), model.getValueAt(r, 1).toString()).getGiamGia();
                        giaBan = s.tinhGiaBan() * (1 - giamGia / 100);
                    }
                    String[] row = { s.getMaSanPham(), s.getTenSanPham(), c.getSoLuong() + "", giaBan + "",
                            (c.getSoLuong() * giaBan) + "" };
                    GUI_LapHD.getModelHoaDon().addRow(row);
                }
                tongTien = 0;
                for (int i = 0; i < GUI_LapHD.getTableChiTietHoaDon().getRowCount(); i++) {
                    tongTien += Double.parseDouble(GUI_LapHD.getModelHoaDon().getValueAt(i, 4).toString());
                }
                tongTien = tongTien + tongTien * 0.05;
                GUI_LapHD.getLbTongTien().setText(df.format(tongTien));
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hóa đơn cần thanh toán");
            }
        }
    }

    private DecimalFormat df = new DecimalFormat("#,##0.00 VND");
}
