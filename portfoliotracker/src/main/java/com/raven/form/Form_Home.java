
package com.raven.form;

import com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.ImageIcon;
import org.json.JSONObject;


public class Form_Home extends javax.swing.JPanel {
    
    public String getData(String coin) {
        
        String price24h = "";
        try {
            // Create a URL object with the API endpoint
            URL url = new URL("https://api.blockchain.com/v3/exchange/tickers/" + coin + "-USD");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Set any headers if required
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Get the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                
                JSONObject jsonResponse = new JSONObject(response.toString());
        
                // Extract data from the JSON object
                String symbol = jsonResponse.getString("symbol");
                price24h = jsonResponse.getString("price_24h");
                double volume24h = jsonResponse.getDouble("volume_24h");
                double lastTradePrice = jsonResponse.getDouble("last_trade_price");

              

                
            } else {
                System.out.println("HTTP GET request failed with response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return price24h;
    }


    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon("C:\\development\\School\\Portfolio-Tracking\\portfoliotracker\\src\\main\\java\\com.raven.icon\\bitcoin.png"), "Bitcoin", "$"+getData("BTC"), "BTC","0.25%"));
        card2.setData(new Model_Card(new ImageIcon("C:\\development\\School\\Portfolio-Tracking\\portfoliotracker\\src\\main\\java\\com.raven.icon\\litecoin.png"), "Cardano", "$"+getData("ADA"), "ADA","0.25%"));
        card3.setData(new Model_Card(new ImageIcon("C:\\development\\School\\Portfolio-Tracking\\portfoliotracker\\src\\main\\java\\com.raven.icon\\eth2.png"), "Ethereum", "$"+getData("ETH"), "ETH","0.25%"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card3 = new com.raven.component.Card();
        panel = new javax.swing.JLayeredPane();
        card2 = new com.raven.component.Card();
        card4 = new com.raven.component.Card();
        card1 = new com.raven.component.Card();

        card3.setForeground(new java.awt.Color(27, 32, 40));

        panel.setBackground(new java.awt.Color(27, 32, 40));
        panel.setForeground(new java.awt.Color(49, 53, 63));

        card2.setForeground(new java.awt.Color(27, 32, 40));

        card4.setForeground(new java.awt.Color(27, 32, 40));

        panel.setLayer(card2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(card4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        card1.setForeground(new java.awt.Color(27, 32, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 260, Short.MAX_VALUE)
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(0xff31353F));
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private com.raven.component.Card card4;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
