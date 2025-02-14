
package gestion_empres;

import java.util.*;
//la importacion es pata Date y lista arrayslista




class Proyecto {
    String nombreClave;
    String denominacionComercial;
    Date fechaInicio;
    Date fechaFinalizacion;
    String estadoActual;
    Empleado jefeDeProyecto;
    List<Tarea> tareas;

    // Constructor del Proyecto
    public Proyecto(String nombreClave, String denominacionComercial, Date fechaInicio, Date fechaFinalizacion, String estadoActual, Empleado jefeDeProyecto) {
        this.nombreClave = nombreClave;
        this.denominacionComercial = denominacionComercial;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estadoActual = estadoActual;
        this.jefeDeProyecto = jefeDeProyecto;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }
}

