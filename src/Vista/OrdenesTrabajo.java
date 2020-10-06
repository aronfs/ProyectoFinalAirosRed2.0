/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author aaron
 */
public class OrdenesTrabajo extends javax.swing.JInternalFrame {

    /**
     * Creates new form OrdenesTrabajo
     */
    public OrdenesTrabajo() {
        initComponents();
    }

    public JButton getOrdenesTrabajoBtnActualizar() {
        return OrdenesTrabajoBtnActualizar;
    }

    public void setOrdenesTrabajoBtnActualizar(JButton OrdenesTrabajoBtnActualizar) {
        this.OrdenesTrabajoBtnActualizar = OrdenesTrabajoBtnActualizar;
    }

    public JButton getOrdenesTrabajoBtnAnular() {
        return OrdenesTrabajoBtnAnular;
    }

    public void setOrdenesTrabajoBtnAnular(JButton OrdenesTrabajoBtnAnular) {
        this.OrdenesTrabajoBtnAnular = OrdenesTrabajoBtnAnular;
    }

    public JButton getOrdenesTrabajoBtnAplicarFiltro() {
        return OrdenesTrabajoBtnAplicarFiltro;
    }

    public void setOrdenesTrabajoBtnAplicarFiltro(JButton OrdenesTrabajoBtnAplicarFiltro) {
        this.OrdenesTrabajoBtnAplicarFiltro = OrdenesTrabajoBtnAplicarFiltro;
    }

    public JButton getOrdenesTrabajoBtnEditar() {
        return OrdenesTrabajoBtnEditar;
    }

    public void setOrdenesTrabajoBtnEditar(JButton OrdenesTrabajoBtnEditar) {
        this.OrdenesTrabajoBtnEditar = OrdenesTrabajoBtnEditar;
    }

    public JButton getOrdenesTrabajoBtnNuevo() {
        return OrdenesTrabajoBtnNuevo;
    }

    public void setOrdenesTrabajoBtnNuevo(JButton OrdenesTrabajoBtnNuevo) {
        this.OrdenesTrabajoBtnNuevo = OrdenesTrabajoBtnNuevo;
    }

    public JButton getOrdenesTrabajoBtnRestablecerFiltros() {
        return OrdenesTrabajoBtnRestablecerFiltros;
    }

    public void setOrdenesTrabajoBtnRestablecerFiltros(JButton OrdenesTrabajoBtnRestablecerFiltros) {
        this.OrdenesTrabajoBtnRestablecerFiltros = OrdenesTrabajoBtnRestablecerFiltros;
    }

    public JButton getOrdenesTrabajoBtnSolicitudServicio() {
        return OrdenesTrabajoBtnSolicitudServicio;
    }

    public void setOrdenesTrabajoBtnSolicitudServicio(JButton OrdenesTrabajoBtnSolicitudServicio) {
        this.OrdenesTrabajoBtnSolicitudServicio = OrdenesTrabajoBtnSolicitudServicio;
    }

    public JComboBox<String> getOrdenesTrabajoComboEstado() {
        return OrdenesTrabajoComboEstado;
    }

    public void setOrdenesTrabajoComboEstado(JComboBox<String> OrdenesTrabajoComboEstado) {
        this.OrdenesTrabajoComboEstado = OrdenesTrabajoComboEstado;
    }

    public JDateChooser getOrdenesTrabajoComboFechaDesde() {
        return OrdenesTrabajoComboFechaDesde;
    }

    public void setOrdenesTrabajoComboFechaDesde(JDateChooser OrdenesTrabajoComboFechaDesde) {
        this.OrdenesTrabajoComboFechaDesde = OrdenesTrabajoComboFechaDesde;
    }

    public JDateChooser getOrdenesTrabajoComboFechaHasta() {
        return OrdenesTrabajoComboFechaHasta;
    }

    public void setOrdenesTrabajoComboFechaHasta(JDateChooser OrdenesTrabajoComboFechaHasta) {
        this.OrdenesTrabajoComboFechaHasta = OrdenesTrabajoComboFechaHasta;
    }

    public JComboBox<String> getOrdenesTrabajoComboTipo() {
        return OrdenesTrabajoComboTipo;
    }

    public void setOrdenesTrabajoComboTipo(JComboBox<String> OrdenesTrabajoComboTipo) {
        this.OrdenesTrabajoComboTipo = OrdenesTrabajoComboTipo;
    }

    public JPanel getOrdenesTrabajoPanel() {
        return OrdenesTrabajoPanel;
    }

    public void setOrdenesTrabajoPanel(JPanel OrdenesTrabajoPanel) {
        this.OrdenesTrabajoPanel = OrdenesTrabajoPanel;
    }

    public JTable getOrdenesTrabajoTabla_General() {
        return OrdenesTrabajoTabla_General;
    }

