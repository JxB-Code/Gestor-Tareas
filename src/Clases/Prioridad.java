package Clases;

import java.awt.Color;

public enum Prioridad {

    ALTA("Alta 🔴", new Color(243, 59, 59)),
    MEDIA("Media 🟡", new Color(253, 255, 120)),
    BAJA("Baja 🟢", new Color(159, 255, 120));

    private String rango;
    private Color color;

    Prioridad(String rango, Color color) {
        this.rango = rango;
        this.color = color;
    }

    public String getRango() {
        return rango;
    }

    public Color getColor() {
        return color;
    }

}
