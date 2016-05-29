
package pe.egcc.sueldoaapp.view;

import java.awt.Color;
import pe.egcc.sueldoaapp.controller.SueldoController;


public class SueldoView extends javax.swing.JFrame {

    private SueldoController controller;
   
     private void Seleccion(javax.swing.JPanel Panel)
    {   
        
   
     
       Panel_trabajadores.removeAll();
       Panel.setSize(Panel.getPreferredSize());
       Panel.setOpaque(false);
       Panel_trabajadores.add(Panel);
       Panel_trabajadores.updateUI();
       
       
    
             
    }  
     

     
     
     
      Empleado emp = new Empleado();
      Docente doc = new Docente();
    public SueldoView() {
        
        
        initComponents();
       
        setLocationRelativeTo(null);
        
        controller = new SueldoController();
        LlenarCombo();
        Seleccion(emp);
      
      
        
    }
    
   
    
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Opciones = new javax.swing.JPanel();
        cbo_tipos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Panel_trabajadores = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sueldo Edutec");
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(630, 300));
        setResizable(false);

        Panel_Opciones.setBackground(new java.awt.Color(0, 153, 153));
        Panel_Opciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbo_tipos.setBackground(new java.awt.Color(0, 102, 102));
        cbo_tipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_tipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_tiposItemStateChanged(evt);
            }
        });
        cbo_tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tiposActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIPO DE TRABAJADOR");

        javax.swing.GroupLayout Panel_OpcionesLayout = new javax.swing.GroupLayout(Panel_Opciones);
        Panel_Opciones.setLayout(Panel_OpcionesLayout);
        Panel_OpcionesLayout.setHorizontalGroup(
            Panel_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbo_tipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_OpcionesLayout.setVerticalGroup(
            Panel_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        Panel_trabajadores.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout Panel_trabajadoresLayout = new javax.swing.GroupLayout(Panel_trabajadores);
        Panel_trabajadores.setLayout(Panel_trabajadoresLayout);
        Panel_trabajadoresLayout.setHorizontalGroup(
            Panel_trabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        Panel_trabajadoresLayout.setVerticalGroup(
            Panel_trabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_trabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_tiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tiposActionPerformed
         int select=cbo_tipos.getSelectedIndex();
       switch (select)
       {
           case 0:
               Seleccion(emp);
               break;
           case 1:
               Seleccion(emp);
               break;
           case 2:
               Seleccion(emp);
               break;
           case 3:
               Seleccion(doc);
               
       }
    }//GEN-LAST:event_cbo_tiposActionPerformed

    private void cbo_tiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_tiposItemStateChanged
  
    }//GEN-LAST:event_cbo_tiposItemStateChanged

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
            java.util.logging.Logger.getLogger(SueldoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SueldoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SueldoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SueldoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SueldoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Opciones;
    private javax.swing.JPanel Panel_trabajadores;
    public static javax.swing.JComboBox cbo_tipos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void LlenarCombo()
    {
        cbo_tipos.removeAllItems();
        for(String tipo : controller.getTipos())
        {
            cbo_tipos.addItem(tipo);
        }
        cbo_tipos.setSelectedIndex(0);
    }
    
    
    

}
