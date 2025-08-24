package Clases;

import java.util.ArrayList;

public class User {

    private String nombre;
    private String password;
    private ArrayList<Tarea> tareas;
    private int tareasCompletadas;
    private int tareasPendientes;

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.tareas = new ArrayList();
        this.tareasCompletadas = 0;
        this.tareasPendientes = 0;
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

    public int getTareasCompletadas() {
        return tareasCompletadas;
    }

    public void setTareasCompletadas() {
        this.tareasCompletadas++;
    }

    public int getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes() {
        for (Tarea tarea : this.tareas) {
            this.tareasPendientes++;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nPendiente: " + tareasPendientes + "tareas"
                + "\nCompletadas: " + tareasCompletadas + "tareas";
    }
}