    public void setOrdenesTrabajoTabla_General(JTable OrdenesTrabajoTabla_General) {
        this.OrdenesTrabajoTabla_General = OrdenesTrabajoTabla_General;
    }

    public JDateChooser getOrdenesTrabajocombofecha() {
        return OrdenesTrabajocombofecha;
    }

    public void setOrdenesTrabajocombofecha(JDateChooser OrdenesTrabajocombofecha) {
        this.OrdenesTrabajocombofecha = OrdenesTrabajocombofecha;
    }

    public JPanel getOrdenesTrabajopanelfecha() {
        return OrdenesTrabajopanelfecha;
    }

    public void setOrdenesTrabajopanelfecha(JPanel OrdenesTrabajopanelfecha) {
        this.OrdenesTrabajopanelfecha = OrdenesTrabajopanelfecha;
    }

    public JTextField getOrdenesTrabajotxt_Ejecutadopor() {
        return OrdenesTrabajotxt_Ejecutadopor;
    }

    public void setOrdenesTrabajotxt_Ejecutadopor(JTextField OrdenesTrabajotxt_Ejecutadopor) {
        this.OrdenesTrabajotxt_Ejecutadopor = OrdenesTrabajotxt_Ejecutadopor;
    }

    public JTextField getOrdenesTrabajotxt_asignadoA() {
        return OrdenesTrabajotxt_asignadoA;
    }

    public void setOrdenesTrabajotxt_asignadoA(JTextField OrdenesTrabajotxt_asignadoA) {
        this.OrdenesTrabajotxt_asignadoA = OrdenesTrabajotxt_asignadoA;
    }

    public JTextField getOrdenesTrabajotxt_cliente() {
        return OrdenesTrabajotxt_cliente;
    }

