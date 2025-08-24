package Clases;

import java.util.ArrayList;

public class User {

    private String nombre;
    private String password;
    private ArrayList<Tarea> tareas;

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.tareas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

}
