import java.util.ArrayList;

public class Estacionamiento {
    private static ArrayList<Auto> autos = new ArrayList<Auto>();
    private static int espacioMaximo;

    private static int precioEntrada;
    private static int precioNoche;

    private static int horaInicial = 7;
    private static int horaFinal = 11;

    public static void inicializar(int espacioMaximo, int precioEntrada, int precioNoche) {
        Estacionamiento.espacioMaximo = espacioMaximo;
        Estacionamiento.precioEntrada = precioEntrada;
        Estacionamiento.precioNoche = precioNoche;
    }


    public static void entra(Auto auto) {
        if (autos.contains(auto)) {  // hay que validar si la matricula ya existe
            System.out.println("El auto ya esta en el estacionamiento\n");
        } else {
            if (autos.size() < espacioMaximo) {
                
                autos.add(auto);
                auto.getPersona().sumarCuenta(precioEntrada);
                // crear la cuenta corriente del usuario  y darle el precio de entrada

                System.out.println("El auto " + auto.getMatricula() + " se ha añadido al estacionamiento\n");

            } else {
                System.out.println("El estacionamiento esta lleno, volve otro dia\n");
            }
        }
    }


    public static void mostrarCuentaCorriente(Auto auto) {
        System.out.println("Saldo de " + auto.getPersona().getNombre() + ": " + auto.getPersona().cuenta);
    }


    public static void sale(Auto auto) {
        if (autos.contains(auto)) {
            autos.remove(auto);
            System.out.println("El auto " + auto.getMatricula() + " se ha retirado del estacionamiento");
            System.out.println( auto.getPersona().getNombre() + " Su cuenta corriente es:  " + auto.getPersona().cuenta + "\n");

        } else {
            System.out.println("El auto " + auto.getMatricula() + " no esta en el estacionamiento\n");
        }
    }


    public static void nuevoDia() {
        for (Auto auto : autos) {
            if (autos.contains(auto)) {
                auto.getPersona().sumarCuenta(precioNoche);
            }
        }
    }


    public static void calcular() {
        for (Auto auto : autos) {
            if (autos.contains(auto)) {
                System.out.println("Señor/a " + auto.getPersona().getNombre() + " su saldo es de: " + auto.getPersona().cuenta);
            }
        }
    }


    /*
     * 
     * public static void sale(Auto auto) {
     * if (vehiculos.contains(auto)) {
     * System.out.println("Se ha eliminado el vehiculo");
     * vehiculos.remove(auto);
     * } else {
     * System.out.println("No se ha encontrado el vehiculo");
     * }
     * }
     * 
     * 
     * public static void nuevoDia() {
     * // si hay un vehiculo en el estacionamiento se le aplica el precio de la noche.
     * }
     * 
     * // mostrar cuentacorriente de la persona
     * public static void mostrarCuentaCorriente(Auto auto) {
     * auto.getPersona().cuentaCorriente.getSaldo();
     * }
     * 
     * 
     * public static void mostrar() {
     * System.out.println("");
     * System.out.println("Espacio maximo: " + espacioMaximo);
     * System.out.println("Precio : " + precioEntrada);
     * System.out.println("Precio noche: " + precioNoche);
     * System.out.println("Vehiculos: " + vehiculos.size());
     * for (Auto auto : vehiculos) {
     * System.out.println(auto.getModelo() + auto.getMatricula() +
     * auto.getPersona().getNombre());
     * }
     * }
     */
}
