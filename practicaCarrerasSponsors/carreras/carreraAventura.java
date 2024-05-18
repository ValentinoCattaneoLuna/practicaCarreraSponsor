package practicaCarrerasSponsors.carreras;

import practicaCarrerasSponsors.corredores.corredor;
import practicaCarrerasSponsors.sponsors.patrocinable;


public class carreraAventura extends carrera implements patrocinable {

    private int desnivel;



    private int cuposDisponibles;

    public carreraAventura(String nombre, int desnivel,int distancia, int cuposDisponibles) {
        this.desnivel = desnivel;
        this.cuposDisponibles = cuposDisponibles;
        this.nombre = nombre;
        this.distancia = distancia;
    }
    public void agregarCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles += cuposDisponibles;
    }

    private int calcularPuntajeCarrera(){
        int puntosDistancia = this.distancia / 20;

        int puntosDesnivel = this.desnivel / 1000;

        return puntosDesnivel + puntosDistancia;
    }
    @Override
    public void inscribir(corredor unCorredor) {
        if (cuposDisponibles > 0){
            this.corredores.add(unCorredor);
            unCorredor.actualizarDistancia(this.distancia);
            this.cuposDisponibles--;
            unCorredor.incrementarCarrerasTotales();
            unCorredor.aumentarPuntos(calcularPuntajeCarrera());
        }
        else System.out.println("No Hay Cupos Disponibles para inscribir al corredor");
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public boolean esPatrocinable() {
        if (this.desnivel>=2000){
            return true;}

        for (corredor c : this.corredores){
            if (c.getPuntaje()<=5){
                return true;}
        }

        return false;
    }
}
