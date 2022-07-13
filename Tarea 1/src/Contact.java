import java.util.ArrayList;
import java.util.Scanner;

// funcionaria, pero llevar la lista de contactos parece 
// ser una responsabilidad de la App (agenda). Tenes que pensar
// que es contacto y asignar las responabilidades y scope de cada clase

public class Contact {
    private String nombre, email, telefono;
    private static ArrayList<Contact> contactos = new ArrayList<Contact>();
    private static final int MAX_CONTACT = 256;

    public Contact(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public static void Search(String busqueda) {

        for (Contact contacto: contactos) { // perfecto

            if (contacto.getNombre().equals(busqueda)) {
                System.out.println("- Nombre: " + contacto.getNombre());
                System.out.println("- Telefono: " + contacto.getTelefono());
                System.out.println("- Email: " + contacto.getEmail());
                
            }else{
                System.out.println("No se encontro el contacto");
            }
        }
    }	

    public static void Register(String nombre,String email,String telefono) {
        
        Scanner tec = new Scanner(System.in);
        
        while (!(email.contains("@") && email.contains("."))) {
            System.out.println("Ingrese un email valido: ");
            if (email.equals("")) {
                break;
            }
    	
            email = tec.nextLine();

        
        }

        if (contactos.size() >= MAX_CONTACT) {
            System.out.println("El contacto no puede ser creado, ya hay muchos en el sistema");
        }else{
            contactos.add(new Contact(nombre, email,telefono));
        }
    }

}