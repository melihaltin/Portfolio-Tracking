package com.deu.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SearchBar extends javax.swing.JPanel {

    public SearchBar() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        jLabel2.setIcon(new ImageIcon("src/main/java/com.raven.icon/search.png"));
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        //g2.fillRect(0, 0, 25, getHeight());

        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        searchText1 = new com.deu.swing.SearchText();

        setBackground(new java.awt.Color(27, 32, 40));

        searchText1.setBackground(new java.awt.Color(27, 32, 40));
        searchText1.setForeground(new java.awt.Color(153, 153, 153));
        searchText1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(searchText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
        String searchText = searchText1.getText();
    
    // CSV dosyasından veriyi ara ve ekranda göster
        searchAndDisplayFromCSV(searchText);
    }//GEN-LAST:event_searchText1ActionPerformed

    private void searchAndDisplayFromCSV(String searchText) {
        // CSV dosyasını oku ve arama işlemini gerçekleştir
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/melihaltin/Downloads/Portfolio-Tracking/portfoliotracker/src/main/java/Wallet.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Her satırı ara ve eğer eşleşme bulunursa ekranda göster
                if (line.contains(searchText)) {
                    // Eşleşme bulundu, ekranda göster
                    JOptionPane.showMessageDialog(this, line, "Search Result", JOptionPane.INFORMATION_MESSAGE);
                    return; // Eşleşme bulunduğunda aramayı sonlandır
                }
            }
            // Eğer eşleşme bulunamazsa bilgilendirme mesajı göster
            JOptionPane.showMessageDialog(this, "No match found for: " + searchText, "Search Result", JOptionPane.INFORMATION_MESSAGE);
           reader.close();
        } catch (IOException e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private com.deu.swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
}
