/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Tienda extends javax.swing.JFrame {

    //Variable para el API
    private static final String POSTS_API_URL = "https://jsonplaceholder.typicode.com/posts";
    
    //Funcionalidades
    public static ArrayList TransformarFinal(ArrayList<Item> listaItems){
        (listaItems.get(0)).setNombre("Espada "+(listaItems.get(0)).getNombre());(listaItems.get(0)).setAtaque(35);
        (listaItems.get(1)).setNombre("Hacha "+(listaItems.get(1)).getNombre());(listaItems.get(1)).setAtaque(50);
        (listaItems.get(2)).setNombre("Peto "+(listaItems.get(2)).getNombre());(listaItems.get(2)).setDefensa(70);
        (listaItems.get(3)).setNombre("Escudo " +(listaItems.get(3)).getNombre());(listaItems.get(3)).setDefensa(40);(listaItems.get(3)).setAtaque(20);
        (listaItems.get(4)).setNombre("Amuleto de "+(listaItems.get(4)).getNombre());(listaItems.get(4)).setFuerza(10);(listaItems.get(4)).setSalud(30);(listaItems.get(4)).setFortuna(40);
        (listaItems.get(5)).setNombre("Collar "+(listaItems.get(5)).getNombre());(listaItems.get(5)).setSalud(40);(listaItems.get(5)).setFuerza(40);(listaItems.get(5)).setFortuna(80);
        (listaItems.get(6)).setNombre("Pocion de "+(listaItems.get(6)).getNombre());(listaItems.get(6)).setFuerza(80);
        (listaItems.get(7)).setNombre("Encantamiento de "+(listaItems.get(7)).getNombre());(listaItems.get(7)).setSalud(60);
        
        return listaItems;
    }
    
    public static int TransformarPrecio(int precioViejo){
        if((precioViejo%2)==0){
            return precioViejo*20;
        }else if((precioViejo%10)==5){
            return precioViejo*30;
        }else{
            return precioViejo*50;
        }
    }
    
    public static String TransformarNombre(String nombreViejo){
        int indiceAux = nombreViejo.indexOf(" ");
        String nombreNuevo = nombreViejo.substring(0,indiceAux);
        return nombreNuevo;
    }
    
    public static Item Transformar(List<Post> postsList,int num){
        Post auxiliar = postsList.get(num);
        String nombreNuevo = TransformarNombre(auxiliar.getTitle());
        int precioNuevo = TransformarPrecio(auxiliar.getId());
        Item itemEj = new Item(nombreNuevo,0,0,0,0, precioNuevo, precioNuevo/2,false);
        return itemEj;
    }
    public static ArrayList<Item> CrearListaItems(List<Post> postsList){
        //Creacion de la lista de Items
        ArrayList<Item> listaItems = new ArrayList(8);
        for(int e=13;e<=20;e++){
            Item itemAux = Transformar(postsList,e);
            listaItems.add(itemAux);
        }
        //Transformar a Objetos Listos para Usar
         ArrayList<Item> itemsFinales = TransformarFinal(listaItems);
         return itemsFinales;
    
    }
    public Tienda() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabelStatVida = new javax.swing.JLabel();
        jLabelStatFuerza = new javax.swing.JLabel();
        jLabelStatAtaque = new javax.swing.JLabel();
        jLabelStatDefensa = new javax.swing.JLabel();
        jLabelStatFortuna = new javax.swing.JLabel();
        jLabelSalud = new javax.swing.JLabel();
        jLabelFuerza = new javax.swing.JLabel();
        jLabelAtaque = new javax.swing.JLabel();
        jLabelDefensa = new javax.swing.JLabel();
        jLabelFortuna = new javax.swing.JLabel();
        jLabelRupias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo= new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        txtnom = new javax.swing.JTextField();
        jButtonComprar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabelTitulo = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabelTituloArmadura = new javax.swing.JLabel();
        Armasboton2 = new javax.swing.JRadioButton();
        Armaboton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelTituloInv = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonDesequipar = new javax.swing.JButton();
        jButtonEquipar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStatVida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CorazonFn2.png"))); // NOI18N
        jLabelStatVida.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, 40));

        jLabelStatFuerza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puño.jpg"))); // NOI18N
        jLabelStatFuerza.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 50, 40));

        jLabelStatAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Espadafin.png"))); // NOI18N
        jLabelStatAtaque.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, 40));

        jLabelStatDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Armadura.png"))); // NOI18N
        jLabelStatDefensa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 50, 40));

        jLabelStatFortuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Amuleto_1.png"))); // NOI18N
        jLabelStatFortuna.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        getContentPane().add(jLabelStatFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 50, 40));

        jLabelSalud.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelSalud.setForeground(new java.awt.Color(255, 204, 51));
        jLabelSalud.setText("Salud: 100");
        getContentPane().add(jLabelSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jLabelFuerza.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFuerza.setForeground(new java.awt.Color(255, 204, 51));
        jLabelFuerza.setText("Fuerza: 60");
        getContentPane().add(jLabelFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, -1, -1));

        jLabelAtaque.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelAtaque.setForeground(new java.awt.Color(255, 204, 51));
        jLabelAtaque.setText("Ataque: 50");
        getContentPane().add(jLabelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, -1, -1));

        jLabelDefensa.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelDefensa.setForeground(new java.awt.Color(255, 204, 51));
        jLabelDefensa.setText("Defensa: 30");
        getContentPane().add(jLabelDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 670, -1, -1));

        jLabelFortuna.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabelFortuna.setForeground(new java.awt.Color(255, 204, 51));
        jLabelFortuna.setText("Fortuna: 10");
        getContentPane().add(jLabelFortuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        jLabelRupias.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelRupias.setForeground(new java.awt.Color(0, 153, 153));
        jLabelRupias.setText("Drabines: 1000D");
        getContentPane().add(jLabelRupias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 180, 30));

        jList1.setModel(modelo);
        jList1.setBackground(new java.awt.Color(84, 69, 55));
        jList1.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 204, 51));
        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 190));

        txtnom.setBackground(new java.awt.Color(84, 69, 55));
        txtnom.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        txtnom.setForeground(new java.awt.Color(255, 204, 51));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 40));

        jButtonComprar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonComprar.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 204, 51));
        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, 160, -1));

        jButtonVender.setBackground(new java.awt.Color(0, 102, 102));
        jButtonVender.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(255, 204, 51));
        jButtonVender.setText("Vender");
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
        getContentPane().add(jButtonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 160, -1));

        jRadioButton8.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton8.setText((itemsGlobales.get(5)).getNombre());
        jRadioButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 260, -1));

        jRadioButton5.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton5.setText((itemsGlobales.get(4)).getNombre());
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 260, -1));

        jLabelTitulo.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setText("Amuletos de Fortuna");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        jRadioButton10.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton10.setText((itemsGlobales.get(3)).getNombre());
        jRadioButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 260, -1));

        jRadioButton9.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton9.setText((itemsGlobales.get(2)).getNombre());
        jRadioButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton9MouseClicked(evt);
            }
        });
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 260, -1));

        jLabelTituloArmadura.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabelTituloArmadura.setForeground(new java.awt.Color(0, 153, 153));
        jLabelTituloArmadura.setText("Armadura y escudos");
        jLabelTituloArmadura.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabelTituloArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        Armasboton2.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(Armasboton2);
        Armasboton2.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        Armasboton2.setForeground(new java.awt.Color(255, 204, 51));
        Armasboton2.setText((itemsGlobales.get(1)).getNombre());
        Armasboton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Armasboton2MouseClicked(evt);
            }
        });
        Armasboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Armasboton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Armasboton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 260, 30));

        Armaboton1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(Armaboton1);
        Armaboton1.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        Armaboton1.setForeground(new java.awt.Color(255, 204, 51));
        Armaboton1.setText((itemsGlobales.get(0)).getNombre());
        Armaboton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Armaboton1MouseClicked(evt);
            }
        });
        Armaboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Armaboton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Armaboton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 260, -1));

        jLabel2.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Armas");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        jLabelTituloInv.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelTituloInv.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTituloInv.setText("Inventario");
        getContentPane().add(jLabelTituloInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 102));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 80, -1));

        jButtonDesequipar.setBackground(new java.awt.Color(0, 51, 51));
        jButtonDesequipar.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jButtonDesequipar.setForeground(new java.awt.Color(255, 204, 102));
        jButtonDesequipar.setText("Desequipar");
        jButtonDesequipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesequiparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesequipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 40));

        jButtonEquipar.setBackground(new java.awt.Color(0, 51, 51));
        jButtonEquipar.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jButtonEquipar.setForeground(new java.awt.Color(255, 204, 102));
        jButtonEquipar.setText("Equipar");
        jButtonEquipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquiparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEquipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 40));

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Pociones y Encantamientos");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 410, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton1.setText("Sustituir");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 260, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 204, 51));
        jRadioButton2.setText((itemsGlobales.get(7)).getNombre());
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 260, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 102));
        jButton1.setText("Utilizar Consumible");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 250, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fantasy.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Armasboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Armasboton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Armasboton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed
