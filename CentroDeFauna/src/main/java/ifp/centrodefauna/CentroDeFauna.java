/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ifp.centrodefauna;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Arturo
 */
public class CentroDeFauna extends javax.swing.JFrame {

    PanelAlta panelAlta;
    PanelLiberacion panelLiberacion;
    PanelTratamiento panelTratamiento;
    PanelListado panelListado;
    PanelFallecimiento panelBaja;
    final int width = 318;
    static ArrayList<Animal> listadoAnimales = new ArrayList<>();

    /**
     * Creates new form CentroDeFauna
     */
    public CentroDeFauna() {
        initComponents();
        setSize(318, 564);
        panelAlta = new PanelAlta();
        panelLiberacion = new PanelLiberacion();
        panelTratamiento = new PanelTratamiento();
        panelListado = new PanelListado();
        panelBaja = new PanelFallecimiento();
        panelAlta.setBounds(318, 0, 260, 564);
        panelLiberacion.setBounds(318, 0, 417, 564);
        panelTratamiento.setBounds(318, 0, 803, 564);
        panelListado.setBounds(318, 0, 845, 564);
        panelBaja.setBounds(318, 0, 482, 564);
        panelAlta.setVisible(false);
        panelLiberacion.setVisible(false);
        panelTratamiento.setVisible(false);
        panelListado.setVisible(false);
        panelBaja.setVisible(false);
        add(panelAlta);
        add(panelLiberacion);
        add(panelTratamiento);
        add(panelListado);
        add(panelBaja);
        setLocationRelativeTo(null);
        listadoAnimales.add(new Ave("a", new Date(), "", (float) 1.2, "", "", false));
        listadoAnimales.add(new Mamifero("b", new Date(), "", (float) 1.2, "", "", false));
        listadoAnimales.add(new Reptil("c", new Date(), "", (float) 1.2, "", "", false));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Alta = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        Tratamiento = new javax.swing.JButton();
        Liberacion = new javax.swing.JButton();
        Listado = new javax.swing.JButton();
        Baja = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(318, 564));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 251, 244));
        jPanel1.setToolTipText("");
        jPanel1.setEnabled(false);

        Alta.setBackground(new java.awt.Color(245, 223, 153));
        Alta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Alta.setForeground(new java.awt.Color(75, 134, 115));
        Alta.setText("Alta");
        Alta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(75, 134, 115));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cavanillas");
        Titulo.setToolTipText("");
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(75, 134, 115));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Centro de Recuperación");
        Titulo1.setToolTipText("");
        Titulo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tratamiento.setBackground(new java.awt.Color(245, 223, 153));
        Tratamiento.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Tratamiento.setForeground(new java.awt.Color(75, 134, 115));
        Tratamiento.setText("Tratamiento");
        Tratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TratamientoActionPerformed(evt);
            }
        });

        Liberacion.setBackground(new java.awt.Color(245, 223, 153));
        Liberacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Liberacion.setForeground(new java.awt.Color(75, 134, 115));
        Liberacion.setText("Liberación");
        Liberacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Liberacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiberacionActionPerformed(evt);
            }
        });

        Listado.setBackground(new java.awt.Color(245, 223, 153));
        Listado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Listado.setForeground(new java.awt.Color(75, 134, 115));
        Listado.setText("Listado");
        Listado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoActionPerformed(evt);
            }
        });

        Baja.setBackground(new java.awt.Color(245, 223, 153));
        Baja.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Baja.setForeground(new java.awt.Color(75, 134, 115));
        Baja.setText("Baja");
        Baja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(245, 223, 153));
        Salir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(75, 134, 115));
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\images\\Logo.jpg"));
        jLabel1.setMaximumSize(new java.awt.Dimension(288, 288));
        jLabel1.setMinimumSize(new java.awt.Dimension(288, 288));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Listado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tratamiento)
                    .addComponent(Liberacion)))
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alta, Baja, Liberacion, Listado, Salir, Tratamiento});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Listado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Liberacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        this.setSize(panelAlta.getWidth() + width, this.getHeight());
        panelAlta.setVisible(true);
        panelLiberacion.setVisible(false);
        panelTratamiento.setVisible(false);
        panelListado.setVisible(false);
        panelBaja.setVisible(false);
        panelAlta.InitFecha();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_AltaActionPerformed

    private void TratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TratamientoActionPerformed
        this.setSize(panelTratamiento.getWidth() + width, this.getHeight());
        panelAlta.setVisible(false);
        panelLiberacion.setVisible(false);
        panelTratamiento.setVisible(true);
        panelListado.setVisible(false);
        panelBaja.setVisible(false);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_TratamientoActionPerformed

    private void LiberacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiberacionActionPerformed
        this.setSize(panelLiberacion.getWidth() + width, this.getHeight());
        panelAlta.setVisible(false);
        panelLiberacion.setVisible(true);
        panelTratamiento.setVisible(false);
        panelListado.setVisible(false);
        panelBaja.setVisible(false);
        setLocationRelativeTo(null);
        panelLiberacion.InitFecha();
    }//GEN-LAST:event_LiberacionActionPerformed

    private void ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoActionPerformed
        this.setSize(panelListado.getWidth() + width, this.getHeight());
        panelAlta.setVisible(false);
        panelLiberacion.setVisible(false);
        panelTratamiento.setVisible(false);
        panelListado.setVisible(true);
        panelBaja.setVisible(false);
        setLocationRelativeTo(null);
        panelListado.initElementsInTable();
    }//GEN-LAST:event_ListadoActionPerformed

    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        this.setSize(panelBaja.getWidth() + width, this.getHeight());
        panelAlta.setVisible(false);
        panelLiberacion.setVisible(false);
        panelTratamiento.setVisible(false);
        panelListado.setVisible(false);
        panelBaja.setVisible(true);
        setLocationRelativeTo(null);
        panelBaja.InitFecha();
    }//GEN-LAST:event_BajaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(CentroDeFauna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroDeFauna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroDeFauna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroDeFauna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroDeFauna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JButton Baja;
    private javax.swing.JButton Liberacion;
    private javax.swing.JButton Listado;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton Tratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
