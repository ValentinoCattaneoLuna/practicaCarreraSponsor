package practicaHamburgueseria.hamburguesas;

import practicaHamburgueseria.ingredientes.agregable;
import practicaHamburgueseria.ingredientes.ingrediente;
import practicaHamburgueseria.medallones.medallon;

import java.util.ArrayList;

public  abstract  class hamburguesa {

    protected int limiteMedallones;
    protected int limiteIngredientes;
    protected int precioBase;



    protected int precioTotal;

    public ArrayList<agregable> ingredientes = new ArrayList<agregable>();



    public void agregarIngrediente(agregable unIngrediente){
        if (unIngrediente instanceof medallon && this.limiteMedallones > 0) {
            this.ingredientes.add(unIngrediente);
            this.limiteMedallones--;
        }
        if (unIngrediente instanceof ingrediente && this.limiteIngredientes > 0) {
            this.ingredientes.add(unIngrediente);
            this.limiteIngredientes--;
        }
    }

    private void calcularPrecio(){
        int suma = 0;
        for (agregable a : this.ingredientes){
            suma+= a.getPrecio();
        }
        this.precioTotal = suma + this.precioBase;
    }

    public int getPrecioTotal() {
        this.calcularPrecio();
        return this.precioTotal;
    }



}
