public class Persona  {
    private String nombre;
    int cuenta;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cuenta = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // sumar cuenta
    public void sumarCuenta (int cantidad) {
        this.cuenta += cantidad;
    }

}