    public void setOrdenesTrabajotxt_cliente(JTextField OrdenesTrabajotxt_cliente) {
        this.OrdenesTrabajotxt_cliente = OrdenesTrabajotxt_cliente;
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
        jPanel2 = new javax.swing.JPanel();
        OrdenesTrabajoBtnNuevo = new javax.swing.JButton();
        OrdenesTrabajoBtnEditar = new javax.swing.JButton();
        OrdenesTrabajoBtnAnular = new javax.swing.JButton();
        OrdenesTrabajoBtnSolicitudServicio = new javax.swing.JButton();
        OrdenesTrabajoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OrdenesTrabajopanelfecha = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrdenesTrabajocombofecha = new com.toedter.calendar.JDateChooser();
        OrdenesTrabajoComboFechaDesde = new com.toedter.calendar.JDateChooser();
        OrdenesTrabajoComboFechaHasta = new com.toedter.calendar.JDateChooser();
        OrdenesTrabajotxt_cliente = new javax.swing.JTextField();
        OrdenesTrabajoComboTipo = new javax.swing.JComboBox<>();
        OrdenesTrabajoComboEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OrdenesTrabajotxt_asignadoA = new javax.swing.JTextField();
        OrdenesTrabajotxt_Ejecutadopor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        OrdenesTrabajoBtnAplicarFiltro = new javax.swing.JButton();
        OrdenesTrabajoBtnActualizar = new javax.swing.JButton();
        OrdenesTrabajoBtnRestablecerFiltros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenesTrabajoTabla_General = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        OrdenesTrabajoBtnNuevo.setText("Nuevo");

        OrdenesTrabajoBtnEditar.setText("Editar");
        OrdenesTrabajoBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenesTrabajoBtnEditarActionPerformed(evt);
            }
        });

        OrdenesTrabajoBtnAnular.setText("Anular");

        OrdenesTrabajoBtnSolicitudServicio.setText("Solicitud de Servicio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(OrdenesTrabajoBtnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrdenesTrabajoBtnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrdenesTrabajoBtnAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrdenesTrabajoBtnSolicitudServicio)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrdenesTrabajoBtnNuevo)
                    .addComponent(OrdenesTrabajoBtnEditar)
                    .addComponent(OrdenesTrabajoBtnAnular)
                    .addComponent(OrdenesTrabajoBtnSolicitudServicio))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 50));

        OrdenesTrabajoPanel.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenes de Trabajo"));
        OrdenesTrabajoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente:");
        OrdenesTrabajoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, -1));

        jLabel3.setText("Tipo:");
        OrdenesTrabajoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel4.setText("Estado:");
        OrdenesTrabajoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 60, 20));
        OrdenesTrabajoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        OrdenesTrabajopanelfecha.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajopanelfecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha "));
        OrdenesTrabajopanelfecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Fecha :");
        OrdenesTrabajopanelfecha.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, -1, -1));

        jLabel8.setText("Desde:");
        OrdenesTrabajopanelfecha.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel9.setText("Hasta:");
        OrdenesTrabajopanelfecha.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        OrdenesTrabajocombofecha.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajocombofecha.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajopanelfecha.add(OrdenesTrabajocombofecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, 20));

        OrdenesTrabajoComboFechaDesde.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajoComboFechaDesde.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajopanelfecha.add(OrdenesTrabajoComboFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 170, 20));

        OrdenesTrabajoComboFechaHasta.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajoComboFechaHasta.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajopanelfecha.add(OrdenesTrabajoComboFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 130, 20));

        OrdenesTrabajoPanel.add(OrdenesTrabajopanelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 450, 100));

        OrdenesTrabajotxt_cliente.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajotxt_cliente.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajoPanel.add(OrdenesTrabajotxt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 200, -1));

        OrdenesTrabajoComboTipo.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajoComboTipo.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajoComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "INSTALACION", "SUSPENSION", "CANCELACION", "REACTIVACION", "CAMBIO DE DIRECCION", "VISITA TECNICA", "CANCELACION INICIADA POR EMPRESA" }));
        OrdenesTrabajoPanel.add(OrdenesTrabajoComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 320, -1));

        OrdenesTrabajoComboEstado.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajoComboEstado.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajoComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "EMITIDA", "INICIADA", "EJECUTADA", "FACTURADA" }));
        OrdenesTrabajoPanel.add(OrdenesTrabajoComboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 320, -1));

        jLabel2.setText("Ejecutada por:");
        OrdenesTrabajoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jLabel6.setText("Asignada a:");
        OrdenesTrabajoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        OrdenesTrabajotxt_asignadoA.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajotxt_asignadoA.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajoPanel.add(OrdenesTrabajotxt_asignadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 320, -1));

        OrdenesTrabajotxt_Ejecutadopor.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesTrabajotxt_Ejecutadopor.setForeground(new java.awt.Color(0, 0, 0));
        OrdenesTrabajoPanel.add(OrdenesTrabajotxt_Ejecutadopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 320, -1));

        jPanel1.add(OrdenesTrabajoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 970, 220));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        OrdenesTrabajoBtnAplicarFiltro.setText("Aplicar Filtros");

        OrdenesTrabajoBtnActualizar.setText("Actualizar");

        OrdenesTrabajoBtnRestablecerFiltros.setText("Restablecer Filtros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrdenesTrabajoBtnAplicarFiltro)
                .addGap(18, 18, 18)
                .addComponent(OrdenesTrabajoBtnActualizar)
                .addGap(18, 18, 18)
                .addComponent(OrdenesTrabajoBtnRestablecerFiltros)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrdenesTrabajoBtnAplicarFiltro)
                    .addComponent(OrdenesTrabajoBtnActualizar)
                    .addComponent(OrdenesTrabajoBtnRestablecerFiltros))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 970, 50));

        OrdenesTrabajoTabla_General.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Centro de Costos", "Cedula", "Cliente", "Contrato", "Fecha", "Tipo", "Estado", "Asignada a", "Ejecutada por", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(OrdenesTrabajoTabla_General);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 970, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrdenesTrabajoBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenesTrabajoBtnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrdenesTrabajoBtnEditarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
//            java.util.logging.Logger.getLogger(OrdenesTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OrdenesTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OrdenesTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OrdenesTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrdenesTrabajo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrdenesTrabajoBtnActualizar;
    private javax.swing.JButton OrdenesTrabajoBtnAnular;
    private javax.swing.JButton OrdenesTrabajoBtnAplicarFiltro;
    private javax.swing.JButton OrdenesTrabajoBtnEditar;
    private javax.swing.JButton OrdenesTrabajoBtnNuevo;
    private javax.swing.JButton OrdenesTrabajoBtnRestablecerFiltros;
    private javax.swing.JButton OrdenesTrabajoBtnSolicitudServicio;
    private javax.swing.JComboBox<String> OrdenesTrabajoComboEstado;
    private com.toedter.calendar.JDateChooser OrdenesTrabajoComboFechaDesde;
    private com.toedter.calendar.JDateChooser OrdenesTrabajoComboFechaHasta;
    private javax.swing.JComboBox<String> OrdenesTrabajoComboTipo;
    private javax.swing.JPanel OrdenesTrabajoPanel;
    private javax.swing.JTable OrdenesTrabajoTabla_General;
    private com.toedter.calendar.JDateChooser OrdenesTrabajocombofecha;
    private javax.swing.JPanel OrdenesTrabajopanelfecha;
    private javax.swing.JTextField OrdenesTrabajotxt_Ejecutadopor;
    private javax.swing.JTextField OrdenesTrabajotxt_asignadoA;
    private javax.swing.JTextField OrdenesTrabajotxt_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
