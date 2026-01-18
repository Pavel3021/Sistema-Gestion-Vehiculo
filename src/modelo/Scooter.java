
package modelo;

/**
 *
 * @author pavel
 */
public class Scooter extends Vehiculo{
private boolean plegable;

    public Scooter(boolean plegable, String marca, String modelo, String anio, String revisionBateria, int codigo, int diasServicio) {
        super(marca, modelo, anio, revisionBateria, codigo, diasServicio);
        this.plegable = plegable;
    }

    public boolean isPlegable() {
        return plegable;
    }

    public void setPlegable(boolean plegable) {
        this.plegable = plegable;
    }
 
    @Override
    public String toString() {
        return "Scooter{" + "plegable=" + plegable + '}';
    }

}
