package ofp5;

public class Partido {
	public int hora;
	Jugador[] listaJugadores = new Jugador[10];
	boolean partidoCompleto;
	public int fecha;
	int cantJugadores = 0;
	
	
	public void inscribir(Jugador unJugador) {
		if(partidoCompleto)
		{
			unJugador.modo.inscribir(unJugador,this);
		}
		else
		{
			this.agregarJugador(unJugador);
		}
		
	}
	
	public void agregarJugador(Jugador unJugador){
		this.listaJugadores[cantJugadores] = unJugador;
		cantJugadores++;
	}

	public boolean isPartidoCompleto() {
		return partidoCompleto;
	}

	public void setPartidoCompleto(boolean partidoCompleto) {
		this.partidoCompleto = partidoCompleto;
	}
	
	
	
}
