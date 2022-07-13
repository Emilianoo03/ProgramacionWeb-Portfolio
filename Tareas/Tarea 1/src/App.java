import java.util.Scanner;


public class App { // la llamaria Agenda, es muy generico App.
    // no es necesario polucionar la clase con variable que puden ser locales
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        boolean salir = false;
        while (!salir) { // divino
             String opc;
             System.out.println("1- Ingresar un nuevo contacto");
             System.out.println("2- Buscar un contacto existente");
             System.out.println("3- Salir");

             System.out.print("Ingrese una opcion: ");
             opc = tec.nextLine();
             switch (opc) {
                 case "1":
                        String nombre,email, telefono;
                        System.out.println("Ingrese el nombre del contacto: ");
                        // podrias usar esto para asegurar que el nombre no sea vacio
                        do {
                          nombre = tec.nextLine();
                        } while (nombre.isEmpty());

                        // igual con el telefono
                        System.out.println("Ingrese el telefono del contacto: ");
                        telefono = tec.nextLine();

                        System.out.println("Ingrese el email del contacto: ");
                        email = tec.nextLine();
                       Contact.Register(nombre, email, telefono);
                     break;
                 case "2":
                    System.out.println("Ingrese el nombre del contacto: ");
                    // idem el nombre que definis en el case anterior
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
