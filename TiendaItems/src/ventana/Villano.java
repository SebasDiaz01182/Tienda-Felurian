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
public class Villano extends javax.swing.JFrame {

    /**
     * Creates new form Villano
     */
    public Villano() {
        initComponents();
        this.setLocationRelativeTo(null);
        interfaz nombreRecuperar=new interfaz();
        nombreVillano=nombreRecuperar.nombreIngresado;
        jLabelNombre.setText("¡Bienvenido "+nombreVillano+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFondo = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jLabelFraseComp = new javax.swing.JLabel();
        jLabelFraseVend = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelStatFortuna = new javax.swing.JLabel();
        jLabelStatDefensa = new javax.swing.JLabel();
        jLabelStatAtaque = new javax.swing.JLabel();
        jLabelStatVida = new javax.swing.JLabel();
        jLabelStatFuerza = new javax.swing.JLabel();
        jLabelSalud = new javax.swing.JLabel();
        jLabelFuerza = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelDefensa = new javax.swing.JLabel();
        jLabelFortuna = new javax.swing.JLabel();
        jLabelRupias = new javax.swing.JLabel();
        jLabelFondoVillano = new javax.swing.JLabel();

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dragon.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(102, 102, 102));
        jButtonExit.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 90, 30));

        botonRegresar.setBackground(new java.awt.Color(102, 102, 102));
        botonRegresar.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jButtonVender.setBackground(new java.awt.Color(51, 51, 51));
        jButtonVender.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVender.setText("Tienda Felurian");
        jButtonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVenderMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 220, -1));

        jLabelFraseComp.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFraseComp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFraseComp.setText("Hechizos, armaduras, espadas... a pelear!");
        getContentPane().add(jLabelFraseComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, -1, -1));

        jLabelFraseVend.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFraseVend.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFraseVend.setText("Dame un alma y te dare riqueza y poder!");
        getContentPane().add(jLabelFraseVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 390, -1));

        jLabelNombre.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("jLabel5");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 260, -1));

        jLabelStatFortuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Magic.png"))); // NOI18N
        jLabelStatFortuna.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabelStatFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabelStatDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Shield.png"))); // NOI18N
        jLabelStatDefensa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabelStatDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 50));

        jLabelStatAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sword.png"))); // NOI18N
        jLabelStatAtaque.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabelStatAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 70));

        jLabelStatVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dark3.png"))); // NOI18N
        jLabelStatVida.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabelStatVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabelStatFuerza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hand.png"))); // NOI18N
        jLabelStatFuerza.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabelStatFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 256, -1, -1));

        jLabelSalud.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelSalud.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalud.setText("Salud: 100");
        getContentPane().add(jLabelSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 220, 40));

        jLabelFuerza.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFuerza.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelFuerza.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFuerza.setText("Fuerza: 60");
        getContentPane().add(jLabelFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 220, -1));

        jLabelAtaque.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelAtaque.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAtaque.setText("Ataque: 50");
        getContentPane().add(jLabelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 30));

        jLabelDefensa.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelDefensa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDefensa.setText("Defensa: 30");
        getContentPane().add(jLabelDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 180, 30));

        jLabelFortuna.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelFortuna.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFortuna.setText("Fortuna: 10");
        getContentPane().add(jLabelFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 160, 30));

        jLabelRupias.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelRupias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRupias.setText("Drabines: 1000D");
        getContentPane().add(jLabelRupias, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 524, 180, 30));

        jLabelFondoVillano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Villian.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
interfaz cambio2= new interfaz();
cambio2.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVenderMouseClicked
Tienda cambio6= new Tienda();
cambio6.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButtonVenderMouseClicked

    
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
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelAtaque;
    private javax.swing.JLabel jLabelDefensa;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoVillano;
    private javax.swing.JLabel jLabelFortuna;
    private javax.swing.JLabel jLabelFraseComp;
    private javax.swing.JLabel jLabelFraseVend;
    private javax.swing.JLabel jLabelFuerza;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRupias;
    private javax.swing.JLabel jLabelSalud;
    private javax.swing.JLabel jLabelStatAtaque;
    private javax.swing.JLabel jLabelStatDefensa;
    private javax.swing.JLabel jLabelStatFortuna;
    private javax.swing.JLabel jLabelStatFuerza;
    private javax.swing.JLabel jLabelStatVida;
    // End of variables declaration//GEN-END:variables
    public String nombreVillano="";
}   
