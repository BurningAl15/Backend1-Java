package TemplateMethodPractica;

import static java.lang.StringTemplate.STR;

public class MenuVegetariano extends Menu{
    boolean tieneEspecias;
    int salsasVegetarianas;
    public MenuVegetariano(double precioBase, boolean tieneEspecias, int salsasVegetarianas) {
        super(precioBase);
        this.tieneEspecias = tieneEspecias;
        this.salsasVegetarianas = salsasVegetarianas;
        System.out.println( "---- Menu Vegetariano -----" );
    }

    @Override
    protected void printPrice(double price){
        String especias = (tieneEspecias ? "con especias" : "sin especias");
        String salsas = (salsasVegetarianas > 0 ? "con " + salsasVegetarianas + " salsas" : "sin salsas vegetarianas");
        String message = STR
                . ">>> El precio del menú vegetariano  \{ especias }  y \{ salsas }  es \{price}";
        System.out.println( message );
    }

    @Override
    protected void calcularPrecioVenta(){
        double base = tieneEspecias ? precioBase*0.01 : 0;
        precioBase = precioBase + salsasVegetarianas*2 + base;
        printPrice(precioBase);
    }
}
