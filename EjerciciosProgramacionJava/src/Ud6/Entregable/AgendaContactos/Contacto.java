
package ud6.Entregable.AgendaContactos;


public class Contacto {
    
    private String nombre;
    private String tlf;
    private String email;

    //Constructor
    public Contacto(String nombre, String tlf, String email) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.email = email;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public String getEmail() {
        return email;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Devuelve String con info contacto
    public String getAll(){
        return (nombre+" "+tlf+ " "+email);
    }
    
    // Imprimir info contacto
    public void imprimir(){
        System.out.println(getAll());
    }
    
}
