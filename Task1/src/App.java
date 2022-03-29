import java.util.Scanner;


public class App {
    private static Scanner tec = new Scanner(System.in);
    private static String nombre,email, telefono;

    public static void main(String[] args) throws Exception {
        boolean salir = false;
         String opc;
         while (!salir) {
             System.out.println("1- Ingresar un nuevo contacto");
             System.out.println("2- Buscar un contacto existente");
             System.out.println("3- Salir");

             System.out.print("Ingrese una opcion: ");
             opc = tec.nextLine();
             switch (opc) {
                 case "1":
                        System.out.println("Ingrese el nombre del contacto: ");
                        nombre = tec.nextLine();

                        System.out.println("Ingrese el telefono del contacto: ");
                        telefono = tec.nextLine();

                        System.out.println("Ingrese el email del contacto: ");
                        email = tec.nextLine();
                       Contact.Register(nombre, email, telefono);
                     break;
                 case "2":
                    System.out.println("Ingrese el nombre del contacto: ");
                    String busqueda = tec.nextLine();
                    Contact.Search(busqueda);
                     break;
                 case "3":
                     System.out.print("Has salido del programa");
                     salir = true;
                     break;
                 default:
                     System.out.print("Opcion no valida!");
             }
         }
    }  
}
