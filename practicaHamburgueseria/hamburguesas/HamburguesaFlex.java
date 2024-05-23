package practicaHamburgueseria.hamburguesas;

import practicaHamburgueseria.ingredientes.Agregable;

public class HamburguesaFlex extends Hamburguesa {

    public HamburguesaFlex(){
        this.precioBase = 2000;
    }

    @Override
    public void agregarIngrediente(Agregable unIngrediente) {
        this.ingredientes.add(unIngrediente);
    }
}
