package practicaHamburgueseria.medallones;

import practicaHamburgueseria.ingredientes.agregable;

public abstract class medallon implements agregable {
    protected int precio;

    public int getPrecio() {
        return this.precio;
    }
}
