package practicaHamburgueseria.hamburguesas;

import practicaHamburgueseria.ingredientes.Agregable;
import practicaHamburgueseria.ingredientes.Ingrediente;
import practicaHamburgueseria.ingredientes.Medallon;

import java.util.ArrayList;

public  abstract  class Hamburguesa {

    protected int limiteMedallones;
    protected int limiteIngredientes;
    protected int precioBase;
    protected int precioTotal;
    protected ArrayList<Agregable> ingredientes = new ArrayList<Agregable>();



    public void agregarIngrediente(Agregable unIngrediente){
        if (unIngrediente instanceof Medallon && this.limiteMedallones > 0) {
            this.ingredientes.add(unIngrediente);
            this.limiteMedallones--;
        }
        if (unIngrediente instanceof Ingrediente && this.limiteIngredientes > 0) {
            this.ingredientes.add(unIngrediente);
            this.limiteIngredientes--;
        }
    }

    private void calcularPrecio(){
        int suma = 0;
        for (Agregable a : this.ingredientes){
            suma+= a.getPrecio();
        }
        this.precioTotal = suma + this.precioBase;
    }

    public int getPrecioTotal() {
        this.calcularPrecio();
        return this.precioTotal;
    }

    public int getCantidadIngredientes() {
        return this.ingredientes.size();
    }
}
