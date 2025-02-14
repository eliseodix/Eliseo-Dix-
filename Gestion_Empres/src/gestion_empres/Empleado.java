
package gestion_empres;

import java.util.*;
//date
class Empleado {
  
    String dni;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correoElectronico;
    Date fechaContratacion;

    // Constructor del Empleado
    public Empleado(String dni, String nombre, String apellido, String direccion, String telefono, String correoElectronico, Date fechaContratacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaContratacion = fechaContratacion;
    }
    
    public String obtenerFicha() {
        return "DNI: " + dni + "\nNombre: " + nombre + "\nApellido: " 
                + apellido + "\nDirección: " + 
                direccion + "\nTeléfono: " + 
                telefono + "\nCorreo Electrónico: " + 
                correoElectronico + "\nFecha de Contratación: " + fechaContratacion;
    }
}

