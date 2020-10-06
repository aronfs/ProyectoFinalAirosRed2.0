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

/**
 *
 * @author aaron
 */
public class VentanaItems extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaItems
     */
    public VentanaItems() {
        initComponents();
    }

    public JPanel getVentanaFacturasPanelBntNuevos() {
        return VentanaFacturasPanelBntNuevos;
    }

    public void setVentanaFacturasPanelBntNuevos(JPanel VentanaFacturasPanelBntNuevos) {
        this.VentanaFacturasPanelBntNuevos = VentanaFacturasPanelBntNuevos;
    }

    public JPanel getVentanaItemsPanelGeneral() {
        return VentanaItemsPanelGeneral;
    }

    public void setVentanaItemsPanelGeneral(JPanel VentanaItemsPanelGeneral) {
        this.VentanaItemsPanelGeneral = VentanaItemsPanelGeneral;
    }

    public JButton getVentanaItems_BntActualizar() {
        return VentanaItems_BntActualizar;
    }

    public void setVentanaItems_BntActualizar(JButton VentanaItems_BntActualizar) {
        this.VentanaItems_BntActualizar = VentanaItems_BntActualizar;
    }

    public JButton getVentanaItems_BntAnular() {
        return VentanaItems_BntAnular;
    }

    public void setVentanaItems_BntAnular(JButton VentanaItems_BntAnular) {
        this.VentanaItems_BntAnular = VentanaItems_BntAnular;
    }

    public JButton getVentanaItems_BntAplicarFiltro() {
        return VentanaItems_BntAplicarFiltro;
    }

    public void setVentanaItems_BntAplicarFiltro(JButton VentanaItems_BntAplicarFiltro) {
        this.VentanaItems_BntAplicarFiltro = VentanaItems_BntAplicarFiltro;
    }

    public JButton getVentanaItems_BntEditar() {
        return VentanaItems_BntEditar;
    }

    public void setVentanaItems_BntEditar(JButton VentanaItems_BntEditar) {
        this.VentanaItems_BntEditar = VentanaItems_BntEditar;
    }

    public JButton getVentanaItems_BntNuevo() {
        return VentanaItems_BntNuevo;
    }

    public void setVentanaItems_BntNuevo(JButton VentanaItems_BntNuevo) {
        this.VentanaItems_BntNuevo = VentanaItems_BntNuevo;
    }

    public JButton getVentanaItems_BntRestablecerFiltros() {
        return VentanaItems_BntRestablecerFiltros;
    }

    public void setVentanaItems_BntRestablecerFiltros(JButton VentanaItems_BntRestablecerFiltros) {
        this.VentanaItems_BntRestablecerFiltros = VentanaItems_BntRestablecerFiltros;
    }

    public JComboBox<String> getVentanaItems_ComboActivo() {
        return VentanaItems_ComboActivo;
    }

    public void setVentanaItems_ComboActivo(JComboBox<String> VentanaItems_ComboActivo) {
        this.VentanaItems_ComboActivo = VentanaItems_ComboActivo;
    }

    public JComboBox<String> getVentanaItems_ComboControlSeries() {
        return VentanaItems_ComboControlSeries;
    }

    public void setVentanaItems_ComboControlSeries(JComboBox<String> VentanaItems_ComboControlSeries) {
        this.VentanaItems_ComboControlSeries = VentanaItems_ComboControlSeries;
    }

    public JComboBox<String> getVentanaItems_ComboGrupo() {
        return VentanaItems_ComboGrupo;
    }

    public void setVentanaItems_ComboGrupo(JComboBox<String> VentanaItems_ComboGrupo) {
        this.VentanaItems_ComboGrupo = VentanaItems_ComboGrupo;
    }

    public JComboBox<String> getVentanaItems_ComboIva() {
        return VentanaItems_ComboIva;
    }

    public void setVentanaItems_ComboIva(JComboBox<String> VentanaItems_ComboIva) {
        this.VentanaItems_ComboIva = VentanaItems_ComboIva;
    }

    public JComboBox<String> getVentanaItems_ComboMarca() {
        return VentanaItems_ComboMarca;
    }

    public void setVentanaItems_ComboMarca(JComboBox<String> VentanaItems_ComboMarca) {
        this.VentanaItems_ComboMarca = VentanaItems_ComboMarca;
    }

    public JComboBox<String> getVentanaItems_ComboServicio() {
        return VentanaItems_ComboServicio;
    }

    public void setVentanaItems_ComboServicio(JComboBox<String> VentanaItems_ComboServicio) {
        this.VentanaItems_ComboServicio = VentanaItems_ComboServicio;
    }

    public JComboBox<String> getVentanaItems_ComboTipo() {
        return VentanaItems_ComboTipo;
    }

    public void setVentanaItems_ComboTipo(JComboBox<String> VentanaItems_ComboTipo) {
        this.VentanaItems_ComboTipo = VentanaItems_ComboTipo;
    }

    public JPanel getVentanaItems_PanelBotonFiltros() {
        return VentanaItems_PanelBotonFiltros;
    }

    public void setVentanaItems_PanelBotonFiltros(JPanel VentanaItems_PanelBotonFiltros) {
        this.VentanaItems_PanelBotonFiltros = VentanaItems_PanelBotonFiltros;
    }

    public JPanel getVentanaItems_PanelItem() {
        return VentanaItems_PanelItem;
    }

    public void setVentanaItems_PanelItem(JPanel VentanaItems_PanelItem) {
        this.VentanaItems_PanelItem = VentanaItems_PanelItem;
    }

    public JTable getVentanaItems_TablaGeneral() {
        return VentanaItems_TablaGeneral;
    }

    public void setVentanaItems_TablaGeneral(JTable VentanaItems_TablaGeneral) {
        this.VentanaItems_TablaGeneral = VentanaItems_TablaGeneral;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaItemsPanelGeneral = new javax.swing.JPanel();
        VentanaFacturasPanelBntNuevos = new javax.swing.JPanel();
        VentanaItems_BntNuevo = new javax.swing.JButton();
        VentanaItems_BntEditar = new javax.swing.JButton();
        VentanaItems_BntAnular = new javax.swing.JButton();
        VentanaItems_PanelItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VentanaItems_ComboActivo = new javax.swing.JComboBox<>();
        VentanaItems_ComboControlSeries = new javax.swing.JComboBox<>();
        VentanaItems_ComboMarca = new javax.swing.JComboBox<>();
        VentanaItems_ComboGrupo = new javax.swing.JComboBox<>();
        VentanaItems_ComboIva = new javax.swing.JComboBox<>();
        VentanaItems_ComboTipo = new javax.swing.JComboBox<>();
        VentanaItems_ComboServicio = new javax.swing.JComboBox<>();
        VentanaItems_PanelBotonFiltros = new javax.swing.JPanel();
        VentanaItems_BntAplicarFiltro = new javax.swing.JButton();
        VentanaItems_BntActualizar = new javax.swing.JButton();
        VentanaItems_BntRestablecerFiltros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaItems_TablaGeneral = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        VentanaItemsPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        VentanaItemsPanelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaFacturasPanelBntNuevos.setBackground(new java.awt.Color(0, 153, 51));

        VentanaItems_BntNuevo.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntNuevo.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntNuevo.setText("Nuevo");

        VentanaItems_BntEditar.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntEditar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntEditar.setText("Editar");

        VentanaItems_BntAnular.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntAnular.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntAnular.setText("Anular");

        javax.swing.GroupLayout VentanaFacturasPanelBntNuevosLayout = new javax.swing.GroupLayout(VentanaFacturasPanelBntNuevos);
        VentanaFacturasPanelBntNuevos.setLayout(VentanaFacturasPanelBntNuevosLayout);
        VentanaFacturasPanelBntNuevosLayout.setHorizontalGroup(
            VentanaFacturasPanelBntNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaFacturasPanelBntNuevosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(VentanaItems_BntNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaItems_BntEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaItems_BntAnular)
                .addContainerGap(724, Short.MAX_VALUE))
        );
        VentanaFacturasPanelBntNuevosLayout.setVerticalGroup(
            VentanaFacturasPanelBntNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaFacturasPanelBntNuevosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaFacturasPanelBntNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaItems_BntNuevo)
                    .addComponent(VentanaItems_BntEditar)
                    .addComponent(VentanaItems_BntAnular))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        VentanaItemsPanelGeneral.add(VentanaFacturasPanelBntNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 980, -1));

        VentanaItems_PanelItem.setBackground(new java.awt.Color(255, 255, 255));
        VentanaItems_PanelItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));
        VentanaItems_PanelItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Activo(a):");
        VentanaItems_PanelItem.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setText("Control Series:");
        VentanaItems_PanelItem.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Marca:");
        VentanaItems_PanelItem.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        jLabel4.setText("Grupo:");
        VentanaItems_PanelItem.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel5.setText("IVA:");
        VentanaItems_PanelItem.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel6.setText("Tipo:");
        VentanaItems_PanelItem.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel8.setText("Servicio:");
        VentanaItems_PanelItem.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        VentanaItems_ComboActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SI", "NO" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, -1));

        VentanaItems_ComboControlSeries.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SI", "NO" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboControlSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 120, -1));

        VentanaItems_ComboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 150, -1));

        VentanaItems_ComboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, -1));

        VentanaItems_ComboIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "APLICA IVA", "EXENTO DE IMPUESTO", "NO OBJETO DE IMPUESTO", "TARIFA 0%" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 130, -1));

        VentanaItems_ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "COMPRA", "VENTA" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 170, -1));

        VentanaItems_ComboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SI", "NO" }));
        VentanaItems_PanelItem.add(VentanaItems_ComboServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, -1));

        VentanaItemsPanelGeneral.add(VentanaItems_PanelItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 120));

        VentanaItems_PanelBotonFiltros.setBackground(new java.awt.Color(0, 153, 51));

        VentanaItems_BntAplicarFiltro.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntAplicarFiltro.setText("Aplicar Filtros");

        VentanaItems_BntActualizar.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntActualizar.setText("Actualizar");

        VentanaItems_BntRestablecerFiltros.setBackground(new java.awt.Color(0, 255, 51));
        VentanaItems_BntRestablecerFiltros.setForeground(new java.awt.Color(255, 255, 255));
        VentanaItems_BntRestablecerFiltros.setText("Restablecer Filtros");

        javax.swing.GroupLayout VentanaItems_PanelBotonFiltrosLayout = new javax.swing.GroupLayout(VentanaItems_PanelBotonFiltros);
        VentanaItems_PanelBotonFiltros.setLayout(VentanaItems_PanelBotonFiltrosLayout);
        VentanaItems_PanelBotonFiltrosLayout.setHorizontalGroup(
            VentanaItems_PanelBotonFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaItems_PanelBotonFiltrosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(VentanaItems_BntAplicarFiltro)
                .addGap(28, 28, 28)
                .addComponent(VentanaItems_BntActualizar)
                .addGap(18, 18, 18)
                .addComponent(VentanaItems_BntRestablecerFiltros)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        VentanaItems_PanelBotonFiltrosLayout.setVerticalGroup(
            VentanaItems_PanelBotonFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaItems_PanelBotonFiltrosLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(VentanaItems_PanelBotonFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaItems_BntAplicarFiltro)
                    .addComponent(VentanaItems_BntActualizar)
                    .addComponent(VentanaItems_BntRestablecerFiltros))
                .addContainerGap())
        );

        VentanaItemsPanelGeneral.add(VentanaItems_PanelBotonFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 980, 50));

        VentanaItems_TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Aplica IVA", "Precio", "Creado por", "Fecha de Creacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VentanaItems_TablaGeneral);

        VentanaItemsPanelGeneral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 980, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaItemsPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaItemsPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
