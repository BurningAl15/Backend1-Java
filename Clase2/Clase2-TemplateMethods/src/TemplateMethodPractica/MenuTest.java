package TemplateMethodPractica;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {
    @Test
    public void CalculateMenus(){
        MenuClasico classicMenu = new MenuClasico(25);
        List<String> stepsClassic = new ArrayList<>();
        stepsClassic.add("Coloca hamburguesa");
        stepsClassic.add("Coloca gaseosa");
        stepsClassic.add("Coloca papas");
        stepsClassic.add("Coloca salsas");
        stepsClassic.add("Cierra caja de menú");
        classicMenu.armarMenu(stepsClassic);
        classicMenu.calcularPrecioVenta();

        int cantidadSalsasVegetarianas = 3;
        MenuVegetariano vegetariano = new MenuVegetariano(25,true,cantidadSalsasVegetarianas);
        List<String> stepsVeggie = new ArrayList<>();
        stepsVeggie.add("Coloca hamburguesa");
        stepsVeggie.add("Coloca gaseosa");
        stepsVeggie.add("Coloca papas");
        stepsVeggie.add("Coloca salsas");
        for(int i=0;i<cantidadSalsasVegetarianas;i++){
            stepsVeggie.add("Coloca salsa vegetariana " + (i+1));
        }
        stepsVeggie.add("Coloca  salsas");
        stepsVeggie.add("Coloca especias");
        stepsVeggie.add("Cierra caja de menú");
        vegetariano.armarMenu(stepsVeggie);
        vegetariano.calcularPrecioVenta();

        int juguetes = 4;
        MenuInfantil intantil = new MenuInfantil(25,juguetes);
        List<String> stepsInfantil = new ArrayList<>();

        stepsInfantil.add("Coloca hamburguesa");
        stepsInfantil.add("Coloca gaseosa");
        stepsInfantil.add("Coloca papas");
        stepsInfantil.add("Coloca salsas");
        for(int i=0;i<juguetes;i++){
            stepsInfantil.add("Coloca juguete " + (i+1));
        }
        stepsInfantil.add("Coloca  salsas");
        intantil.armarMenu(stepsInfantil);
        intantil.calcularPrecioVenta();
    }
}
