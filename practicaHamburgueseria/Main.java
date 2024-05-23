package practicaHamburgueseria;

import practicaHamburgueseria.ingredientes.*;
import practicaHamburgueseria.hamburguesas.*;


public class Main {
    public static void main(String[] args) {
        //creo  tres hamburguesas
        Hamburguesa hamburguesa1 = new HamburguesaSimple();
        Hamburguesa hamburguesa2 = new HamburguesaDoble();
        Hamburguesa hamburguesa3 = new HamburguesaPlus();

        //creo los 3 tipos de medallones
        Medallon medallonDeCarne = new Medallon(1000);
        Medallon medallonDePollo = new Medallon(850);
        Medallon medallonVeggie  = new Medallon(1250);
        //creo los diferentes ingredientes

        Ingrediente ketchup = new Ingrediente(100);
        Ingrediente huevoFrito = new Ingrediente(300);
        Ingrediente tomate = new Ingrediente(250);
        Ingrediente lechuga = new Ingrediente(250);
        Ingrediente quesoChedar = new Ingrediente(400);

        // armo mi hamburguesa simple
        hamburguesa1.agregarIngrediente(medallonDeCarne);
        hamburguesa1.agregarIngrediente(ketchup);

            //compruebo la cantidad de ingredientes que tiene
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa1.getCantidadIngredientes());
            //trato de agregarle de ingredientes de mas
            hamburguesa1.agregarIngrediente(medallonDeCarne);
            hamburguesa1.agregarIngrediente(ketchup);
            //compruebo que no se hayan agregado
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa1.getCantidadIngredientes());

        // armo mi hamburguesa doble
        hamburguesa2.agregarIngrediente(medallonDePollo);
        hamburguesa2.agregarIngrediente(medallonDeCarne);
        hamburguesa2.agregarIngrediente(huevoFrito);
        hamburguesa2.agregarIngrediente(lechuga);
            //compruebo la cantidad de ingredientes que tiene
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+ hamburguesa2.getCantidadIngredientes());
            //trato de agregarle de ingredientes de mas
            hamburguesa2.agregarIngrediente(medallonDePollo);
            hamburguesa2.agregarIngrediente(medallonDeCarne);
            hamburguesa2.agregarIngrediente(huevoFrito);
            hamburguesa2.agregarIngrediente(lechuga);
            //compruebo que no se hayan agregado
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa2.getCantidadIngredientes());

        // armo mi hamburguesa plus

        hamburguesa3.agregarIngrediente(medallonVeggie);
        hamburguesa3.agregarIngrediente(medallonDeCarne);
        hamburguesa3.agregarIngrediente(medallonDePollo);
        hamburguesa3.agregarIngrediente(tomate);
        hamburguesa3.agregarIngrediente(tomate);
        hamburguesa3.agregarIngrediente(ketchup);
        hamburguesa3.agregarIngrediente(huevoFrito);
            //compruebo la cantidad de ingredientes que tiene
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa3.getCantidadIngredientes());
            //trato de agregarle de ingredientes de mas
            hamburguesa3.agregarIngrediente(medallonVeggie);
            hamburguesa3.agregarIngrediente(medallonDeCarne);
            hamburguesa3.agregarIngrediente(medallonDePollo);
            hamburguesa3.agregarIngrediente(tomate);
            hamburguesa3.agregarIngrediente(tomate);
            hamburguesa3.agregarIngrediente(ketchup);
            hamburguesa3.agregarIngrediente(huevoFrito);
            //compruebo que no se hayan agregado
            System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa3.getCantidadIngredientes());


        //calculo el precio total de mis tres hamburguesas

        System.out.println("HAMBURGUESA SIMPLE: " + hamburguesa1.getPrecioTotal() + "$");
        System.out.println("HAMBURGUESA DOBLE: " +hamburguesa2.getPrecioTotal()+ "$");
        System.out.println("HAMBURGUESA PLUS: "+ hamburguesa3.getPrecioTotal()+ "$");

        //creo mi hamburguesa FLEX
        HamburguesaFlex hamburguesa4 = new HamburguesaFlex();

        //le agrego todos los ingredientes que quiera

        hamburguesa4.agregarIngrediente(medallonVeggie);
        hamburguesa4.agregarIngrediente(medallonDeCarne);
        hamburguesa4.agregarIngrediente(medallonDeCarne);
        hamburguesa4.agregarIngrediente(medallonDePollo);
        hamburguesa4.agregarIngrediente(medallonVeggie);
            //5 medallones

        hamburguesa4.agregarIngrediente(tomate);
        hamburguesa4.agregarIngrediente(ketchup);
        hamburguesa4.agregarIngrediente(huevoFrito);
        hamburguesa4.agregarIngrediente(lechuga);
        hamburguesa4.agregarIngrediente(quesoChedar);
            //5 ingredientes
        //compruebo que esten los 10 elementos agregados
        System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa4.getCantidadIngredientes());
        //le agrego un ingrediente mas para comprobar que se pueden seguir agregando
        hamburguesa4.agregarIngrediente(quesoChedar);

        //compruebo que sean  11 elementos totales
        System.out.println("cantidad de ingredientes de mi hamburguesa"+" "+hamburguesa4.getCantidadIngredientes());

        //calculo su precio total
        System.out.println("HAMBURGUESA FLEX: "+hamburguesa4.getPrecioTotal()+"$");


    }
}
