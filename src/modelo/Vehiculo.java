
package modelo;

/**
 *
 * @author pavel
 */
public abstract class Vehiculo {
private String marca, modelo, anio, revisionBateria;
private int codigo, diasServicio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getRevisionBateria() {
        return revisionBateria;
    }

    public void setRevisionBateria(String revisionBateria) {
        this.revisionBateria = revisionBateria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDiasServicio() {
        return diasServicio;
    }

    public void setDiasServicio(int diasServicio) {
        this.diasServicio = diasServicio;
    }

    public Vehiculo(String marca, String modelo, String anio, String revisionBateria, int codigo, int diasServicio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.revisionBateria = revisionBateria;
        this.codigo = codigo;
        this.diasServicio = diasServicio;
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", revisionBateria=" + revisionBateria + ", codigo=" + codigo + ", diasServicio=" + diasServicio + '}';
    }
public void mostrarDatos(){
    System.out.println("Datos: ");
}
}