// Llamar la función vender
    private void jButtonVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVenderMouseClicked

    }//GEN-LAST:event_jButtonVenderMouseClicked
    public static Item BuscarItem(String buscar,ArrayList<Item> itemsGlobales){
        int y = 0;
        while(y<5){
        Item corriendo = itemsGlobales.get(y);
        if((corriendo.getNombre()).equals(buscar)){
            break;
        }else{
            y+=1;
        }
        }
        return itemsGlobales.get(y);
    }
    public static boolean VerificarEquipado(String buscar,ArrayList<Item> itemsEquipados){
        int y = 0;
        while(y<5){
        Item corriendo = itemsEquipados.get(y);
        if((corriendo.getNombre()).equals(buscar)){
            return true;
        }else{
            y+=1;
        }
        }
        return false;
    }
    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed

    String buscar = txtnom.getText();
    Item seleccionado = BuscarItem(buscar,itemsGlobales);
    int dineroFinal = personaje.getDinero()- seleccionado.getPrecio(); 
    if(dineroFinal>=0){
        modelo.addElement(txtnom.getText());
        txtnom.setText("");
        jList1.setSelectedIndex(0);
        cambiarDinero(dineroFinal);
        personaje.setDinero(dineroFinal);
    }else{
        JOptionPane.showMessageDialog(null,"Error, los drabines no son suficientes.");
    }
    
    
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        if(modelo.getSize()>0)
        {
            int n = jList1.getSelectedIndex();
            String eliminar = (modelo.get(n))+"";
            Item seleccionado = BuscarItem(eliminar,itemsGlobales);
            if(seleccionado.isEquipado()){
                JOptionPane.showMessageDialog(null,"Error,debe de desequipar el item antes de venderlo.");
            }else{
                int dineroFinal = personaje.getDinero() + seleccionado.getPrecioVenta();
                cambiarDinero(dineroFinal);
                personaje.setDinero(dineroFinal);
                modelo.removeElementAt(n);
                jList1.setSelectedIndex(0);
            }
            
            
        }
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void Armaboton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Armaboton1MouseClicked
        txtnom.setText("Espada voluptatem");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 280D y se puede vender por 140D, La espada Voluptatem aumenta el stat de ataque un 35%");
    }//GEN-LAST:event_Armaboton1MouseClicked

    private void Armasboton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Armasboton2MouseClicked
        txtnom.setText("Hacha eveniet");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 450D y se puede vender por 225D, El Hacha Eveniet aumenta el stat de ataque un 50%");
    }//GEN-LAST:event_Armasboton2MouseClicked

    private void jRadioButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton9MouseClicked
        txtnom.setText("Peto sint");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 320D y se puede vender por 160D, El Peto Sint aumenta el stat de defensa un 70%");
    }//GEN-LAST:event_jRadioButton9MouseClicked

    private void jRadioButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton10MouseClicked
        txtnom.setText("Escudo fugit");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 850D y se puede vender por 425D, El Escudo Fugit aumenta el stat de defensa un 40% y ataque un 20%");
    }//GEN-LAST:event_jRadioButton10MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        txtnom.setText("Amuleto de voluptate");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 360D y se puede vender por 180D, El Amuleto Voluptate aumenta el stat de salud 30% , el stat de fuerza un 10% y la fortuna un 40%");
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton8MouseClicked
        txtnom.setText("Collar adipisci");
        JOptionPane.showMessageDialog(null,"El precio de este item es de 950D y se puede vender por 475D, El Collar Adipisci aumenta el stat de salud 40% , el stat de fuerza un 40% y la fortuna un 80%");
    }//GEN-LAST:event_jRadioButton8MouseClicked

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Armaboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Armaboton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Armaboton1ActionPerformed

    private void jButtonEquiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquiparActionPerformed
        if(modelo.getSize()>0)
        {
            int n = jList1.getSelectedIndex();
            String eliminar = (modelo.get(n))+"";
            Item seleccionado = BuscarItem(eliminar,itemsGlobales);
            if(seleccionado.isEquipado()){
                JOptionPane.showMessageDialog(null,"Error,el item ya ha sido equipado.");
            }else{
                personaje.AplicarStats(seleccionado);
                cambiarEtiquetas();
                seleccionado.setEquipado(true);
                jList1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_jButtonEquiparActionPerformed

    private void jButtonDesequiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesequiparActionPerformed
        if(modelo.getSize()>0){
            int n = jList1.getSelectedIndex();
            String eliminar = (modelo.get(n))+"";
            Item seleccionado = BuscarItem(eliminar,itemsGlobales);
            personaje.QuitarStats(seleccionado);
            cambiarEtiquetas();
            seleccionado.setEquipado(false);
            jList1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonDesequiparActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed
    // Cambiar Etiquetas
    public void cambiarEtiquetas(){
        jLabelSalud.setText("Salud: "+personaje.getSalud()+"");
        jLabelFuerza.setText("Fuerza: "+personaje.getFuerza()+"");
        jLabelAtaque.setText("Ataque: "+personaje.getAtaque()+"");
        jLabelDefensa.setText("Defensa: "+personaje.getDefensa()+"");
        jLabelFortuna.setText("Fortuna: "+personaje.getFortuna()+"");
    }
    
    //Dinero
    
    public void TransaccionCompra(Item item,Personaje personaje){
        int costo=item.getPrecio();
        personaje.setDinero((personaje.getDinero())-costo);
        
    }
    public void TransaccionVenta(Item item,Personaje personaje){
        int costo=item.getPrecioVenta();
        personaje.setDinero((personaje.getDinero())+costo);
    }
    
    //Cambiar etiqueta de dinero
    public void cambiarDinero(int dinero){
        //Cambiar a string
        String cantidad= dinero+"";
        jLabelRupias.setText("Drabines: "+cantidad+"D");
    }
    
      public static void main(String args[]) throws IOException, InterruptedException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
                
            }
        });
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept","application/json")
                .uri(URI.create(POSTS_API_URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        //Realizar el Parse del JSON
        ObjectMapper  mapper = new ObjectMapper();
        List<Post> postsList = mapper.readValue(response.body(),new TypeReference<List<Post>>() {});
        itemsGlobales = CrearListaItems(postsList);
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Armaboton1;
    private javax.swing.JRadioButton Armasboton2;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonDesequipar;
    private javax.swing.JButton jButtonEquipar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAtaque;
    private javax.swing.JLabel jLabelDefensa;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFortuna;
    private javax.swing.JLabel jLabelFuerza;
    private javax.swing.JLabel jLabelRupias;
    private javax.swing.JLabel jLabelSalud;
    private javax.swing.JLabel jLabelStatAtaque;
    private javax.swing.JLabel jLabelStatDefensa;
    private javax.swing.JLabel jLabelStatFortuna;
    private javax.swing.JLabel jLabelStatFuerza;
    private javax.swing.JLabel jLabelStatVida;
    private javax.swing.JLabel jLabelTitulo;
    private static javax.swing.JLabel jLabelTituloArmadura;
    private javax.swing.JLabel jLabelTituloInv;
    private javax.swing.JList<String> jList1;
    private DefaultListModel modelo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
    public static ArrayList<Item> itemsGlobales ;
    public static Personaje personaje = new Personaje(100,50,30,10,1000,60);
} 

