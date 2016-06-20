

package pe.egcc.sueldoaapp.view;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.sueldoaapp.controller.SueldoController;
import pe.egcc.sueldoaapp.dto.SueldoDto;



public class Docente extends javax.swing.JPanel {

    private SueldoController controller;
    public Docente() {
        initComponents();
      
        controller = new SueldoController();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_horas = new javax.swing.JTextField();
        btn_procesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_docente = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Docente"));
        setPreferredSize(new java.awt.Dimension(400, 250));

        jLabel1.setText("Horas: ");

        btn_procesar.setBackground(new java.awt.Color(255, 255, 255));
        btn_procesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/sueldoaapp/imagen/clouddiscovery-procesamiento-rapido_1.png"))); // NOI18N
        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        tbl_docente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
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
        jScrollPane1.setViewportView(tbl_docente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_procesar)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_procesar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        
        
        
        try 
        {
                   if("".equals(txt_horas.getText()))
        {
            
     JOptionPane.showMessageDialog(null, "Coloque las horas dictadas.");
            
     
     
        }
         
        {
              String tipo = SueldoView.cbo_tipos.getSelectedItem().toString();
        double total = Double.parseDouble(txt_horas.getText());
                   //proceso
            SueldoDto[] rpta = controller.ProcesarSeleccion(tipo, total);
            //resultado
            DefaultTableModel tabla;
            tabla = (DefaultTableModel) tbl_docente.getModel();
            tabla.setRowCount(0);
            for(SueldoDto dto: rpta)
            {
                Object[] rowData = {dto.getNombre(),dto.getValor()};
                tabla.addRow(rowData);
                
            }
        }
        }
        
        catch (Exception e)
        
        {
            
        }
        

       
    }//GEN-LAST:event_btn_procesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_docente;
    private javax.swing.JTextField txt_horas;
    // End of variables declaration//GEN-END:variables
}
