
package lista;


public class persona {
    private String identificacion;
    private String nombre;
    private String saldo;

    public persona(String identificacion, String nombre, String saldo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
}
