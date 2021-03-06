/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biro_view;

import biro_koneksi.koneksi;
import static biro_view.menu.idWisata;
import static biro_view.menu.namaWisata;
import static biro_view.pemesanan_tiket.jumlahTiket;
import static biro_view.pemesanan_tiket.namaPembeli;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import static java.lang.Integer.parseInt;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author robbycmukti
 */
public class pembayaran extends javax.swing.JFrame {
//    public static String namaPembeli;  
//    public static String jumlahTiket;
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form pembayaran
     */
    public pembayaran() {
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 =  new RoundedPanel(32,new java.awt.Color(242,242,242));
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f_nama = new javax.swing.JTextField();
        t_wisata = new javax.swing.JTextField();
        j_tiket = new javax.swing.JTextField();
        total_pem = new javax.swing.JTextField();
        f_nama1 = new javax.swing.JTextField();
        randomcode1 = new javax.swing.JTextField();
        alfamart = new javax.swing.JLabel();
        indo = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        bayar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });

        jLabel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biro_image/x aja.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setText("BIRO WISATA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nama");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/biro_image/homescreen.jpg")).getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("PEMBAYARAN TIKET");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("No Tiket");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tempat Wisata");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Jumlah Tiket");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Total Bayar");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("METODE PAMBAYARAN TIKET");

        f_nama = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        f_nama.setBorder(new LineBorder(Color.BLACK, 2));
        f_nama.setHorizontalAlignment(JTextField.CENTER);

        t_wisata = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        t_wisata.setBorder(new LineBorder(Color.BLACK, 2));
        t_wisata.setHorizontalAlignment(JTextField.CENTER);

        j_tiket = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        j_tiket.setBorder(new LineBorder(Color.BLACK, 2));
        j_tiket.setHorizontalAlignment(JTextField.CENTER);

        total_pem = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        total_pem.setBorder(new LineBorder(Color.BLACK, 2));
        total_pem.setHorizontalAlignment(JTextField.CENTER);

        f_nama1 = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        f_nama1.setBorder(new LineBorder(Color.BLACK, 2));
        f_nama1.setHorizontalAlignment(JTextField.CENTER);
        f_nama1.setText("1");

        randomcode1 = new RoundJTextField(10);
        //f_nama.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        randomcode1.setBorder(new LineBorder(Color.BLACK, 2));
        randomcode1.setHorizontalAlignment(JTextField.CENTER);
        randomcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomcode1ActionPerformed(evt);
            }
        });

        alfamart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biro_image/Alfamart.png"))); // NOI18N
        alfamart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alfamartMouseClicked(evt);
            }
        });

        indo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biro_image/indomaret.png"))); // NOI18N
        indo.setToolTipText("");
        indo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indoMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biro_image/cancel.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        bayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biro_image/read.png"))); // NOI18N
        bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(f_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(f_nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(j_tiket)
                                        .addComponent(total_pem)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(24, 24, 24)
                                    .addComponent(t_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(alfamart)
                                        .addGap(18, 18, 18)
                                        .addComponent(indo))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(back)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bayar))
                                        .addComponent(randomcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(147, 147, 147))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(f_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8))
                    .addComponent(f_nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(t_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(j_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(total_pem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alfamart)
                    .addComponent(indo))
                .addGap(18, 18, 18)
                .addComponent(randomcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(bayar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        f_nama.setText(namaPembeli);        
        j_tiket.setText(jumlahTiket);
        t_wisata.setText(namaWisata);
        randomcode1.setVisible(false);
        
        alfamart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        indo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        int harga_total = parseInt(jumlahTiket)*50000;
        
        
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

        BigDecimal bd = new BigDecimal(harga_total);

        symbols.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(symbols);
        
        f_nama.setEditable(false);
        j_tiket.setEditable(false);
        t_wisata.setEditable(false);
        total_pem.setEditable(false);
        f_nama1.setEditable(false);
        f_nama1.setEditable(false);
        randomcode1.setEditable(false);
        
        
        total_pem.setText(formatter.format(bd.longValue()));
        
    }//GEN-LAST:event_formComponentShown

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown

    }//GEN-LAST:event_jPanel3ComponentShown

    private void randomcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomcode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randomcode1ActionPerformed

    private void alfamartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alfamartMouseClicked
        conn            = koneksi.konek();

        Random random   = new Random();
        long first14    = (long) (Math.random() * 100000000000000L);
        long number     = 8800000000000000L + first14;
        String sql      = "SELECT * FROM tiket where kode_bayar = "+number+"";
        //        String sql      = "SELECT * FROM tiket where kode_bayar = '8897305748730586'";
        //        JOptionPane.showMessageDialog(rootPane, sql);

        try {
            ps    = conn.prepareStatement(sql);
            rs    = ps.executeQuery();
            //            JOptionPane.showMessageDialog(rootPane, rs.getString("kode_bayar"));

            if (rs.next() == false) {
                randomcode1.setText(String.valueOf(number));
            }else{
                long first15    = (long) (Math.random() * 100000000000000L);
                long number2    = 8800000000000000L + first15;

                randomcode1.setText(String.valueOf(number2));
            }
            
            randomcode1.setVisible(true);
            randomcode1.setEditable(false);

                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_alfamartMouseClicked

    private void indoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indoMouseClicked
        conn            = koneksi.konek();

        Random random   = new Random();
        long first14    = (long) (Math.random() * 100000000000000L);
        long number     = 7700000000000000L + first14;
        String sql      = "SELECT * FROM tiket where kode_bayar = "+number+"";
        //        String sql      = "SELECT * FROM tiket where kode_bayar = '8897305748730586'";
        //        JOptionPane.showMessageDialog(rootPane, sql);

        try {
            ps    = conn.prepareStatement(sql);
            rs    = ps.executeQuery();
            //            JOptionPane.showMessageDialog(rootPane, rs.getString("kode_bayar"));

            if (rs.next() == false) {
                randomcode1.setText(String.valueOf(number));
            }else{
                long first15    = (long) (Math.random() * 100000000000000L);
                long number2    = 7700000000000000L + first15;

                randomcode1.setText(String.valueOf(number2));
            }
            
            randomcode1.setVisible(true);
            randomcode1.setEditable(false);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_indoMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        pemesanan_tiket back;
        back = new pemesanan_tiket();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bayarMouseClicked
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        
        String kode_bayar = randomcode1.getText();
        
        String sql = "INSERT INTO tiket (id_wisata,id_pelanggan,nama_pelanggan,jumlah_tiket,harga,tanggal_beli,kode_bayar) VALUES ('"+idWisata+"', '1', '"+namaPembeli+"','"+jumlahTiket+"', '50000', '"+now+"', '"+kode_bayar+"')";
//                JOptionPane.showMessageDialog(null, sql);
        System.out.println(sql);
        try {
            ps = conn.prepareStatement(sql);

            ps.execute();
            String result = "Menunggu konfirmasi pembayaran ";

            menu pindah = new menu();
            pindah.setVisible(true);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_bayarMouseClicked

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
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran().setVisible(true);
            }
        });
    }
    
    public class RoundedPanel extends JPanel{
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border            
        }
    }

    public class RoundedBorder extends AbstractBorder {

        public RoundedBorder(Color c, int g) {
            color = c;
            gap = g;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d;
            if (g instanceof Graphics2D) {
                g2d = (Graphics2D) g;
                g2d.setColor(color);
                System.out.println(x + y);
                g2d.draw(new Line2D.Double((double)x, (double)y + 10, (double)x + 3, (double)y + 3));
                g2d.draw(new Line2D.Double((double)x + 3, (double)y + 3, (double)x + 10, (double)y));
                g2d.draw(new Line2D.Double((double)x + 10, (double)y, (double)x + 30, (double)y));
                g2d.draw(new Line2D.Double((double)x + 30, (double)y, (double)x + 33, (double)y + 2));
                g2d.draw(new Line2D.Double((double)x + 33, (double)y + 2, (double)x + 36, (double)y + 8));
                g2d.draw(new Line2D.Double((double)x + 36, (double)y + 8, (double)x + 36, (double)y + 28));
                g2d.draw(new Line2D.Double((double)x + 36, (double)y + 28, (double)x + 34, (double)y + 31));
                g2d.draw(new Line2D.Double((double)x + 34, (double)y + 31, (double)x + 32, (double)y + 33));
                g2d.draw(new Line2D.Double((double)x + 32, (double)y + 33, (double)x + 6, (double)y + 33));
                g2d.draw(new Line2D.Double((double)x + 6, (double)y + 33, (double)x + 3, (double)y + 31));
                g2d.draw(new Line2D.Double((double)x + 3, (double)y + 31, (double)x, (double)y + 27));
                g2d.draw(new Line2D.Double((double)x, (double)y + 27, (double)x, (double)y + 10));
            }
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return (getBorderInsets(c, new Insets(gap, gap, gap, gap)));
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = gap;
            return insets;
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        // Variable declarations
        private final Color color;
        private final int gap;
    }
    
    public class RoundJTextField extends JTextField {
        private Shape shape;
        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }
        protected void paintComponent(Graphics g) {
             g.setColor(getBackground());
             g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
             super.paintComponent(g);
        }
        protected void paintBorder(Graphics g) {
             g.setColor(getForeground());
             g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }
        public boolean contains(int x, int y) {
             if (shape == null || !shape.getBounds().equals(getBounds())) {
                 shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
             }
             return shape.contains(x, y);
        }
    }
    
    public class RoundJpasswordField extends JPasswordField {
    private Shape shape;
    public RoundJpasswordField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alfamart;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bayar;
    private javax.swing.JTextField f_nama;
    private javax.swing.JTextField f_nama1;
    private javax.swing.JLabel indo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField j_tiket;
    private javax.swing.JTextField randomcode1;
    private javax.swing.JTextField t_wisata;
    private javax.swing.JTextField total_pem;
    // End of variables declaration//GEN-END:variables
}
