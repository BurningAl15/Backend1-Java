package TemplateMethodPractica;

public class MenuClasico extends Menu{
    public MenuClasico(double precioBase) {
        super(precioBase);
        System.out.println( "---- Menu Clasico -----" );
    }

    @Override
    protected void printPrice(double price){
        System.out.println(">>> El precio del menú es " + price);
    }

    @Override
    protected void calcularPrecioVenta(){
        printPrice(precioBase);
    }
}
