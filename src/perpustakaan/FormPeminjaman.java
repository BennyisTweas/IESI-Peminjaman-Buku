/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;
import javax.accessibility.AccessibleRole;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VivoBook
 */
public class FormPeminjaman extends javax.swing.JFrame {
    
    private int borrowedDuration = -1;
    Object[] kolom = { "Judul" };
    DefaultTableModel model = new DefaultTableModel(kolom, 0);
    
    ArrayList<BukuDipinjam> bukuDipinjamCollection;

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }
    
    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldJudul = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBukuCari = new javax.swing.JTable();
        jButtonTambah = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBukuPinjam = new javax.swing.JTable();
        jButtonKonfirmasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCari.setText("Cari");
        jButtonCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCariMouseClicked(evt);
            }
        });

        jtBukuCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtBukuCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBukuCariMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBukuCari);

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBatalMouseClicked(evt);
            }
        });

        jtBukuPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtBukuPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBukuPinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtBukuPinjam);

        jButtonKonfirmasi.setText("Konfirmasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBatal))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKonfirmasi)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        // TODO add your handling code here:
        int row = jtBukuCari.getSelectedRow();
        Buku buku = (Buku) jtBukuCari.getModel().getValueAt(row, 0);
        tambahBuku(buku, borrowedDuration);
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCariMouseClicked
        // TODO add your handling code here:
        String judul = jTextFieldJudul.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(judul);
    }//GEN-LAST:event_jButtonCariMouseClicked

    private void jtBukuCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBukuCariMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint( evt.getPoint() );
        
        // Check if a valid cell is clicked
        if (row >= 0 && column >= 0) {
            // Prompt the user to enter how long the book will be borrowed
            String input = JOptionPane.showInputDialog(
                this, 
                "Enter the duration for borrowing the book (in days):", 
                "Borrow Duration", 
                JOptionPane.QUESTION_MESSAGE
            );

            // Check if the user provided input
            if (input != null && !input.isEmpty()) {
                try {
                    int duration = Integer.parseInt(input);
                    borrowedDuration = duration;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        this,
                        "Invalid input. Please enter a valid number.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
    }//GEN-LAST:event_jtBukuCariMouseClicked

    private void jtBukuPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBukuPinjamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBukuPinjamMouseClicked

    private void jButtonBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBatalMouseClicked
        // TODO add your handling code here:
        int row = jtBukuPinjam.getSelectedRow();
        Buku buku = (Buku) jtBukuPinjam.getModel().getValueAt(row, 0);
        hapusBuku(buku);
    }//GEN-LAST:event_jButtonBatalMouseClicked

    public void tambahBuku(Buku buku, int lama) {
        bukuDipinjamCollection = new ArrayList<>();
        BukuDipinjam bukuDipinjam = new BukuDipinjam(buku.judul, lama);
        
        // Set the judul and lama properties from the provided Buku and lama values
        bukuDipinjam.judul = buku.judul;
        bukuDipinjam.lama = lama;

        // Add the BukuDipinjam object to the collection
        bukuDipinjamCollection.add(bukuDipinjam);
        tampilPinjaman(bukuDipinjamCollection);
    }
    
    public void hapusBuku(Buku buku) {
        for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
            if (bukuDipinjam.judul == buku.judul) {
                bukuDipinjamCollection.remove(bukuDipinjam);
                break;
            }
        }
    }
    
    public void display(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel tabelCari = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            tabelCari.addRow(baris);
        }
        
        jtBukuCari.setModel(tabelCari);
    }
    
    public void tampilPinjaman(ArrayList<BukuDipinjam> bukuList) {
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }
        
        jtBukuPinjam.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonKonfirmasi;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTable jtBukuCari;
    private javax.swing.JTable jtBukuPinjam;
    // End of variables declaration//GEN-END:variables
}
