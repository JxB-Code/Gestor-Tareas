package Clases;

public class TareaEscolar extends Tarea {

    private String materia;
    private String fechaLimite;

    public TareaEscolar(String titulo, String descripcion, Prioridad prioridad, String materia, String fechaLimite) {
        super(titulo, descripcion, prioridad);
        this.materia = materia;
        this.fechaLimite = fechaLimite;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

}
