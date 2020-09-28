
package ventana;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {
    
    
    //Variable para el API
    private static final String POSTS_API_URL = "https://jsonplaceholder.typicode.com/posts";
    
    //Funcionalidades
    
    
    public static int TransformarPrecio(int precioViejo){
        if((precioViejo%2)==0){
            return precioViejo * 40;
        }else{
            if(precioViejo%10==5){
            return precioViejo * 50;
            }
            else{
            return  precioViejo * 70;
            }
        }
    }
    
    public static String TransformarNombre(String nombreViejo){
        String espacio = " ";
        int indiceAux = nombreViejo.indexOf(espacio);
        int indiceFinal = nombreViejo.indexOf(espacio, indiceAux);
        String nombreNuevo = nombreViejo.substring(indiceAux, indiceFinal);
        return nombreNuevo;
    }
    
    public static Item Transformar(List<Post> postsList,int num){
        Post auxiliar = postsList.get(num);
        String nombreNuevo = TransformarNombre(auxiliar.getTitle());
        int precioNuevo = TransformarPrecio(auxiliar.getId());
        Item itemEj = new Item(nombreNuevo,0,0,0,0, precioNuevo, precioNuevo/2);
        return itemEj;
    }
    
    
    //Metodo Main
    public static void main(String args[]) throws IOException, InterruptedException {
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
        List<Item> listaItems = null;
        for(int e=0;e!=6;e++){
            Item itemAux = Transformar(postsList,e);
            listaItems.add(e, itemAux);
        }
        
    }
}
