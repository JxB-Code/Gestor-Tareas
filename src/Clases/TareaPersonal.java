package Clases;

public class TareaPersonal extends Tarea {

    private String lugar;
    private Categorias categoria;

    public TareaPersonal(String titulo, String descripcion, Prioridad prioridad, String fechaLimite, String lugar, Categorias categoria) {
        super(titulo, descripcion, prioridad, fechaLimite);
        this.lugar = lugar;
        this.categoria = categoria;
    }

    @Override
    public String infoTarea() {
        if (descripcion.equals("")) {
            return "Titulo: " + titulo + " (" + categoria.getCategoria() + (")")
                    + "\nPrioridad:" + prioridad
                    + "\nFecha Limite: " + fechaLimite
                    + "\nLugar";
        } else {
            return "Titulo: " + titulo + " (" + categoria.getCategoria() + (")")
                    + "\nDescripcion: " + descripcion
                    + "\nPrioridad:" + prioridad
                    + "\nFecha Limite: " + fechaLimite
                    + "\nLugar";
        }
    }
}
