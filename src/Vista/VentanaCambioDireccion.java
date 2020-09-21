/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author aaron
 */
public class VentanaCambioDireccion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCambioDireccion
     */
    public VentanaCambioDireccion() {
        initComponents();
    }

    public JPanel getVentanaCambioDireccionPanelBotones_Aplicar() {
        return VentanaCambioDireccionPanelBotones_Aplicar;
    }

    public void setVentanaCambioDireccionPanelBotones_Aplicar(JPanel VentanaCambioDireccionPanelBotones_Aplicar) {
        this.VentanaCambioDireccionPanelBotones_Aplicar = VentanaCambioDireccionPanelBotones_Aplicar;
    }

    public JPanel getVentanaCambioDireccionPanelBotones_Nuevo() {
        return VentanaCambioDireccionPanelBotones_Nuevo;
    }

    public void setVentanaCambioDireccionPanelBotones_Nuevo(JPanel VentanaCambioDireccionPanelBotones_Nuevo) {
        this.VentanaCambioDireccionPanelBotones_Nuevo = VentanaCambioDireccionPanelBotones_Nuevo;
    }
    

    public JButton getVentanaCambioDireccionBntAnular() {
        return VentanaCambioDireccionBntAnular;
    }

    public void setVentanaCambioDireccionBntAnular(JButton VentanaCambioDireccionBntAnular) {
        this.VentanaCambioDireccionBntAnular = VentanaCambioDireccionBntAnular;
    }

    public JButton getVentanaCambioDireccionBntEditar() {
        return VentanaCambioDireccionBntEditar;
    }

    public void setVentanaCambioDireccionBntEditar(JButton VentanaCambioDireccionBntEditar) {
        this.VentanaCambioDireccionBntEditar = VentanaCambioDireccionBntEditar;
    }

    public JButton getVentanaCambioDireccionBntImprimirSolicitud() {
        return VentanaCambioDireccionBntImprimirSolicitud;
    }

    public void setVentanaCambioDireccionBntImprimirSolicitud(JButton VentanaCambioDireccionBntImprimirSolicitud) {
        this.VentanaCambioDireccionBntImprimirSolicitud = VentanaCambioDireccionBntImprimirSolicitud;
    }

    public JButton getVentanaCambioDireccionBntNuevo() {
        return VentanaCambioDireccionBntNuevo;
    }

    public void setVentanaCambioDireccionBntNuevo(JButton VentanaCambioDireccionBntNuevo) {
        this.VentanaCambioDireccionBntNuevo = VentanaCambioDireccionBntNuevo;
    }

    public JButton getVentanaCambioDireccionBnt_Actualizar() {
        return VentanaCambioDireccionBnt_Actualizar;
    }

    public void setVentanaCambioDireccionBnt_Actualizar(JButton VentanaCambioDireccionBnt_Actualizar) {
        this.VentanaCambioDireccionBnt_Actualizar = VentanaCambioDireccionBnt_Actualizar;
    }

    public JButton getVentanaCambioDireccionBnt_AplicarFiltro() {
        return VentanaCambioDireccionBnt_AplicarFiltro;
    }

    public void setVentanaCambioDireccionBnt_AplicarFiltro(JButton VentanaCambioDireccionBnt_AplicarFiltro) {
        this.VentanaCambioDireccionBnt_AplicarFiltro = VentanaCambioDireccionBnt_AplicarFiltro;
    }

    public JButton getVentanaCambioDireccionBnt_RestablecerFiltros() {
        return VentanaCambioDireccionBnt_RestablecerFiltros;
    }

    public void setVentanaCambioDireccionBnt_RestablecerFiltros(JButton VentanaCambioDireccionBnt_RestablecerFiltros) {
        this.VentanaCambioDireccionBnt_RestablecerFiltros = VentanaCambioDireccionBnt_RestablecerFiltros;
    }

    public JDateChooser getVentanaCambioDireccionJDate_FechaDesde() {
        return VentanaCambioDireccionJDate_FechaDesde;
    }

    public void setVentanaCambioDireccionJDate_FechaDesde(JDateChooser VentanaCambioDireccionJDate_FechaDesde) {
        this.VentanaCambioDireccionJDate_FechaDesde = VentanaCambioDireccionJDate_FechaDesde;
    }

    public JDateChooser getVentanaCambioDireccionJDate_FechaHasta() {
        return VentanaCambioDireccionJDate_FechaHasta;
    }

    public void setVentanaCambioDireccionJDate_FechaHasta(JDateChooser VentanaCambioDireccionJDate_FechaHasta) {
        this.VentanaCambioDireccionJDate_FechaHasta = VentanaCambioDireccionJDate_FechaHasta;
    }

   public JPanel getVentanaCambioDireccionPanel_FechadeCambio() {
        return VentanaCambioDireccionPanel_FechadeCambio;
    }

    public void setVentanaCambioDireccionPanel_FechadeCambio(JPanel VentanaCambioDireccionPanel_FechadeCambio) {
        this.VentanaCambioDireccionPanel_FechadeCambio = VentanaCambioDireccionPanel_FechadeCambio;
    }

    public JTable getVentanaCambioDireccionTabla_General() {
        return VentanaCambioDireccionTabla_General;
    }

    public void setVentanaCambioDireccionTabla_General(JTable VentanaCambioDireccionTabla_General) {
        this.VentanaCambioDireccionTabla_General = VentanaCambioDireccionTabla_General;
    }

    public JTextField getVentanaCambioDirecciontxt_Cliente() {
        return VentanaCambioDirecciontxt_Cliente;
    }

    public void setVentanaCambioDirecciontxt_Cliente(JTextField VentanaCambioDirecciontxt_Cliente) {
        this.VentanaCambioDirecciontxt_Cliente = VentanaCambioDirecciontxt_Cliente;
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
        VentanaCambioDireccionPanelBotones_Nuevo = new javax.swing.JPanel();
        VentanaCambioDireccionBntNuevo = new javax.swing.JButton();
        VentanaCambioDireccionBntEditar = new javax.swing.JButton();
        VentanaCambioDireccionBntAnular = new javax.swing.JButton();
        VentanaCambioDireccionBntImprimirSolicitud = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VentanaCambioDireccionPanel_FechadeCambio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VentanaCambioDireccionJDate_FechaDesde = new com.toedter.calendar.JDateChooser();
        VentanaCambioDireccionJDate_FechaHasta = new com.toedter.calendar.JDateChooser();
        VentanaCambioDirecciontxt_Cliente = new javax.swing.JTextField();
        VentanaCambioDireccionPanelBotones_Aplicar = new javax.swing.JPanel();
        VentanaCambioDireccionBnt_AplicarFiltro = new javax.swing.JButton();
        VentanaCambioDireccionBnt_Actualizar = new javax.swing.JButton();
        VentanaCambioDireccionBnt_RestablecerFiltros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaCambioDireccionTabla_General = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        VentanaCambioDireccionPanelBotones_Nuevo.setBackground(new java.awt.Color(0, 153, 51));

        VentanaCambioDireccionBntNuevo.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBntNuevo.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBntNuevo.setText("Nuevo");

        VentanaCambioDireccionBntEditar.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBntEditar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBntEditar.setText("Editar");

        VentanaCambioDireccionBntAnular.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBntAnular.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBntAnular.setText("Anular");

        VentanaCambioDireccionBntImprimirSolicitud.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBntImprimirSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBntImprimirSolicitud.setText("Imprimir Solicitud");

        javax.swing.GroupLayout VentanaCambioDireccionPanelBotones_NuevoLayout = new javax.swing.GroupLayout(VentanaCambioDireccionPanelBotones_Nuevo);
        VentanaCambioDireccionPanelBotones_Nuevo.setLayout(VentanaCambioDireccionPanelBotones_NuevoLayout);
        VentanaCambioDireccionPanelBotones_NuevoLayout.setHorizontalGroup(
            VentanaCambioDireccionPanelBotones_NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaCambioDireccionPanelBotones_NuevoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(VentanaCambioDireccionBntNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaCambioDireccionBntEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaCambioDireccionBntAnular)
                .addGap(18, 18, 18)
                .addComponent(VentanaCambioDireccionBntImprimirSolicitud)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        VentanaCambioDireccionPanelBotones_NuevoLayout.setVerticalGroup(
            VentanaCambioDireccionPanelBotones_NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaCambioDireccionBntNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VentanaCambioDireccionBntEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(VentanaCambioDireccionBntAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VentanaCambioDireccionBntImprimirSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitudes de cambio de direccion"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        VentanaCambioDireccionPanel_FechadeCambio.setBackground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionPanel_FechadeCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Cambio"));
        VentanaCambioDireccionPanel_FechadeCambio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Desde:");
        VentanaCambioDireccionPanel_FechadeCambio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 24, -1, -1));

        jLabel4.setText("Hasta:");
        VentanaCambioDireccionPanel_FechadeCambio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 60, -1, -1));

        VentanaCambioDireccionJDate_FechaDesde.setBackground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionPanel_FechadeCambio.add(VentanaCambioDireccionJDate_FechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 18, 260, 23));

        VentanaCambioDireccionJDate_FechaHasta.setBackground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionPanel_FechadeCambio.add(VentanaCambioDireccionJDate_FechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 53, 261, 23));

        jPanel3.add(VentanaCambioDireccionPanel_FechadeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 18, 470, 90));
        jPanel3.add(VentanaCambioDirecciontxt_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 250, -1));

        VentanaCambioDireccionPanelBotones_Aplicar.setBackground(new java.awt.Color(0, 153, 51));

        VentanaCambioDireccionBnt_AplicarFiltro.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBnt_AplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBnt_AplicarFiltro.setText("Aplicar Filtros");

        VentanaCambioDireccionBnt_Actualizar.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBnt_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBnt_Actualizar.setText("Actualizar");

        VentanaCambioDireccionBnt_RestablecerFiltros.setBackground(new java.awt.Color(0, 204, 51));
        VentanaCambioDireccionBnt_RestablecerFiltros.setForeground(new java.awt.Color(255, 255, 255));
        VentanaCambioDireccionBnt_RestablecerFiltros.setText("Restablecer Filtros");

        javax.swing.GroupLayout VentanaCambioDireccionPanelBotones_AplicarLayout = new javax.swing.GroupLayout(VentanaCambioDireccionPanelBotones_Aplicar);
        VentanaCambioDireccionPanelBotones_Aplicar.setLayout(VentanaCambioDireccionPanelBotones_AplicarLayout);
        VentanaCambioDireccionPanelBotones_AplicarLayout.setHorizontalGroup(
            VentanaCambioDireccionPanelBotones_AplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaCambioDireccionPanelBotones_AplicarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanaCambioDireccionBnt_AplicarFiltro)
                .addGap(18, 18, 18)
                .addComponent(VentanaCambioDireccionBnt_Actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaCambioDireccionBnt_RestablecerFiltros)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        VentanaCambioDireccionPanelBotones_AplicarLayout.setVerticalGroup(
            VentanaCambioDireccionPanelBotones_AplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaCambioDireccionPanelBotones_AplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(VentanaCambioDireccionBnt_AplicarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(VentanaCambioDireccionBnt_Actualizar)
                .addComponent(VentanaCambioDireccionBnt_RestablecerFiltros))
        );

        VentanaCambioDireccionTabla_General.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Centro de costos", "Cedula", "Cliente", "Contrato", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(VentanaCambioDireccionTabla_General);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VentanaCambioDireccionPanelBotones_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VentanaCambioDireccionPanelBotones_Aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VentanaCambioDireccionPanelBotones_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(VentanaCambioDireccionPanelBotones_Aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(VentanaCambioDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaCambioDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaCambioDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaCambioDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaCambioDireccion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VentanaCambioDireccionBntAnular;
    private javax.swing.JButton VentanaCambioDireccionBntEditar;
    private javax.swing.JButton VentanaCambioDireccionBntImprimirSolicitud;
    private javax.swing.JButton VentanaCambioDireccionBntNuevo;
    private javax.swing.JButton VentanaCambioDireccionBnt_Actualizar;
    private javax.swing.JButton VentanaCambioDireccionBnt_AplicarFiltro;
    private javax.swing.JButton VentanaCambioDireccionBnt_RestablecerFiltros;
    private com.toedter.calendar.JDateChooser VentanaCambioDireccionJDate_FechaDesde;
    private com.toedter.calendar.JDateChooser VentanaCambioDireccionJDate_FechaHasta;
    private javax.swing.JPanel VentanaCambioDireccionPanelBotones_Aplicar;
    private javax.swing.JPanel VentanaCambioDireccionPanelBotones_Nuevo;
    private javax.swing.JPanel VentanaCambioDireccionPanel_FechadeCambio;
    private javax.swing.JTable VentanaCambioDireccionTabla_General;
    private javax.swing.JTextField VentanaCambioDirecciontxt_Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
