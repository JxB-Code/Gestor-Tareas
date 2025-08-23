package Clases;

public class TareaEscolar extends Tarea {

    private String materia;

    public TareaEscolar(String titulo, String descripcion, Prioridad prioridad, String fechaLimite, String materia) {
        super(titulo, descripcion, prioridad, fechaLimite);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String infoTarea() {
        if (descripcion.equals("")) {
            return "Titulo: " + titulo + " (" + materia + ")"
                    + "\nPrioridad:" + prioridad
                    + "\nFecha Limite: " + fechaLimite;
        } else {
            return "Titulo: " + titulo + " (" + materia + ")"
                    + "\nDescripcion: " + descripcion
                    + "\nPrioridad:" + prioridad
                    + "\nFecha Limite: " + fechaLimite;
        }
    }

}
