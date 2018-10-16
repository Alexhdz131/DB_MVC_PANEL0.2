
package views;


public class ViewMain extends javax.swing.JFrame {

    
    public ViewMain() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_agenda = new javax.swing.JMenuItem();
        jmi_detalle_contacto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jmi_agenda.setText("Agenda");
        jMenu1.add(jmi_agenda);

        jmi_detalle_contacto.setText("Detalle Contacto");
        jmi_detalle_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_detalle_contactoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_detalle_contacto);
        jMenu1.add(jSeparator1);

        jmi_salir.setText("Salir");
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_detalle_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_detalle_contactoActionPerformed
    
    }//GEN-LAST:event_jmi_detalle_contactoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JMenuItem jmi_agenda;
    public javax.swing.JMenuItem jmi_detalle_contacto;
    public javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