//            java.util.logging.Logger.getLogger(VentanaItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaItems().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VentanaFacturasPanelBntNuevos;
    private javax.swing.JPanel VentanaItemsPanelGeneral;
    private javax.swing.JButton VentanaItems_BntActualizar;
    private javax.swing.JButton VentanaItems_BntAnular;
    private javax.swing.JButton VentanaItems_BntAplicarFiltro;
    private javax.swing.JButton VentanaItems_BntEditar;
    private javax.swing.JButton VentanaItems_BntNuevo;
    private javax.swing.JButton VentanaItems_BntRestablecerFiltros;
    private javax.swing.JComboBox<String> VentanaItems_ComboActivo;
    private javax.swing.JComboBox<String> VentanaItems_ComboControlSeries;
    private javax.swing.JComboBox<String> VentanaItems_ComboGrupo;
    private javax.swing.JComboBox<String> VentanaItems_ComboIva;
    private javax.swing.JComboBox<String> VentanaItems_ComboMarca;
    private javax.swing.JComboBox<String> VentanaItems_ComboServicio;
    private javax.swing.JComboBox<String> VentanaItems_ComboTipo;
    private javax.swing.JPanel VentanaItems_PanelBotonFiltros;
    private javax.swing.JPanel VentanaItems_PanelItem;
    private javax.swing.JTable VentanaItems_TablaGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
