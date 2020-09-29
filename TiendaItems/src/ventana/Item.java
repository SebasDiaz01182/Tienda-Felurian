
package ventana;


public class Item {

    //Atributos
    private String nombre;
    private int salud; 
    private int ataque;
    private int defensa;
    private int fortuna;
    private int fuerza;
    private int precio;
    private int precioVenta;
    private boolean equipado;
    
    public Item(String nombre,int salud,int ataque,int defensa,int fortuna, int precio, int precioVenta,boolean equipado){
    this.nombre = nombre;
    this.salud = salud;
    this.ataque = ataque;
    this.defensa = defensa;
    this.fortuna = fortuna;
    this.precio = precio;
    this.precioVenta= precioVenta;
    this.equipado = false;
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

   
    public int getAtaque() {
        return ataque;
    }

   
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    
    public int getDefensa() {
        return defensa;
    }

  
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

   
    public int getFortuna() {
        return fortuna;
    }

    public void setFortuna(int fortuna) {
        this.fortuna = fortuna;
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
    public boolean isEquipado() {
        return equipado;
    }

   
    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }
  
}
