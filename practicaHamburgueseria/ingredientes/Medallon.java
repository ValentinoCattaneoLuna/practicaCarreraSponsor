package practicaHamburgueseria.ingredientes;

public  class Medallon implements Agregable {
    private int precio;

    public Medallon(int precio){
        this.precio = precio;
    }
    public int getPrecio() {
        return this.precio;
    }
}
