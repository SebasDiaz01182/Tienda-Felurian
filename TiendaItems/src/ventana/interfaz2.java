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
public class interfaz2 extends javax.swing.JFrame {

    /**
     * Creates new form interfaz2
     */
    public interfaz2() {
        initComponents();
        this.setLocationRelativeTo(null);
        interfaz nombreRecuperar=new interfaz();
        nombrePersonaje=nombreRecuperar.nombreIngresado;
        jLabelNombreH.setText("¡Bienvenido "+nombrePersonaje+"!");
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegresar = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonComprar = new javax.swing.JButton();
        jLabelFraseV = new javax.swing.JLabel();
        jLabelFraseC = new javax.swing.JLabel();
        jLabelQuote = new javax.swing.JLabel();
        jLabelNombreH = new javax.swing.JLabel();
        jLabelQuote2 = new javax.swing.JLabel();
        jLabelStatVida = new javax.swing.JLabel();
        jLabelStatFuerza = new javax.swing.JLabel();
        jLabelStatsAtaque = new javax.swing.JLabel();
        jLabelStatDefensa = new javax.swing.JLabel();
        jLabelStatFortuna = new javax.swing.JLabel();
        jLabelSalud = new javax.swing.JLabel();
        jLabelFuerza = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelDefensa = new javax.swing.JLabel();
        jLabelFortuna = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegresar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonRegresar.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseClicked(evt);
            }
        });
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButtonExit.setBackground(new java.awt.Color(102, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 100, 30));

        jButtonVender.setBackground(new java.awt.Color(102, 0, 0));
        jButtonVender.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVender.setText("Vender ");
        jButtonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVenderMouseClicked(evt);
            }
        });
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 120, -1));

        jButtonComprar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonComprar.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprar.setText("Comprar");
        jButtonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonComprarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, 120, 30));

        jLabelFraseV.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFraseV.setText("Listo para desechar esa vieja armadura!");
        getContentPane().add(jLabelFraseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 380, 30));

        jLabelFraseC.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFraseC.setText("Necesitas nuevo equipo para vencer!");
        getContentPane().add(jLabelFraseC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, -1, -1));

        jLabelQuote.setFont(new java.awt.Font("Harrington", 3, 15)); // NOI18N
        jLabelQuote.setForeground(new java.awt.Color(255, 204, 102));
        jLabelQuote.setText("\"Los guerreros quieren un oponente digno. ");
        getContentPane().add(jLabelQuote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 30));

        jLabelNombreH.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelNombreH.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreH.setText("jLabel5");
        getContentPane().add(jLabelNombreH, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 420, -1));

        jLabelQuote2.setFont(new java.awt.Font("Harrington", 3, 15)); // NOI18N
        jLabelQuote2.setForeground(new java.awt.Color(255, 204, 102));
        jLabelQuote2.setText("No hay satisfaccion en luchar con lo patético\"");
        getContentPane().add(jLabelQuote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabelStatVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CorazonFn2.png"))); // NOI18N
        jLabelStatVida.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 50, -1));

        jLabelStatFuerza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puño.jpg"))); // NOI18N
        jLabelStatFuerza.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jLabelStatFuerza.setMaximumSize(new java.awt.Dimension(41, 37));
        jLabelStatFuerza.setMinimumSize(new java.awt.Dimension(41, 37));
        jLabelStatFuerza.setPreferredSize(new java.awt.Dimension(41, 37));
        getContentPane().add(jLabelStatFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 50, 50));

        jLabelStatsAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Espadafin.png"))); // NOI18N
        jLabelStatsAtaque.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jLabelStatsAtaque.setPreferredSize(new java.awt.Dimension(43, 40));
        getContentPane().add(jLabelStatsAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 50, 50));

        jLabelStatDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Armadura.png"))); // NOI18N
        jLabelStatDefensa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, 50));

        jLabelStatFortuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Amuleto_1.png"))); // NOI18N
        jLabelStatFortuna.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jLabelSalud.setBackground(new java.awt.Color(153, 153, 153));
        jLabelSalud.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelSalud.setForeground(new java.awt.Color(255, 255, 102));
        jLabelSalud.setText("Salud: 100");
        getContentPane().add(jLabelSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));

        jLabelFuerza.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelFuerza.setForeground(new java.awt.Color(255, 255, 102));
        jLabelFuerza.setText("Fuerza: 60");
        getContentPane().add(jLabelFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 170, 30));

        jLabelAtaque.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelAtaque.setForeground(new java.awt.Color(255, 255, 102));
        jLabelAtaque.setText("Ataque: 50");
        getContentPane().add(jLabelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 160, 30));

        jLabelDefensa.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelDefensa.setForeground(new java.awt.Color(255, 255, 102));
        jLabelDefensa.setText("Defensa: 30");
        getContentPane().add(jLabelDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 160, 30));

        jLabelFortuna.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelFortuna.setForeground(new java.awt.Color(255, 255, 102));
        jLabelFortuna.setText("Fortuna: 10");
        getContentPane().add(jLabelFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 150, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuarto de armas.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
 interfaz cambio2= new interfaz();
 cambio2.setVisible(true);
 this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVenderMouseClicked
Tienda cambio3=new Tienda();
cambio3.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButtonVenderMouseClicked

    private void jButtonComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonComprarMouseClicked
Tienda cambio3=new Tienda();
cambio3.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButtonComprarMouseClicked

    public void cmabiarStatSalud(String cantidad){
        jLabelSalud.setText("Salud: "+cantidad);
    }
    
    public void cmabiarStatFuerza(String cantidad){
        jLabelFuerza.setText("Fuerza: "+cantidad);
    }
    
    public void cmabiarStatAtaque(String cantidad){
        jLabelAtaque.setText("Ataque: "+cantidad);
    }
    
    public void cmabiarStatDefensa(String cantidad){
        jLabelDefensa.setText("Defensa: "+cantidad);
    }
    
    public void cmabiarStatFortuna(String cantidad){
        jLabelFortuna.setText("Fortuna: "+cantidad);
    }
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
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelAtaque;
    private javax.swing.JLabel jLabelDefensa;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFortuna;
    private javax.swing.JLabel jLabelFraseC;
    private javax.swing.JLabel jLabelFraseV;
    private javax.swing.JLabel jLabelFuerza;
    private javax.swing.JLabel jLabelNombreH;
    private javax.swing.JLabel jLabelQuote;
    private javax.swing.JLabel jLabelQuote2;
    private javax.swing.JLabel jLabelSalud;
    private javax.swing.JLabel jLabelStatDefensa;
    private javax.swing.JLabel jLabelStatFortuna;
    private javax.swing.JLabel jLabelStatFuerza;
    private javax.swing.JLabel jLabelStatVida;
    private javax.swing.JLabel jLabelStatsAtaque;
    // End of variables declaration//GEN-END:variables
    public String nombrePersonaje="";
}
