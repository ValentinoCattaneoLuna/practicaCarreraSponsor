package practicaCarrerasSponsors.carreras;

import practicaCarrerasSponsors.corredores.corredor;

import java.util.HashSet;
import java.util.Set;

public abstract class carrera {
    protected String nombre;
    protected int distancia;
    protected Set<corredor> corredores  = new HashSet<>();
    protected abstract void inscribir(corredor unCorredor);




    public String toString(){
        String out="Carrera: " + this.nombre + "\n" +
                   "Distancia de la carrera: " + this.distancia +"KM"+ "\n" +
                   "Corredores anotados: " ;
        for (corredor c : this.corredores){
            out += c +","+ " ";
        }
        return out + "\n";
    }
}
