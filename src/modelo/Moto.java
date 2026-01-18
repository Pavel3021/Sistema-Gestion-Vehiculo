
package modelo;

/**
 *
 * @author pavel
 */
public class Moto extends Vehiculo {
private String tipoUso;

    public Moto(String tipoUso, String marca, String modelo, String anio, String revisionBateria, int codigo, int diasServicio) {
        super(marca, modelo, anio, revisionBateria, codigo, diasServicio);
        this.tipoUso = tipoUso;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "tipoUso=" + tipoUso + '}';
    }
 
}
