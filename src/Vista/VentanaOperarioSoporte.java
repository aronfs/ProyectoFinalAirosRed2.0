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
public class VentanaOperarioSoporte extends javax.swing.JFrame {

    /**
     * Creates new form VentanaOperarioSoporte
     */
    public VentanaOperarioSoporte() {
        initComponents();
    }

    public JButton getVentanaOperarioSoporte_BntActualizar() {
        return VentanaOperarioSoporte_BntActualizar;
    }

    public void setVentanaOperarioSoporte_BntActualizar(JButton VentanaOperarioSoporte_BntActualizar) {
        this.VentanaOperarioSoporte_BntActualizar = VentanaOperarioSoporte_BntActualizar;
    }

    public JButton getVentanaOperarioSoporte_BntAplicarFiltro() {
        return VentanaOperarioSoporte_BntAplicarFiltro;
    }

    public void setVentanaOperarioSoporte_BntAplicarFiltro(JButton VentanaOperarioSoporte_BntAplicarFiltro) {
        this.VentanaOperarioSoporte_BntAplicarFiltro = VentanaOperarioSoporte_BntAplicarFiltro;
    }

    public JButton getVentanaOperarioSoporte_BntNuevo() {
        return VentanaOperarioSoporte_BntNuevo;
    }

    public void setVentanaOperarioSoporte_BntNuevo(JButton VentanaOperarioSoporte_BntNuevo) {
        this.VentanaOperarioSoporte_BntNuevo = VentanaOperarioSoporte_BntNuevo;
    }

    public JButton getVentanaOperarioSoporte_BntRestablecerFiltro() {
        return VentanaOperarioSoporte_BntRestablecerFiltro;
    }

    public void setVentanaOperarioSoporte_BntRestablecerFiltro(JButton VentanaOperarioSoporte_BntRestablecerFiltro) {
        this.VentanaOperarioSoporte_BntRestablecerFiltro = VentanaOperarioSoporte_BntRestablecerFiltro;
    }

    public JComboBox<String> getVentanaOperarioSoporte_ComboTipo() {
        return VentanaOperarioSoporte_ComboTipo;
    }

    public void setVentanaOperarioSoporte_ComboTipo(JComboBox<String> VentanaOperarioSoporte_ComboTipo) {
        this.VentanaOperarioSoporte_ComboTipo = VentanaOperarioSoporte_ComboTipo;
    }

    public JComboBox<String> getVentanaOperarioSoporte_Combo_Activo() {
        return VentanaOperarioSoporte_Combo_Activo;
    }

    public void setVentanaOperarioSoporte_Combo_Activo(JComboBox<String> VentanaOperarioSoporte_Combo_Activo) {
        this.VentanaOperarioSoporte_Combo_Activo = VentanaOperarioSoporte_Combo_Activo;
    }

    public JPanel getVentanaOperarioSoporte_PanelFltro() {
        return VentanaOperarioSoporte_PanelFltro;
    }

    public void setVentanaOperarioSoporte_PanelFltro(JPanel VentanaOperarioSoporte_PanelFltro) {
        this.VentanaOperarioSoporte_PanelFltro = VentanaOperarioSoporte_PanelFltro;
    }

    public JPanel getVentanaOperarioSoporte_PanelNuevo() {
        return VentanaOperarioSoporte_PanelNuevo;
    }

    public void setVentanaOperarioSoporte_PanelNuevo(JPanel VentanaOperarioSoporte_PanelNuevo) {
        this.VentanaOperarioSoporte_PanelNuevo = VentanaOperarioSoporte_PanelNuevo;
    }

    public JPanel getVentanaOperarioSoporte_PanelOperarios() {
        return VentanaOperarioSoporte_PanelOperarios;
    }

    public void setVentanaOperarioSoporte_PanelOperarios(JPanel VentanaOperarioSoporte_PanelOperarios) {
        this.VentanaOperarioSoporte_PanelOperarios = VentanaOperarioSoporte_PanelOperarios;
    }

    public JTable getVentanaOperarioSoporte_TablaGeneral() {
        return VentanaOperarioSoporte_TablaGeneral;
    }

    public void setVentanaOperarioSoporte_TablaGeneral(JTable VentanaOperarioSoporte_TablaGeneral) {
        this.VentanaOperarioSoporte_TablaGeneral = VentanaOperarioSoporte_TablaGeneral;
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
        VentanaOperarioSoporte_PanelNuevo = new javax.swing.JPanel();
        VentanaOperarioSoporte_BntNuevo = new javax.swing.JButton();
        VentanaOperarioSoporte_PanelOperarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VentanaOperarioSoporte_ComboTipo = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        VentanaOperarioSoporte_Combo_Activo = new javax.swing.JComboBox<String>();
        VentanaOperarioSoporte_PanelFltro = new javax.swing.JPanel();
        VentanaOperarioSoporte_BntAplicarFiltro = new javax.swing.JButton();
        VentanaOperarioSoporte_BntActualizar = new javax.swing.JButton();
        VentanaOperarioSoporte_BntRestablecerFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaOperarioSoporte_TablaGeneral = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaOperarioSoporte_PanelNuevo.setBackground(new java.awt.Color(0, 153, 51));

        VentanaOperarioSoporte_BntNuevo.setBackground(new java.awt.Color(0, 204, 51));
        VentanaOperarioSoporte_BntNuevo.setForeground(new java.awt.Color(255, 255, 255));
        VentanaOperarioSoporte_BntNuevo.setText("Nuevo");

        javax.swing.GroupLayout VentanaOperarioSoporte_PanelNuevoLayout = new javax.swing.GroupLayout(VentanaOperarioSoporte_PanelNuevo);
        VentanaOperarioSoporte_PanelNuevo.setLayout(VentanaOperarioSoporte_PanelNuevoLayout);
        VentanaOperarioSoporte_PanelNuevoLayout.setHorizontalGroup(
            VentanaOperarioSoporte_PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaOperarioSoporte_PanelNuevoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(VentanaOperarioSoporte_BntNuevo)
                .addContainerGap(888, Short.MAX_VALUE))
        );
        VentanaOperarioSoporte_PanelNuevoLayout.setVerticalGroup(
            VentanaOperarioSoporte_PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaOperarioSoporte_PanelNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentanaOperarioSoporte_BntNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(VentanaOperarioSoporte_PanelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 40));

