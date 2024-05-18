package practicaCarrerasSponsors.carreras;


import practicaCarrerasSponsors.corredores.corredor;
import practicaCarrerasSponsors.sponsors.patrocinable;

public class carreraRecreativa extends carrera implements patrocinable {


    public carreraRecreativa(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    @Override
    public void inscribir(corredor unCorredor) {
        this.corredores.add(unCorredor);
        unCorredor.actualizarDistancia(this.distancia);
        unCorredor.incrementarCarrerasTotales();
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public boolean esPatrocinable() {
        return false;
    }
}
