/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author aaron
 */
public class VentanaSeries extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSeries
     */
    public VentanaSeries() {
        initComponents();
    }

    public JComboBox<String> getVentanaSerie_ComboTipoDocumentoOrigen() {
        return VentanaSerie_ComboTipoDocumentoOrigen;
    }

    public void setVentanaSerie_ComboTipoDocumentoOrigen(JComboBox<String> VentanaSerie_ComboTipoDocumentoOrigen) {
        this.VentanaSerie_ComboTipoDocumentoOrigen = VentanaSerie_ComboTipoDocumentoOrigen;
    }

    public JPanel getVentanaSerie_PanelSeries() {
        return VentanaSerie_PanelSeries;
    }

    public void setVentanaSerie_PanelSeries(JPanel VentanaSerie_PanelSeries) {
        this.VentanaSerie_PanelSeries = VentanaSerie_PanelSeries;
    }

    public JButton getVentanaSeries_BntActualizar() {
        return VentanaSeries_BntActualizar;
    }

    public void setVentanaSeries_BntActualizar(JButton VentanaSeries_BntActualizar) {
        this.VentanaSeries_BntActualizar = VentanaSeries_BntActualizar;
    }

    public JButton getVentanaSeries_BntAnular() {
        return VentanaSeries_BntAnular;
    }

    public void setVentanaSeries_BntAnular(JButton VentanaSeries_BntAnular) {
        this.VentanaSeries_BntAnular = VentanaSeries_BntAnular;
    }

    public JButton getVentanaSeries_BntAplicarFiltro() {
        return VentanaSeries_BntAplicarFiltro;
    }

    public void setVentanaSeries_BntAplicarFiltro(JButton VentanaSeries_BntAplicarFiltro) {
        this.VentanaSeries_BntAplicarFiltro = VentanaSeries_BntAplicarFiltro;
    }

    public JButton getVentanaSeries_BntEditar() {
        return VentanaSeries_BntEditar;
    }

    public void setVentanaSeries_BntEditar(JButton VentanaSeries_BntEditar) {
        this.VentanaSeries_BntEditar = VentanaSeries_BntEditar;
    }

    public JButton getVentanaSeries_BntNuevo() {
        return VentanaSeries_BntNuevo;
    }

    public void setVentanaSeries_BntNuevo(JButton VentanaSeries_BntNuevo) {
        this.VentanaSeries_BntNuevo = VentanaSeries_BntNuevo;
    }

    public JButton getVentanaSeries_BntRestablecerFiltros() {
        return VentanaSeries_BntRestablecerFiltros;
    }

    public void setVentanaSeries_BntRestablecerFiltros(JButton VentanaSeries_BntRestablecerFiltros) {
        this.VentanaSeries_BntRestablecerFiltros = VentanaSeries_BntRestablecerFiltros;
    }

    public JButton getVentanaSeries_BntVer() {
        return VentanaSeries_BntVer;
    }

    public void setVentanaSeries_BntVer(JButton VentanaSeries_BntVer) {
        this.VentanaSeries_BntVer = VentanaSeries_BntVer;
    }

    public JComboBox<String> getVentanaSeries_ComboBodega() {
        return VentanaSeries_ComboBodega;
    }

    public void setVentanaSeries_ComboBodega(JComboBox<String> VentanaSeries_ComboBodega) {
        this.VentanaSeries_ComboBodega = VentanaSeries_ComboBodega;
    }

    public JComboBox<String> getVentanaSeries_ComboDisponibilidad() {
        return VentanaSeries_ComboDisponibilidad;
    }

    public void setVentanaSeries_ComboDisponibilidad(JComboBox<String> VentanaSeries_ComboDisponibilidad) {
        this.VentanaSeries_ComboDisponibilidad = VentanaSeries_ComboDisponibilidad;
    }

    public JComboBox<String> getVentanaSeries_ComboEstadoIntegridadItem() {
        return VentanaSeries_ComboEstadoIntegridadItem;
    }

    public void setVentanaSeries_ComboEstadoIntegridadItem(JComboBox<String> VentanaSeries_ComboEstadoIntegridadItem) {
        this.VentanaSeries_ComboEstadoIntegridadItem = VentanaSeries_ComboEstadoIntegridadItem;
    }

    public JPanel getVentanaSeries_PanelFiltro() {
        return VentanaSeries_PanelFiltro;
    }

    public void setVentanaSeries_PanelFiltro(JPanel VentanaSeries_PanelFiltro) {
        this.VentanaSeries_PanelFiltro = VentanaSeries_PanelFiltro;
    }

    public JPanel getVentanaSeries_PanelNuevo() {
        return VentanaSeries_PanelNuevo;
    }

    public void setVentanaSeries_PanelNuevo(JPanel VentanaSeries_PanelNuevo) {
        this.VentanaSeries_PanelNuevo = VentanaSeries_PanelNuevo;
    }

    public JTable getVentanaSeries_TablaGeneral() {
        return VentanaSeries_TablaGeneral;
    }

    public void setVentanaSeries_TablaGeneral(JTable VentanaSeries_TablaGeneral) {
        this.VentanaSeries_TablaGeneral = VentanaSeries_TablaGeneral;
    }

    public JTextField getVentanaSeries_txtItem() {
        return VentanaSeries_txtItem;
    }

    public void setVentanaSeries_txtItem(JTextField VentanaSeries_txtItem) {
        this.VentanaSeries_txtItem = VentanaSeries_txtItem;
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
        VentanaSeries_PanelNuevo = new javax.swing.JPanel();
        VentanaSeries_BntNuevo = new javax.swing.JButton();
        VentanaSeries_BntEditar = new javax.swing.JButton();
        VentanaSeries_BntAnular = new javax.swing.JButton();
        VentanaSeries_BntVer = new javax.swing.JButton();
        VentanaSerie_PanelSeries = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VentanaSeries_txtItem = new javax.swing.JTextField();
        VentanaSeries_ComboDisponibilidad = new javax.swing.JComboBox<String>();
        VentanaSeries_ComboBodega = new javax.swing.JComboBox<String>();
        VentanaSeries_ComboEstadoIntegridadItem = new javax.swing.JComboBox<String>();
        VentanaSerie_ComboTipoDocumentoOrigen = new javax.swing.JComboBox<String>();
        VentanaSeries_PanelFiltro = new javax.swing.JPanel();
        VentanaSeries_BntAplicarFiltro = new javax.swing.JButton();
        VentanaSeries_BntActualizar = new javax.swing.JButton();
        VentanaSeries_BntRestablecerFiltros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaSeries_TablaGeneral = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaSeries_PanelNuevo.setBackground(new java.awt.Color(0, 153, 51));

        VentanaSeries_BntNuevo.setText("Nuevo");

        VentanaSeries_BntEditar.setText("Editar");

        VentanaSeries_BntAnular.setText("Anular");

        VentanaSeries_BntVer.setText("Ver");

        javax.swing.GroupLayout VentanaSeries_PanelNuevoLayout = new javax.swing.GroupLayout(VentanaSeries_PanelNuevo);
        VentanaSeries_PanelNuevo.setLayout(VentanaSeries_PanelNuevoLayout);
        VentanaSeries_PanelNuevoLayout.setHorizontalGroup(
            VentanaSeries_PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaSeries_PanelNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanaSeries_BntNuevo)
                .addGap(18, 18, 18)
                .addComponent(VentanaSeries_BntEditar)
                .addGap(18, 18, 18)
                .addComponent(VentanaSeries_BntAnular)
                .addGap(18, 18, 18)
                .addComponent(VentanaSeries_BntVer)
                .addContainerGap(670, Short.MAX_VALUE))
        );
        VentanaSeries_PanelNuevoLayout.setVerticalGroup(
            VentanaSeries_PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaSeries_PanelNuevoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(VentanaSeries_PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaSeries_BntNuevo)
                    .addComponent(VentanaSeries_BntEditar)
                    .addComponent(VentanaSeries_BntAnular)
                    .addComponent(VentanaSeries_BntVer))
                .addContainerGap())
        );

        jPanel1.add(VentanaSeries_PanelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 50));

        VentanaSerie_PanelSeries.setBackground(new java.awt.Color(255, 255, 255));
        VentanaSerie_PanelSeries.setBorder(javax.swing.BorderFactory.createTitledBorder("Series de Items de Inventario"));
        VentanaSerie_PanelSeries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Item:");
        VentanaSerie_PanelSeries.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 10));

        jLabel2.setText("Disponibilidad:");
        VentanaSerie_PanelSeries.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 10));

        jLabel3.setText("Bodega:");
        VentanaSerie_PanelSeries.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 10));

        jLabel4.setText("Estado de Integridad del ítem:");
        VentanaSerie_PanelSeries.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 10));

        jLabel5.setText("Tipo de documento origen:");
        VentanaSerie_PanelSeries.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 10));
        VentanaSerie_PanelSeries.add(VentanaSeries_txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 240, -1));

        VentanaSeries_ComboDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "EN STOCK", "CONFIRMACION PENDIENTE DE TRANSFERENCIA", "DEVUELTO A PROVEEDOR", "VENDIDO", "DEVUELTO POR CLIENTE", "PEDIDO", "RESERVADO PARA FACTURAR CONTRATO DE SERVICIO DE INTERNET", "CESION TEMPORAL A CLIENTE" }));
        VentanaSeries_ComboDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaSeries_ComboDisponibilidadActionPerformed(evt);
            }
        });
        VentanaSerie_PanelSeries.add(VentanaSeries_ComboDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 240, -1));

        VentanaSeries_ComboBodega.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE" }));
        VentanaSerie_PanelSeries.add(VentanaSeries_ComboBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 240, -1));

        VentanaSeries_ComboEstadoIntegridadItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "BUENO", "DEFECTUOSO" }));
        VentanaSerie_PanelSeries.add(VentanaSeries_ComboEstadoIntegridadItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 240, -1));

        VentanaSerie_ComboTipoDocumentoOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "FACTURA DE COMPRA", "ORDEN DE TRABAJO", "PEDIDO" }));
        VentanaSerie_PanelSeries.add(VentanaSerie_ComboTipoDocumentoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 240, -1));

        jPanel1.add(VentanaSerie_PanelSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 970, 110));

        VentanaSeries_PanelFiltro.setBackground(new java.awt.Color(0, 153, 51));

        VentanaSeries_BntAplicarFiltro.setText("Aplicar Filtros");

        VentanaSeries_BntActualizar.setText("Actualizar");

        VentanaSeries_BntRestablecerFiltros.setText("Restablecer Filtros");
        VentanaSeries_BntRestablecerFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaSeries_BntRestablecerFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaSeries_PanelFiltroLayout = new javax.swing.GroupLayout(VentanaSeries_PanelFiltro);
        VentanaSeries_PanelFiltro.setLayout(VentanaSeries_PanelFiltroLayout);
        VentanaSeries_PanelFiltroLayout.setHorizontalGroup(
            VentanaSeries_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaSeries_PanelFiltroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(VentanaSeries_BntAplicarFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaSeries_BntActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaSeries_BntRestablecerFiltros)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        VentanaSeries_PanelFiltroLayout.setVerticalGroup(
            VentanaSeries_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaSeries_PanelFiltroLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(VentanaSeries_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaSeries_BntAplicarFiltro)
                    .addComponent(VentanaSeries_BntActualizar)
                    .addComponent(VentanaSeries_BntRestablecerFiltros))
                .addContainerGap())
        );

        jPanel1.add(VentanaSeries_PanelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 970, 50));

        VentanaSeries_TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Item", "Item", "Numero Serie", "Tipo de Documento", "Numero Documento", "Bodega", "Disponibilidad", "Integridad Item", "Creado por", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(VentanaSeries_TablaGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 970, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentanaSeries_ComboDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaSeries_ComboDisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaSeries_ComboDisponibilidadActionPerformed

    private void VentanaSeries_BntRestablecerFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaSeries_BntRestablecerFiltrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaSeries_BntRestablecerFiltrosActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaSeries().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> VentanaSerie_ComboTipoDocumentoOrigen;
    private javax.swing.JPanel VentanaSerie_PanelSeries;
    private javax.swing.JButton VentanaSeries_BntActualizar;
    private javax.swing.JButton VentanaSeries_BntAnular;
    private javax.swing.JButton VentanaSeries_BntAplicarFiltro;
    private javax.swing.JButton VentanaSeries_BntEditar;
    private javax.swing.JButton VentanaSeries_BntNuevo;
    private javax.swing.JButton VentanaSeries_BntRestablecerFiltros;
    private javax.swing.JButton VentanaSeries_BntVer;
    private javax.swing.JComboBox<String> VentanaSeries_ComboBodega;
    private javax.swing.JComboBox<String> VentanaSeries_ComboDisponibilidad;
    private javax.swing.JComboBox<String> VentanaSeries_ComboEstadoIntegridadItem;
    private javax.swing.JPanel VentanaSeries_PanelFiltro;
    private javax.swing.JPanel VentanaSeries_PanelNuevo;
    private javax.swing.JTable VentanaSeries_TablaGeneral;
    private javax.swing.JTextField VentanaSeries_txtItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
