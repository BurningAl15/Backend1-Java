package TemplateMethodPractica;
import java.util.List;

public abstract class Menu {
    protected double precioBase;

    public Menu(double precioBase){
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }


    protected abstract void printPrice(double price);

    protected void armarMenu(List<String> pasos){
        for(String paso : pasos){
            System.out.println(paso);
        }
    }

    protected abstract void calcularPrecioVenta();
}
