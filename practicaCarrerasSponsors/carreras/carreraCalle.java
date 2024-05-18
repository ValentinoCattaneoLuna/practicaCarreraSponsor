package practicaCarrerasSponsors.carreras;

import practicaCarrerasSponsors.corredores.corredor;
import practicaCarrerasSponsors.sponsors.patrocinable;

public class carreraCalle extends carrera implements patrocinable {

    public carreraCalle(String nombre, int distancia) {
        this.distancia = distancia;
        this.nombre = nombre;
    }

    @Override
    public void inscribir(corredor unCorredor) {
        if ( this.distancia >=10 && unCorredor.tieneCertificado() ){
            this.corredores.add(unCorredor);
            unCorredor.actualizarDistancia(this.distancia);
            unCorredor.incrementarCarrerasTotales();
        }
        if ( this.distancia < 10){
            this.corredores.add(unCorredor);
            unCorredor.actualizarDistancia(this.distancia);
            unCorredor.incrementarCarrerasTotales();
        }

    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public boolean esPatrocinable() {
        return this.corredores.size() >= 100;
    }
}
