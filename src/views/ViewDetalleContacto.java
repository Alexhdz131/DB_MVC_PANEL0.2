
package views;


public class ViewDetalleContacto extends javax.swing.JPanel {

    
    public ViewDetalleContacto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jl_detalles = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jl_nombre.setFont(new java.awt.Font("Agency FB", 0, 16)); // NOI18N
        jl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nombre.setText("Nombre");

        jl_email.setFont(new java.awt.Font("Agency FB", 0, 16)); // NOI18N
        jl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_email.setText("Email");

        jl_detalles.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jl_detalles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_detalles.setText("Detalles");
        jl_detalles.setToolTipText("");

        jl_telefono.setFont(new java.awt.Font("Agency FB", 0, 16)); // NOI18N
        jl_telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_telefono.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jl_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addComponent(jl_detalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jl_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_detalles;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_telefono;
    // End of variables declaration//GEN-END:variables
}
