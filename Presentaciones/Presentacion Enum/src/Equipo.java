public enum Equipo
{
	REAL_MADRID("Real Madrid",2),
	PSG("PSG",4),
    VILLAREAL("Villareal",7); 
	
	private String nombreClub;
	private int puestoLiga;
	
	private Equipo (String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}	
	
}