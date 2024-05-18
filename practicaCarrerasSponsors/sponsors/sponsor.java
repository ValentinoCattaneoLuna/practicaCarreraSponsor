package practicaCarrerasSponsors.sponsors;

import practicaCarrerasSponsors.corredores.corredor;

import java.util.HashSet;
import java.util.Set;

public class sponsor {

    private String nombre;

    private Set<patrocinable> patrocinados = new HashSet<>();

    public sponsor(String nombre) {
        this.nombre = nombre;
    }

    public void patrocinar(patrocinable algoPatrocinable){
        if (algoPatrocinable.esPatrocinable()){
            this.patrocinados.add(algoPatrocinable);
        }
    }

    public  String toString(){
        String out= this.nombre + " es sponsor de: ";
        for (patrocinable p : this.patrocinados){
            out += p.getNombre() +","+ " ";
        }
        return out + "\n";
    }
}
