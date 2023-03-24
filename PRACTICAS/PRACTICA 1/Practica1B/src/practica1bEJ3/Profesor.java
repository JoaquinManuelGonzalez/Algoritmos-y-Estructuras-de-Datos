
package practica1bEJ3;


public class Profesor {
    private String nombre;
    private String apellido;
    private int catedra;
    private String email;
    private String facultad;
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getFacultad() {
        return facultad;
    }
    
    public int getCatedra() {
        return catedra;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCatedra(int catedra) {
        this.catedra = catedra;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    public String tusDatos() {
        return "Nombre: " + this.getNombre() + ". Apellido: " + this.getApellido() + ". Email: " + this.getEmail() + ". Facultad: " + this.getFacultad() + ". Catedra: " + this.getCatedra();
    }
}
