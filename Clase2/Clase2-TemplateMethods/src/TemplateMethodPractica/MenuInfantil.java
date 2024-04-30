package TemplateMethodPractica;

public class MenuInfantil extends Menu{

    int juguetesIncluidos;
    public MenuInfantil(double precioBase, int juguetesIncluidos) {
        super(precioBase);
        this.juguetesIncluidos = juguetesIncluidos;
        System.out.println( "---- Menu Infantil -----" );
    }

    @Override
    protected void printPrice(double price){

        String juguetes = (juguetesIncluidos > 0 ? "con " + juguetesIncluidos + " juguetes" : "sin juguetes");
        String message = STR
                . ">>> El precio del menú vegetariano  \{ juguetes } es \{price}";
        System.out.println( message );
        System.out.println( "\n" );
    }

    @Override
    protected void calcularPrecioVenta(){
        precioBase = precioBase + juguetesIncluidos*3;
        printPrice(precioBase);
    }
}
