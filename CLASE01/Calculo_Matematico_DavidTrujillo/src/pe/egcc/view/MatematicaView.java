

package pe.egcc.view;


import javax.swing.JInternalFrame;


public class MatematicaView extends javax.swing.JFrame {

    public MatematicaView() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_botones = new javax.swing.JPanel();
        btn_factorial = new javax.swing.JButton();
        btn_Fibonacci = new javax.swing.JButton();
        btn_MCM = new javax.swing.JButton();
        btn_primo = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        fac = new javax.swing.JMenuItem();
        fib = new javax.swing.JMenuItem();
        mcm = new javax.swing.JMenuItem();
        primo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_botones.setLayout(new java.awt.GridLayout(1, 4));

        btn_factorial.setText("Factorial");
        btn_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factorialActionPerformed(evt);
            }
        });
        Panel_botones.add(btn_factorial);

        btn_Fibonacci.setText("Fibonacci");
        btn_Fibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FibonacciActionPerformed(evt);
            }
        });
        Panel_botones.add(btn_Fibonacci);

        btn_MCM.setText("MCM y MDC");
        btn_MCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MCMActionPerformed(evt);
            }
        });
        Panel_botones.add(btn_MCM);

        btn_primo.setText("Primo");
        btn_primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primoActionPerformed(evt);
            }
        });
        Panel_botones.add(btn_primo);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Metodos");

        fac.setMnemonic('t');
        fac.setText("Factorial");
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });
        editMenu.add(fac);

        fib.setMnemonic('y');
        fib.setText("Fibonacci");
        fib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibActionPerformed(evt);
            }
        });
        editMenu.add(fib);

        mcm.setMnemonic('p');
        mcm.setText("MCM y MCD");
        mcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcmActionPerformed(evt);
            }
        });
        editMenu.add(mcm);

        primo.setMnemonic('d');
        primo.setText("Primo");
        primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primoActionPerformed(evt);
            }
        });
        editMenu.add(primo);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btn_factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factorialActionPerformed
        cargarFormulario(Factorial.class);
    }//GEN-LAST:event_btn_factorialActionPerformed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
       cargarFormulario(Factorial.class);
    }//GEN-LAST:event_facActionPerformed

    private void btn_FibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FibonacciActionPerformed
     cargarFormulario(Fibonacci.class);
    }//GEN-LAST:event_btn_FibonacciActionPerformed

    private void btn_MCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MCMActionPerformed
     cargarFormulario(MCM_MCM.class);
    }//GEN-LAST:event_btn_MCMActionPerformed

    private void btn_primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primoActionPerformed
     cargarFormulario(Primo.class);
    }//GEN-LAST:event_btn_primoActionPerformed

    private void fibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibActionPerformed
    cargarFormulario(Fibonacci.class);
    }//GEN-LAST:event_fibActionPerformed

    private void mcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcmActionPerformed
 cargarFormulario(MCM_MCM.class);
    }//GEN-LAST:event_mcmActionPerformed

    private void primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primoActionPerformed
cargarFormulario(Primo.class);
    }//GEN-LAST:event_primoActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(MatematicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatematicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatematicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatematicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatematicaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_botones;
    private javax.swing.JButton btn_Fibonacci;
    private javax.swing.JButton btn_MCM;
    private javax.swing.JButton btn_factorial;
    private javax.swing.JButton btn_primo;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem fac;
    private javax.swing.JMenuItem fib;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem mcm;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem primo;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario(Class<?> aClass)
    {
       
           
      
            try 
            {
                 JInternalFrame view = null;
        for(JInternalFrame frame : desktopPane.getAllFrames())
        {
            if(aClass.isInstance(frame))
            {
                view = frame;
                break;
            }
        }
        
        //crear la instancia
        if(view == null)
        {
            view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
            desktopPane.add(view);
        }
        //Hacerlo visible
        view.setVisible(true);
        view.setSelected(true);
            } 
            catch (Exception e) 
            {
                
            }
            
       
    }   
    
    
}
