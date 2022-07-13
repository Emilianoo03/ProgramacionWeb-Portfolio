public class App {
    

    public static void main(String[] args) throws Exception {
        
        Equipo psg = Equipo.PSG;
        
        System.out.println(psg.getNombreClub());
        System.out.println(psg.getPuestoLiga());

        Futbolista neymar = new Futbolista("Neymar", 11, Demarcacion.DELANTERO, Equipo.PSG);

        System.out.println(neymar);

    }
}