        VentanaOperarioSoporte_PanelOperarios.setBackground(new java.awt.Color(255, 255, 255));
        VentanaOperarioSoporte_PanelOperarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Operarios de Soporte"));

        jLabel1.setText("Tipo:");

        VentanaOperarioSoporte_ComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "OPERARIO", "SUPERVISOR" }));

        jLabel2.setText(" Activo(a): ");

        VentanaOperarioSoporte_Combo_Activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONE", "SI", "NO" }));

        javax.swing.GroupLayout VentanaOperarioSoporte_PanelOperariosLayout = new javax.swing.GroupLayout(VentanaOperarioSoporte_PanelOperarios);
        VentanaOperarioSoporte_PanelOperarios.setLayout(VentanaOperarioSoporte_PanelOperariosLayout);
        VentanaOperarioSoporte_PanelOperariosLayout.setHorizontalGroup(
            VentanaOperarioSoporte_PanelOperariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaOperarioSoporte_PanelOperariosLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaOperarioSoporte_ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaOperarioSoporte_Combo_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        VentanaOperarioSoporte_PanelOperariosLayout.setVerticalGroup(
            VentanaOperarioSoporte_PanelOperariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaOperarioSoporte_PanelOperariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaOperarioSoporte_PanelOperariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaOperarioSoporte_PanelOperariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(VentanaOperarioSoporte_Combo_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaOperarioSoporte_PanelOperariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(VentanaOperarioSoporte_ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(VentanaOperarioSoporte_PanelOperarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 980, 60));

        VentanaOperarioSoporte_PanelFltro.setBackground(new java.awt.Color(0, 153, 51));

        VentanaOperarioSoporte_BntAplicarFiltro.setBackground(new java.awt.Color(0, 204, 51));
        VentanaOperarioSoporte_BntAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaOperarioSoporte_BntAplicarFiltro.setText("Aplicar Filtros");

        VentanaOperarioSoporte_BntActualizar.setBackground(new java.awt.Color(0, 204, 51));
        VentanaOperarioSoporte_BntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaOperarioSoporte_BntActualizar.setText("Actualizar");

        VentanaOperarioSoporte_BntRestablecerFiltro.setBackground(new java.awt.Color(0, 204, 51));
        VentanaOperarioSoporte_BntRestablecerFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaOperarioSoporte_BntRestablecerFiltro.setText("Restablecer Filtros");

        javax.swing.GroupLayout VentanaOperarioSoporte_PanelFltroLayout = new javax.swing.GroupLayout(VentanaOperarioSoporte_PanelFltro);
        VentanaOperarioSoporte_PanelFltro.setLayout(VentanaOperarioSoporte_PanelFltroLayout);
        VentanaOperarioSoporte_PanelFltroLayout.setHorizontalGroup(
            VentanaOperarioSoporte_PanelFltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaOperarioSoporte_PanelFltroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(VentanaOperarioSoporte_BntAplicarFiltro)
                .addGap(18, 18, 18)
                .addComponent(VentanaOperarioSoporte_BntActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaOperarioSoporte_BntRestablecerFiltro)
                .addContainerGap(621, Short.MAX_VALUE))
        );
        VentanaOperarioSoporte_PanelFltroLayout.setVerticalGroup(
            VentanaOperarioSoporte_PanelFltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaOperarioSoporte_PanelFltroLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(VentanaOperarioSoporte_PanelFltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaOperarioSoporte_BntAplicarFiltro)
                    .addComponent(VentanaOperarioSoporte_BntActualizar)
                    .addComponent(VentanaOperarioSoporte_BntRestablecerFiltro))
                .addContainerGap())
        );

        jPanel1.add(VentanaOperarioSoporte_PanelFltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 970, 50));

        VentanaOperarioSoporte_TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Activo", "Nombre Usuario", "Creado por", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(VentanaOperarioSoporte_TablaGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 960, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
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
//            java.util.logging.Logger.getLogger(VentanaOperarioSoporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaOperarioSoporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaOperarioSoporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaOperarioSoporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaOperarioSoporte().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VentanaOperarioSoporte_BntActualizar;
    private javax.swing.JButton VentanaOperarioSoporte_BntAplicarFiltro;
    private javax.swing.JButton VentanaOperarioSoporte_BntNuevo;
    private javax.swing.JButton VentanaOperarioSoporte_BntRestablecerFiltro;
    private javax.swing.JComboBox<String> VentanaOperarioSoporte_ComboTipo;
    private javax.swing.JComboBox<String> VentanaOperarioSoporte_Combo_Activo;
    private javax.swing.JPanel VentanaOperarioSoporte_PanelFltro;
    private javax.swing.JPanel VentanaOperarioSoporte_PanelNuevo;
    private javax.swing.JPanel VentanaOperarioSoporte_PanelOperarios;
    private javax.swing.JTable VentanaOperarioSoporte_TablaGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
