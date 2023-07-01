/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import connectDB.ConnectDB;
import dao.Dao_SanPham;

/**
 *
 * @author TuanPC
 */
public class NhanVienDN extends javax.swing.JFrame implements ActionListener{
	private Dao_SanPham dao_SanPham;
	private JMenuItem mnTroGiup;
    /** Creates new form Main */
    public NhanVienDN() {
    	dao_SanPham = new Dao_SanPham();
    	try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        initComponents();
        mnThoat.addActionListener(this);
        mnTrangChu.addActionListener(this);
        mnLapHoaDon.addActionListener(this);
        mnKhachHang.addActionListener(this);
        mnDangXuat.addActionListener(this);
        mnVPP.addActionListener(this);
        setContentPane(new GUI_TrangChu().getTrangChu());
        mnNCC.addActionListener(this);
        mnNXB.addActionListener(this);
        mnTacGia.addActionListener(this);
        mnLSP.addActionListener(this);
        mnHoaDon.addActionListener(this);
        mnXuatXu.addActionListener(this);
        mnSach.addActionListener(this);
        mnDoanhThu.addActionListener(this);
        mnTKSP.addActionListener(this);
        mnTroGiup.addActionListener(this);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mnTrangChu = new javax.swing.JMenuItem();
        mnDangXuat = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        mnBanHang = new javax.swing.JMenu();
        mnLapHoaDon = new javax.swing.JMenuItem();
        mnQuanly = new javax.swing.JMenu();
        mnHoaDon = new javax.swing.JMenuItem();
        mnSach = new javax.swing.JMenuItem();
        mnVPP = new javax.swing.JMenuItem();
        mnKhachHang = new javax.swing.JMenuItem();
        mnTacGia = new javax.swing.JMenuItem();
        mnNXB = new javax.swing.JMenuItem();
        mnNCC = new javax.swing.JMenuItem();
        mnLSP = new javax.swing.JMenuItem();
        mnXuatXu = new javax.swing.JMenuItem();
        mnThongke = new javax.swing.JMenu();
        mnDoanhThu = new javax.swing.JMenuItem();
        mnTKSP = new javax.swing.JMenuItem();
        mnTKHD = new javax.swing.JMenuItem();
        mnSPDB = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        mnHeThong.setIcon(new javax.swing.ImageIcon("img\\hethong.png")); // NOI18N
        mnHeThong.setText("Hệ thống");
        mnHeThong.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        mnTrangChu.setIcon(new ImageIcon("img\\home-page-22.png"));
        mnTrangChu.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnTrangChu.setText("Trang Chủ");
        mnHeThong.add(mnTrangChu);

        mnDangXuat.setIcon(new ImageIcon("img\\logout-20.png"));
        mnDangXuat.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnDangXuat.setText("Đăng Xuất");
        mnHeThong.add(mnDangXuat);

        mnThoat.setIcon(new ImageIcon("img\\close-20.png"));
        mnThoat.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnThoat.setText("Thoát");
        mnHeThong.add(mnThoat);
        
        mnTroGiup.setIcon(new ImageIcon("img\\help-22.png"));
        mnTroGiup.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnTroGiup.setText("Trợ giúp");
        mnHeThong.add(mnTroGiup);

        jMenuBar1.add(mnHeThong);

        mnBanHang.setIcon(new javax.swing.ImageIcon("img\\banhang.png")); // NOI18N
        mnBanHang.setText("Bán hàng");
        mnBanHang.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        mnLapHoaDon.setIcon(new ImageIcon("img\\order-22.png"));
        mnLapHoaDon.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnLapHoaDon.setText("Lập Hóa Đơn");
        mnBanHang.add(mnLapHoaDon);

        jMenuBar1.add(mnBanHang);

        mnQuanly.setIcon(new javax.swing.ImageIcon("img\\quanly.png")); // NOI18N
        mnQuanly.setText("Quản lý");
        mnQuanly.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        mnHoaDon.setIcon(new ImageIcon("img\\bill-22.png"));
        mnHoaDon.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnHoaDon.setText("Hóa Đơn");
        mnBanHang.add(mnHoaDon);

        mnSach.setIcon(new ImageIcon("img\\book-22.png"));
        mnSach.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnSach.setText("Sách");
        mnSach.setToolTipText("");
        mnQuanly.add(mnSach);

        mnVPP.setIcon(new ImageIcon("img\\stationery-22.png"));
        mnVPP.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnVPP.setText("Văn Phòng Phẩm");
        mnQuanly.add(mnVPP);

        mnKhachHang.setIcon(new ImageIcon("img\\customer-22.png"));
        mnKhachHang.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnKhachHang.setText("Khách Hàng");
        mnQuanly.add(mnKhachHang);

        mnTacGia.setIcon(new ImageIcon("img\\writer-22.png"));
        mnTacGia.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnTacGia.setText("Tác Giả");
        mnQuanly.add(mnTacGia);

        mnNXB.setIcon(new ImageIcon("img\\company-22.png"));
        mnNXB.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnNXB.setText("Nhà Xuất Bản");
        mnQuanly.add(mnNXB);

        mnNCC.setIcon(new ImageIcon("img\\supplier-22.png"));
        mnNCC.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnNCC.setText("Nhà Cung Cấp");
        mnQuanly.add(mnNCC);

        mnLSP.setIcon(new ImageIcon("img\\product-22.png"));
        mnLSP.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnLSP.setText("Loại Sản Phẩm");
        mnQuanly.add(mnLSP);

        mnXuatXu.setIcon(new ImageIcon("img\\globe-22.png"));
        mnXuatXu.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnXuatXu.setText("Xuất Xứ");
        mnQuanly.add(mnXuatXu);

        jMenuBar1.add(mnQuanly);

        mnThongke.setIcon(new javax.swing.ImageIcon("img\\thongke.png")); // NOI18N
        mnThongke.setText("Thống kê");
        mnThongke.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        mnDoanhThu.setIcon(new ImageIcon("img\\cash-22.png"));
        mnDoanhThu.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnDoanhThu.setText("Doanh Thu");
        mnThongke.add(mnDoanhThu);

        mnTKSP.setIcon(new ImageIcon("img\\sp-22.png"));
        mnTKSP.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        mnTKSP.setText("Sản Phẩm");
        mnThongke.add(mnTKSP);
        

        mnSPDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSPDBActionPerformed(evt);
            }
        });
        mnThongke.add(mnSPDB);

        jMenuBar1.add(mnThongke);
        
        
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSPDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSPDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSPDBActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        run();  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static NhanVienDN gdChinh;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnBanHang;
    private javax.swing.JMenuItem mnDangXuat;
    private javax.swing.JMenuItem mnDoanhThu;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mnHoaDon;
    private javax.swing.JMenuItem mnKhachHang;
    private javax.swing.JMenuItem mnLSP;
    private javax.swing.JMenuItem mnLapHoaDon;
    private javax.swing.JMenuItem mnNCC;
    private javax.swing.JMenuItem mnNXB;
    private javax.swing.JMenu mnQuanly;
    private javax.swing.JMenuItem mnSPDB;
    private javax.swing.JMenuItem mnSach;
    private javax.swing.JMenuItem mnTKHD;
    private javax.swing.JMenuItem mnTKSP;
    private javax.swing.JMenuItem mnTacGia;
    private javax.swing.JMenuItem mnThoat;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JMenuItem mnTrangChu;
    private javax.swing.JMenuItem mnVPP;
    private javax.swing.JMenuItem mnXuatXu;
	private static GUI_Help gui_help;
	private static GUI_LapHD gui_LapHoaDon;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(mnThoat)) {
			System.exit(0);
		}
		else if(o.equals(mnTrangChu)) {
			setContentPane(new GUI_TrangChu().getTrangChu());
			revalidate();
			repaint();
		}else if(o.equals(mnLapHoaDon)) {
			gui_LapHoaDon = new GUI_LapHD();
			setContentPane(gui_LapHoaDon);
			revalidate();
			repaint();
		}else if(o.equals(mnKhachHang)) {
			setContentPane(new GUI_KhachHang());
			revalidate();
			repaint();
		}else if(o.equals(mnDangXuat)) {
			dispose();
			GUI_DangNhap gui_DangNhap = new GUI_DangNhap();
			gui_DangNhap.setVisible(true);
			gui_DangNhap.setLocationRelativeTo(null);
			gui_DangNhap.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}else if(o.equals(mnVPP)){
            setContentPane(new GUI_VanPhongPham());
            revalidate();
            repaint();
        }else if(o.equals(mnTacGia)){
            setContentPane(new GUI_TacGia());
            revalidate();
            repaint();
        }else if(o.equals(mnLSP)){
            setContentPane(new GUI_LoaiSanPham());
            revalidate();
            repaint();
        }else if(o.equals(mnNCC)){
            setContentPane(new GUI_NhaCungCap());
            revalidate();
            repaint();
        }else if(o.equals(mnNXB)){
            setContentPane(new GUI_NhaXuatBan());
            revalidate();
            repaint();
        }else if(o.equals(mnHoaDon)){
            setContentPane(new GUI_HoaDon());
            revalidate();
            repaint();
        }else if(o.equals(mnXuatXu)){
            setContentPane(new GUI_XuatXu());
            revalidate();
            repaint();
        }else if(o.equals(mnSach)){
            setContentPane(new GUI_Sach());
            revalidate();
            repaint();
        }else if(o.equals(mnDoanhThu)) {
        	setContentPane(new GUI_NVThongKeDoanhThu());
        	revalidate();
            repaint();
        }else if(o.equals(mnTKSP)) {
        	try {
				setContentPane(new GUI_NVThongKeSanPham());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	revalidate();
            repaint();
        }else if(o.equals(mnTroGiup)) {
        	GUI_Help gui_help = new GUI_Help();
        	gui_help.setVisible(true);
        	gui_help.setLocationRelativeTo(null);
        	gui_help.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        	revalidate();
			repaint();
        	
        }
	}
	public static JFrame getFrame() {
		return gdChinh;
	}
	public static JPanel guiLapHoaDon() {
		return gui_LapHoaDon;
	}

	public static void run() {
		gdChinh =new NhanVienDN();
        gdChinh.setVisible(true);
        gdChinh.setLocationRelativeTo(null);
	}
}