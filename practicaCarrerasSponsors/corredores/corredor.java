package practicaCarrerasSponsors.corredores;

import practicaCarrerasSponsors.sponsors.patrocinable;

public class corredor implements patrocinable {
    private String nombre;
    private int cantCarreras;
    private int puntaje;
    private boolean certificado;
    private int distMaxima;

    public corredor(String nombre){
        this.nombre = nombre;
    }

    public  int getPuntaje() {
        return this.puntaje;
    }

    public void actualizarDistancia(int distancia) {
        if (distancia>this.distMaxima){
            this.distMaxima = distancia;
            }
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }

    public boolean tieneCertificado() {
        return this.certificado;
    }
    public void agregarCertificado(){this.certificado = true;}
    public void incrementarCarrerasTotales() {
        this.cantCarreras ++;
    }

    public String toString(){
        return  this.nombre;
    }

    public void aumentarPuntos(int puntaje) {
        this.puntaje += puntaje;
    }

    @Override
    public boolean esPatrocinable() {
        return this.cantCarreras>=3;
    }
}
