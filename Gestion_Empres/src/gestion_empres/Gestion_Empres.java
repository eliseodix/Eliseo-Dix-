
package gestion_empres;
 import java.util.*;
import javax.swing.*;
//arrayslist, date y list
public class Gestion_Empres {
     List<Proyecto> proyecto;
     List<Empleado>  empleado;
     
     public Gestion_Empres(){
        
         this.proyecto = new ArrayList<>();
         this.empleado= new ArrayList<>();
     }
     
    
    
    //metodo agrega empleados, proyectos, tareas---------
     public void agregarProyecto(Proyecto proyecto){
         this.proyecto.add(proyecto);
     }
      public void agregarEmpleado(Empleado empleado){
          this.empleado.add(empleado);

  
     }
    public static void main(String[] args) {
    }
    }
      
    

