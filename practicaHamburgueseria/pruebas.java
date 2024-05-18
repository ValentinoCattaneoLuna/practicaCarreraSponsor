package practicaHamburgueseria;

import practicaHamburgueseria.ingredientes.*;
import practicaHamburgueseria.hamburguesas.*;
import practicaHamburgueseria.medallones.*;

public class pruebas {
    public static void main(String[] args) {
        //creo  tres hamburguesas
        hamburguesa hamburguesa1 = new hamburguesaSimple();
        hamburguesa hamburguesa2 = new hamburguesaDoble();
        hamburguesa hamburguesa3 = new hamburguesaPlus();

        //creo los 3 tipos de medallones
        medallon medallonCarne = new medallonCarne();
        medallon medallonPollo = new medallonPollo();
        medallon medallonVeggie = new medallonVeggie();

        //creo los diferentes ingredientes
        ingrediente ketchup  = new ketchup();
        ingrediente lechuga = new lechuga();
        ingrediente huevoFrito = new huevoFrito();
        ingrediente tomate = new tomate();




    }
}
