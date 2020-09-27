/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author DELL
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public static String nombreIngresado="";
   
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabel1Bienvenido = new javax.swing.JLabel();
        ingresarNombre = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        botonHeroe = new javax.swing.JButton();
        botonVillano = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelNombre.setText("Ingrese un nombre para el personaje:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 40));

        jLabel1Bienvenido.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel1Bienvenido.setText("¡Bienvenido a la Tienda Felurian !");
        getContentPane().add(jLabel1Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 400, 30));

        ingresarNombre.setBackground(new java.awt.Color(255, 255, 204));
        ingresarNombre.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        ingresarNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 102)));
        ingresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 330, 30));

        jButtonExit.setBackground(new java.awt.Color(255, 255, 204));
        jButtonExit.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonExit.setText("Salir");
        jButtonExit.setBorder(null);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 80, 30));

        botonHeroe.setBackground(new java.awt.Color(255, 255, 204));
        botonHeroe.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        botonHeroe.setText("Inicia una nueva aventura como héroe");
        botonHeroe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonHeroeMouseClicked(evt);
            }
        });
        botonHeroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHeroeActionPerformed(evt);
            }
        });
        getContentPane().add(botonHeroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 330, 30));

        botonVillano.setBackground(new java.awt.Color(255, 255, 204));
        botonVillano.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        botonVillano.setText("Listo para sembrar el caos en la villa");
        botonVillano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVillanoMouseClicked(evt);
            }
        });
        getContentPane().add(botonVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 330, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KvotheWallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void ingresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ingresarNombreActionPerformed

    private void botonHeroeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeroeMouseClicked
//Validar para que solo pase a otra ventana si ingresa un nombre para el personaje

    nombreIngresado= ingresarNombre.getText();
if (nombreIngresado.equals("")){
    ingresarNombre.setText("Debe de ingresar un nombre.");
}
else{
    interfaz2 cambio= new interfaz2();
    cambio.setVisible(true);
    this.dispose();
}
// TODO add your handling code here:
    }//GEN-LAST:event_botonHeroeMouseClicked

    private void botonHeroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHeroeActionPerformed
        // TODO add your handling code here:
        //interfaz2.txtBienvenido.setText(jTextFieldUser.getText());
    }//GEN-LAST:event_botonHeroeActionPerformed

    private void botonVillanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVillanoMouseClicked

    nombreIngresado= ingresarNombre.getText();
    if (nombreIngresado.equals("")){
        ingresarNombre.setText("Debe de ingresar un nombre.");
    }
    else{
    Villano cambio1= new Villano();
    cambio1.setVisible(true);
    this.dispose();
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_botonVillanoMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonHeroe;
    private javax.swing.JButton botonVillano;
    private javax.swing.JTextField ingresarNombre;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1Bienvenido;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
    
}
