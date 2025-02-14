
package gestion_empres;
import java.util.*;
//arrayslist y lista
class Tarea {
    String nombre;
    String descripcion;
    List<Empleado> empleadoAsignado;
    List<Documentacion> documentacionAsociada;
    
    public Tarea(String nombre, String descripcion){
        this.nombre= nombre;
        this.descripcion=descripcion;
        this.empleadoAsignado= new ArrayList<>();
        this.documentacionAsociada= new ArrayList<>();
        
    }
    
}
