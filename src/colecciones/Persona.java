package colecciones;


import java.util.Objects;


/**
 *
 * @author educacionit
 */
public class Persona implements Comparable <Persona>{
    private String dni;
    private String nombre;
    // constructor + getter y setter
    // equals + hashcode

    public Persona(String nombre,String dni) { 
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {
     return this.dni.compareTo(o.dni);
     
    }
    
     
     
}
