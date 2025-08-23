package Clases;

public enum Categorias {

    TRABAJO("💼 Trabajo"),
    HOGAR("🏡 Hogar"),
    SALUD("💊 Salud"),
    VIAJE("✈ Viaje"),
    COMPRAS("🛒 Compras"),
    MASCOTAS("🐾 Mascotas"),
    ENTRETENIMIENTO("🖼 Entretenimiento"),
    EVENTOS("🎉 Evento"),
    FINANZAS("💰 Finanza"),
    OTRO("🔰 ");

    private String categoria;

    Categorias(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoriaOtro(Categorias otherCategoria, String otro) {
        if (otherCategoria == OTRO) {
            this.categoria += otro;
        }
    }
}
