package ofp5;

public class Admin {
	Partido partido;
	
	
	
	public void organizarPartido(int fecha, int hora)
	{
		partido = new Partido();
		partido.fecha = fecha;
		partido.hora = hora;
	}

}
