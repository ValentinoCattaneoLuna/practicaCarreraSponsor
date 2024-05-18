package practicaCarrerasSponsors;

import practicaCarrerasSponsors.carreras.*;
import practicaCarrerasSponsors.corredores.corredor;
import practicaCarrerasSponsors.sponsors.sponsor;

public class pruebas {
    public static void main(String[] args) {

        //creo las instancias de corredores
        corredor corredor1 = new corredor("Valentino");
        corredor corredor2 = new corredor("Bautista");
        corredor corredor3 = new corredor("Franco");
        corredor corredor4 = new corredor("Julian");

        //creo las instancias de carreras
        carreraAventura carrera1 = new carreraAventura("Correr en Bosques", 3500, 50, 4);
        carreraCalle carrera2 = new carreraCalle("corre bunge", 12);
        carreraRecreativa carrera3 = new carreraRecreativa("todos corren", 10);


        //creo las instancias de carreras
        sponsor Saucony = new sponsor("Saucony");
        sponsor McDonalds = new sponsor("Mc Donalds");


        //corredor 1 y corredor 2 van a tener certificado medico
        corredor1.agregarCertificado();
        corredor2.agregarCertificado();


        //todos los corredores van a tratar de entrar en la carrera 1
        carrera1.inscribir(corredor1);
        carrera1.inscribir(corredor2);
        carrera1.inscribir(corredor3);
        carrera1.inscribir(corredor4);

        //vemos quienes se puedieron inscribir
        System.out.println(carrera1);


        //todos los corredores van a tratar de entrar en la carrera 2
        carrera2.inscribir(corredor1);
        carrera2.inscribir(corredor2);
        carrera2.inscribir(corredor3);

            //vemos quienes se puedieron inscribir
            System.out.println(carrera2);


        //todos los corredores van a tratar de entrar en la carrera 3
        carrera3.inscribir(corredor1);
        carrera3.inscribir(corredor2);
        carrera3.inscribir(corredor3);
        carrera3.inscribir(corredor4);
            //vemos quienes se puedieron inscribir
            System.out.println(carrera3);

        //saucony va a tratar de promocionar a todos los corredores
        Saucony.patrocinar(corredor1);
        Saucony.patrocinar(corredor2);
        Saucony.patrocinar(corredor3);
            //vemos a quienes se pudo patrocinar

        System.out.println(Saucony);

        //McDonalds va a tratar de promocionar todas las carreras
        McDonalds.patrocinar(carrera1);
        McDonalds.patrocinar(carrera2);
        McDonalds.patrocinar(carrera3);
            //vemos a cuales  pudo patrocinar
            System.out.println(McDonalds);
      }

}
