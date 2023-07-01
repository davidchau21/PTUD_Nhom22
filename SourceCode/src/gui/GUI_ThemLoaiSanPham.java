/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connectDB.ConnectDB;
import dao.Dao_LoaiSanPham;
import dao.Dao_PhatSinhMa;
import entity.LoaiSanPham;

/**
 *
 * @author TuanPC
 */
public class GUI_ThemLoaiSanPham extends javax.swing.JFrame implements ActionListener{
	private Dao_PhatSinhMa daoPhatSinhMa;
	private Dao_LoaiSanPham daoLoaiSP;
    /**
     * Creates new form GUI_ThemLoaiSanPham
     */
    public GUI_ThemLoaiSanPham() {
    	daoPhatSinhMa = new Dao_PhatSinhMa();
		daoLoaiSP = new Dao_LoaiSanPham();
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		initComponents();
		lbMaLoai.setText(daoPhatSinhMa.getMaLoaiSP());
		lbMaLoai.setForeground(Color.white);
		lbMaLoai.setFont(new Font("Arial", Font.BOLD, 16));
		btnXacNhan.addActionListener(this);
		btnHuy.addActionListener(this);
		btnLamMoi.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbMaLoai = new javax.swing.JLabel();
        txtChiTiet = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbbTenLoai = new javax.swing.JComboBox<>();
        btnXacNhan = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 119, 221));

        jLabel11.setBackground(new java.awt.Color(153, 204, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thêm Loại Sản Phẩm");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 2, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nhà Sách Thiên Văn");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mã Loại:");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tên Loại:");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Chi Tiết:");

        cbbTenLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTenLoaiActionPerformed(evt);
            }
        });
        cbbTenLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Sách","Văn Phòng Phẩm"}));
        btnXacNhan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(51, 102, 255));
        btnXacNhan.setIcon(new javax.swing.ImageIcon("img\\yes24.png")); // NOI18N
        btnXacNhan.setText("Xác Nhận");

        btnLamMoi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(51, 102, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon("img\\rf24.png")); // NOI18N
        btnLamMoi.setText("Làm Mới");

        btnHuy.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(51, 102, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon("img\\huy24.png")); // NOI18N
        btnHuy.setText("Hủy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(btnLamMoi)
                        .addGap(20, 20, 20)
                        .addComponent(btnXacNhan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChiTiet))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbTenLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbTenLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTenLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTenLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTenLoaiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_ThemLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ThemLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ThemLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ThemLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ThemLoaiSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbbTenLoai;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMaLoai;
    private javax.swing.JTextField txtChiTiet;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnHuy)) {
			dispose();
		}
		else if(o.equals(btnLamMoi)) {
			cbbTenLoai.setSelectedIndex(0);
			txtChiTiet.setText("");
		}
		else if(o.equals(btnXacNhan)) {
			String maLoai = lbMaLoai.getText();
			String tenLoai = cbbTenLoai.getSelectedItem().toString();
			String chiTiet = txtChiTiet.getText();
			LoaiSanPham lsp = new LoaiSanPham(maLoai, tenLoai, chiTiet);
			if(GUI_LoaiSanPham.edit == 1) {
				if(regex()) {
					if(daoLoaiSP.themLoaiSP(lsp)) {
						JOptionPane.showMessageDialog(null, "Thêm thành công loại sản phẩm " + tenLoai);
						GUI_LoaiSanPham.updateTable();
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ");
					}
				}
			}else if(GUI_LoaiSanPham.edit == 2) {
				if(regex()) {
					if(daoLoaiSP.suaLoaiSP(lsp)) {
						JOptionPane.showMessageDialog(null, "Sửa thành công loại sản phẩm " + tenLoai);
						GUI_LoaiSanPham.updateTable();
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ");
					}
				}
			}
		}
	}
		private boolean regex() {
			String chiTiet = txtChiTiet.getText().trim();
			String regex = "^[ A-Za-za-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+$";
			if (!chiTiet.matches(regex)) {
				JOptionPane.showMessageDialog(this, "thông tin không hợp lệ!\n Mẫu chi tiết sản phẩm: Sách kinh tế");
				return false;
			}

			return true;
		}

	public Dao_PhatSinhMa getDaoPhatSinhMa() {
		return daoPhatSinhMa;
	}

	public void setDaoPhatSinhMa(Dao_PhatSinhMa daoPhatSinhMa) {
		this.daoPhatSinhMa = daoPhatSinhMa;
	}

	public Dao_LoaiSanPham getDaoLoaiSP() {
		return daoLoaiSP;
	}

	public void setDaoLoaiSP(Dao_LoaiSanPham daoLoaiSP) {
		this.daoLoaiSP = daoLoaiSP;
	}

	public javax.swing.JButton getBtnHuy() {
		return btnHuy;
	}

	public void setBtnHuy(javax.swing.JButton btnHuy) {
		this.btnHuy = btnHuy;
	}

	public javax.swing.JButton getBtnLamMoi() {
		return btnLamMoi;
	}

	public void setBtnLamMoi(javax.swing.JButton btnLamMoi) {
		this.btnLamMoi = btnLamMoi;
	}

	public javax.swing.JButton getBtnXacNhan() {
		return btnXacNhan;
	}

	public void setBtnXacNhan(javax.swing.JButton btnXacNhan) {
		this.btnXacNhan = btnXacNhan;
	}

	public javax.swing.JComboBox<String> getCbbTenLoai() {
		return cbbTenLoai;
	}

	public void setCbbTenLoai(javax.swing.JComboBox<String> cbbTenLoai) {
		this.cbbTenLoai = cbbTenLoai;
	}

	public javax.swing.JLabel getjLabel11() {
		return jLabel11;
	}

	public void setjLabel11(javax.swing.JLabel jLabel11) {
		this.jLabel11 = jLabel11;
	}

	public javax.swing.JLabel getjLabel12() {
		return jLabel12;
	}

	public void setjLabel12(javax.swing.JLabel jLabel12) {
		this.jLabel12 = jLabel12;
	}

	public javax.swing.JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(javax.swing.JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public javax.swing.JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(javax.swing.JLabel jLabel14) {
		this.jLabel14 = jLabel14;
	}

	public javax.swing.JLabel getjLabel19() {
		return jLabel19;
	}

	public void setjLabel19(javax.swing.JLabel jLabel19) {
		this.jLabel19 = jLabel19;
	}

	public javax.swing.JPanel getjPanel2() {
		return jPanel2;
	}

	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.jPanel2 = jPanel2;
	}

	public javax.swing.JLabel getLbMaLoai() {
		return lbMaLoai;
	}

	public void setLbMaLoai(javax.swing.JLabel lbMaLoai) {
		this.lbMaLoai = lbMaLoai;
	}

	public javax.swing.JTextField getTxtChiTiet() {
		return txtChiTiet;
	}

	public void setTxtChiTiet(javax.swing.JTextField txtChiTiet) {
		this.txtChiTiet = txtChiTiet;
	}
}
