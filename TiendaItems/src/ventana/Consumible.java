
package ventana;

public class Consumible {

   
    //Atributos
    private String nombre;
    private int salud;
    private int fuerza;
    private int precio;
    private int precioVenta;
    
    public Consumible(String nombre, int salud, int fuerza,int precio, int precioVenta){
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        this.precio = precio;
        this.precioVenta = precioVenta;
    }
     public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public int getSalud() {
        return salud;
    }

  
    public void setSalud(int salud) {
        this.salud = salud;
    }

    
    public int getFuerza() {
        return fuerza;
    }

    
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public int getPrecio() {
        return precio;
    }

    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

   
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}
