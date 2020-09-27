
package ventana;


public class Personaje {

    
   
    //Atributos
    private int salud; 
    private int ataque;
    private int defensa;
    private int fortuna;
    private int dinero;
    private int fuerza;
   
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

    
    public int getDinero() {
        return dinero;
    }

   
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    //Metodos
    public boolean Equipar(){
        return true;
    }
    public boolean Desequipar(){
        return false;
    }
    public void AplicarStats(Item item){
        this.ataque=this.ataque + item.getAtaque();
        this.defensa=this.defensa + item.getDefensa();
        this.fortuna=this.fortuna + item.getFortuna();
        this.salud=this.salud + item.getSalud();
        this.fuerza=this.fuerza + item.getFuerza();
    }
    public void QuitarStats(Item item){
        this.ataque=this.ataque - item.getAtaque();
        this.defensa=this.defensa - item.getDefensa();
        this.fortuna=this.fortuna - item.getFortuna();
        this.salud=this.salud - item.getSalud();
        this.fuerza=this.fuerza - item.getFuerza();
    }
    
}
