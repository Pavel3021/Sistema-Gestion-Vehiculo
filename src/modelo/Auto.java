
package modelo;

/**
 *
 * @author pavel
 */
public class Auto extends Vehiculo{
    private int autonomiaKm;

    public Auto(int autonomiaKm, String marca, String modelo, String anio, String revisionBateria, int codigo, int diasServicio) {
        super(marca, modelo, anio, revisionBateria, codigo, diasServicio);
        this.autonomiaKm = autonomiaKm;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(int autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto{" + "autonomiaKm=" + autonomiaKm + '}';
    }
    
}
