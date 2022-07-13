public class Main {
    public static void main(String[] args) throws Exception {
    

        Estacionamiento.inicializar(2, 60, 180);
        
        Persona personaJuan = new Persona("Juan");
        Auto autoJuan = new Auto(Auto.FORD, "AABBC-1234", personaJuan);
        
        Estacionamiento.entra(autoJuan);

        // verifica si juan esta o no. :Validar matricula.
        Estacionamiento.entra(autoJuan);


        Persona personaPedro = new Persona("Pedro");
        Auto autoPedro = new Auto(Auto.CHEVROLET, "ASDBC-1256", personaPedro);

        Estacionamiento.entra(autoPedro);
        
        
        System.out.println(" ");

        Estacionamiento.sale(autoJuan);
        
        Estacionamiento.nuevoDia();

        Estacionamiento.entra(autoJuan);

        Persona personaFelipe = new Persona("Felipe");
        Auto autoFelipe = new Auto(Auto.AUDI , "BFD-124", personaFelipe);
        Estacionamiento.entra(autoFelipe);

        
        Estacionamiento.calcular();
        

    }
}
