/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.sueldoaapp.view;

import javax.swing.table.DefaultTableModel;
import pe.egcc.sueldoaapp.controller.SueldoController;
import pe.egcc.sueldoaapp.dto.SueldoDto;

/**
 *
 * @author David
 */
public class Empleado extends javax.swing.JPanel {

  private SueldoController controller;
    public Empleado() {
        initComponents();
         controller = new SueldoController();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleado = new javax.swing.JTable();
        btn_procesar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        setPreferredSize(new java.awt.Dimension(400, 250));
        setVerifyInputWhenFocusTarget(false);

        tbl_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Concepto", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_empleado);

        btn_procesar.setBackground(new java.awt.Color(255, 255, 255));
        btn_procesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/sueldoaapp/imagen/clouddiscovery-procesamiento-rapido_1.png"))); // NOI18N
        btn_procesar.setText("Procesar:");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_procesar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_procesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
      String tipo = SueldoView.cbo_tipos.getSelectedItem().toString();
        double total = 0;
        //proceso
        SueldoDto[] rpta = controller.ProcesarSeleccion(tipo, total);
        //resultado
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tbl_empleado.getModel();
                tabla.setRowCount(0);
                for(SueldoDto dto: rpta)
                {
                    Object[] rowData = {dto.getNombre(),dto.getValor()};
                    tabla.addRow(rowData);
                 
                }
    }//GEN-LAST:event_btn_procesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_empleado;
    // End of variables declaration//GEN-END:variables
}
