package practicaHamburgueseria.ingredientes;

public class Ingrediente implements Agregable {
    private int precio;

    public Ingrediente(int precio){
        this.precio = precio;
    }
    public int getPrecio() {return this.precio;}
}
