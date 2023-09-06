
package views;
import connection.ConexaoDAO;
import control.ControlMotorbike;
import infomotorbike.GeneralInfo;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal extends javax.swing.JFrame {
    ControlMotorbike cm = new ControlMotorbike();
    Connection conn = null;
    String sql = "INSERT INTO fuel_motorbike_data (date, kmTraveled, litersStocked, totalKm, averageLitersPerKm) VALUES (?, ?, ?, ?, ?);";
    
    public Principal() {
        initComponents();
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnListAllPanel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfKmTraveled = new javax.swing.JTextField();
        txfLitersStocked = new javax.swing.JTextField();
        txfTotalKm = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnExitPanel = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(668, 499));

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        btnListAllPanel.setText("Visualizar");
        btnListAllPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAllPanelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Km percorridos:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Litros abastecidos:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Km total:");

        txfKmTraveled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfKmTraveledActionPerformed(evt);
            }
        });

        txfLitersStocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLitersStockedActionPerformed(evt);
            }
        });

        txfTotalKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTotalKmActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExitPanel.setText("Sair");
        btnExitPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnListAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txfKmTraveled, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfLitersStocked, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                .addComponent(txfTotalKm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(txfKmTraveled, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfLitersStocked, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTotalKm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfKmTraveledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfKmTraveledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfKmTraveledActionPerformed

    private void txfLitersStockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLitersStockedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLitersStockedActionPerformed

    private void txfTotalKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTotalKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTotalKmActionPerformed

    private void btnExitPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitPanelActionPerformed
        System.exit(0);  
    }//GEN-LAST:event_btnExitPanelActionPerformed

    private void btnListAllPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAllPanelActionPerformed
       ListarInfos listar = new ListarInfos(null, true, cm);
       listar.setPreferredSize(new Dimension(900, 650));
       listar.setMaximumSize(new Dimension(900, 650));
       listar.setMinimumSize(new Dimension(860, 650));
       listar.setLocationRelativeTo(null);
       listar.setVisible(true);
    }//GEN-LAST:event_btnListAllPanelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        GeneralInfo info = new GeneralInfo();
        
        Date selectedDate = dateChooser.getDate();
        if(selectedDate != null){ 
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = sdf.format(selectedDate);
            info.setData(formattedDate);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma data válida.");
        }
        
        info.setKmTraveled(Double.parseDouble(txfKmTraveled.getText()));
        info.setLitersStocked(Double.parseDouble(txfLitersStocked.getText()));
        info.setTotalKm(Double.parseDouble(txfTotalKm.getText()));
        info.setAverageLitersPerKm();
        
        if(cm.save(info)){
            try {
                conn = ConexaoDAO.conectaBD();
                conn.setAutoCommit(true);

                System.out.println(conn);
            } catch(SQLException e){
                System.err.println("Erro ao realizar conexão");
                System.out.println("Message exception: "+e.getMessage());
            }
            
            JOptionPane.showMessageDialog(null, "Informações da moto cadastradas.");
            txfKmTraveled.setText("");
            txfLitersStocked.setText("");
            txfTotalKm.setText("");
            dateChooser.requestFocus();
            
            double kmTravelded = info.getKmTraveled();
            double averageLitersPerKm = info.getAverageLitersPerKm();
            double litersStocked = info.getLitersStocked();
            double totalKm = info.getTotalKm();
            String data = info.getData();
            
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                preparedStatement.setString(1, data);
                preparedStatement.setDouble(2, kmTravelded);
                preparedStatement.setDouble(3, litersStocked);
                preparedStatement.setDouble(4, totalKm);
                preparedStatement.setDouble(5, averageLitersPerKm);
                
                int linhasAfetadas = preparedStatement.executeUpdate();
                if (linhasAfetadas > 0) {
                    System.out.println("Inserção bem-sucedida!");
                } else {
                    System.out.println("Nenhuma linha inserida.");
                }
                
            //    ScriptsSQL.executeSqlScritps(connection, sql);
                
            } catch(SQLException e){
                System.out.println("Message exception: "+e.getMessage());
                System.out.println("Erro ao executar inserção");
            } finally{
                try{
                    conn.close();
                } catch(SQLException e){
                    System.out.println("Message exception: "+e.getMessage());
                    System.out.println("Erro ao fechar a conexão");
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar as informações da moto.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitPanel;
    private javax.swing.JButton btnListAllPanel;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txfKmTraveled;
    private javax.swing.JTextField txfLitersStocked;
    private javax.swing.JTextField txfTotalKm;
    // End of variables declaration//GEN-END:variables
}
