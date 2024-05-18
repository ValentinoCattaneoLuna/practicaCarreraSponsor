package practicaHamburgueseria.hamburguesas;

import practicaHamburgueseria.ingredientes.agregable;
import practicaHamburgueseria.ingredientes.ingrediente;
import practicaHamburgueseria.medallones.medallon;

public class hamburguesaSimple extends hamburguesa {

    public hamburguesaSimple() {
        this.limiteMedallones = 1;
        this.precioBase = 1000;
        this.limiteIngredientes = 1;
    }


}
