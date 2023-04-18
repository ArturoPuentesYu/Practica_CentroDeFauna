/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ifp.centrodefauna;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ajpyu
 */
public class PanelAlta extends javax.swing.JPanel {

    Date date;

    /**
     * Creates new form PanelAlta
     */
    public PanelAlta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ClasesAnimales = new javax.swing.JScrollPane();
        jListClases = new javax.swing.JList<>();
        jLabelEspecie = new javax.swing.JLabel();
        Especie = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        jLabelLesion = new javax.swing.JLabel();
        Lesion = new javax.swing.JTextField();
        jLabelGravedad = new javax.swing.JLabel();
        jScrollPaneGravedad = new javax.swing.JScrollPane();
        jListGravedad = new javax.swing.JList<>();
        jLabelFecha = new javax.swing.JLabel();
        FechaDeAlta = new javax.swing.JTextField();
        DatoExtra = new javax.swing.JRadioButton();
        DarAlta = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();

        setBackground(new java.awt.Color(246, 251, 244));
        setForeground(new java.awt.Color(75, 134, 115));
        setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        setMaximumSize(new java.awt.Dimension(264, 564));
        setMinimumSize(new java.awt.Dimension(264, 564));

        Titulo.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(75, 134, 115));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Alta");
        Titulo.setToolTipText("");
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 134, 115));
        jLabel1.setText("Clase Animal:");

        jListClases.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jListClases.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ave", "Mamífero", "Reptil" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClasesMouseClicked(evt);
            }
        });
        ClasesAnimales.setViewportView(jListClases);

        jLabelEspecie.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelEspecie.setForeground(new java.awt.Color(75, 134, 115));
        jLabelEspecie.setText("Especie:");

        Especie.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspecieKeyTyped(evt);
            }
        });

        jLabelPeso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelPeso.setForeground(new java.awt.Color(75, 134, 115));
        jLabelPeso.setText("Peso:");

        Peso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PesoKeyTyped(evt);
            }
        });

        jLabelLesion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelLesion.setForeground(new java.awt.Color(75, 134, 115));
        jLabelLesion.setText("Lesion:");

        Lesion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Lesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LesionKeyTyped(evt);
            }
        });

        jLabelGravedad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelGravedad.setForeground(new java.awt.Color(75, 134, 115));
        jLabelGravedad.setText("Gravedad:");

        jListGravedad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jListGravedad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Baja", "Media", "Urgente" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneGravedad.setViewportView(jListGravedad);

        jLabelFecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(75, 134, 115));
        jLabelFecha.setText("Fecha:");

        FechaDeAlta.setEditable(false);
        FechaDeAlta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        DatoExtra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        DatoExtra.setForeground(new java.awt.Color(75, 134, 115));
        DatoExtra.setText("Selecciona una clase de animal");
        DatoExtra.setEnabled(false);

        DarAlta.setBackground(new java.awt.Color(245, 223, 153));
        DarAlta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        DarAlta.setForeground(new java.awt.Color(75, 134, 115));
        DarAlta.setText("Dar Alta");
        DarAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarAltaActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(75, 134, 115));
        jLabelNombre.setText("Nombre:");

        Nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ClasesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelGravedad)
                                    .addComponent(jScrollPaneGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DatoExtra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLesion)
                                    .addComponent(jLabelPeso)
                                    .addComponent(jLabelEspecie)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelFecha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Especie, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaDeAlta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Peso)
                                    .addComponent(Lesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaDeAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGravedad)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(ClasesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(DatoExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(DarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        Especie.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void EspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspecieKeyTyped
        Gestor.IntroLetras(evt);
    }//GEN-LAST:event_EspecieKeyTyped

    private void LesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LesionKeyTyped
        Gestor.IntroLetras(evt);
    }//GEN-LAST:event_LesionKeyTyped

    private void PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyTyped
        Gestor.IntroDecimales(evt, Peso.getText());
    }//GEN-LAST:event_PesoKeyTyped

    private void jListClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClasesMouseClicked
        DatoExtra.setEnabled(true);
        if (jListClases.getSelectedIndex() == 0) {
            DatoExtra.setText("Caza Furtiba");
        }
        if (jListClases.getSelectedIndex() == 1) {
            DatoExtra.setText("Atropellado");
        }
        if (jListClases.getSelectedIndex() == 2) {
            DatoExtra.setText("Infercción bacteriana");
        }
    }//GEN-LAST:event_jListClasesMouseClicked

    private void DarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarAltaActionPerformed
        if (jListClases.getSelectedIndex() == 0) {
            Ave e = new Ave(Nombre.getText(), date, Especie.getText(), Float.parseFloat(Peso.getText()), Lesion.getText(), jListGravedad.getSelectedValue(), DatoExtra.isSelected());
            CentroDeFauna.listadoAnimales.add(e);
        }
        if (jListClases.getSelectedIndex() == 1) {
            Mamifero e = new Mamifero(Nombre.getText(), date, Especie.getText(), Float.parseFloat(Peso.getText()), Lesion.getText(), jListGravedad.getSelectedValue(), DatoExtra.isSelected());
            CentroDeFauna.listadoAnimales.add(e);
        }
        if (jListClases.getSelectedIndex() == 2) {
            Reptil e = new Reptil(Nombre.getText(), date, Especie.getText(), Float.parseFloat(Peso.getText()), Lesion.getText(), jListGravedad.getSelectedValue(), DatoExtra.isSelected());
            CentroDeFauna.listadoAnimales.add(e);
        }
        this.InitFecha();
        this.Nombre.setText("");
        this.Especie.setText("");
        this.Peso.setText("");
        this.Lesion.setText("");
        this.jListClases.clearSelection();
        this.jListGravedad.clearSelection();
        this.DatoExtra.setText("Selecciona una clase de animal");
        this.DatoExtra.setEnabled(false);
    }//GEN-LAST:event_DarAltaActionPerformed

    public void InitFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date = new Date();
        FechaDeAlta.setText(formato.format(date));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ClasesAnimales;
    private javax.swing.JButton DarAlta;
    private javax.swing.JRadioButton DatoExtra;
    private javax.swing.JTextField Especie;
    private javax.swing.JTextField FechaDeAlta;
    private javax.swing.JTextField Lesion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Peso;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEspecie;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelGravedad;
    private javax.swing.JLabel jLabelLesion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JList<String> jListClases;
    private javax.swing.JList<String> jListGravedad;
    private javax.swing.JScrollPane jScrollPaneGravedad;
    // End of variables declaration//GEN-END:variables
}